package es.upo.datalab.entrypoints.general


import es.upo.datalab.utilities.{LoadTableParquet, SparkSessionUtils, TabPaths, TimingUtils}
import org.apache.spark.storage.StorageLevel

/**
  * Created by davgutavi on 7/04/17.
  */
object TabTest {

  def main(args: Array[String]): Unit = {

    val nivel = StorageLevel.MEMORY_AND_DISK

    val sqlContext = SparkSessionUtils.sqlContext

    TimingUtils.time {

      val df_05C = LoadTableParquet.loadTable(TabPaths.TAB_05C)
      df_05C.persist(nivel)
      println("Número de registros en Clientes = " + df_05C.count())
      df_05C.show(50,truncate = false)

    }

  }

}
