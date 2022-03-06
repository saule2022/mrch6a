import java.time.Year
import scala.io.StdIn.readLine

object agecalc extends App {

  //TODO write an application that asks for person's and their age
  //Greet the person with their name
  //and calculate when they will be 100 years old and print it out
  //  val year = 2022 //this would be okay
  val targetage = 100
  val year = Year.now.getValue
  val name = readLine("what is your name?")

  println(s"HI great, $name !")
  val age = readLine("how old are you").toDouble
  println(s"cool, you are $age year old !!")
  val age100 = year - age + targetage
  val smiley = "😀"
  println(s"100 year old you will be in $age100 $smiley !")


}