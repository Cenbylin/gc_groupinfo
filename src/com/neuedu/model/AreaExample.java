package com.neuedu.model;

import java.util.ArrayList;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
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

        public Criteria andAreaidIsNull() {
            addCriterion("AREAID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AREAID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("AREAID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("AREAID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("AREAID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AREAID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("AREAID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("AREAID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("AREAID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("AREAID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("AREAID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("AREAID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("AREANAME is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("AREANAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("AREANAME =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("AREANAME <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("AREANAME >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("AREANAME >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("AREANAME <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("AREANAME <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("AREANAME like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("AREANAME not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("AREANAME in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("AREANAME not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("AREANAME between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("AREANAME not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andRelativeIsNull() {
            addCriterion("RELATIVE is null");
            return (Criteria) this;
        }

        public Criteria andRelativeIsNotNull() {
            addCriterion("RELATIVE is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeEqualTo(Integer value) {
            addCriterion("RELATIVE =", value, "relative");
            return (Criteria) this;
        }

        public Criteria andRelativeNotEqualTo(Integer value) {
            addCriterion("RELATIVE <>", value, "relative");
            return (Criteria) this;
        }

        public Criteria andRelativeGreaterThan(Integer value) {
            addCriterion("RELATIVE >", value, "relative");
            return (Criteria) this;
        }

        public Criteria andRelativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RELATIVE >=", value, "relative");
            return (Criteria) this;
        }

        public Criteria andRelativeLessThan(Integer value) {
            addCriterion("RELATIVE <", value, "relative");
            return (Criteria) this;
        }

        public Criteria andRelativeLessThanOrEqualTo(Integer value) {
            addCriterion("RELATIVE <=", value, "relative");
            return (Criteria) this;
        }

        public Criteria andRelativeIn(List<Integer> values) {
            addCriterion("RELATIVE in", values, "relative");
            return (Criteria) this;
        }

        public Criteria andRelativeNotIn(List<Integer> values) {
            addCriterion("RELATIVE not in", values, "relative");
            return (Criteria) this;
        }

        public Criteria andRelativeBetween(Integer value1, Integer value2) {
            addCriterion("RELATIVE between", value1, value2, "relative");
            return (Criteria) this;
        }

        public Criteria andRelativeNotBetween(Integer value1, Integer value2) {
            addCriterion("RELATIVE not between", value1, value2, "relative");
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