object Day7StringExercise extends App{
        //TODO
        def processString(text:String,uppercaseChars:String="",needsTrim:Boolean=false,suffix:String=""):String={
        //you will need to write a loop
        //you will probably want to use var to store a temporary string that you keep reweriting
        //return newly created string

        val trimmedString=if(needsTrim)text.trim else text

        var newString="" //so I start with an empty string and build it up
        //this approach with an empty string is completely fine on smaller strings say a few hundred characters long
        val sb=new StringBuilder("") //optimized just for building strings up here we start with an empty string
        //so string builder is mutable unlike regular strings meaning we can add to it
        //the approach with an empty string is completely fine on smaller strings say a few hundred characters long
        //it will get slow to add a new character to the end of a large string
        //for that we need to use a StringBuilder which is optimized for concatenation operations
        //https://www.baeldung.com/scala/stringbuilder //TODO check it out
        //https://www.baeldung.com/scala/stringbuilder
        for(c<-trimmedString){
        if(uppercaseChars.contains(c)){
        newString+=c.toUpper //we are building up a new string one character at a time
        sb+=c.toUpper //we are building up a new string one character at a time
        }else{
        newString+=c
        sb+=c //adding a single char notice +=
        }
        }
        newString
        sb++=suffix //we add string to the end
        sb.toString //once we've build up our stringbuilder we cast it to string
        }
        //again adding too much functionality to a single function can be problematic, consider using multiple smaller functions

        println(processString("abracadabra","cr")) //should print abRaCadabRa
        println(processString("   abracadabra  ","cr",needsTrim=true)) //should print abRaCadabRa
        println(processString("   Riga is a nice city isn't it?  ","ci",needsTrim=true)) //should print abRaCadabRa
        println(processString("   Riga is a nice city isn't it?  "
        ,"ci"
        ,needsTrim=true
        ,"END OF MY STRING!")) //should print abRaCadabRa

        }
