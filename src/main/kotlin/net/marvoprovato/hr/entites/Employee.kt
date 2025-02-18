package net.marvoprovato.hr.entites

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "employees")
class Employee(
    var firstName: String,
    var lastName: String,
    var birthDate: LocalDate,
    var hireDate: LocalDate,
    @ManyToOne var jobTitle: JobTitle,
    @Enumerated(EnumType.STRING) var gender: Gender?,
    @Id @GeneratedValue var id: Long? = null
)
