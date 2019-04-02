package com.leesanghyuk

import org.apache.spark.{SparkConf, SparkContext}


/**
 * Hello world!
 *
 */
object App{

  def main(args: Array[String]): Unit = {
    val conf=new SparkConf().setAppName("App")//设置本程序名称
    if(args==null||args.length==0){
      conf.setMaster("local[*]")//启动本地化计算
    }

    //Spark程序的编写都是从SparkContext开始的
    val sc=new SparkContext(conf)

    val rdd=sc.parallelize(List(1,2,3))

    rdd.foreach(println)
  }
}
