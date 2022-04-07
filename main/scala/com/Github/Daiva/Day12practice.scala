/**...*/
class PlainHouse
/**
 * Describes a blueprint for a generic House
 * @param name - House name
 * @param levels - how many stories are in the house
 */
class House(var name:String,
            val levels:Int,
            var material:String="Brick",
            val floorHeight:Double=2.8,
            val width:Double=4,
            val houseLenght:Double=3.7){
  //constructor block - meaning it will run when an object is created from this class blueprint
  println("Starting construction!")

  val volume=levels*floorHeight*width*houseLenght //does not cover attic and basement
  var age=0 //so we can change the age later
  def yearsPass(years:Int):Unit= {
    age+=years
  }
  // we limit visibility of this securityKey to inside so our methods can use it inside our class
  private var securityKey=""
  var publicKey="My public key"
  //inside the constructor we put the things we want done upon initalization

  //we can do private methods as well , meaning they are only usable internally not from outside
  private def generateHash(plainText:String):String= {
    "hash" +plainText+ "my_salt"
  }
  def updateSecurityKey(password:String): Unit ={
    securityKey=generateHash(password)
  }
  def retrieveSecurityKey(password:String): String = {
    if (password=="hunter2") securityKey else "NoAccess"
    //there could more code here to check for access privileges
  }
  //method is a function that lives inside our object
  def prettyPrint(): Unit ={
    //unlike many other languages we do not need to use this or self to access our internal data
  println(s"Cool our house is called $name and it has $levels stories and it is made of $material")
  }
  //we can change the default functionality of what we get when we try to print pur ojects created from this class
  //toString is specific we cant choose another name
  //in other words we override already existing definition
  //this is not required but can be done for convenience
  override def toString:String= {
    s"Neat our house is called $name and it has $levels stories and it is made of $material"
  }

}
//so object in Scala is so called singleton object
//we have said that we are only going to have a single instance
//from Day12Classes definition
object Day12practice extends App {
  println("Classes as blueprints for objects")
  println("Objects hold data and methods to work with data")
  //https://docs.scala-lang.org/overviews/scala-book/classes.html
  val myPLainHouse=new PlainHouse
  println(myPLainHouse)
  val anotherPlainHouse=new PlainHouse
  println(anotherPlainHouse)

  val myHouse=new House("country house", 2)
  println(myHouse)
  println(myHouse.name)//we can GET values/fields/data out of objects using dot notation
  println(myHouse.levels)
  //we can change the name because we defined with var
  myHouse.name="myCountryCastle" // i can SET fields if they were defined in the blueprint with var
  println(myHouse.name)

  //i create another object out of House class blueprint
  val anotherHouse=new House("cityHouse",5, "Brink")
  println(anotherHouse)
  anotherHouse.prettyPrint()
  //I do not have to add all the default parameters, I can specify which ones explicitly
  val strawHouse=new House("piggyHouse",1,"Straw")
  strawHouse.prettyPrint()
  println(strawHouse)
  println(strawHouse.age)
  strawHouse.age+=5 //so same as saying strawHouse.age = strawHouse.age + 5
  println(strawHouse.age)
  strawHouse.yearsPass(12)
  println(strawHouse.age)
  //no access to generateHash method because it is private

  strawHouse.updateSecurityKey("mypassword0000")
  println(strawHouse.retrieveSecurityKey("hunter2")) //generally you SHOULD NOT enter password in code
  println(strawHouse.retrieveSecurityKey("notmyhunter2")) //generally you SHOULD NOT enter password in code
  println(s"Strawhouse volume is ${strawHouse.volume}")

  //members
  //fields
  //methods
  //public vs private

  val rose = new Flower("rose", "red")
  println(rose.color) //flowerType is not accessible without methods




}
