object Tuples {
  val v = (3, 3.4, true, "Hi")
  var x = v._3

  val (first, second, third, fourth) = v // Assigns these values to each tuple element

  val symbols = Array("<", "-", ">")
  val numbers = Array(2, 4, 6)
  val pairs = symbols.zip(numbers).toList // Combines each element to its corresponding element of the second Array

  for ((s, n) <- pairs) print(s * n) // Add println if clearing the buffer is needed

  def divide10(n: Int): (Int, Int) = (n / 10, n % 10)

  val (tens, ones) = divide10(95) // Separates the Int from each decimal point

}
