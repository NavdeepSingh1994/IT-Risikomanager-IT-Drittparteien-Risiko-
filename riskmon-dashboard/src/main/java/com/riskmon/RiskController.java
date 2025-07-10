package com.riskmon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RiskController {

    private final List<Risk> risks = new ArrayList<>();

    @Autowired
    private RiskService riskService;

    @GetMapping("/risk")
    public String showForm(Model model) {
        model.addAttribute("risk", new Risk());
        return "risk_form";
    }

    @PostMapping("/risk")
    public String submitForm(@ModelAttribute Risk risk, Model model) {
        riskService.evaluateRisk(risk);
        risks.add(risk);
        model.addAttribute("risks", risks);
        return "risk_list";
    }
}
