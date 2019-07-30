package top.whq6.study.entity;

public class Drug {
    private Integer drugId;

    private Integer userId;

    private String drugName;

    private String drugEffect;

    private String drugIntro;

    private Integer drugPrice;

    private String drugRecommender;

    private String drugPrimaryKey;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getDrugEffect() {
        return drugEffect;
    }

    public void setDrugEffect(String drugEffect) {
        this.drugEffect = drugEffect == null ? null : drugEffect.trim();
    }

    public String getDrugIntro() {
        return drugIntro;
    }

    public void setDrugIntro(String drugIntro) {
        this.drugIntro = drugIntro == null ? null : drugIntro.trim();
    }

    public Integer getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Integer drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getDrugRecommender() {
        return drugRecommender;
    }

    public void setDrugRecommender(String drugRecommender) {
        this.drugRecommender = drugRecommender == null ? null : drugRecommender.trim();
    }

    public String getDrugPrimaryKey() {
        return drugPrimaryKey;
    }

    public void setDrugPrimaryKey(String drugPrimaryKey) {
        this.drugPrimaryKey = drugPrimaryKey == null ? null : drugPrimaryKey.trim();
    }
}