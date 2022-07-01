import Models.FizzBuzz
import Utils.MarianElioRules
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MarianElioRulesShould {
    private var fizzBuzz = FizzBuzz(MarianElioRules())
    private enum class Prints { MarianElio, Marian, Elio }
    @Test
    fun `Create a List of 100 numbers`(){
        val result = fizzBuzz.GetListFizzBuzz()
        Assertions.assertThat(result.size).isEqualTo(100)
    }

    @Test
    fun `Return all numbers on String`(){
        val result = fizzBuzz.GetListFizzBuzz()
        Assertions.assertThat(result.elementAt(result.size - 1)).isEqualTo("100")
        Assertions.assertThat(result.first()).isEqualTo("1")
    }

    @Test
    fun `Return Fizz when number divisible by six`(){
        val result = fizzBuzz.GetListFizzBuzz()
        Assertions.assertThat(result[5]).isEqualTo(Prints.Marian.toString())
    }

    @Test
    fun `Return Buzz when number divisible by eight`(){
        val result = fizzBuzz.GetListFizzBuzz()
        Assertions.assertThat(result[7]).isEqualTo(Prints.Elio.toString())
    }

    @Test
    fun `Return FizzBuzz when number divisible by six and eight`(){
        val result = fizzBuzz.GetListFizzBuzz()
        Assertions.assertThat(result[47]).isEqualTo(Prints.MarianElio.toString())
    }
}