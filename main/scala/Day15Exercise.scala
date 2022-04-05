object Day15Exercise extends App {
  def getDay(day: Int): Unit = {
    day match {
      case 1 => println("Monday")
      case 2 => println("Tuesday")
      case 3 => println("Wednesday")
      case 4 => println("Thursday")
      case 5 => println("Friday")
      case 6 => println("Saturday !")
      case 7 => println("Sunday !")
      case whoa => println("No such Day!: ")
    }
  }

  def getDayType(day: String): String = day match {
    case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "WorkDay !"
    case "Saturday" | "Sunday" => "Weekend !"
  }

  println(getDayType("Monday"))
  println(getDay(4))
}

