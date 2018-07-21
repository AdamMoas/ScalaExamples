object Account extends App {
  var account1 = new BankAccount("Adam", 25, 'c')
  var account2 = new BankAccount("Bob", 250, 's')
  List(account1, account2).foreach(print)
}

class BankAccount(name: String, balance: Double, accountType: Char = 'c') {
  var accountNumber = BankAccount.nextAccountNumber()

  override def toString: String = "Client name: " + name + " | balance $" + balance +
    (if (accountType == 'c') "\nChecking" else "\nSavings") + "\nAccount number: " + accountNumber +
    "\n" + "*" * 30
}

object BankAccount {
  // Singleton companion object
  var accountNum = 5000

  def nextAccountNumber() = {
    accountNum += 1
    accountNum
  }
}
