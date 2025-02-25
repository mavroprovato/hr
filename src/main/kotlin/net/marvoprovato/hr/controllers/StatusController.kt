package net.marvoprovato.hr.controllers

import net.marvoprovato.hr.entites.Department
import net.marvoprovato.hr.repositories.DepartmentRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/status")
class StatusController(private val repository: DepartmentRepository) {
    @GetMapping("/")
    fun index() : String {
        return "OK";
    }

    @PostMapping("/initDb")
    fun initDb() : String {
        val department = Department("Test Department")
        repository.save(department)
        return "OK";
    }
}
