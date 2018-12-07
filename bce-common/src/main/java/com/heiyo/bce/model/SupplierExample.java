package com.heiyo.bce.model;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("phonenum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("phonenum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("phonenum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("phonenum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("phonenum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("phonenum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("phonenum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("phonenum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("phonenum like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("phonenum not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("phonenum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("phonenum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("phonenum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("phonenum not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andIsystemIsNull() {
            addCriterion("isystem is null");
            return (Criteria) this;
        }

        public Criteria andIsystemIsNotNull() {
            addCriterion("isystem is not null");
            return (Criteria) this;
        }

        public Criteria andIsystemEqualTo(Byte value) {
            addCriterion("isystem =", value, "isystem");
            return (Criteria) this;
        }

        public Criteria andIsystemNotEqualTo(Byte value) {
            addCriterion("isystem <>", value, "isystem");
            return (Criteria) this;
        }

        public Criteria andIsystemGreaterThan(Byte value) {
            addCriterion("isystem >", value, "isystem");
            return (Criteria) this;
        }

        public Criteria andIsystemGreaterThanOrEqualTo(Byte value) {
            addCriterion("isystem >=", value, "isystem");
            return (Criteria) this;
        }

        public Criteria andIsystemLessThan(Byte value) {
            addCriterion("isystem <", value, "isystem");
            return (Criteria) this;
        }

        public Criteria andIsystemLessThanOrEqualTo(Byte value) {
            addCriterion("isystem <=", value, "isystem");
            return (Criteria) this;
        }

        public Criteria andIsystemIn(List<Byte> values) {
            addCriterion("isystem in", values, "isystem");
            return (Criteria) this;
        }

        public Criteria andIsystemNotIn(List<Byte> values) {
            addCriterion("isystem not in", values, "isystem");
            return (Criteria) this;
        }

        public Criteria andIsystemBetween(Byte value1, Byte value2) {
            addCriterion("isystem between", value1, value2, "isystem");
            return (Criteria) this;
        }

        public Criteria andIsystemNotBetween(Byte value1, Byte value2) {
            addCriterion("isystem not between", value1, value2, "isystem");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andAdvanceinIsNull() {
            addCriterion("AdvanceIn is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceinIsNotNull() {
            addCriterion("AdvanceIn is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceinEqualTo(Double value) {
            addCriterion("AdvanceIn =", value, "advancein");
            return (Criteria) this;
        }

        public Criteria andAdvanceinNotEqualTo(Double value) {
            addCriterion("AdvanceIn <>", value, "advancein");
            return (Criteria) this;
        }

        public Criteria andAdvanceinGreaterThan(Double value) {
            addCriterion("AdvanceIn >", value, "advancein");
            return (Criteria) this;
        }

        public Criteria andAdvanceinGreaterThanOrEqualTo(Double value) {
            addCriterion("AdvanceIn >=", value, "advancein");
            return (Criteria) this;
        }

        public Criteria andAdvanceinLessThan(Double value) {
            addCriterion("AdvanceIn <", value, "advancein");
            return (Criteria) this;
        }

        public Criteria andAdvanceinLessThanOrEqualTo(Double value) {
            addCriterion("AdvanceIn <=", value, "advancein");
            return (Criteria) this;
        }

        public Criteria andAdvanceinIn(List<Double> values) {
            addCriterion("AdvanceIn in", values, "advancein");
            return (Criteria) this;
        }

        public Criteria andAdvanceinNotIn(List<Double> values) {
            addCriterion("AdvanceIn not in", values, "advancein");
            return (Criteria) this;
        }

        public Criteria andAdvanceinBetween(Double value1, Double value2) {
            addCriterion("AdvanceIn between", value1, value2, "advancein");
            return (Criteria) this;
        }

        public Criteria andAdvanceinNotBetween(Double value1, Double value2) {
            addCriterion("AdvanceIn not between", value1, value2, "advancein");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetIsNull() {
            addCriterion("BeginNeedGet is null");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetIsNotNull() {
            addCriterion("BeginNeedGet is not null");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetEqualTo(Double value) {
            addCriterion("BeginNeedGet =", value, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetNotEqualTo(Double value) {
            addCriterion("BeginNeedGet <>", value, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetGreaterThan(Double value) {
            addCriterion("BeginNeedGet >", value, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetGreaterThanOrEqualTo(Double value) {
            addCriterion("BeginNeedGet >=", value, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetLessThan(Double value) {
            addCriterion("BeginNeedGet <", value, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetLessThanOrEqualTo(Double value) {
            addCriterion("BeginNeedGet <=", value, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetIn(List<Double> values) {
            addCriterion("BeginNeedGet in", values, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetNotIn(List<Double> values) {
            addCriterion("BeginNeedGet not in", values, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetBetween(Double value1, Double value2) {
            addCriterion("BeginNeedGet between", value1, value2, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedgetNotBetween(Double value1, Double value2) {
            addCriterion("BeginNeedGet not between", value1, value2, "beginneedget");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayIsNull() {
            addCriterion("BeginNeedPay is null");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayIsNotNull() {
            addCriterion("BeginNeedPay is not null");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayEqualTo(Double value) {
            addCriterion("BeginNeedPay =", value, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayNotEqualTo(Double value) {
            addCriterion("BeginNeedPay <>", value, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayGreaterThan(Double value) {
            addCriterion("BeginNeedPay >", value, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayGreaterThanOrEqualTo(Double value) {
            addCriterion("BeginNeedPay >=", value, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayLessThan(Double value) {
            addCriterion("BeginNeedPay <", value, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayLessThanOrEqualTo(Double value) {
            addCriterion("BeginNeedPay <=", value, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayIn(List<Double> values) {
            addCriterion("BeginNeedPay in", values, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayNotIn(List<Double> values) {
            addCriterion("BeginNeedPay not in", values, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayBetween(Double value1, Double value2) {
            addCriterion("BeginNeedPay between", value1, value2, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andBeginneedpayNotBetween(Double value1, Double value2) {
            addCriterion("BeginNeedPay not between", value1, value2, "beginneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedgetIsNull() {
            addCriterion("AllNeedGet is null");
            return (Criteria) this;
        }

        public Criteria andAllneedgetIsNotNull() {
            addCriterion("AllNeedGet is not null");
            return (Criteria) this;
        }

        public Criteria andAllneedgetEqualTo(Double value) {
            addCriterion("AllNeedGet =", value, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedgetNotEqualTo(Double value) {
            addCriterion("AllNeedGet <>", value, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedgetGreaterThan(Double value) {
            addCriterion("AllNeedGet >", value, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedgetGreaterThanOrEqualTo(Double value) {
            addCriterion("AllNeedGet >=", value, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedgetLessThan(Double value) {
            addCriterion("AllNeedGet <", value, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedgetLessThanOrEqualTo(Double value) {
            addCriterion("AllNeedGet <=", value, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedgetIn(List<Double> values) {
            addCriterion("AllNeedGet in", values, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedgetNotIn(List<Double> values) {
            addCriterion("AllNeedGet not in", values, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedgetBetween(Double value1, Double value2) {
            addCriterion("AllNeedGet between", value1, value2, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedgetNotBetween(Double value1, Double value2) {
            addCriterion("AllNeedGet not between", value1, value2, "allneedget");
            return (Criteria) this;
        }

        public Criteria andAllneedpayIsNull() {
            addCriterion("AllNeedPay is null");
            return (Criteria) this;
        }

        public Criteria andAllneedpayIsNotNull() {
            addCriterion("AllNeedPay is not null");
            return (Criteria) this;
        }

        public Criteria andAllneedpayEqualTo(Double value) {
            addCriterion("AllNeedPay =", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayNotEqualTo(Double value) {
            addCriterion("AllNeedPay <>", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayGreaterThan(Double value) {
            addCriterion("AllNeedPay >", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayGreaterThanOrEqualTo(Double value) {
            addCriterion("AllNeedPay >=", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayLessThan(Double value) {
            addCriterion("AllNeedPay <", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayLessThanOrEqualTo(Double value) {
            addCriterion("AllNeedPay <=", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayIn(List<Double> values) {
            addCriterion("AllNeedPay in", values, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayNotIn(List<Double> values) {
            addCriterion("AllNeedPay not in", values, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayBetween(Double value1, Double value2) {
            addCriterion("AllNeedPay between", value1, value2, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayNotBetween(Double value1, Double value2) {
            addCriterion("AllNeedPay not between", value1, value2, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTaxnumIsNull() {
            addCriterion("taxNum is null");
            return (Criteria) this;
        }

        public Criteria andTaxnumIsNotNull() {
            addCriterion("taxNum is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnumEqualTo(String value) {
            addCriterion("taxNum =", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotEqualTo(String value) {
            addCriterion("taxNum <>", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumGreaterThan(String value) {
            addCriterion("taxNum >", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumGreaterThanOrEqualTo(String value) {
            addCriterion("taxNum >=", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLessThan(String value) {
            addCriterion("taxNum <", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLessThanOrEqualTo(String value) {
            addCriterion("taxNum <=", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLike(String value) {
            addCriterion("taxNum like", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotLike(String value) {
            addCriterion("taxNum not like", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumIn(List<String> values) {
            addCriterion("taxNum in", values, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotIn(List<String> values) {
            addCriterion("taxNum not in", values, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumBetween(String value1, String value2) {
            addCriterion("taxNum between", value1, value2, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotBetween(String value1, String value2) {
            addCriterion("taxNum not between", value1, value2, "taxnum");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("bankName is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankName is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankName =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankName <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankName >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankName >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankName <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankName <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankName like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankName not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankName in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankName not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankName between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankName not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNull() {
            addCriterion("accountNumber is null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNotNull() {
            addCriterion("accountNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberEqualTo(String value) {
            addCriterion("accountNumber =", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotEqualTo(String value) {
            addCriterion("accountNumber <>", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThan(String value) {
            addCriterion("accountNumber >", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("accountNumber >=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThan(String value) {
            addCriterion("accountNumber <", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThanOrEqualTo(String value) {
            addCriterion("accountNumber <=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLike(String value) {
            addCriterion("accountNumber like", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotLike(String value) {
            addCriterion("accountNumber not like", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIn(List<String> values) {
            addCriterion("accountNumber in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotIn(List<String> values) {
            addCriterion("accountNumber not in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberBetween(String value1, String value2) {
            addCriterion("accountNumber between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotBetween(String value1, String value2) {
            addCriterion("accountNumber not between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("taxRate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("taxRate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Double value) {
            addCriterion("taxRate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Double value) {
            addCriterion("taxRate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Double value) {
            addCriterion("taxRate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Double value) {
            addCriterion("taxRate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Double value) {
            addCriterion("taxRate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Double value) {
            addCriterion("taxRate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Double> values) {
            addCriterion("taxRate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Double> values) {
            addCriterion("taxRate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Double value1, Double value2) {
            addCriterion("taxRate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Double value1, Double value2) {
            addCriterion("taxRate not between", value1, value2, "taxrate");
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