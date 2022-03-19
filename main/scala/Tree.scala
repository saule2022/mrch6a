import scala.io.StdIn.readLine
import scala.util.control.Breaks.break

object Tree extends App {
  //TODO ask person's name
  //TODO ask for tree height
  //TODO print a xmas tree (or another tree) by calling printTree function with the correct parameters
  //tree height should be the one assigned
  //simple version for height 3 would be
  //  *
  // ***
  //*****


  //for full points I would like to see the following
  //if user enters name Valdis  and height 9
  //then we should print
  //        *
  //       VVV
  //      AAAAA
  //     LLLLLLL
  //    DDDDDDDDD
  //   IIIIIIIIIII
  //  SSSSSSSSSSSSS
  // VVVVVVVVVVVVVVV
  //AAAAAAAAAAAAAAAAA

  //let's consider maximum height 40 (so person's name letters could repeat many times)

  //def printTree(name:String, height:Int, symbol:Char='*', maximumHeight:Int=40):Unit = {
  //for this exercise we are not going to adjust maximumHeight
  //TODO print the tree HINT: check the last entry in Day7Strings
  val name = readLine("what is your name?"): String
  val height = readLine("How many layer do you a tree?").toInt
  var number = 1
  var i = 0
  var n = 0
  println(" " * height + "*")
  while (i < height - 1) {
    for (c <- name.toUpperCase()) {
      if (i == height - 1) break
      else {
        number = number + 2
        n = n + 1

        println(" " * (height - n) + c.toString * number)
      }
      i = i + 1
    }


  }






  //val name = readLine("Please enter your name:\n")
  // val Range = readLine("How many layer do you a tree?").toInt
  //var number = -1
  //var x = 1


  //for (x <- 1 to Range) {
  //number = number + 2
  //Ra=" " *(Range-x)

  //println(" " * (Range - x) + "+" * number)

  //}
}