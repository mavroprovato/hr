package net.marvoprovato.hr.controllers

import net.marvoprovato.hr.services.EmployeeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employees")
class EmployeeController(private val service: EmployeeService) {
    @GetMapping
    fun listEmployees() = service.find()
}
