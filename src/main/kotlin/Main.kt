import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.web")
open class Main {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            runApplication<Main>(*args)
        }
    }
}
