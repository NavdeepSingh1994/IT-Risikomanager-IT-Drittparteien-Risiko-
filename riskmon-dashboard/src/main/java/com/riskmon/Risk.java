package com.riskmon;

import jakarta.persistence.*;

@Entity
public class Risk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean mfaImplemented;
    private boolean loggingEnabled;
    private boolean thirdPartyContract;
    private boolean isoCompliant;

    private String riskLevel;
    private String recommendation;

    // Getter & Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isMfaImplemented() { return mfaImplemented; }
    public void setMfaImplemented(boolean mfaImplemented) { this.mfaImplemented = mfaImplemented; }

    public boolean isLoggingEnabled() { return loggingEnabled; }
    public void setLoggingEnabled(boolean loggingEnabled) { this.loggingEnabled = loggingEnabled; }

    public boolean isThirdPartyContract() { return thirdPartyContract; }
    public void setThirdPartyContract(boolean thirdPartyContract) { this.thirdPartyContract = thirdPartyContract; }

    public boolean isIsoCompliant() { return isoCompliant; }
    public void setIsoCompliant(boolean isoCompliant) { this.isoCompliant = isoCompliant; }

    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }

    public String getRecommendation() { return recommendation; }
    public void setRecommendation(String recommendation) { this.recommendation = recommendation; }
}
