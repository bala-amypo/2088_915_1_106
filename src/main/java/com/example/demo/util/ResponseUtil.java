package com.example.demo.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

    private ResponseUtil() {
    }

    public static <T> ResponseEntity<ApiResponse<T>> success(
            String message, T data) {

        ApiResponse<T> response =
                new ApiResponse<>(true, message, data);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<ApiResponse<Object>> error(
            String message, HttpStatus status) {

        ApiResponse<Object> response =
                new ApiResponse<>(false, message);

        return new ResponseEntity<>(response, status);
    }
}
