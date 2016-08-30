package hex.python

/**
  * Created by fmilo on 8/29/16.
  */
object PythonMain {

  def main(args: Array[String]): Unit = {
   val env: Map[String,String] = Map(
    "PYTHONPATH" -> "/home/fmilo/workspace/h2o-3/h2o-core/src/main/java/hex/python"
   )
   var worker = new PythonWorkerFactory("/home/fmilo/anaconda2/envs/h2o/bin/python", env)
   var socket = worker.create()

    Thread.sleep(1000);
  }

}
