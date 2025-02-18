package net.marvoprovato.hr.controllers

import net.marvoprovato.hr.entites.Employee
import net.marvoprovato.hr.repositories.EmployeeRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/employees")
class EmployeeController(private val repository: EmployeeRepository) {

    @GetMapping("/")
    fun list(): Iterable<Employee> = repository.findAll()

    @GetMapping("/{id}")
    fun read(@PathVariable id: Long): Employee = repository.findById(id).orElseThrow {
        throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }
}
