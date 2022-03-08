object Boolmrch7 extends App {
  val isEvening = true
  println(isEvening)
  println(s"It is morning $isEvening")
  val isMorning = !isEvening
  println(s"It is is morning? $isMorning")
  val isTimeReal = isEvening && isMorning
  println("its timereal??", isTimeReal)
  println(true & true)
  println(true && false)
  println(2 * 2 == 4 && 2 * 4 == 8 && isMorning)
  //println(2*2==4 && 5/0==10)
  val a = 611
  if (a > 600) {
    println("it is over 600")
  }
  if (a > 9000) {
    println("Wow it is over 9000!")
    println(s"a is $a")
    //we can do more stuff here when a >9000
  } else { //in effect when a <= 9000
    println("Sorry not quite 9001...so 9000 or less")
    println(s"a is $a") //here of course we could have simplied code by putting
  }
  if (a > 100) {
    val b = 33333 // b is local only within these ineer curly bracers
    if (a > 500) println("Over 500") //so branch inside a branch
    else println("over 100 but less or equal to 500")
    println(s"WE can print b just for heck of it $b")
    //so b with 33333 is gone after this line
  } else println("less than or equal to 100")


}
