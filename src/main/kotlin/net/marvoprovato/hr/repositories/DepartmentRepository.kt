package net.marvoprovato.hr.repositories

import net.marvoprovato.hr.entites.Department
import org.springframework.data.repository.CrudRepository

interface DepartmentRepository : CrudRepository<Department, Long>