object Farengheit extends App {
  val farengh = celsiusToFahrenheit(37)

  def celsiusToFahrenheit(d: Double) = (d * 9 / 5 + 32)


  println(farengh)
}