import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue


class FizzBuzzShould {

    private var fizzBuzz = FizzBuzz()

    @BeforeEach
    fun Setup(){

    }

    @Test
    fun `Create an Array`(){
        val result = fizzBuzz.GetListFizzBuzz()
        assertThat(99).isEqualTo(result.size)
    }

    @Test
    fun `Return all numbers on String`(){
        val result = fizzBuzz.GetListFizzBuzz()
        //val expectedNumbers = Array(99){(it + 1).rangeTo(1)}
        assertThat(result.elementAt(result.size-1)).isEqualTo("100")
        assertThat(result.first()).isEqualTo("1")


    }

    @Test
    fun `Return Fizz when number divisible by three`(){

        val result = fizzBuzz.GetListFizzBuzz()

        assertThat(result.elementAt(2)).isEqualTo("Fizz")
        assertThat(result.elementAt(29)).isEqualTo("Fizz")
    }


}

