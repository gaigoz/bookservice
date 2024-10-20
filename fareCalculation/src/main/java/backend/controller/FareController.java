package backend.controller;

import backend.service.FareCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fare")
public class FareController {

    @Autowired
    private FareCalculatorService fareCalculatorService;

    @GetMapping("/calculate")
    public double calculateFare(@RequestParam String cabType, @RequestParam double distance) {
        return fareCalculatorService.calculateFare(cabType, distance);
    }
}
