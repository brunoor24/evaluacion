package com.example.leccion.controller

import com.example.leccion.model.Attendee
import com.example.leccion.service.AttendeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


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

    @PutMapping
    fun update (@RequestBody attendee:Attendee): ResponseEntity<Attendee>{
        return  ResponseEntity(attendeeService.update(attendee), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName (@RequestBody attendee:Attendee):ResponseEntity<Attendee>{
        return ResponseEntity(attendeeService.updateName(attendee), HttpStatus.OK)
    }
}

