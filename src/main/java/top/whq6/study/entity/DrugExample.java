package top.whq6.study.entity;

import java.util.ArrayList;
import java.util.List;

public class DrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDrugIdIsNull() {
            addCriterion("drug_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugIdIsNotNull() {
            addCriterion("drug_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugIdEqualTo(Integer value) {
            addCriterion("drug_id =", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotEqualTo(Integer value) {
            addCriterion("drug_id <>", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThan(Integer value) {
            addCriterion("drug_id >", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_id >=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThan(Integer value) {
            addCriterion("drug_id <", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_id <=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdIn(List<Integer> values) {
            addCriterion("drug_id in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotIn(List<Integer> values) {
            addCriterion("drug_id not in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_id between", value1, value2, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_id not between", value1, value2, "drugId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNull() {
            addCriterion("drug_name is null");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNotNull() {
            addCriterion("drug_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNameEqualTo(String value) {
            addCriterion("drug_name =", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotEqualTo(String value) {
            addCriterion("drug_name <>", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThan(String value) {
            addCriterion("drug_name >", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("drug_name >=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThan(String value) {
            addCriterion("drug_name <", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThanOrEqualTo(String value) {
            addCriterion("drug_name <=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLike(String value) {
            addCriterion("drug_name like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotLike(String value) {
            addCriterion("drug_name not like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameIn(List<String> values) {
            addCriterion("drug_name in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotIn(List<String> values) {
            addCriterion("drug_name not in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameBetween(String value1, String value2) {
            addCriterion("drug_name between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotBetween(String value1, String value2) {
            addCriterion("drug_name not between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugEffectIsNull() {
            addCriterion("drug_effect is null");
            return (Criteria) this;
        }

        public Criteria andDrugEffectIsNotNull() {
            addCriterion("drug_effect is not null");
            return (Criteria) this;
        }

        public Criteria andDrugEffectEqualTo(String value) {
            addCriterion("drug_effect =", value, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectNotEqualTo(String value) {
            addCriterion("drug_effect <>", value, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectGreaterThan(String value) {
            addCriterion("drug_effect >", value, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectGreaterThanOrEqualTo(String value) {
            addCriterion("drug_effect >=", value, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectLessThan(String value) {
            addCriterion("drug_effect <", value, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectLessThanOrEqualTo(String value) {
            addCriterion("drug_effect <=", value, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectLike(String value) {
            addCriterion("drug_effect like", value, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectNotLike(String value) {
            addCriterion("drug_effect not like", value, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectIn(List<String> values) {
            addCriterion("drug_effect in", values, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectNotIn(List<String> values) {
            addCriterion("drug_effect not in", values, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectBetween(String value1, String value2) {
            addCriterion("drug_effect between", value1, value2, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugEffectNotBetween(String value1, String value2) {
            addCriterion("drug_effect not between", value1, value2, "drugEffect");
            return (Criteria) this;
        }

        public Criteria andDrugIntroIsNull() {
            addCriterion("drug_intro is null");
            return (Criteria) this;
        }

        public Criteria andDrugIntroIsNotNull() {
            addCriterion("drug_intro is not null");
            return (Criteria) this;
        }

        public Criteria andDrugIntroEqualTo(String value) {
            addCriterion("drug_intro =", value, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroNotEqualTo(String value) {
            addCriterion("drug_intro <>", value, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroGreaterThan(String value) {
            addCriterion("drug_intro >", value, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroGreaterThanOrEqualTo(String value) {
            addCriterion("drug_intro >=", value, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroLessThan(String value) {
            addCriterion("drug_intro <", value, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroLessThanOrEqualTo(String value) {
            addCriterion("drug_intro <=", value, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroLike(String value) {
            addCriterion("drug_intro like", value, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroNotLike(String value) {
            addCriterion("drug_intro not like", value, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroIn(List<String> values) {
            addCriterion("drug_intro in", values, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroNotIn(List<String> values) {
            addCriterion("drug_intro not in", values, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroBetween(String value1, String value2) {
            addCriterion("drug_intro between", value1, value2, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugIntroNotBetween(String value1, String value2) {
            addCriterion("drug_intro not between", value1, value2, "drugIntro");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIsNull() {
            addCriterion("drug_price is null");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIsNotNull() {
            addCriterion("drug_price is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPriceEqualTo(Integer value) {
            addCriterion("drug_price =", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotEqualTo(Integer value) {
            addCriterion("drug_price <>", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceGreaterThan(Integer value) {
            addCriterion("drug_price >", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_price >=", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceLessThan(Integer value) {
            addCriterion("drug_price <", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceLessThanOrEqualTo(Integer value) {
            addCriterion("drug_price <=", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIn(List<Integer> values) {
            addCriterion("drug_price in", values, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotIn(List<Integer> values) {
            addCriterion("drug_price not in", values, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceBetween(Integer value1, Integer value2) {
            addCriterion("drug_price between", value1, value2, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_price not between", value1, value2, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderIsNull() {
            addCriterion("drug_recommender is null");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderIsNotNull() {
            addCriterion("drug_recommender is not null");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderEqualTo(String value) {
            addCriterion("drug_recommender =", value, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderNotEqualTo(String value) {
            addCriterion("drug_recommender <>", value, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderGreaterThan(String value) {
            addCriterion("drug_recommender >", value, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderGreaterThanOrEqualTo(String value) {
            addCriterion("drug_recommender >=", value, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderLessThan(String value) {
            addCriterion("drug_recommender <", value, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderLessThanOrEqualTo(String value) {
            addCriterion("drug_recommender <=", value, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderLike(String value) {
            addCriterion("drug_recommender like", value, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderNotLike(String value) {
            addCriterion("drug_recommender not like", value, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderIn(List<String> values) {
            addCriterion("drug_recommender in", values, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderNotIn(List<String> values) {
            addCriterion("drug_recommender not in", values, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderBetween(String value1, String value2) {
            addCriterion("drug_recommender between", value1, value2, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugRecommenderNotBetween(String value1, String value2) {
            addCriterion("drug_recommender not between", value1, value2, "drugRecommender");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyIsNull() {
            addCriterion("drug_primary_key is null");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyIsNotNull() {
            addCriterion("drug_primary_key is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyEqualTo(String value) {
            addCriterion("drug_primary_key =", value, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyNotEqualTo(String value) {
            addCriterion("drug_primary_key <>", value, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyGreaterThan(String value) {
            addCriterion("drug_primary_key >", value, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyGreaterThanOrEqualTo(String value) {
            addCriterion("drug_primary_key >=", value, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyLessThan(String value) {
            addCriterion("drug_primary_key <", value, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyLessThanOrEqualTo(String value) {
            addCriterion("drug_primary_key <=", value, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyLike(String value) {
            addCriterion("drug_primary_key like", value, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyNotLike(String value) {
            addCriterion("drug_primary_key not like", value, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyIn(List<String> values) {
            addCriterion("drug_primary_key in", values, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyNotIn(List<String> values) {
            addCriterion("drug_primary_key not in", values, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyBetween(String value1, String value2) {
            addCriterion("drug_primary_key between", value1, value2, "drugPrimaryKey");
            return (Criteria) this;
        }

        public Criteria andDrugPrimaryKeyNotBetween(String value1, String value2) {
            addCriterion("drug_primary_key not between", value1, value2, "drugPrimaryKey");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}