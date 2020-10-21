package com.example.demo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity //rozponznaje ze jest to czesc bazy danych
class Student (val name: String,
               val surname: String,
               @Id @GeneratedValue(strategy = GenerationType.AUTO)
               val id:Long = 0
               )
