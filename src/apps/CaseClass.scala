object CaseClass extends App {
  val alice = Person("Alice", 25)
  val rabbit = Person("Bugs", 50)
  val duck = Person("Donald", 21)

  for (person <- List(alice, rabbit, duck)) {
    person match {
      case Person("Alice", 25) => println("Hi Alice")
      case Person("Bugs", 50) => println("Hi Bugs")
      case Person("Donald", 21) => println("Hi Donald")
    }
  }
}

case class Person(firstName: String, age: Int)