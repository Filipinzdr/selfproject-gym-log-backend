package com.app.logworkout.log.exception;

import com.app.logworkout.log.dto.ApiErrorDTO;
import org.aspectj.weaver.ast.Not;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ApiErrorDTO handleNotFound(NotFoundException ex){
        return new ApiErrorDTO(
                HttpStatus.NOT_FOUND.value(),
                "NOT_FOUND",
                ex.getMessage()
        );
    }

    @ExceptionHandler(BadRequestException.class)
    public ApiErrorDTO handleBadRequest(BadRequestException ex){
        return new ApiErrorDTO(
                HttpStatus.BAD_REQUEST.value(),
                "BAD_REQUEST",
                ex.getMessage()
        );
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ApiErrorDTO handleUnauthorized(UnauthorizedException ex){
        return new ApiErrorDTO(
                HttpStatus.UNAUTHORIZED.value(),
                "UNAUTHORIZED",
                ex.getMessage()
        );
    }

    @ExceptionHandler(ForbiddenException.class)
    public ApiErrorDTO handleForbidden(ForbiddenException ex){
        return new ApiErrorDTO(
                HttpStatus.FORBIDDEN.value(),
                "FORBIDDEN",
                ex.getMessage()
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiErrorDTO handleValidation(MethodArgumentNotValidException ex){
        String message = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .findFirst()
                .map(err -> err.getField() + ": " + err.getDefaultMessage())
                .orElse("Dados inválidos");

        return new ApiErrorDTO(
                HttpStatus.BAD_REQUEST.value(),
                "VALIDATION_ERROR",
                message
        );
    }

    @ExceptionHandler(Exception.class)
    public ApiErrorDTO handleGeneric(Exception ex){
        return new ApiErrorDTO(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "INTERNAL_ERROR",
                "Erro inesperado"
        );
    }



}
