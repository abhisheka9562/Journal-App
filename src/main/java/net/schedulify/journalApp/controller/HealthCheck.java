//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.schedulify.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    public HealthCheck() {
    }

    @GetMapping({"/health-check"})
    public String healthCheck() {
        return "Ok";
    }
}
