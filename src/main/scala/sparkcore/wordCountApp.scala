package sparkcore

import org.apache.spark.{SparkConf, SparkContext}

object wordCountApp extends App {

  val conf = new SparkConf().setAppName("Word Count Application").setMaster("local[*]")
  val sc = new SparkContext(conf)
  val inputFile = "E:/works/wordcount/bigdata.txt"
  val outPut = "E:/works/wordcount/bigdataTwoxx"
  val input = sc.textFile(inputFile)
  input.flatMap(_.split(" ")).map(w => (w, 1)).reduceByKey(_+_).saveAsTextFile(outPut)

}
