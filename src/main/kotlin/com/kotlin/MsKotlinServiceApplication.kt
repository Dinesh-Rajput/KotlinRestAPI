package com.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MsKotlinServiceApplication

fun main(args: Array<String>) {
	runApplication<MsKotlinServiceApplication>(*args)
}
