package top.whq6.study.entity;

import java.util.ArrayList;
import java.util.List;

public class CaseillnessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseillnessExample() {
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

        public Criteria andCaseillnessIdIsNull() {
            addCriterion("caseillness_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdIsNotNull() {
            addCriterion("caseillness_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdEqualTo(Integer value) {
            addCriterion("caseillness_id =", value, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdNotEqualTo(Integer value) {
            addCriterion("caseillness_id <>", value, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdGreaterThan(Integer value) {
            addCriterion("caseillness_id >", value, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("caseillness_id >=", value, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdLessThan(Integer value) {
            addCriterion("caseillness_id <", value, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdLessThanOrEqualTo(Integer value) {
            addCriterion("caseillness_id <=", value, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdIn(List<Integer> values) {
            addCriterion("caseillness_id in", values, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdNotIn(List<Integer> values) {
            addCriterion("caseillness_id not in", values, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdBetween(Integer value1, Integer value2) {
            addCriterion("caseillness_id between", value1, value2, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("caseillness_id not between", value1, value2, "caseillnessId");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameIsNull() {
            addCriterion("caseillness_name is null");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameIsNotNull() {
            addCriterion("caseillness_name is not null");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameEqualTo(String value) {
            addCriterion("caseillness_name =", value, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameNotEqualTo(String value) {
            addCriterion("caseillness_name <>", value, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameGreaterThan(String value) {
            addCriterion("caseillness_name >", value, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameGreaterThanOrEqualTo(String value) {
            addCriterion("caseillness_name >=", value, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameLessThan(String value) {
            addCriterion("caseillness_name <", value, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameLessThanOrEqualTo(String value) {
            addCriterion("caseillness_name <=", value, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameLike(String value) {
            addCriterion("caseillness_name like", value, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameNotLike(String value) {
            addCriterion("caseillness_name not like", value, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameIn(List<String> values) {
            addCriterion("caseillness_name in", values, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameNotIn(List<String> values) {
            addCriterion("caseillness_name not in", values, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameBetween(String value1, String value2) {
            addCriterion("caseillness_name between", value1, value2, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessNameNotBetween(String value1, String value2) {
            addCriterion("caseillness_name not between", value1, value2, "caseillnessName");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionIsNull() {
            addCriterion("caseillness_condition is null");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionIsNotNull() {
            addCriterion("caseillness_condition is not null");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionEqualTo(String value) {
            addCriterion("caseillness_condition =", value, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionNotEqualTo(String value) {
            addCriterion("caseillness_condition <>", value, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionGreaterThan(String value) {
            addCriterion("caseillness_condition >", value, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionGreaterThanOrEqualTo(String value) {
            addCriterion("caseillness_condition >=", value, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionLessThan(String value) {
            addCriterion("caseillness_condition <", value, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionLessThanOrEqualTo(String value) {
            addCriterion("caseillness_condition <=", value, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionLike(String value) {
            addCriterion("caseillness_condition like", value, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionNotLike(String value) {
            addCriterion("caseillness_condition not like", value, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionIn(List<String> values) {
            addCriterion("caseillness_condition in", values, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionNotIn(List<String> values) {
            addCriterion("caseillness_condition not in", values, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionBetween(String value1, String value2) {
            addCriterion("caseillness_condition between", value1, value2, "caseillnessCondition");
            return (Criteria) this;
        }

        public Criteria andCaseillnessConditionNotBetween(String value1, String value2) {
            addCriterion("caseillness_condition not between", value1, value2, "caseillnessCondition");
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