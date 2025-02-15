package net.marvoprovato.hr.services

import net.marvoprovato.hr.Employee
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import org.springframework.jdbc.core.query

@Service
class EmployeeService(private val db: JdbcTemplate) {
    fun list(): List<Employee> = db.query("select * from employees") { response, _ ->
        Employee(response.getInt("id"), response.getString("first_name"), response.getString("last_name"))
    }

    fun read(id: Int): Employee? = db.query("select * from employees where id = ?", id) { response, _ ->
        Employee(response.getInt("id"), response.getString("first_name"), response.getString("last_name"))
    }.singleOrNull()
}
