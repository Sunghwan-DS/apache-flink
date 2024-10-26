package jsh.apacheflink

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApacheFlinkApplication

fun main(args: Array<String>) {
    runApplication<ApacheFlinkApplication>(*args)
}
