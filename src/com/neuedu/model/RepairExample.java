package com.neuedu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andRepairidIsNull() {
            addCriterion("REPAIRID is null");
            return (Criteria) this;
        }

        public Criteria andRepairidIsNotNull() {
            addCriterion("REPAIRID is not null");
            return (Criteria) this;
        }

        public Criteria andRepairidEqualTo(Integer value) {
            addCriterion("REPAIRID =", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidNotEqualTo(Integer value) {
            addCriterion("REPAIRID <>", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidGreaterThan(Integer value) {
            addCriterion("REPAIRID >", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAIRID >=", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidLessThan(Integer value) {
            addCriterion("REPAIRID <", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidLessThanOrEqualTo(Integer value) {
            addCriterion("REPAIRID <=", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidIn(List<Integer> values) {
            addCriterion("REPAIRID in", values, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidNotIn(List<Integer> values) {
            addCriterion("REPAIRID not in", values, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidBetween(Integer value1, Integer value2) {
            addCriterion("REPAIRID between", value1, value2, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAIRID not between", value1, value2, "repairid");
            return (Criteria) this;
        }

        public Criteria andRcountIsNull() {
            addCriterion("RCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRcountIsNotNull() {
            addCriterion("RCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRcountEqualTo(Double value) {
            addCriterion("RCOUNT =", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountNotEqualTo(Double value) {
            addCriterion("RCOUNT <>", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountGreaterThan(Double value) {
            addCriterion("RCOUNT >", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountGreaterThanOrEqualTo(Double value) {
            addCriterion("RCOUNT >=", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountLessThan(Double value) {
            addCriterion("RCOUNT <", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountLessThanOrEqualTo(Double value) {
            addCriterion("RCOUNT <=", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountIn(List<Double> values) {
            addCriterion("RCOUNT in", values, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountNotIn(List<Double> values) {
            addCriterion("RCOUNT not in", values, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountBetween(Double value1, Double value2) {
            addCriterion("RCOUNT between", value1, value2, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountNotBetween(Double value1, Double value2) {
            addCriterion("RCOUNT not between", value1, value2, "rcount");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNull() {
            addCriterion("RTIME is null");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNotNull() {
            addCriterion("RTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRtimeEqualTo(Date value) {
            addCriterion("RTIME =", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotEqualTo(Date value) {
            addCriterion("RTIME <>", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThan(Date value) {
            addCriterion("RTIME >", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RTIME >=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThan(Date value) {
            addCriterion("RTIME <", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThanOrEqualTo(Date value) {
            addCriterion("RTIME <=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeIn(List<Date> values) {
            addCriterion("RTIME in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotIn(List<Date> values) {
            addCriterion("RTIME not in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeBetween(Date value1, Date value2) {
            addCriterion("RTIME between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotBetween(Date value1, Date value2) {
            addCriterion("RTIME not between", value1, value2, "rtime");
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

        public Criteria andBidIsNull() {
            addCriterion("BID is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("BID is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("BID =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("BID <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("BID >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BID >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("BID <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("BID <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("BID in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("BID not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("BID between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("BID not between", value1, value2, "bid");
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