package com.johann.finance.sandbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SandboxServiceApplication

fun main(args: Array<String>) {
	runApplication<SandboxServiceApplication>(*args)
}
