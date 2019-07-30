package top.whq6.study.entity;

import java.util.ArrayList;
import java.util.List;

public class ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemExample() {
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

        public Criteria andProblemBankIdIsNull() {
            addCriterion("problem_bank_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdIsNotNull() {
            addCriterion("problem_bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdEqualTo(Integer value) {
            addCriterion("problem_bank_id =", value, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdNotEqualTo(Integer value) {
            addCriterion("problem_bank_id <>", value, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdGreaterThan(Integer value) {
            addCriterion("problem_bank_id >", value, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_bank_id >=", value, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdLessThan(Integer value) {
            addCriterion("problem_bank_id <", value, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_bank_id <=", value, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdIn(List<Integer> values) {
            addCriterion("problem_bank_id in", values, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdNotIn(List<Integer> values) {
            addCriterion("problem_bank_id not in", values, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_bank_id between", value1, value2, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_bank_id not between", value1, value2, "problemBankId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdIsNull() {
            addCriterion("problem_questiion_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdIsNotNull() {
            addCriterion("problem_questiion_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdEqualTo(Integer value) {
            addCriterion("problem_questiion_id =", value, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdNotEqualTo(Integer value) {
            addCriterion("problem_questiion_id <>", value, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdGreaterThan(Integer value) {
            addCriterion("problem_questiion_id >", value, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_questiion_id >=", value, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdLessThan(Integer value) {
            addCriterion("problem_questiion_id <", value, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_questiion_id <=", value, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdIn(List<Integer> values) {
            addCriterion("problem_questiion_id in", values, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdNotIn(List<Integer> values) {
            addCriterion("problem_questiion_id not in", values, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_questiion_id between", value1, value2, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemQuestiionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_questiion_id not between", value1, value2, "problemQuestiionId");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoIsNull() {
            addCriterion("problem_sequence_no is null");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoIsNotNull() {
            addCriterion("problem_sequence_no is not null");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoEqualTo(Integer value) {
            addCriterion("problem_sequence_no =", value, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoNotEqualTo(Integer value) {
            addCriterion("problem_sequence_no <>", value, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoGreaterThan(Integer value) {
            addCriterion("problem_sequence_no >", value, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_sequence_no >=", value, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoLessThan(Integer value) {
            addCriterion("problem_sequence_no <", value, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoLessThanOrEqualTo(Integer value) {
            addCriterion("problem_sequence_no <=", value, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoIn(List<Integer> values) {
            addCriterion("problem_sequence_no in", values, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoNotIn(List<Integer> values) {
            addCriterion("problem_sequence_no not in", values, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoBetween(Integer value1, Integer value2) {
            addCriterion("problem_sequence_no between", value1, value2, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemSequenceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_sequence_no not between", value1, value2, "problemSequenceNo");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdIsNull() {
            addCriterion("problem_test_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdIsNotNull() {
            addCriterion("problem_test_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdEqualTo(Integer value) {
            addCriterion("problem_test_id =", value, "problemTestId");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdNotEqualTo(Integer value) {
            addCriterion("problem_test_id <>", value, "problemTestId");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdGreaterThan(Integer value) {
            addCriterion("problem_test_id >", value, "problemTestId");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_test_id >=", value, "problemTestId");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdLessThan(Integer value) {
            addCriterion("problem_test_id <", value, "problemTestId");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_test_id <=", value, "problemTestId");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdIn(List<Integer> values) {
            addCriterion("problem_test_id in", values, "problemTestId");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdNotIn(List<Integer> values) {
            addCriterion("problem_test_id not in", values, "problemTestId");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_test_id between", value1, value2, "problemTestId");
            return (Criteria) this;
        }

        public Criteria andProblemTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_test_id not between", value1, value2, "problemTestId");
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