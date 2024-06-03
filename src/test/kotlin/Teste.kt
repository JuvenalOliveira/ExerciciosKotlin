import org.example.ExerciciosFuncao.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Funcionalidades {

    @Test
    fun somaTest() {
        val response = soma(10, 10, 10)
        Assertions.assertEquals(response, 30)

        val x = somaImposto(0.05,1000)
        Assertions.assertEquals(x, 1050.0)

        val y = valorPagamento(1000.0, 5)
        Assertions.assertEquals(y, 1080.0)
    }

    @Test
    fun checar() {
        val response = checar(1)
        Assertions.assertEquals(response, 'P')

        val x = modificar(100)
        Assertions.assertEquals(x, 3)

        val y = inverterNumero(123)
        Assertions.assertEquals(y, 321)

        val data = formatarData("25/11/2024")
        Assertions.assertEquals(data, "25/Novembro/2024")

        val embaralhar = Embaralhar("Jotaro")
        Assertions.assertEquals(embaralhar::class, String::class)

        val horario = converterHora("14:54")
        Assertions.assertEquals(horario, "2:54PM")
    }
}
