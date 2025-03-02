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
    public String calculatePercentage(@RequestBody PercentageRequest request ){

        double result = percentageService.calculatePercentage(request.getTotalMarks(), request.getPercentage());
        return request.getPercentage() + "% of " + request.getTotalMarks() + " = " + result;

    }
}
