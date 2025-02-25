package net.marvoprovato.hr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HrApiApplication

fun main(args: Array<String>) {
    runApplication<HrApiApplication>(*args)
}
