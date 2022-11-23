package com.example.leccion.service


import com.example.leccion.model.Product
import com.example.leccion.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ProductService {
    @Autowired
    lateinit var productRepository: ProductRepository
    @Autowired
    lateinit var productRepository: ProductRepository

    fun list (): MutableList<Product> {
        return productRepository.findAll()
    }

    fun save (product: Product):Product{
        try {
            productRepository.findById(product.productId)
                    ?: throw Exception("Asistente no existe")
            return productRepository.save(product)
        }
        catch(ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun update(product: Product):Product{
        try {
            productRepository.findById(product.productId)
                    ?: throw Exception("Id no existe")
            return productRepository.save(product)
        }
        catch(ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
    fun updateName(product:Product): Product {
        try{
            val response = productRepository.findById(product.id)
                    ?: throw Exception("ID no existe")
            response.apply {
                total=product.total
            }
            return productRepository.save(response)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}