object Sets {
  val fruit = Set("apple", "orange", "banana")
  var moreFruit = Set("kiwi", "pineapple")
  var nums = Set(1, 2, 3, 4, 5)
  var moreNums = Set(6, 7, 8, 9)
  nums.contains(5)
  nums(3)

  var mixed = fruit ++ nums // Type: Any
  nums -= 5 // Removes 5 from set
  println(nums)

  nums & moreNums // Finds intersection of the two sets - Empty Set in this case

  moreFruit.head // First element of list
  moreFruit.tail // All but first element
  moreNums.isEmpty // false

}