package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
@RequestMapping("")
    fun getInfo():String{
        return "info"
    }
    @RequestMapping("tomek")
    fun getIndex() = "index"
}