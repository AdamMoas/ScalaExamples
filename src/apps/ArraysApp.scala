object ArraysApp extends App {

  def average(array: Array[Int]): Double = {
    var sum = 0

    for (value <- array) yield sum += value

    sum / array.length
  }

  var min = (array: Array[Int]) => {
    var min = array(0)
    for (value <- array) if (value < min) min = value

    min
  }

  var max = (array: Array[Int]) => {
    var max = array(0)
    for (value <- array) if (value > max) max = value

    max
  }

  var numberArray = Array(1, 4, 3, 7, 2, 9, 100, 54, 99, 34)
  
  println("Average: " + average(numberArray))
  println("Min: " + min(numberArray))
  println("Max: " + max(numberArray))

}