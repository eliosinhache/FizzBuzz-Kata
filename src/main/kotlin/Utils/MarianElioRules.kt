package Utils

class MarianElioRules : IFizzBuzzRules {
    override fun verifyRule(number: Int): String {
        var result = ""
        if(number % 6 == 0 && number % 8 == 0){
            result = "MarianElio"
        }else if(number % 6 == 0) {
            result = "Marian"
        }else if(number % 8 == 0){
            result = "Elio"
        }else{
            result = number.toString()
        }
        return result
    }
}