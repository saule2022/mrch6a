object Day10Maps2 extends App{
        val myNumbers=(5to 10).toArray
        println(myNumbers(2)) //so Indexed sequence we can look up values by their index
        println(myNumbers.mkString(","))
        val myFavorites=Map(("food","potatoes"),("car","vw"),("color","green"),("shirt","green"))
        println(myFavorites.mkString(","))
        val anotherMap=Map("cats"->5,"dogs"->3,"kids"->3,"cars"->1)
        println(s"I have ${anotherMap("cats")} cats  and ${anotherMap("dogs")} dogs")
        //val numericMap = Map(100 -> "heroes", 300 -> "Spartans", 9000 -> "enough", 9001 -> "too much")
        //println(numericMap(300))
        val numericMap=Map(100->"heroes",
        300->"Spartans",
        9000->"enough",
        9001->"too much",
        2_000_000->"even more so")

        println(numericMap.mkString(","))
        println(numericMap(2_000_000))

        //println(numericMap(5000)) //this will throw an exception
        //println(myFavorites("drink")) //again will be an exception
        println(myFavorites.contains("food")) //so this is a very quick check if key named food exists
        println(myFavorites.contains("drink"))

        for((key,value)<-numericMap){
        println(s"my key: $key maps to -> $value")
        }
        val myKey="drink" // this could be coming in from readLine or outside
        if(myFavorites.contains(myKey)){
        println(s"Key $myKey -> ${myFavorites(myKey)}")
        }else{
        println(s"Sorry no key $myKey found")
        }
        val myValue=myFavorites.getOrElse(myKey,"no such key")
        println(s"Key $myKey -> $myValue")

        val myKeys=for((key,value)<-myFavorites)yield key //I am using _ to indicate that key is not needed
        println(myKeys)
        val myValues=for((_,value)<-myFavorites)yield value //I am using _ to indicate that key is not needed
        println(myValues)

        val greenMap=for((key,value)<-myFavorites if value=="green")yield(key,value)
        println(greenMap.mkString(","))
        val muteMap=scala.collection.mutable.Map("cats"->5,"dogs"->3,"kids"->3,"cars"->1)
        println(muteMap)

        }
