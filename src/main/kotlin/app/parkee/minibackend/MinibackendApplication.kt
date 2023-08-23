package app.parkee.minibackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MinibackendApplication

fun main(args: Array<String>) {
	runApplication<MinibackendApplication>(*args)
}
