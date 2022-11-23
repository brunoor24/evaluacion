package com.example.leccion.controller

import com.example.leccion.model.Invoice
import com.example.leccion.model.Product
import com.example.leccion.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/product")
class ProductController {
    @Autowired
    lateinit var productService: ProductService


    @GetMapping
    fun list(): List<Invoice> {
        return productService.list()
    }

    @PostMapping
    fun save(@RequestBody @Valid product: Product):Product? {
        return productService.save(product)
    }

    @PutMapping
    fun update (@RequestBody product:Product): ResponseEntity<Product>{
        return  ResponseEntity(productService.update(product), HttpStatus.OK)
    }
}