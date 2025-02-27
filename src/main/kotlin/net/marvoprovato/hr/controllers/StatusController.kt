package net.marvoprovato.hr.controllers

import net.marvoprovato.hr.services.InitDbService;
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/status")
class StatusController(private val service: InitDbService) {
    @GetMapping("/")
    fun index() : String {
        return "OK";
    }

    @PostMapping("/initDb")
    fun initDb() : String {
        service.initDb()
        return "OK";
    }
}
