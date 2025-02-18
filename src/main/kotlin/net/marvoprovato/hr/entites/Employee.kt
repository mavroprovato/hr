package net.marvoprovato.hr.entites

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Employee(
    var firstName: String,
    var lastName: String,
    @Id @GeneratedValue var id: Long? = null
)