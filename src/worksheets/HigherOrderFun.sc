object HigherOrderFun {

  val double = (i: Int) => i * 2

  def higherOrder(x: Int, y: Int => Int) = y(x)

  higherOrder(2, double)

  val triple = (i: Int) => i * 3

  higherOrder(7, triple)

  def composeMessage = (name: String) => {
    "Hi" + " " + name
  }

  var message = composeMessage("Adam")
  println(message)

  var y = 5
  val multiplier = (x: Int) => x * y

  multiplier(20)

}