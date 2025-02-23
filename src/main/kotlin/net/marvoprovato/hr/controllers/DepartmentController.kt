package net.marvoprovato.hr.controllers

import net.marvoprovato.hr.entites.Department
import net.marvoprovato.hr.repositories.DepartmentRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/departments")
class DepartmentController(private val repository: DepartmentRepository) {
    @GetMapping("/")
    fun list(): Iterable<Department> = repository.findAll()

    @GetMapping("/{id}")
    fun read(@PathVariable id: Long): Department = repository.findById(id).orElseThrow {
        throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }
}
