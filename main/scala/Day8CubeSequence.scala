import scala.io.StdIn.readLine

object Day8CubeSequence extends App {
  //TODO ask user for starting number
  //TODO ask user for ending numbers
  //Calculate cubes of these integers including start and end AND store results in a sequence
  //Print the saved sequence on screen

  //extra challenge save odd cubes and print them
  val number = readLine("please enter the number").toInt
  val endNumber = readLine("please enter end number").toInt
  val cleanBuffer = scala.collection.mutable.ArrayBuffer[Int]()
  for (n <- number to endNumber) {
    val mySquare = n * n * n
    cleanBuffer += mySquare
  }
  println(cleanBuffer)
}
