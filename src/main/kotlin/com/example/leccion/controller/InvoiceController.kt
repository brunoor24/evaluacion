package com.example.leccion.controller

import com.example.leccion.model.Invoice
import com.example.leccion.service.AttendeeService
import com.example.leccion.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/invoice")
class InvoiceController {
    @Autowired
    lateinit var invoiceService: InvoiceService


    @GetMapping
    fun list():List<Invoice>{
        return invoiceService.list()
    }

    @PostMapping
    fun save(@RequestBody invoice: Invoice):Invoice? {
        return invoiceService.save(invoice)
    }

    @PutMapping
    fun update (@RequestBody invoice:Invoice): ResponseEntity<Invoice>{
        return  ResponseEntity(invoiceService.update(invoice), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName (@RequestBody invoice:Invoice):ResponseEntity<Invoice>{
        return ResponseEntity(invoiceService.updateName(invoice), HttpStatus.OK)
    }
}

