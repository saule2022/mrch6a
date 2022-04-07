object Xtree2short extends App{
        //for full points I would like to see the following
        //if user enters name Valdis  and height 9
        //then we should print
        //        *
        //       VVV
        //      AAAAA
        //     LLLLLLL
        //    DDDDDDDDD
        //   IIIIIIIIIII
        //  SSSSSSSSSSSSS
        // VVVVVVVVVVVVVVV
        //AAAAAAAAAAAAAAAAA

        //let's consider maximum height 40 (so person's name letters could repeat many times)

        def printTree(name:String,height:Int,symbol:Char='*',maximumHeight:Int=40):Unit={
        //for this exercise we are not going to adjust maximumHeight
        //TODO print the tree HINT: check the last entry in Day7Strings
        }
        val name=readLine("what is your name?"):String
        val height=readLine("How many layer do you a tree?").toInt
        if(height<1||height>41)println("max height exceed 40")
        else{
        def printTree(name:String,height:Int,symbol:Char='*',maximumHeight:Int=40):Unit={
        println(" "*height+symbol)
        for(n<-1until height){
        println(" "*(height-n)+((name*maximumHeight)(n-1)).toString*(n*2+1))

        }

        }
        printTree(name,height)
        println(name*10)
        }


        }
