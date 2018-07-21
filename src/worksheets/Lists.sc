object Lists {
  var l = List(3.0, 5, 'a')

  var l2 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

  var l3 = List.range(10, 20)

  var l4 = l :: l2 // Inserts l into the l2 list

  var l5 = l ::: l2 // Creates a new list containing all elements from l and l2

  var sum = 0
  l3.foreach(sum += _) // Sums all values in the l3 list
  println(sum)

  val list = List((1,2), (3,4), (5,6))
  for((a,b) <- list) yield a + b // Sums each tuple

}