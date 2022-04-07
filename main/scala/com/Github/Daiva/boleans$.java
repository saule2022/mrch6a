object boleans extends App{
        println("Hello Booleans !")
        val isLate=true
        val isSunny=false
        println(isLate,isSunny)
        val isMathCorrect=2*2==4
        println(s"Math 2 times 2 ==4: $isMathCorrect")
        println("5 > 10",5>10)
        println("5*5 < 20",5*5< 20)
        println("10 <= 2*5",10<=2*5) //less or equal, this should be true
        println("8 >= 14/2",8>=14/2)

        val a=2
        val b=4
        println("a*a== b",a*a==b)

        println("a*a!= b",a*a!=b)
        println("a*a*10!= b",a*a*10!=b)

        println(0.1+0.2)
        println(0.1+0.2-0.3==0)


        println(0==0.0) //we can compare numerical values even if they are not the same data type
        val myChar='A'
        val anotherChar='a'
        println(myChar==anotherChar)
        val myName="Valdis"
        val anotherName="Voldemars"
        println(myName==anotherName) //naturally a false
        println(myName<anotherName)
        println(myName.length<anotherName.length)

        }
