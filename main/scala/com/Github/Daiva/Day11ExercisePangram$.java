object Day11ExercisePangram extends App{

        //TODO write a pangram tester
        //https://en.wikipedia.org/wiki/Pangram
        //check if text contains every letter of an alphabet at least once
        //for this task consider upuper and lower case the same
        def isPangram(text:String,alpha:String="abcdefghijklmnopqrstuvwxyz"):Boolean={
        true  //FIXME
        }
        val myTestText="The five boxing wizards jump quickly"
        //useful to get unique characters
        val alpha="abcdefghijklmnopqrstuvwxyz".toSet
        val TestText="The five boxing wizards jump quickly".toLowerCase.toSet
        println(alpha)
        val text=alpha.subsetOf(TestText)
        println(TestText)
        println(text)
        //FIXME
        println(isPangram(myTestText)) //should be true


        }
