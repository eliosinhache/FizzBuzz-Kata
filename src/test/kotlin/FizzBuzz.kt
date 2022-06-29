class FizzBuzz() {

    private val FIZZ: String = "Fizz"

    fun GetListFizzBuzz(): Set<String> {
        /*val arrayFizzBuzz = arrayOfNulls<String>(100)
        var index = 1
        while (index <= arrayFizzBuzz.size) {
            arrayFizzBuzz[index-1] = index.toString()
            index++
        }
        return arrayFizzBuzz*/


        return GetArray().toSet()

    }

    private fun GetArray(): MutableList<String> {
        var list = mutableListOf<String>()
        /*for (i in 1..100){
            if(i % 3 == 0) {
                list.add(FIZZ)
            }else{
                list.add(i.toString())
            }
        }*/

        var index = 1
        while (index <= 100) {
            if(index % 3 == 0) {
                list.add("Fizz")
            }else{
                list.add(index.toString())
            }
            index++
        }

        /*println(list)
        println(list.indexOf("30"))
        println(list.elementAt(29))*/

        return list
    }

}
