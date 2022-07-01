import Models.FizzBuzz
import Utils.FizzBuzzRules
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class FizzBuzzRulesShould {
    private var fizzBuzz = FizzBuzz(FizzBuzzRules())

    @Test
    fun `Create a List of 100 numbers`(){
        val result = fizzBuzz.GetListFizzBuzz()
        assertThat(result.size).isEqualTo(100)
    }

    @Test
    fun `Return all numbers on String`(){
        val result = fizzBuzz.GetListFizzBuzz()
        assertThat(result.elementAt(result.size-1)).isEqualTo("Buzz")
        assertThat(result.first()).isEqualTo("1")
    }

    @Test
    fun `Return Fizz when number divisible by three`(){
        val result = fizzBuzz.GetListFizzBuzz()
        assertThat(result[2]).isEqualTo("Fizz")
        assertThat(result.get(17)).isEqualTo("Fizz")
        assertThat(result.get(92)).isEqualTo("Fizz")
    }

    @Test
    fun `Return Buzz when number divisible by five`(){
        val result = fizzBuzz.GetListFizzBuzz()
        assertThat(result[4]).isEqualTo("Buzz")
        assertThat(result.get(49)).isEqualTo("Buzz")
        assertThat(result.get(99)).isEqualTo("Buzz")
    }

    @Test
    fun `Return FizzBuzz when number divisible by three and five`(){
        val result = fizzBuzz.GetListFizzBuzz()
        assertThat(result[14]).isEqualTo("FizzBuzz")
        assertThat(result.get(29)).isEqualTo("FizzBuzz")
        assertThat(result.get(89)).isEqualTo("FizzBuzz")
    }

}

