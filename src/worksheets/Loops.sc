object Loops {

  var x = 10
  var y = 10
  var z = 10

  while (x > 0) {
    println("x: " + x)
    x = x - 1
  }

  println("Blast off! x")

  do {
    println("y: " + y)
    y = y - 1
  } while (y > 0)

  println("Blast off! y")

  for (z <- 10 to 1 by -1) {
    println("z: " + z)
  }

  println("Blast off! y")

  var a = for (num <- 0 to 9) yield num + 1
  println(a)

  var word = "Monday"
  for (x <- 0 until word.length) {
    println(word(x))
  }

}