package com.example.leccion.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
@Table(name="detail")
class Detail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @NotBlank
    @NotNull
    var quantaty: Long? = null
    @Column(name="invoice_id")
    @NotBlank
    @NotNull
    var invoiceId: Long? = null
    @Column(name="product_id")
    @NotBlank
    @NotNull
    var productId: Long? = null

}