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
    val myCubes = n * n * n
    cleanBuffer += myCubes
  }
  val oddCubes = for (cleanBuffer <- cleanBuffer if cleanBuffer % 2 == 1) yield cleanBuffer


  //val cubes= for (n <- number to endNumber)yield Math.pow(n,3).toInt  <----gives vector
  println(cleanBuffer)
  println(oddCubes)
}
