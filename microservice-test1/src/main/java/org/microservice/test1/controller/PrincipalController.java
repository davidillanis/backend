package org.microservice.test1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/principal")
public class PrincipalController {
    @GetMapping(path = "/david")
    public ResponseEntity<?> hello() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "David");
        map.put("dateBirth", LocalDate.of(2004, Month.JULY, 11));
        map.put("country", "Peru");
        return ResponseEntity.ok(map);
    }
}
