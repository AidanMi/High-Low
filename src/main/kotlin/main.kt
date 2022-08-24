import kotlin.random.Random

fun main() {
    var guess: Int = 0
    var number = Random.nextInt(0,100)
    while(guess!=number){
        println("guess a number: ")
        guess = readln()!!.toInt()
        if(guess==number){
            println("You got the number: " + guess)
        }
        else if(guess<number){
            println("Too Low")
        }
        else if(guess>number){
            println("Too High")
        }
    }
}