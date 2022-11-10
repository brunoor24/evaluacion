package com.example.leccion.controller

import com.example.leccion.model.Attendee
import com.example.leccion.service.AttendeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


    @RestController
    @RequestMapping("/attendee")
    class AttendeeController {

        @Autowired
        lateinit var attendeeService: AttendeeService

        @GetMapping
        fun list():List<Attendee>{
            return attendeeService.list()
        }

        @PostMapping
        fun save(@RequestBody attendee: Attendee):Attendee? {
            return attendeeService.save(attendee)
        }

        }

