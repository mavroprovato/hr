package net.marvoprovato.hr.services

import net.marvoprovato.hr.entites.Department
import net.marvoprovato.hr.repositories.DepartmentRepository
import org.springframework.stereotype.Service

@Service
class InitDbService(private val repository: DepartmentRepository) {
    fun initDb() {
        // TODO: check if department exists
        val department = Department("Test Department")
        repository.save(department)
    }
}
