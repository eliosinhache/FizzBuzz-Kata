class FizzBuzz() {

    fun GetListFizzBuzz(): List<String> {
        var list = mutableListOf<String>()
        for (index in 1..100) {
            list.add(verifyNumber(index))
        }
        return list
    }

    private fun verifyNumber(index: Int): String {
        var result = ""
        if(index % 3 == 0 && index % 5 == 0){
            result = "FizzBuzz"
        }else if(index % 3 == 0) {
            result = "Fizz"
        }else if(index % 5 == 0){
            result = "Buzz"
        }else{
            result = index.toString()
        }
        return result
    }

}
