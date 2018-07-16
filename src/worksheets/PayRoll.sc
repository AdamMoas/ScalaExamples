object PayRoll {
  val rate = 10.5

  def earnings(s: String, h: Double): String = {
    if (s == "h") {
      if (h <= 40) {
        "Weekly paycheck is $" + h * rate
      } else {
        "Weekly paycheck is $" + (40 * rate + (h - 40) * rate * 1.5)
      }

    } else {
      ""
    }
  }

}