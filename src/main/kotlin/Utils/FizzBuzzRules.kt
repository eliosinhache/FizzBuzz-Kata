package Utils

class FizzBuzzRules : IFizzBuzzRules {
    override fun verifyRule(number: Int): String {
        var result = ""
        if(number % 3 == 0 && number % 5 == 0){
            result = "FizzBuzz"
        }else if(number % 3 == 0) {
            result = "Fizz"
        }else if(number % 5 == 0){
            result = "Buzz"
        }else{
            result = number.toString()
        }
        return result
    }
}
