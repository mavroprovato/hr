package net.marvoprovato.hr.repositories

import net.marvoprovato.hr.entites.Employee
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<Employee, Long>