class AnimalToo (val name:String,
                 val animalType:String,
                 val likes:String,
                 val sound:String,
                 val age:Int=1) {

  def makeSound {
    println(s"I'm a $animalType and I go $sound") }

  def meet(contact:String): Unit = {
    if (contact == likes) println(s"Hi, $contact! $name likes you")
    else println("No, thanks, gotta go!")
  }
}

object Day12ExerciseMoreAnimals extends App {
  val animal1 = new AnimalToo("Carry", "Fox","Hunting","Hees")
  animal1.makeSound
  animal1.meet("Hunting")

  val animal2 = new AnimalToo("Charlotte","Cat","Sleeping","Meow")
  animal2.makeSound
  animal2.meet("Hunting")

  val animal3 = new AnimalToo("Miranda","Dog","Walking","Woof")
  animal3.makeSound
  animal3.meet("Walking")

  val animal4 = new AnimalToo("Samantha","Leopard","Sunbathing","Shhh")
  animal4.makeSound
  animal4.meet("Walking")

}