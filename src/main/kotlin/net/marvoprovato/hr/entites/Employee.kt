package net.marvoprovato.hr.entites

import jakarta.persistence.Entity
import jakarta.persistence.Enumerated
import jakarta.persistence.EnumType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "employees")
class Employee(
    var firstName: String,
    var lastName: String,
    var birthDate: LocalDate,
    var hireDate: LocalDate,
    @Enumerated(EnumType.STRING) var gender: Gender?,
    @Id @GeneratedValue var id: Long? = null
)
