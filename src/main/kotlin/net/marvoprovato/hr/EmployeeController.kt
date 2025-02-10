package net.marvoprovato.hr

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employees")
class EmployeeController {
    @GetMapping
    fun list() = listOf(
        Employee(1, "John", "Doe"),
        Employee(2, "Jane", "Doe")
    )
}
