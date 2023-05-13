package ua.trydmi.k8stemplate.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello from k8s-template");
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> helloName(@PathVariable String name) {
        return ResponseEntity.ok("Hello " + name + " from k8s-template");
    }
}
