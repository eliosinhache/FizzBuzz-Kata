class FizzBuzz() {
    fun GetListFizzBuzz(): Array<String?> {
        val arrayFizzBuzz = arrayOfNulls<String>(100)
        var index = 1
        while (index <= arrayFizzBuzz.size) {
            arrayFizzBuzz[index-1] = index.toString()
            index++
        }

        return arrayFizzBuzz
    }

}
