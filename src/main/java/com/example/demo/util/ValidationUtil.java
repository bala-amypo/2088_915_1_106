package com.example.demo.util;

public class ValidationUtil {

    private ValidationUtil() {
    }

    public static void requireNonEmpty(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " required");
        }
    }

    public static void requireNotNull(Object value, String fieldName) {
        if (value == null) {
            throw new IllegalArgumentException(fieldName + " required");
        }
    }
}
