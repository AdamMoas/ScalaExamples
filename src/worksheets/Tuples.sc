object Tuples {
  val v = (3, 3.4, true, "Hi")
  var x = v._3

  val (first, second, third, fourth) = v // Assigns these values to each tuple element

  val symbols = Array("<", "-", ">")
  val numbers = Array(2, 4, 6)
  val pairs = symbols.zip(numbers).toList // combines each element to its corresponding element of the other Array

  for ((s, n) <- pairs) print(s * n) // Add printLn if clearing the buffer is needed

  def divide10(n: Int): (Int, Int) = (n / 10, n % 10)

  val (tens, ones) = divide10(95) // Separates the Int from each decimal point

}
