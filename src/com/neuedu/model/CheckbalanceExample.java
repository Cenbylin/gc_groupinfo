package com.neuedu.model;

import java.util.ArrayList;
import java.util.List;

public class CheckbalanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckbalanceExample() {
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

        public Criteria andChidIsNull() {
            addCriterion("CHID is null");
            return (Criteria) this;
        }

        public Criteria andChidIsNotNull() {
            addCriterion("CHID is not null");
            return (Criteria) this;
        }

        public Criteria andChidEqualTo(Integer value) {
            addCriterion("CHID =", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidNotEqualTo(Integer value) {
            addCriterion("CHID <>", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidGreaterThan(Integer value) {
            addCriterion("CHID >", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHID >=", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidLessThan(Integer value) {
            addCriterion("CHID <", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidLessThanOrEqualTo(Integer value) {
            addCriterion("CHID <=", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidIn(List<Integer> values) {
            addCriterion("CHID in", values, "chid");
            return (Criteria) this;
        }

        public Criteria andChidNotIn(List<Integer> values) {
            addCriterion("CHID not in", values, "chid");
            return (Criteria) this;
        }

        public Criteria andChidBetween(Integer value1, Integer value2) {
            addCriterion("CHID between", value1, value2, "chid");
            return (Criteria) this;
        }

        public Criteria andChidNotBetween(Integer value1, Integer value2) {
            addCriterion("CHID not between", value1, value2, "chid");
            return (Criteria) this;
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

        public Criteria andSidIsNull() {
            addCriterion("SID is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("SID is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("SID =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("SID <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("SID >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SID >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("SID <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("SID <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("SID in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("SID not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("SID between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("SID not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("TID not between", value1, value2, "tid");
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