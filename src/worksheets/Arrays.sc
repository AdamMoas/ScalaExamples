object Arrays {
  val numbers = new Array[Any](4).toList // Array of type Any of size 4

  var furniture = Array("chair", "sofa", "table", "bed")

  for (f <- furniture) println(f) // Loops through each element in the Array and prints it as f.
  println(furniture(0)) // Prints the first element in the furniture Array

  var a = Array(1, 2, 3, 4, 5)

  var result = for(n <- a) yield 2 * n // Produces a List of numbers 2 * n
  result.toList

  var even = for(n <- a if n % 2 == 0) yield n // Only prints the even numbers in the Array a
  even.toList
  
}
