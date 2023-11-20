package com.auth.security.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Tag(name = "Dashboard Controller")
public class DashboardController {
    @GetMapping
    public String dashboard() {
        return "Welcome, you are here now!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "You can view this only if you are admin!";
    }

    @GetMapping("/staff")
    public String staff() {
        return "If you are admin or staff, you can access this page!";
    }
}
