object Fizz extends App{
        var n=1
        while(n<100){
        if(n%5==0&&n%7==0){
        println("FizzBuzz!")
        }
        else if(n%5==0){
        println("Fizz!")
        }
        else if(n%7==0){
        println("Buzz!")
        }
        else{
        println(n)
        n=n+1


        }
        }
        }
