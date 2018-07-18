import io.Source._

object ReadFromFiles extends App {
  val fileName = "src/apps/week.txt"

  for (line <- fromFile(fileName).getLines()) {
    println(line)
  }

  val lines = fromFile(fileName).getLines().toList
  lines.foreach(println)

}