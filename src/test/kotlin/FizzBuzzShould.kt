import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue


class FizzBuzzShould {
    @Test
    fun `Create an Array`(){
        val fizzBuzz = FizzBuzz()
        val result = fizzBuzz.GetListFizzBuzz()
        assertThat(99).isEqualTo(result.size)
    }

    @Test
    fun `Return all numbers on String`(){
        val fizzBuzz = FizzBuzz()
        val result = fizzBuzz.GetListFizzBuzz()
        //val expectedNumbers = Array(99){(it + 1).rangeTo(1)}
        assertThat(result[result.size-1]).isEqualTo("100")
        assertThat(result[0]).isEqualTo("1")
    }


}