package net.marvoprovato.hr.entites

import jakarta.persistence.*

@Entity
@Table(name = "job_titles")
class JobTitle(
    @Column(unique = true, nullable = false) var name: String,
    @Id @GeneratedValue var id: Long? = null
)
