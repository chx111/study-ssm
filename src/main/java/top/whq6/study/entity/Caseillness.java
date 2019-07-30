package top.whq6.study.entity;

public class Caseillness {
    private Integer caseillnessId;

    private String caseillnessName;

    private String caseillnessCondition;

    public Integer getCaseillnessId() {
        return caseillnessId;
    }

    public void setCaseillnessId(Integer caseillnessId) {
        this.caseillnessId = caseillnessId;
    }

    public String getCaseillnessName() {
        return caseillnessName;
    }

    public void setCaseillnessName(String caseillnessName) {
        this.caseillnessName = caseillnessName == null ? null : caseillnessName.trim();
    }

    public String getCaseillnessCondition() {
        return caseillnessCondition;
    }

    public void setCaseillnessCondition(String caseillnessCondition) {
        this.caseillnessCondition = caseillnessCondition == null ? null : caseillnessCondition.trim();
    }
}