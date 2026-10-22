package com.carrer_prep.spring_ramp_up.exception_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import com.carrer_prep.spring_ramp_up.dtos.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
        ErrorResponse error = new ErrorResponse(ex.getStatusCode(), ex.getMessage(), ex.getNestedPath());
        return new ResponseEntity<>("Invalid method argument" + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleNotFound(HttpClientErrorException.NotFound ex) {
        return new ResponseEntity<>("Not found" + ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
