package com.heiyo.bce.model;

import java.util.ArrayList;
import java.util.List;

public class UserbusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserbusinessExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNull() {
            addCriterion("KeyId is null");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("KeyId is not null");
            return (Criteria) this;
        }

        public Criteria andKeyidEqualTo(String value) {
            addCriterion("KeyId =", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotEqualTo(String value) {
            addCriterion("KeyId <>", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThan(String value) {
            addCriterion("KeyId >", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(String value) {
            addCriterion("KeyId >=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThan(String value) {
            addCriterion("KeyId <", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThanOrEqualTo(String value) {
            addCriterion("KeyId <=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLike(String value) {
            addCriterion("KeyId like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotLike(String value) {
            addCriterion("KeyId not like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidIn(List<String> values) {
            addCriterion("KeyId in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotIn(List<String> values) {
            addCriterion("KeyId not in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidBetween(String value1, String value2) {
            addCriterion("KeyId between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotBetween(String value1, String value2) {
            addCriterion("KeyId not between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("Value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("Value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("Value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("Value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("Value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("Value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("Value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("Value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("Value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("Value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("Value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("Value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("Value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("Value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andBtnstrIsNull() {
            addCriterion("BtnStr is null");
            return (Criteria) this;
        }

        public Criteria andBtnstrIsNotNull() {
            addCriterion("BtnStr is not null");
            return (Criteria) this;
        }

        public Criteria andBtnstrEqualTo(String value) {
            addCriterion("BtnStr =", value, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrNotEqualTo(String value) {
            addCriterion("BtnStr <>", value, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrGreaterThan(String value) {
            addCriterion("BtnStr >", value, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrGreaterThanOrEqualTo(String value) {
            addCriterion("BtnStr >=", value, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrLessThan(String value) {
            addCriterion("BtnStr <", value, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrLessThanOrEqualTo(String value) {
            addCriterion("BtnStr <=", value, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrLike(String value) {
            addCriterion("BtnStr like", value, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrNotLike(String value) {
            addCriterion("BtnStr not like", value, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrIn(List<String> values) {
            addCriterion("BtnStr in", values, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrNotIn(List<String> values) {
            addCriterion("BtnStr not in", values, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrBetween(String value1, String value2) {
            addCriterion("BtnStr between", value1, value2, "btnstr");
            return (Criteria) this;
        }

        public Criteria andBtnstrNotBetween(String value1, String value2) {
            addCriterion("BtnStr not between", value1, value2, "btnstr");
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