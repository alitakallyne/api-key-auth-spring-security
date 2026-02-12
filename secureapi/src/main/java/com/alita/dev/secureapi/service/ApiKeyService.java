package com.alita.dev.secureapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class ApiKeyService {

    @Value("${api.key}")
    private String apiKey;

    public boolean isValid(String key) {
        if (apiKey == null || key == null) return false;
        return apiKey.trim().equals(key.trim());
    }



   
}
