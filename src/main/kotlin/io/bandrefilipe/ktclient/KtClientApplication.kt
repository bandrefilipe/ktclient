package io.bandrefilipe.ktclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtClientApplication

fun main(args: Array<String>) {
    runApplication<KtClientApplication>(*args)
}
