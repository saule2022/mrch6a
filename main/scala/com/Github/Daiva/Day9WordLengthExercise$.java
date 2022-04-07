object Day9WordLengthExercise extends App{
        //TODO ask user to enter a sentence
        //Split sentence into words using split , you will will have a sequence of words, we did this on Day 8
        //Generate word length sequence (can use map or yield)
        //Filter only words of length over 5
        //print word lengths for every word
        //print the long words

        //you are allowed to use yield or map/filter

        val sentence=readLine("Enter any sentence, please:\n")

        val words=sentence.split(" ")
        println(words.mkString(","))

        val wordsLength=words.map(_.length) //so new sequence will be word lengths for each word in the words
        println(wordsLength.mkString(","))
        val wordsfilt=wordsLength.filter(it=>it>5)
        println(wordsfilt.mkString(","))

        val wordsover5=words.filter(it=>it.length>5)
        println(s"words over 5 is ${wordsover5.mkString(",")} ")


        //for ((word, wordLength) <- words zip wordsfilt) { //with zip we can go through 2 sequences at once
        // println(s"Word $word is $wordLength characters long") //of course here I could have calculated the length onthe spot with word.length


        println(s"My sentence of ${words.mkString(",")} has words of lenght ${wordsLength.mkString(",")}")
        for(word<-words){
        println(s"the word: $word lenght is: ${word.length}")

        }


        }
