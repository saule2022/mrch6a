import scala.io.StdIn.readLine

object tempcalc extends App {
  val personsName = readLine("What is your name:")
  println(s"Hello, $personsName! Please enter your body temperature:")
  val bodyTemp = readLine().toDouble
  if (bodyTemp < 35) {
    println("That is a bit too cold")
  }
  else if (37 < bodyTemp && bodyTemp < 35) {
    println("You are all right!")
  }
  else {
    println("You have a fever! Consider contacting a doctor!")
  }

}
