package com.example.leccion.service

import com.example.leccion.model.Attendee
import com.example.leccion.repository.AttendeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AttendeeService {


        @Autowired
        lateinit var attendeeRepository: AttendeeRepository

        fun list ():List<Attendee>{
            return attendeeRepository.findAll()
        }

        fun save (attendee: Attendee):Attendee{
            return attendeeRepository.save(attendee)
        }

}