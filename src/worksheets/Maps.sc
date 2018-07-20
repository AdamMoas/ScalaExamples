object Maps {
  var groceries = Map(1 -> "Milk", 2 -> "Bread", 3 -> "Juice", 4 -> "Eggs")

  groceries = groceries + (5 -> "Apples")
  groceries.get(2)
  groceries(2)
  groceries.getOrElse(6, "No matching element") // Adds an else clause in case of non-existent element

  for (v <- groceries.values) {
    println(v)
  }

  var z = for ((key, value) <- groceries) yield (value, key) // Swaps keys with values

  groceries.foreach(println)
}