
package com.business.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<Map<String, String>> handleRuntimeException(
      RuntimeException exception) {

    String message = exception.getMessage();

    if (message != null && message.startsWith("Employee not found")) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND)
          .body(Map.of("error", message));
    }

    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(Map.of("error", message == null
            ? "Invalid request"
            : message));
  }
}
