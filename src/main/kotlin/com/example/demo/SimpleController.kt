package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
//studentRepository: StudentRepository pobranie repozytorum
class SimpleController(val studentRepository: StudentRepository) {
@RequestMapping("")
    fun getInfo():String{
        return "info"
    }
    @RequestMapping("tomek")
    fun getIndex() = "index"
    //doanie studenta
    @RequestMapping("add")
    fun add(@RequestParam name: String, @RequestParam surname: String):String{
        studentRepository.save(Student(name, surname))
        return "dodano studenta ${name}_${surname}"
    }
    @RequestMapping("Students")
    fun allStudents():Iterable<Student>{
        val students = studentRepository.findAll()
        return studentRepository.findAll()
    }
}