package com.example.leccion.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotBlank

@Entity
@Table(name="attendee")
class Attendee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    @NotBlank
    var id: Long? = null
    @NotBlank
    var name:String? = null
    var email:String? = null
    var institution:String? = null
    var posision:String? = null

}