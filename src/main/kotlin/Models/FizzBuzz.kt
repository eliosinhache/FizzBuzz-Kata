package Models

import Utils.IFizzBuzzRules

class FizzBuzz(private val rules: IFizzBuzzRules) {

    fun GetListFizzBuzz(): List<String> {
        var list = mutableListOf<String>()
        for (index in 1..100) {
            list.add(rules.verifyRule(index))
        }
        return list
    }
}
