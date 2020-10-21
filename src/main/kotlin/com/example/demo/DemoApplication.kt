package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication

//dodawanie studentow do repozytorium
@Bean
fun init(repository: StudentRepository) = CommandLineRunner{
	for(i in 1..10)
	repository.save(Student("Tomasz","Rys_${i}"))
}
fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
