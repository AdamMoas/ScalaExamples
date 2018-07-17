object PayRoll {
  val rate = 10.5

  def earnings(employeeType: String, hours: Double): String = {
    if (employeeType == "hourly") {
      if (hours <= 40) {
        "Weekly paycheck is $" + hours * rate
      } else {
        "Weekly paycheck is $" + (40 * rate + (hours - 40) * rate * 1.5)
      }

    } else {
      "This is a salaried employee"
    }
  }

  println(earnings("hourly", 35))
  println(earnings("hourly", 40))
  println(earnings("hourly", 50))
  println(earnings("salary", 0))

}