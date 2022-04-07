import numerDaysofWeek.Day

object numerDaysofWeek extends Enumeration {
  type Day = Value //so all Fingers have same type of Value

  val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
}

object Day16EnumeraDaysofWeek extends App {
  println("Let's have some fun with Day count!")

  for (day <- numerDaysofWeek.values) println(s"Day No. ${day.id} is $day")

  def daysofweek(AnyDay: Day): Boolean = {
    AnyDay == numerDaysofWeek.Wednesday
  }

  println(daysofweek(numerDaysofWeek.Tuesday))
  println(daysofweek(numerDaysofWeek.Wednesday))
}
