object TypeInference {

  val num = 5             // Type: Int
  val decimal = 5.2242    // Type: Double

  var x = 1 + 2 * 3.5     // Type: Double

  List(1, 2, 4.5, true)   // Type: AnyVal
  List(1, true, "Scala")  // Type: Any

  def addOne(x: Int) = x + 1  // Return: Int
  def greaterThanZero(x: Int) = if (x > 0) 1 else "negative"  // Return: Any

  addOne(5)
  greaterThanZero(0)

}