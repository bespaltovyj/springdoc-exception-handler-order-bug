package io.github.bespaltovyj

import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException::class)
    @ResponseStatus
    fun processException(): GlobalErrorDto = GlobalErrorDto("global")
}