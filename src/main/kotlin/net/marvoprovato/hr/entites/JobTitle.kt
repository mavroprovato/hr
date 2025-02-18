package net.marvoprovato.hr.entites

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "job_titles")
class JobTitle(
    var name: String,
    @Id @GeneratedValue var id: Long? = null
)
