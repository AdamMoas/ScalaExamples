object PayRoll extends App {
  var employee1 = new Employee("Sam", "Paulson", salaried = 'n')
  var employee2 = new Employee("Kevin", "Jones", salaried = 's')
  println(employee1)
  println(employee2)

}

class Employee(val fName: String, val lName: String, var salaried: Char = 'n') {
  def fullName: String = fName + " " + lName

  override def toString: String = "Employee name: " + fullName +
    (if (salaried == 'n') "\nHourly Employee" else "\nSalaried Employee") + ("\n" + "-" * 20)
}