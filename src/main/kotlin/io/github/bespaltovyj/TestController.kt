package io.github.bespaltovyj

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class TestController {

    @GetMapping("/test")
    fun getBody(): String {
        throw IllegalArgumentException()
    }

    @ExceptionHandler(RuntimeException::class)
    @ResponseStatus
    fun processException(): LocalErrorDto = LocalErrorDto("local")
}