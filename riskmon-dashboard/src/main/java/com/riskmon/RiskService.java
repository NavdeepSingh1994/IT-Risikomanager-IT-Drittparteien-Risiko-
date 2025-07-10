package com.riskmon;

import org.springframework.stereotype.Service;

@Service
public class RiskService {

    public void evaluateRisk(Risk risk) {
        int score = 0;

        if (!risk.isMfaImplemented()) score++;
        if (!risk.isLoggingEnabled()) score++;
        if (!risk.isThirdPartyContract()) score++;
        if (!risk.isIsoCompliant()) score++;

        if (score == 0) {
            risk.setRiskLevel("Niedrig");
            risk.setRecommendation("Keine Maßnahmen erforderlich.");
        } else if (score <= 2) {
            risk.setRiskLevel("Mittel");
            risk.setRecommendation("Teilweise Verbesserungen nötig, z.B. Logging aktivieren.");
        } else {
            risk.setRiskLevel("Hoch");
            risk.setRecommendation("Dringende Maßnahmen gemäß ISO 27001 einleiten.");
        }
    }
}
