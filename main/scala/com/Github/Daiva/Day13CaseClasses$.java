object Day13CaseClasses extends App{
        println("using case classes")
        val me=Person("Valdis","myself",180)
        val sunflower=new Flower("sunflower","yellow")
        //val anotherFlower=sunflower.clone()
        println(sunflower.color)
        println(me)
        //we also gain ability to pattern match by using case classes
        //I have access to all parameters
        println(me.name)
        println(me.relation)
        println(me.topSpeed)
        val mynewSpeed=me.increaseSpeed(15)//we can extract value as well
        println(mynewSpeed)
        println(s"Hello I am ${me.name} related as ${me.relation} with a top speed of ${me.topSpeed}")

        val myCopy=me.copy()
        println(me==myCopy)//our contents equal\
        val ede=Person("Ede","daughter",300)
        println(ede)
        val Jana=Person("Jana","friend",240)
        println(Jana)
        //ede.name="NewEde" not possible because properties in case class is val by default
        //println(ede.name)
        ede.topSpeed=400//fine to mutate because I specified var in case class definition
        println(ede)


        //so mostly case classes are all about convenience
        //often a case class instance (object) will correspond an entry/row in a database, table etc


        }
