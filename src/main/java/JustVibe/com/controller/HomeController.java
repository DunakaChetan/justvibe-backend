package JustVibe.com.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
public class HomeController {
    
    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "JustVibe Backend API is running!");
        response.put("status", "success");
        response.put("version", "1.0.0");
        response.put("contextPath", "/justvibe-backend");
        response.put("endpoints", Map.of(
            "users", "/justvibe-backend/users",
            "songs", "/justvibe-backend/songs", 
            "albums", "/justvibe-backend/albums",
            "health", "/justvibe-backend/health"
        ));
        return response;
    }
    
    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "JustVibe Backend");
        response.put("contextPath", "/justvibe-backend");
        return response;
    }
}

