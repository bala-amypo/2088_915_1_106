package com.example.demo.controller;

import com.example.demo.entity.ComplianceLog;
import com.example.demo.service.ComplianceEvaluationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compliance")
@Tag(name = "Compliance Evaluation Endpoints")
public class ComplianceEvaluationController {

    private final ComplianceEvaluationService complianceEvaluationService;

    public ComplianceEvaluationController(ComplianceEvaluationService complianceEvaluationService) {
        this.complianceEvaluationService = complianceEvaluationService;
    }

    @PostMapping("/evaluate/{readingId}")
    public ComplianceLog evaluateReading(@PathVariable Long readingId) {
        return complianceEvaluationService.evaluateReading(readingId);
    }

    @GetMapping("/reading/{readingId}")
    public List<ComplianceLog> getLogsByReading(@PathVariable Long readingId) {
        return complianceEvaluationService.getLogsByReading(readingId);
    }

    @GetMapping("/{id}")
    public ComplianceLog getLog(@PathVariable Long id) {
        return complianceEvaluationService.getLog(id);
    }
}
