package net.marvoprovato.hr.repositories

import net.marvoprovato.hr.entites.JobTitle
import org.springframework.data.repository.CrudRepository

interface JobTitleRepository : CrudRepository<JobTitle, Long>