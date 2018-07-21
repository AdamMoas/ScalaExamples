object PayRoll extends App {
  var employee1 = new Employee("Sam", "Paulson", salaried = 'n')
  var employee2 = new Employee("Kevin", "Jones", salaried = 's')
  println(employee1)
  println(employee2)

}

class Employee(val fName: String, val lName: String, var salaried: Char = 'n') {
  def fullName: String = fName + " " + lName

  var employeeID = Employee.newEEID()

  override def toString: String = "Employee name: " + fullName + "\nEmployee ID: " +
    employeeID +
    (if (salaried == 'n') "\nHourly Employee" else "\nSalaried Employee") + ("\n" + "-" * 20)
}

object Employee {
  // Companion object
  var employeeID = 0

  def newEEID() = {
    employeeID += 1
    employeeID
  }
}