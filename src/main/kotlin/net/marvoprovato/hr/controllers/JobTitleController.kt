package net.marvoprovato.hr.controllers

import net.marvoprovato.hr.entites.JobTitle
import net.marvoprovato.hr.repositories.JobTitleRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/jobTitles")
class JobTitleController(private val repository: JobTitleRepository) {
    @GetMapping("/")
    fun list(): Iterable<JobTitle> = repository.findAll()

    @GetMapping("/{id}")
    fun read(@PathVariable id: Long): JobTitle = repository.findById(id).orElseThrow {
        throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }
}
