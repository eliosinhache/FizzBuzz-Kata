import Models.FizzBuzz
import Utils.FizzBuzzRules
import Utils.MarianElioRules

fun main(args: Array<String>) {
    println("""
        1 - Base Rules
        2 - MarianElio Rules
    """.trimIndent())

    val op = readLine()!!.toInt()

    val buzz = if (op == 1) {
        FizzBuzz(FizzBuzzRules())
    } else {
        FizzBuzz(MarianElioRules())
    }
    println(buzz.GetListFizzBuzz())
}