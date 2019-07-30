package top.whq6.study.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNull() {
            addCriterion("test_id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Integer value) {
            addCriterion("test_id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Integer value) {
            addCriterion("test_id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Integer value) {
            addCriterion("test_id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Integer value) {
            addCriterion("test_id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Integer> values) {
            addCriterion("test_id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Integer> values) {
            addCriterion("test_id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Integer value1, Integer value2) {
            addCriterion("test_id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdIsNull() {
            addCriterion("record_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdIsNotNull() {
            addCriterion("record_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdEqualTo(Integer value) {
            addCriterion("record_user_id =", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdNotEqualTo(Integer value) {
            addCriterion("record_user_id <>", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdGreaterThan(Integer value) {
            addCriterion("record_user_id >", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_user_id >=", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdLessThan(Integer value) {
            addCriterion("record_user_id <", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_user_id <=", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdIn(List<Integer> values) {
            addCriterion("record_user_id in", values, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdNotIn(List<Integer> values) {
            addCriterion("record_user_id not in", values, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdBetween(Integer value1, Integer value2) {
            addCriterion("record_user_id between", value1, value2, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_user_id not between", value1, value2, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdIsNull() {
            addCriterion("record_bank_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdIsNotNull() {
            addCriterion("record_bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdEqualTo(Integer value) {
            addCriterion("record_bank_id =", value, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdNotEqualTo(Integer value) {
            addCriterion("record_bank_id <>", value, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdGreaterThan(Integer value) {
            addCriterion("record_bank_id >", value, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_bank_id >=", value, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdLessThan(Integer value) {
            addCriterion("record_bank_id <", value, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_bank_id <=", value, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdIn(List<Integer> values) {
            addCriterion("record_bank_id in", values, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdNotIn(List<Integer> values) {
            addCriterion("record_bank_id not in", values, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdBetween(Integer value1, Integer value2) {
            addCriterion("record_bank_id between", value1, value2, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_bank_id not between", value1, value2, "recordBankId");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeIsNull() {
            addCriterion("record_do_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeIsNotNull() {
            addCriterion("record_do_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeEqualTo(Date value) {
            addCriterionForJDBCDate("record_do_time =", value, "recordDoTime");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("record_do_time <>", value, "recordDoTime");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("record_do_time >", value, "recordDoTime");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_do_time >=", value, "recordDoTime");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeLessThan(Date value) {
            addCriterionForJDBCDate("record_do_time <", value, "recordDoTime");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_do_time <=", value, "recordDoTime");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeIn(List<Date> values) {
            addCriterionForJDBCDate("record_do_time in", values, "recordDoTime");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("record_do_time not in", values, "recordDoTime");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_do_time between", value1, value2, "recordDoTime");
            return (Criteria) this;
        }

        public Criteria andRecordDoTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_do_time not between", value1, value2, "recordDoTime");
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