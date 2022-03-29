package com.johann.finance.sandbox.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/fa-api/sandbox")
class SandboxController {
    @GetMapping("/hi")
    private fun hi() = Mono.just("hi, that's all I know for now.")
}