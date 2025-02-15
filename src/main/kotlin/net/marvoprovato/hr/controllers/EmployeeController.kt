package net.marvoprovato.hr.controllers

import net.marvoprovato.hr.Employee
import net.marvoprovato.hr.services.EmployeeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employees")
class EmployeeController(private val service: EmployeeService) {
    @GetMapping
    fun list() = service.list()

    @GetMapping("/{id}")
    fun read(@PathVariable id: Int): ResponseEntity<Employee> = service.read(id).toResponseEntity()

    private fun Employee?.toResponseEntity(): ResponseEntity<Employee> =
        this?.let { ResponseEntity.ok(it) } ?: ResponseEntity.notFound().build()
}
