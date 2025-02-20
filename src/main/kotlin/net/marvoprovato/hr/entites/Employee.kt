package net.marvoprovato.hr.entites

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "employees")
class Employee(
    @Column(nullable = false) var firstName: String,
    @Column(nullable = false) var lastName: String,
    @Column(nullable = false) var birthDate: LocalDate,
    @Column(nullable = false) var hireDate: LocalDate,
    @Column(nullable = false) @Enumerated(EnumType.STRING) var gender: Gender = Gender.NA,
    @ManyToOne(optional = false) var department: Department,
    @ManyToOne(optional = false) var jobTitle: JobTitle,
    @Id @GeneratedValue var id: Long? = null
)
