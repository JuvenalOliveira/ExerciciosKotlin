import org.example.ExerciciosFuncao.*
import org.example.ExerciciosComString.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Funcionalidades {

    @Test
    fun somaTest() {
        val response = soma(10, 10, 10)
        Assertions.assertEquals(response, 30)

        val x = somaImposto(0.05,1000)
        Assertions.assertEquals(x, 1050.0)
    }

    @Test
    fun checar() {
        val response = checar(1)
        Assertions.assertEquals(response, 'P')

        val x  = comparar("oi!","tudo bem?")
        Assertions.assertEquals(x, false)

    }
}
