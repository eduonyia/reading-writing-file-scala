// Reading and writing to files in Scala

import java.io._
import scala.io._


object Main {
  def main(args: Array[String]): Unit = {

    val test_file = "TestFile.txt"
    val src = Source.fromFile(test_file)

    for ( line <- src.getLines())
    {
      println(line)
    }
    src.close()

    // writing to a file
    val fileObj = new File("Output.txt")
    val pw = new PrintWriter(fileObj)

    pw.write("Hello!! I am the first line of the file.")
    pw.close()
  }
}