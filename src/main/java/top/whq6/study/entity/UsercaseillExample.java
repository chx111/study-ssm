package top.whq6.study.entity;

import java.util.ArrayList;
import java.util.List;

public class UsercaseillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsercaseillExample() {
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

        public Criteria andUsercaseillIdIsNull() {
            addCriterion("usercaseill_id is null");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdIsNotNull() {
            addCriterion("usercaseill_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdEqualTo(Integer value) {
            addCriterion("usercaseill_id =", value, "usercaseillId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdNotEqualTo(Integer value) {
            addCriterion("usercaseill_id <>", value, "usercaseillId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdGreaterThan(Integer value) {
            addCriterion("usercaseill_id >", value, "usercaseillId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercaseill_id >=", value, "usercaseillId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdLessThan(Integer value) {
            addCriterion("usercaseill_id <", value, "usercaseillId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdLessThanOrEqualTo(Integer value) {
            addCriterion("usercaseill_id <=", value, "usercaseillId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdIn(List<Integer> values) {
            addCriterion("usercaseill_id in", values, "usercaseillId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdNotIn(List<Integer> values) {
            addCriterion("usercaseill_id not in", values, "usercaseillId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdBetween(Integer value1, Integer value2) {
            addCriterion("usercaseill_id between", value1, value2, "usercaseillId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usercaseill_id not between", value1, value2, "usercaseillId");
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

        public Criteria andUsercaseillUserIdIsNull() {
            addCriterion("usercaseill_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdIsNotNull() {
            addCriterion("usercaseill_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdEqualTo(Integer value) {
            addCriterion("usercaseill_user_id =", value, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdNotEqualTo(Integer value) {
            addCriterion("usercaseill_user_id <>", value, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdGreaterThan(Integer value) {
            addCriterion("usercaseill_user_id >", value, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercaseill_user_id >=", value, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdLessThan(Integer value) {
            addCriterion("usercaseill_user_id <", value, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("usercaseill_user_id <=", value, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdIn(List<Integer> values) {
            addCriterion("usercaseill_user_id in", values, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdNotIn(List<Integer> values) {
            addCriterion("usercaseill_user_id not in", values, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdBetween(Integer value1, Integer value2) {
            addCriterion("usercaseill_user_id between", value1, value2, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usercaseill_user_id not between", value1, value2, "usercaseillUserId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdIsNull() {
            addCriterion("usercaseill_caseillness_id is null");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdIsNotNull() {
            addCriterion("usercaseill_caseillness_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdEqualTo(Integer value) {
            addCriterion("usercaseill_caseillness_id =", value, "usercaseillCaseillnessId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdNotEqualTo(Integer value) {
            addCriterion("usercaseill_caseillness_id <>", value, "usercaseillCaseillnessId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdGreaterThan(Integer value) {
            addCriterion("usercaseill_caseillness_id >", value, "usercaseillCaseillnessId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercaseill_caseillness_id >=", value, "usercaseillCaseillnessId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdLessThan(Integer value) {
            addCriterion("usercaseill_caseillness_id <", value, "usercaseillCaseillnessId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdLessThanOrEqualTo(Integer value) {
            addCriterion("usercaseill_caseillness_id <=", value, "usercaseillCaseillnessId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdIn(List<Integer> values) {
            addCriterion("usercaseill_caseillness_id in", values, "usercaseillCaseillnessId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdNotIn(List<Integer> values) {
            addCriterion("usercaseill_caseillness_id not in", values, "usercaseillCaseillnessId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdBetween(Integer value1, Integer value2) {
            addCriterion("usercaseill_caseillness_id between", value1, value2, "usercaseillCaseillnessId");
            return (Criteria) this;
        }

        public Criteria andUsercaseillCaseillnessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usercaseill_caseillness_id not between", value1, value2, "usercaseillCaseillnessId");
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