package com.neuedu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyExample() {
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

        public Criteria andBuyidIsNull() {
            addCriterion("BUYID is null");
            return (Criteria) this;
        }

        public Criteria andBuyidIsNotNull() {
            addCriterion("BUYID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyidEqualTo(Integer value) {
            addCriterion("BUYID =", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotEqualTo(Integer value) {
            addCriterion("BUYID <>", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidGreaterThan(Integer value) {
            addCriterion("BUYID >", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUYID >=", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidLessThan(Integer value) {
            addCriterion("BUYID <", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidLessThanOrEqualTo(Integer value) {
            addCriterion("BUYID <=", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidIn(List<Integer> values) {
            addCriterion("BUYID in", values, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotIn(List<Integer> values) {
            addCriterion("BUYID not in", values, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidBetween(Integer value1, Integer value2) {
            addCriterion("BUYID between", value1, value2, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotBetween(Integer value1, Integer value2) {
            addCriterion("BUYID not between", value1, value2, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuycountIsNull() {
            addCriterion("BUYCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBuycountIsNotNull() {
            addCriterion("BUYCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBuycountEqualTo(Double value) {
            addCriterion("BUYCOUNT =", value, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuycountNotEqualTo(Double value) {
            addCriterion("BUYCOUNT <>", value, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuycountGreaterThan(Double value) {
            addCriterion("BUYCOUNT >", value, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuycountGreaterThanOrEqualTo(Double value) {
            addCriterion("BUYCOUNT >=", value, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuycountLessThan(Double value) {
            addCriterion("BUYCOUNT <", value, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuycountLessThanOrEqualTo(Double value) {
            addCriterion("BUYCOUNT <=", value, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuycountIn(List<Double> values) {
            addCriterion("BUYCOUNT in", values, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuycountNotIn(List<Double> values) {
            addCriterion("BUYCOUNT not in", values, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuycountBetween(Double value1, Double value2) {
            addCriterion("BUYCOUNT between", value1, value2, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuycountNotBetween(Double value1, Double value2) {
            addCriterion("BUYCOUNT not between", value1, value2, "buycount");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNull() {
            addCriterion("BUYTIME is null");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNotNull() {
            addCriterion("BUYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuytimeEqualTo(Date value) {
            addCriterion("BUYTIME =", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotEqualTo(Date value) {
            addCriterion("BUYTIME <>", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThan(Date value) {
            addCriterion("BUYTIME >", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYTIME >=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThan(Date value) {
            addCriterion("BUYTIME <", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYTIME <=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeIn(List<Date> values) {
            addCriterion("BUYTIME in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotIn(List<Date> values) {
            addCriterion("BUYTIME not in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeBetween(Date value1, Date value2) {
            addCriterion("BUYTIME between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYTIME not between", value1, value2, "buytime");
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

        public Criteria andDepartidIsNull() {
            addCriterion("DEPARTID is null");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNotNull() {
            addCriterion("DEPARTID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartidEqualTo(Integer value) {
            addCriterion("DEPARTID =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(Integer value) {
            addCriterion("DEPARTID <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(Integer value) {
            addCriterion("DEPARTID >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPARTID >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(Integer value) {
            addCriterion("DEPARTID <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(Integer value) {
            addCriterion("DEPARTID <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<Integer> values) {
            addCriterion("DEPARTID in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<Integer> values) {
            addCriterion("DEPARTID not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(Integer value1, Integer value2) {
            addCriterion("DEPARTID between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPARTID not between", value1, value2, "departid");
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