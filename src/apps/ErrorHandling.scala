import io.Source._
import java.io._

object ErrorHandling extends App {

  try {
    for (line <- fromFile("fakeFile.txt").getLines()) {
      println(line.toLowerCase())
    }
  } catch {
    case e: FileNotFoundException => println("File not found")
    case _: Exception => println("Program error")
  }

  try {
    var quotient = 10 / 0
  } catch {
    case e: ArithmeticException => println("Do not divide by zero")
  }

}