package com.neuedu.model;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProdidIsNull() {
            addCriterion("PRODID is null");
            return (Criteria) this;
        }

        public Criteria andProdidIsNotNull() {
            addCriterion("PRODID is not null");
            return (Criteria) this;
        }

        public Criteria andProdidEqualTo(Integer value) {
            addCriterion("PRODID =", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotEqualTo(Integer value) {
            addCriterion("PRODID <>", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThan(Integer value) {
            addCriterion("PRODID >", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODID >=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThan(Integer value) {
            addCriterion("PRODID <", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThanOrEqualTo(Integer value) {
            addCriterion("PRODID <=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidIn(List<Integer> values) {
            addCriterion("PRODID in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotIn(List<Integer> values) {
            addCriterion("PRODID not in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidBetween(Integer value1, Integer value2) {
            addCriterion("PRODID between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODID not between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNull() {
            addCriterion("PRODNAME is null");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNotNull() {
            addCriterion("PRODNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProdnameEqualTo(String value) {
            addCriterion("PRODNAME =", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotEqualTo(String value) {
            addCriterion("PRODNAME <>", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThan(String value) {
            addCriterion("PRODNAME >", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODNAME >=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThan(String value) {
            addCriterion("PRODNAME <", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThanOrEqualTo(String value) {
            addCriterion("PRODNAME <=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLike(String value) {
            addCriterion("PRODNAME like", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotLike(String value) {
            addCriterion("PRODNAME not like", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameIn(List<String> values) {
            addCriterion("PRODNAME in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotIn(List<String> values) {
            addCriterion("PRODNAME not in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameBetween(String value1, String value2) {
            addCriterion("PRODNAME between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotBetween(String value1, String value2) {
            addCriterion("PRODNAME not between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdcountIsNull() {
            addCriterion("PRODCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProdcountIsNotNull() {
            addCriterion("PRODCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProdcountEqualTo(Double value) {
            addCriterion("PRODCOUNT =", value, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProdcountNotEqualTo(Double value) {
            addCriterion("PRODCOUNT <>", value, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProdcountGreaterThan(Double value) {
            addCriterion("PRODCOUNT >", value, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProdcountGreaterThanOrEqualTo(Double value) {
            addCriterion("PRODCOUNT >=", value, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProdcountLessThan(Double value) {
            addCriterion("PRODCOUNT <", value, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProdcountLessThanOrEqualTo(Double value) {
            addCriterion("PRODCOUNT <=", value, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProdcountIn(List<Double> values) {
            addCriterion("PRODCOUNT in", values, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProdcountNotIn(List<Double> values) {
            addCriterion("PRODCOUNT not in", values, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProdcountBetween(Double value1, Double value2) {
            addCriterion("PRODCOUNT between", value1, value2, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProdcountNotBetween(Double value1, Double value2) {
            addCriterion("PRODCOUNT not between", value1, value2, "prodcount");
            return (Criteria) this;
        }

        public Criteria andProvidIsNull() {
            addCriterion("PROVID is null");
            return (Criteria) this;
        }

        public Criteria andProvidIsNotNull() {
            addCriterion("PROVID is not null");
            return (Criteria) this;
        }

        public Criteria andProvidEqualTo(Integer value) {
            addCriterion("PROVID =", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidNotEqualTo(Integer value) {
            addCriterion("PROVID <>", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidGreaterThan(Integer value) {
            addCriterion("PROVID >", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROVID >=", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidLessThan(Integer value) {
            addCriterion("PROVID <", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidLessThanOrEqualTo(Integer value) {
            addCriterion("PROVID <=", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidIn(List<Integer> values) {
            addCriterion("PROVID in", values, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidNotIn(List<Integer> values) {
            addCriterion("PROVID not in", values, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidBetween(Integer value1, Integer value2) {
            addCriterion("PROVID between", value1, value2, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidNotBetween(Integer value1, Integer value2) {
            addCriterion("PROVID not between", value1, value2, "provid");
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