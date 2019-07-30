package top.whq6.study.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
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

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNull() {
            addCriterion("article_content is null");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNotNull() {
            addCriterion("article_content is not null");
            return (Criteria) this;
        }

        public Criteria andArticleContentEqualTo(String value) {
            addCriterion("article_content =", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotEqualTo(String value) {
            addCriterion("article_content <>", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThan(String value) {
            addCriterion("article_content >", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThanOrEqualTo(String value) {
            addCriterion("article_content >=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThan(String value) {
            addCriterion("article_content <", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThanOrEqualTo(String value) {
            addCriterion("article_content <=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLike(String value) {
            addCriterion("article_content like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotLike(String value) {
            addCriterion("article_content not like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentIn(List<String> values) {
            addCriterion("article_content in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotIn(List<String> values) {
            addCriterion("article_content not in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentBetween(String value1, String value2) {
            addCriterion("article_content between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotBetween(String value1, String value2) {
            addCriterion("article_content not between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateIsNull() {
            addCriterion("article_publish_date is null");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateIsNotNull() {
            addCriterion("article_publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateEqualTo(Date value) {
            addCriterionForJDBCDate("article_publish_date =", value, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("article_publish_date <>", value, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("article_publish_date >", value, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("article_publish_date >=", value, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateLessThan(Date value) {
            addCriterionForJDBCDate("article_publish_date <", value, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("article_publish_date <=", value, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateIn(List<Date> values) {
            addCriterionForJDBCDate("article_publish_date in", values, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("article_publish_date not in", values, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("article_publish_date between", value1, value2, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticlePublishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("article_publish_date not between", value1, value2, "articlePublishDate");
            return (Criteria) this;
        }

        public Criteria andArticleStatusIsNull() {
            addCriterion("article_status is null");
            return (Criteria) this;
        }

        public Criteria andArticleStatusIsNotNull() {
            addCriterion("article_status is not null");
            return (Criteria) this;
        }

        public Criteria andArticleStatusEqualTo(Integer value) {
            addCriterion("article_status =", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotEqualTo(Integer value) {
            addCriterion("article_status <>", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusGreaterThan(Integer value) {
            addCriterion("article_status >", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_status >=", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusLessThan(Integer value) {
            addCriterion("article_status <", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("article_status <=", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusIn(List<Integer> values) {
            addCriterion("article_status in", values, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotIn(List<Integer> values) {
            addCriterion("article_status not in", values, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusBetween(Integer value1, Integer value2) {
            addCriterion("article_status between", value1, value2, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("article_status not between", value1, value2, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdIsNull() {
            addCriterion("article_author_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdIsNotNull() {
            addCriterion("article_author_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdEqualTo(Integer value) {
            addCriterion("article_author_id =", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdNotEqualTo(Integer value) {
            addCriterion("article_author_id <>", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdGreaterThan(Integer value) {
            addCriterion("article_author_id >", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_author_id >=", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdLessThan(Integer value) {
            addCriterion("article_author_id <", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_author_id <=", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdIn(List<Integer> values) {
            addCriterion("article_author_id in", values, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdNotIn(List<Integer> values) {
            addCriterion("article_author_id not in", values, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("article_author_id between", value1, value2, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_author_id not between", value1, value2, "articleAuthorId");
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