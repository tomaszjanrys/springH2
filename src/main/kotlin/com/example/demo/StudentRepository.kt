package com.example.demo

import org.springframework.data.repository.CrudRepository

// : to dziedziczenie <parametry Student i ID = Long >
//Gotowa baza z repozytorium
interface StudentRepository :CrudRepository<Student,Long> {
    fun findStudentByName(name:String):List<Student>
}