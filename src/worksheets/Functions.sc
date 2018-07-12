object Functions {


  def abs(x: Int) = if (x < 0) -x else x

  abs(-2)

  def factorial(n: Int) = {
    var result = 1

    for (i <- 1 to n) result = result * i

    result
  }

  println("Factorial result: " + factorial(5))


  def recursiveFactorial(n: Int): Int = if (n <= 0) 1 else n * recursiveFactorial(n - 1)

  println("Factorial result: " + recursiveFactorial(5))

  def printName(left: String = "[", firstName: String, lastName: String, right: String = "]") = {
    println(left + firstName + " " + lastName + right)
  }

  printName(firstName = "Adam", lastName = "Moas")

}