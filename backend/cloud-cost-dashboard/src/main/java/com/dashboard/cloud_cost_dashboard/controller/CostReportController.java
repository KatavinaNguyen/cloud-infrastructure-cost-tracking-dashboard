package com.dashboard.controller;

import com.dashboard.dto.CostReportRequest;
import com.dashboard.dto.CostReportResponse;
import com.dashboard.service.interfaces.ReportGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reports")
public class CostReportController {

    @Autowired
    private ReportGenerationService reportGenerationService;

    @PostMapping
    public CostReportResponse generateCostReport(@RequestBody CostReportRequest request) {
        System.out.println("Received request for report: " + request.getTeamName());
        return reportGenerationService.generateReport(request);
    }
}
