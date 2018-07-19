object PatternMatching extends App {

  val LETTER = 'a'

  def greekAlphabet(letter: Char) = {
    letter match {
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
      case _ => println("You entered an invalid character")
    }
  }

  println("The greek letter for " + LETTER + " is: " + greekAlphabet(LETTER))

  def max(x: Int, y: Int) = x > y match {
    case true => x
    case false => y
  }

  println(max(40, 70))

}