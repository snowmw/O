package x.o.o

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OApplication

fun main(args: Array<String>) {
    runApplication<OApplication>(*args)
}