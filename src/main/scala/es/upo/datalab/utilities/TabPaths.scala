package es.upo.datalab.utilities

/**
  * Created by davgutavi on 15/03/17.
  */
object TabPaths {

  //HDFS Laboratorio
  final val rootHDFS = "hdfs://192.168.47.247/user/gutierrez/endesa/"
  final val prefix_01 = rootHDFS+"database_parquet/"
  final val prefix_02 = rootHDFS+"database_csv/"
  final val prefix_03 = rootHDFS+"datasets_parquet/"
  final val prefix_04 = rootHDFS+"datasets_csv/"
  final val prefix_05 = rootHDFS+"joins_parquet/"
  final val prefix_06 = rootHDFS+"joins_csv/"

  final val rootHDD = "/mnt/datos/recursos/ENDESA/"
  final val headers = rootHDD+"headers/"



  //MAC David
  //final val root = "/Volumes/david/endesa/"
  //final val prefix = "/Volumes/david/endesa/base_de_datos_descomprimida/"
  //final val headers= prefix+"headers/"

  //*********************************************************************************TABLAS

  //Maestro Aparatos
  final val TAB_00E = prefix_01+"TAB_00E"
  final val TAB_00E_headers =  headers+"TAB_00E_headers.csv"
  final val TAB_00E_csv = prefix_02+"TAB_00E/Endesa_TAB_00E_20170127_CZZ_20100101_20161231.csv"

  //Maestro Contratos
  final val TAB_00C = prefix_01+"TAB_00C"
  final val TAB_00C_headers = headers+"TAB_00C_headers.csv"
  final val TAB_00C_csv = prefix_02+"TAB_00C/Endesa_TAB_00C_20170127_CZZ_20100101_20161231.csv"

  //Contratación
  final val TAB_05A = prefix_01+"TAB_05A"
  final val TAB_05A_headers =  headers+"TAB_05A_headers.csv"
  final val TAB_05A_csv = rootHDD+"TAB_05A/Endesa_TAB_05A_20170127_CZZ_20100101_20161231.csv"

  //Clientes
  final val TAB_05C = prefix_01+"TAB_05C"
  final val TAB_05C_headers =  headers+"TAB_05C_headers.csv"
  final val TAB_05C_csv = prefix_02+"TAB_05C/Endesa_TAB_05C_20170126_CZZ_20100101_20161231.csv"

  //Aparatos
  final val TAB_06 = prefix_01+"TAB_06"
  final val TAB_06_headers =  headers+"TAB_06_headers.csv"
  final val TAB_06_csv = rootHDD+"TAB_06/Endesa_TAB_06_20170127_CZZ_20100101_20161231.csv"


  //Expedientes
  final val TAB_16 = prefix_01+"TAB_16"
  final val TAB_16_headers =  headers+"TAB_16_headers.csv"
  final val TAB_16_csv = prefix_02+"TAB_16/Endesa_TAB_16_20170127_CZZ_20100101_20161231.csv"



  //Curvas de Carga
  final val TAB_01 = prefix_01+"TAB_01"
  final val TAB_01_10 = prefix_01+"TAB_01_10"
  final val TAB_01_11 = prefix_01+"TAB_01_11"
  final val TAB_01_12 = prefix_01+"TAB_01_12"
  final val TAB_01_13 = prefix_01+"TAB_01_13"
  final val TAB_01_14 = prefix_01+"TAB_01_14"
  final val TAB_01_15 = prefix_01+"TAB_01_15"
  final val TAB_01_16 = prefix_01+"TAB_01_16"
  final val TAB_01_headers =  headers+"TAB_01_headers.csv"
  final val TAB_01_10_csv = prefix_02+"TAB_01/Endesa_TAB_01_20170127_CZZ_20100101_20101231.csv"
  final val TAB_01_11_csv = prefix_02+"TAB_01/Endesa_TAB_01_20170127_CZZ_20110101_20111231.csv"
  final val TAB_01_12_csv = prefix_02+"TAB_01/Endesa_TAB_01_20170127_CZZ_20120101_20121231.csv"
  final val TAB_01_13_csv = prefix_02+"TAB_01/Endesa_TAB_01_20170127_CZZ_20130101_20131231.csv"
  final val TAB_01_14_csv = prefix_02+"TAB_01/Endesa_TAB_01_20170127_CZZ_20140101_20141231.csv"
  final val TAB_01_15_csv = prefix_02+"TAB_01/Endesa_TAB_01_20170127_CZZ_20150101_20151231.csv"
  final val TAB_01_16_csv = prefix_02+"TAB_01/Endesa_TAB_01_20170127_CZZ_20160101_20161231.csv"

  //Bits de Calidad
  final val TAB_02 = prefix_01+"TAB_02"
  final val TAB_02_headers = headers+"TAB_02_headers.csv"
  final val TAB_02_10_csv = prefix_02+"Endesa_TAB_02_A2010_20170127_CZZ.csv"
  final val TAB_02_11_csv = prefix_02+"Endesa_TAB_02_A2011_20170127_CZZ.csv"
  final val TAB_02_12_csv = prefix_02+"Endesa_TAB_02_A2012_20170127_CZZ.csv"
  final val TAB_02_13_csv = prefix_02+"Endesa_TAB_02_A2013_20170127_CZZ.csv"
  final val TAB_02_14_csv = prefix_02+"Endesa_TAB_02_20170127_CZZ_20140101_20141231.csv"
  final val TAB_02_15_csv = prefix_02+"Endesa_TAB_02_20170127_CZZ_20150101_20151231.csv"
  final val TAB_02_16_csv = prefix_02+"Endesa_TAB_02_20170127_CZZ_20160101_20161231.csv"

  ///////////************OTROS

  //Consumos de Tipo I - IV
  final val TAB_03 = prefix_01+"TAB_03"
  final val TAB_03_headers = headers+"TAB_03_headers.csv"
  final val TAB_03_csv = prefix_02+"TAB_03/Endesa_TAB_03_20170127_CZZ_20100101_20161231.csv"

  //Consumos de Tipo V
  final val TAB_04 = prefix_01+"TAB_04"
  final val TAB_04_headers = headers+"TAB_04_headers.csv"
  final val TAB_04_10_csv = prefix_02+"TAB_04/Endesa_TAB_04_20170127_CZZ_20100101_20101231.csv"
  final val TAB_04_11_csv = prefix_02+"TAB_04/Endesa_TAB_04_20170127_CZZ_20110101_20111231.csv"
  final val TAB_04_12_csv = prefix_02+"TAB_04/Endesa_TAB_04_20170127_CZZ_20120101_20121231.csv"
  final val TAB_04_13_csv = prefix_02+"TAB_04/Endesa_TAB_04_20170127_CZZ_20130101_20131231.csv"
  final val TAB_04_14_csv = prefix_02+"TAB_04/Endesa_TAB_04_20170127_CZZ_20140101_20141231.csv"
  final val TAB_04_15_csv = prefix_02+"TAB_04/Endesa_TAB_04_20170127_CZZ_20150101_20151231.csv"
  final val TAB_04_16_csv = prefix_02+"TAB_04/Endesa_TAB_04_20170127_CZZ_20160101_20161231.csv"

  //Geolocalización
  final val TAB_05B = prefix_01+"TAB_05B"
  final val TAB_05B_headers = headers+"TAB_05B_headers.csv"
  final val TAB_05B_csv = prefix_02+"TAB_05B/Endesa_TAB_05B_20170127_CZZ_20100101_20161231.csv"

  //TDC
  final val TAB_15A = prefix_01+"TAB_15A"
  final val TAB_15A_headers = headers+"TAB_15A_headers.csv"
  final val TAB_15A_csv = prefix_02+"TAB_15A/Endesa_TAB_15A_20170127_CZZ_20100101_20161231.csv"



































  ///////////************OTROS
//  //Clientes PTOSE
//  final val TAB_05D = prefix+"TAB_05D/Endesa_TAB_05D_20170126_CZZ_20100101_20161231.csv"
//  final val TAB_05D_headers = headers+"TAB_05D_headers.csv"
//  //Movimientos TDC
//  final val TAB_15C = prefix+"TAB_15C/Endesa_TAB_15C_20170127_CZZ_20100101_20161231.csv"
//  final val TAB_15C_headers = headers+"TAB_15C_headers.csv"
//  //Operaciones TDC
//  final val TAB_15B = prefix+"TAB_15B/Endesa_TAB_15B_20170127_CZZ_20100101_20161231.csv"
//  final val TAB_15B_headers = headers+"TAB_15B_headers.csv"
//  //Contratación
//  final val TAB_05A = prefix+"TAB_05A/Endesa_TAB_05A_20170127_CZZ_20100101_20161231.csv"
//  final val TAB_05A_headers = headers+"TAB_05A_headers.csv"
//  //Magnitudes TPL
//  final val TAB_10 = prefix+"TAB_10/Endesa_TAB_10_20170127_CZZ_20100101_20161231.csv"
//  final val TAB_10_headers = prefix+"TAB_10/TAB_10_headers.csv"
//  //Facturación
//  final val TAB_12_10_12 = prefix+"TAB_12/Endesa_TAB_12_20170127_CZZ_DE_2010_A_2012.csv"
//  final val TAB_12_12_13 = prefix+"TAB_12/Endesa_TAB_12_20170127_CZZ_DE_2012_A_2013.csv"
//  final val TAB_12_14_15 = prefix+"TAB_12/Endesa_TAB_12_20170127_CZZ_DE_2014_A_2015.csv"
//  final val TAB_12_16_17 = prefix+"TAB_12/Endesa_TAB_12_20170127_CZZ_DE_2016_A_2017.csv"
//  final val TAB_12_headers = prefix+"TAB_12/TAB_12_headers.csv"
//  //Interrupciones
//  final val TAB_18_ene_mar_16 = prefix+"TAB_18/C3_Endesa_TAB_18_20160411_XZZ_20160123_20160331_1.csv"
//  final val TAB_18_jul_16 = prefix+"TAB_18/C3_Endesa_TAB_18_20160712_XZZ_1.csv"
//  final val TAB_18_ago_16 = prefix+"TAB_18/C3_Endesa_TAB_18_20160816_XZZ_1.csv"
//  final val TAB_18_sep_16 = prefix+"TAB_18/C3_Endesa_TAB_18_20160921_XZZ_1.csv"
//  final val TAB_18_oct_16 = prefix+"TAB_18/C3_Endesa_TAB_18_20161010_XZZ_1.csv"
//  final val TAB_18_nov_16 = prefix+"TAB_18/C3_Endesa_TAB_18_20161108_XZZ_1.csv"
//  final val TAB_18_dic_16 = prefix+"TAB_18/C3_Endesa_TAB_18_20161222_XZZ_1.csv"
//  final val TAB_18_ene_17 = prefix+"TAB_18/C3_Endesa_TAB_18_20170111_XZZ_1.csv"
//  final val TAB_18_headers = prefix+"TAB_18/TAB_18_headers.csv"

}