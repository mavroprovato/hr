package net.marvoprovato.hr.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/status")
class StatusController {
    @GetMapping("/")
    fun index() : String {
        return "OK";
    }
}
