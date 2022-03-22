
object Day8Sequences extends App {
  val mySeq = Seq(1, 2, 3, 4, 5)
  println(mySeq)
  val numbers = (1 to 20).toList
  println(numbers(4))
  println(numbers.tails)
  println(numbers(numbers.length - 15))
  val numArray = numbers.toArray
  println(numArray)
  for (number <- numbers) {
    println(number)

  }
  val oddnumbers = for (number <- numbers if number % 2 == 1) yield number
  println(oddnumbers)

  val squares = for (number <- oddnumbers) yield Math.pow(number, 2).toInt
  println(squares)

  val mutabSquares = scala.collection.mutable.ArraySeq(1, 2, 3, 4, 5)
  println(mutabSquares)

  val cleanBuffer = scala.collection.mutable.ArrayBuffer[Int]()
  for (n <- 1 to 100) {
    val mySquare = n * n
    cleanBuffer += mySquare
  }
  println(cleanBuffer)


}
