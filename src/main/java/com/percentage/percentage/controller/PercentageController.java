package com.percentage.percentage.controller;


import com.percentage.percentage.model.PercentageRequest;
import com.percentage.percentage.service.PercentageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//@CrossOrigin(origins = "https://alicalculators.netlify.app/percentage")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/percentage")
public class PercentageController {

    @Autowired
    private PercentageService percentageService;

    @PostMapping("calculate")
    public double calculatePercentage(@RequestBody PercentageRequest request) {
        return percentageService.calculatePercentage(request.getTotalMarks(), request.getPercentage());

    }
}
