object Day8CubeSequence extends App{
        //TODO ask user for starting number
        //TODO ask user for ending numbers
        //Calculate cubes of these integers including start and end AND store results in a sequence
        //Print the saved sequence on screen

        //extra challenge save odd cubes and print them
        val number=readLine("please enter the number").toInt
        val endNumber=readLine("please enter end number").toInt
        val cleanBuffer=scala.collection.mutable.ArrayBuffer[Int]()
        for(n<-number to endNumber){
        val myCubes=n*n*n
        cleanBuffer+=myCubes
        }
        val oddCubes=for(cleanBuffer<-cleanBuffer if cleanBuffer%2==1)yield cleanBuffer


        //val cubes= for (n <- number to endNumber)yield Math.pow(n,3).toInt  <----gives vector
        println(cleanBuffer)
        println(oddCubes)


        //  val startingNumber = readLine("Enter the starting number, please \n").toInt
        //  val endingNumber = readLine("Enter the ending number, please \n").toInt

        //  if (startingNumber > endingNumber) println("The starting number should be less than the ending number")
        //  else {
        //    val cubes = for (number <- startingNumber to endingNumber) yield Math.pow(number, 3).toInt
        //    println(s"The cubes are: $cubes")
        //    val oddCubes = for (number <- cubes if number % 2==1) yield number
        //    println(s"Odd cubes $oddCubes")
        //  }

        //val startNumber = readLine("Enter starting number: ").toInt
        //val endNumber = readLine("Enter ending number: ").toInt

        //  val cubeSequence = for (number <- startNumber to endNumber) yield Math.pow(number, 3).toInt
        ////  val cubeSequenceString = cubeSequence.mkString(", ")
        ////  println(s"The cubes of all numbers between $startNumber and $endNumber are: $cubeSequenceString")
        ////
        ////  val oddCubes = for (cube <- cubeSequence if cube % 2 != 0) yield cube
        ////  val oddCubesString = oddCubes.mkString(", ")
        ////  println(s"Among them, the odd cubes: $oddCubesString")

        //mutable buffer version
        //val numbers = startNumber to endNumber
        //val cubeSequence = scala.collection.mutable.ArrayBuffer[Int]()
        //for (n <- startNumber to endNumber){
        //  val cube = n*n*n
        //  cubeSequence += cube //we append a cube value to the end of our buffer
        //}
        // println(cubeSequence)
        // val oddCubes = for (cubeSequence <- cubeSequence if cubeSequence % 2 == 0) yield cubeSequence
        // println(oddCubes)
        }
