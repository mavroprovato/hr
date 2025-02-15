package net.marvoprovato.hr.services

import net.marvoprovato.hr.Employee
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val db: JdbcTemplate) {
    fun find(): List<Employee> = db.query("select * from employees") { response, _ ->
        Employee(response.getInt("id"), response.getString("first_name"), response.getString("last_name"))
    }
}
