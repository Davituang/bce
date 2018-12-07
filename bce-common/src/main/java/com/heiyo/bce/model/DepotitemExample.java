package com.heiyo.bce.model;

import java.util.ArrayList;
import java.util.List;

public class DepotitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepotitemExample() {
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

        public Criteria andHeaderidIsNull() {
            addCriterion("HeaderId is null");
            return (Criteria) this;
        }

        public Criteria andHeaderidIsNotNull() {
            addCriterion("HeaderId is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderidEqualTo(Long value) {
            addCriterion("HeaderId =", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotEqualTo(Long value) {
            addCriterion("HeaderId <>", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidGreaterThan(Long value) {
            addCriterion("HeaderId >", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidGreaterThanOrEqualTo(Long value) {
            addCriterion("HeaderId >=", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidLessThan(Long value) {
            addCriterion("HeaderId <", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidLessThanOrEqualTo(Long value) {
            addCriterion("HeaderId <=", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidIn(List<Long> values) {
            addCriterion("HeaderId in", values, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotIn(List<Long> values) {
            addCriterion("HeaderId not in", values, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidBetween(Long value1, Long value2) {
            addCriterion("HeaderId between", value1, value2, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotBetween(Long value1, Long value2) {
            addCriterion("HeaderId not between", value1, value2, "headerid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNull() {
            addCriterion("MaterialId is null");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNotNull() {
            addCriterion("MaterialId is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialidEqualTo(Long value) {
            addCriterion("MaterialId =", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotEqualTo(Long value) {
            addCriterion("MaterialId <>", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThan(Long value) {
            addCriterion("MaterialId >", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThanOrEqualTo(Long value) {
            addCriterion("MaterialId >=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThan(Long value) {
            addCriterion("MaterialId <", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThanOrEqualTo(Long value) {
            addCriterion("MaterialId <=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIn(List<Long> values) {
            addCriterion("MaterialId in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotIn(List<Long> values) {
            addCriterion("MaterialId not in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidBetween(Long value1, Long value2) {
            addCriterion("MaterialId between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotBetween(Long value1, Long value2) {
            addCriterion("MaterialId not between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMunitIsNull() {
            addCriterion("MUnit is null");
            return (Criteria) this;
        }

        public Criteria andMunitIsNotNull() {
            addCriterion("MUnit is not null");
            return (Criteria) this;
        }

        public Criteria andMunitEqualTo(String value) {
            addCriterion("MUnit =", value, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitNotEqualTo(String value) {
            addCriterion("MUnit <>", value, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitGreaterThan(String value) {
            addCriterion("MUnit >", value, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitGreaterThanOrEqualTo(String value) {
            addCriterion("MUnit >=", value, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitLessThan(String value) {
            addCriterion("MUnit <", value, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitLessThanOrEqualTo(String value) {
            addCriterion("MUnit <=", value, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitLike(String value) {
            addCriterion("MUnit like", value, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitNotLike(String value) {
            addCriterion("MUnit not like", value, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitIn(List<String> values) {
            addCriterion("MUnit in", values, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitNotIn(List<String> values) {
            addCriterion("MUnit not in", values, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitBetween(String value1, String value2) {
            addCriterion("MUnit between", value1, value2, "munit");
            return (Criteria) this;
        }

        public Criteria andMunitNotBetween(String value1, String value2) {
            addCriterion("MUnit not between", value1, value2, "munit");
            return (Criteria) this;
        }

        public Criteria andOpernumberIsNull() {
            addCriterion("OperNumber is null");
            return (Criteria) this;
        }

        public Criteria andOpernumberIsNotNull() {
            addCriterion("OperNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOpernumberEqualTo(Double value) {
            addCriterion("OperNumber =", value, "opernumber");
            return (Criteria) this;
        }

        public Criteria andOpernumberNotEqualTo(Double value) {
            addCriterion("OperNumber <>", value, "opernumber");
            return (Criteria) this;
        }

        public Criteria andOpernumberGreaterThan(Double value) {
            addCriterion("OperNumber >", value, "opernumber");
            return (Criteria) this;
        }

        public Criteria andOpernumberGreaterThanOrEqualTo(Double value) {
            addCriterion("OperNumber >=", value, "opernumber");
            return (Criteria) this;
        }

        public Criteria andOpernumberLessThan(Double value) {
            addCriterion("OperNumber <", value, "opernumber");
            return (Criteria) this;
        }

        public Criteria andOpernumberLessThanOrEqualTo(Double value) {
            addCriterion("OperNumber <=", value, "opernumber");
            return (Criteria) this;
        }

        public Criteria andOpernumberIn(List<Double> values) {
            addCriterion("OperNumber in", values, "opernumber");
            return (Criteria) this;
        }

        public Criteria andOpernumberNotIn(List<Double> values) {
            addCriterion("OperNumber not in", values, "opernumber");
            return (Criteria) this;
        }

        public Criteria andOpernumberBetween(Double value1, Double value2) {
            addCriterion("OperNumber between", value1, value2, "opernumber");
            return (Criteria) this;
        }

        public Criteria andOpernumberNotBetween(Double value1, Double value2) {
            addCriterion("OperNumber not between", value1, value2, "opernumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberIsNull() {
            addCriterion("BasicNumber is null");
            return (Criteria) this;
        }

        public Criteria andBasicnumberIsNotNull() {
            addCriterion("BasicNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBasicnumberEqualTo(Double value) {
            addCriterion("BasicNumber =", value, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberNotEqualTo(Double value) {
            addCriterion("BasicNumber <>", value, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberGreaterThan(Double value) {
            addCriterion("BasicNumber >", value, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberGreaterThanOrEqualTo(Double value) {
            addCriterion("BasicNumber >=", value, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberLessThan(Double value) {
            addCriterion("BasicNumber <", value, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberLessThanOrEqualTo(Double value) {
            addCriterion("BasicNumber <=", value, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberIn(List<Double> values) {
            addCriterion("BasicNumber in", values, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberNotIn(List<Double> values) {
            addCriterion("BasicNumber not in", values, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberBetween(Double value1, Double value2) {
            addCriterion("BasicNumber between", value1, value2, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andBasicnumberNotBetween(Double value1, Double value2) {
            addCriterion("BasicNumber not between", value1, value2, "basicnumber");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("UnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("UnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(Double value) {
            addCriterion("UnitPrice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(Double value) {
            addCriterion("UnitPrice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(Double value) {
            addCriterion("UnitPrice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("UnitPrice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(Double value) {
            addCriterion("UnitPrice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(Double value) {
            addCriterion("UnitPrice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<Double> values) {
            addCriterion("UnitPrice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<Double> values) {
            addCriterion("UnitPrice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(Double value1, Double value2) {
            addCriterion("UnitPrice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(Double value1, Double value2) {
            addCriterion("UnitPrice not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceIsNull() {
            addCriterion("TaxUnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceIsNotNull() {
            addCriterion("TaxUnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceEqualTo(Double value) {
            addCriterion("TaxUnitPrice =", value, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceNotEqualTo(Double value) {
            addCriterion("TaxUnitPrice <>", value, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceGreaterThan(Double value) {
            addCriterion("TaxUnitPrice >", value, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("TaxUnitPrice >=", value, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceLessThan(Double value) {
            addCriterion("TaxUnitPrice <", value, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceLessThanOrEqualTo(Double value) {
            addCriterion("TaxUnitPrice <=", value, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceIn(List<Double> values) {
            addCriterion("TaxUnitPrice in", values, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceNotIn(List<Double> values) {
            addCriterion("TaxUnitPrice not in", values, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceBetween(Double value1, Double value2) {
            addCriterion("TaxUnitPrice between", value1, value2, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andTaxunitpriceNotBetween(Double value1, Double value2) {
            addCriterion("TaxUnitPrice not between", value1, value2, "taxunitprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceIsNull() {
            addCriterion("AllPrice is null");
            return (Criteria) this;
        }

        public Criteria andAllpriceIsNotNull() {
            addCriterion("AllPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAllpriceEqualTo(Double value) {
            addCriterion("AllPrice =", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotEqualTo(Double value) {
            addCriterion("AllPrice <>", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceGreaterThan(Double value) {
            addCriterion("AllPrice >", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("AllPrice >=", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceLessThan(Double value) {
            addCriterion("AllPrice <", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceLessThanOrEqualTo(Double value) {
            addCriterion("AllPrice <=", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceIn(List<Double> values) {
            addCriterion("AllPrice in", values, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotIn(List<Double> values) {
            addCriterion("AllPrice not in", values, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceBetween(Double value1, Double value2) {
            addCriterion("AllPrice between", value1, value2, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotBetween(Double value1, Double value2) {
            addCriterion("AllPrice not between", value1, value2, "allprice");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("Img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("Img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("Img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("Img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("Img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("Img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("Img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("Img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("Img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("Img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("Img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("Img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("Img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("Img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andIncidentalsIsNull() {
            addCriterion("Incidentals is null");
            return (Criteria) this;
        }

        public Criteria andIncidentalsIsNotNull() {
            addCriterion("Incidentals is not null");
            return (Criteria) this;
        }

        public Criteria andIncidentalsEqualTo(Double value) {
            addCriterion("Incidentals =", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsNotEqualTo(Double value) {
            addCriterion("Incidentals <>", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsGreaterThan(Double value) {
            addCriterion("Incidentals >", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsGreaterThanOrEqualTo(Double value) {
            addCriterion("Incidentals >=", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsLessThan(Double value) {
            addCriterion("Incidentals <", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsLessThanOrEqualTo(Double value) {
            addCriterion("Incidentals <=", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsIn(List<Double> values) {
            addCriterion("Incidentals in", values, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsNotIn(List<Double> values) {
            addCriterion("Incidentals not in", values, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsBetween(Double value1, Double value2) {
            addCriterion("Incidentals between", value1, value2, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsNotBetween(Double value1, Double value2) {
            addCriterion("Incidentals not between", value1, value2, "incidentals");
            return (Criteria) this;
        }

        public Criteria andDepotidIsNull() {
            addCriterion("DepotId is null");
            return (Criteria) this;
        }

        public Criteria andDepotidIsNotNull() {
            addCriterion("DepotId is not null");
            return (Criteria) this;
        }

        public Criteria andDepotidEqualTo(Long value) {
            addCriterion("DepotId =", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidNotEqualTo(Long value) {
            addCriterion("DepotId <>", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidGreaterThan(Long value) {
            addCriterion("DepotId >", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidGreaterThanOrEqualTo(Long value) {
            addCriterion("DepotId >=", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidLessThan(Long value) {
            addCriterion("DepotId <", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidLessThanOrEqualTo(Long value) {
            addCriterion("DepotId <=", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidIn(List<Long> values) {
            addCriterion("DepotId in", values, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidNotIn(List<Long> values) {
            addCriterion("DepotId not in", values, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidBetween(Long value1, Long value2) {
            addCriterion("DepotId between", value1, value2, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidNotBetween(Long value1, Long value2) {
            addCriterion("DepotId not between", value1, value2, "depotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidIsNull() {
            addCriterion("AnotherDepotId is null");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidIsNotNull() {
            addCriterion("AnotherDepotId is not null");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidEqualTo(Long value) {
            addCriterion("AnotherDepotId =", value, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidNotEqualTo(Long value) {
            addCriterion("AnotherDepotId <>", value, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidGreaterThan(Long value) {
            addCriterion("AnotherDepotId >", value, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidGreaterThanOrEqualTo(Long value) {
            addCriterion("AnotherDepotId >=", value, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidLessThan(Long value) {
            addCriterion("AnotherDepotId <", value, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidLessThanOrEqualTo(Long value) {
            addCriterion("AnotherDepotId <=", value, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidIn(List<Long> values) {
            addCriterion("AnotherDepotId in", values, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidNotIn(List<Long> values) {
            addCriterion("AnotherDepotId not in", values, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidBetween(Long value1, Long value2) {
            addCriterion("AnotherDepotId between", value1, value2, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andAnotherdepotidNotBetween(Long value1, Long value2) {
            addCriterion("AnotherDepotId not between", value1, value2, "anotherdepotid");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("TaxRate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("TaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Double value) {
            addCriterion("TaxRate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Double value) {
            addCriterion("TaxRate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Double value) {
            addCriterion("TaxRate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Double value) {
            addCriterion("TaxRate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Double value) {
            addCriterion("TaxRate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Double value) {
            addCriterion("TaxRate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Double> values) {
            addCriterion("TaxRate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Double> values) {
            addCriterion("TaxRate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Double value1, Double value2) {
            addCriterion("TaxRate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Double value1, Double value2) {
            addCriterion("TaxRate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyIsNull() {
            addCriterion("TaxMoney is null");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyIsNotNull() {
            addCriterion("TaxMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyEqualTo(Double value) {
            addCriterion("TaxMoney =", value, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyNotEqualTo(Double value) {
            addCriterion("TaxMoney <>", value, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyGreaterThan(Double value) {
            addCriterion("TaxMoney >", value, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("TaxMoney >=", value, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyLessThan(Double value) {
            addCriterion("TaxMoney <", value, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyLessThanOrEqualTo(Double value) {
            addCriterion("TaxMoney <=", value, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyIn(List<Double> values) {
            addCriterion("TaxMoney in", values, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyNotIn(List<Double> values) {
            addCriterion("TaxMoney not in", values, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyBetween(Double value1, Double value2) {
            addCriterion("TaxMoney between", value1, value2, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxmoneyNotBetween(Double value1, Double value2) {
            addCriterion("TaxMoney not between", value1, value2, "taxmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyIsNull() {
            addCriterion("TaxLastMoney is null");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyIsNotNull() {
            addCriterion("TaxLastMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyEqualTo(Double value) {
            addCriterion("TaxLastMoney =", value, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyNotEqualTo(Double value) {
            addCriterion("TaxLastMoney <>", value, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyGreaterThan(Double value) {
            addCriterion("TaxLastMoney >", value, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("TaxLastMoney >=", value, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyLessThan(Double value) {
            addCriterion("TaxLastMoney <", value, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyLessThanOrEqualTo(Double value) {
            addCriterion("TaxLastMoney <=", value, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyIn(List<Double> values) {
            addCriterion("TaxLastMoney in", values, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyNotIn(List<Double> values) {
            addCriterion("TaxLastMoney not in", values, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyBetween(Double value1, Double value2) {
            addCriterion("TaxLastMoney between", value1, value2, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andTaxlastmoneyNotBetween(Double value1, Double value2) {
            addCriterion("TaxLastMoney not between", value1, value2, "taxlastmoney");
            return (Criteria) this;
        }

        public Criteria andOtherfield1IsNull() {
            addCriterion("OtherField1 is null");
            return (Criteria) this;
        }

        public Criteria andOtherfield1IsNotNull() {
            addCriterion("OtherField1 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfield1EqualTo(String value) {
            addCriterion("OtherField1 =", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1NotEqualTo(String value) {
            addCriterion("OtherField1 <>", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1GreaterThan(String value) {
            addCriterion("OtherField1 >", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1GreaterThanOrEqualTo(String value) {
            addCriterion("OtherField1 >=", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1LessThan(String value) {
            addCriterion("OtherField1 <", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1LessThanOrEqualTo(String value) {
            addCriterion("OtherField1 <=", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1Like(String value) {
            addCriterion("OtherField1 like", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1NotLike(String value) {
            addCriterion("OtherField1 not like", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1In(List<String> values) {
            addCriterion("OtherField1 in", values, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1NotIn(List<String> values) {
            addCriterion("OtherField1 not in", values, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1Between(String value1, String value2) {
            addCriterion("OtherField1 between", value1, value2, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1NotBetween(String value1, String value2) {
            addCriterion("OtherField1 not between", value1, value2, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield2IsNull() {
            addCriterion("OtherField2 is null");
            return (Criteria) this;
        }

        public Criteria andOtherfield2IsNotNull() {
            addCriterion("OtherField2 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfield2EqualTo(String value) {
            addCriterion("OtherField2 =", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2NotEqualTo(String value) {
            addCriterion("OtherField2 <>", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2GreaterThan(String value) {
            addCriterion("OtherField2 >", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2GreaterThanOrEqualTo(String value) {
            addCriterion("OtherField2 >=", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2LessThan(String value) {
            addCriterion("OtherField2 <", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2LessThanOrEqualTo(String value) {
            addCriterion("OtherField2 <=", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2Like(String value) {
            addCriterion("OtherField2 like", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2NotLike(String value) {
            addCriterion("OtherField2 not like", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2In(List<String> values) {
            addCriterion("OtherField2 in", values, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2NotIn(List<String> values) {
            addCriterion("OtherField2 not in", values, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2Between(String value1, String value2) {
            addCriterion("OtherField2 between", value1, value2, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2NotBetween(String value1, String value2) {
            addCriterion("OtherField2 not between", value1, value2, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield3IsNull() {
            addCriterion("OtherField3 is null");
            return (Criteria) this;
        }

        public Criteria andOtherfield3IsNotNull() {
            addCriterion("OtherField3 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfield3EqualTo(String value) {
            addCriterion("OtherField3 =", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3NotEqualTo(String value) {
            addCriterion("OtherField3 <>", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3GreaterThan(String value) {
            addCriterion("OtherField3 >", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3GreaterThanOrEqualTo(String value) {
            addCriterion("OtherField3 >=", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3LessThan(String value) {
            addCriterion("OtherField3 <", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3LessThanOrEqualTo(String value) {
            addCriterion("OtherField3 <=", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3Like(String value) {
            addCriterion("OtherField3 like", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3NotLike(String value) {
            addCriterion("OtherField3 not like", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3In(List<String> values) {
            addCriterion("OtherField3 in", values, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3NotIn(List<String> values) {
            addCriterion("OtherField3 not in", values, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3Between(String value1, String value2) {
            addCriterion("OtherField3 between", value1, value2, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3NotBetween(String value1, String value2) {
            addCriterion("OtherField3 not between", value1, value2, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield4IsNull() {
            addCriterion("OtherField4 is null");
            return (Criteria) this;
        }

        public Criteria andOtherfield4IsNotNull() {
            addCriterion("OtherField4 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfield4EqualTo(String value) {
            addCriterion("OtherField4 =", value, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4NotEqualTo(String value) {
            addCriterion("OtherField4 <>", value, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4GreaterThan(String value) {
            addCriterion("OtherField4 >", value, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4GreaterThanOrEqualTo(String value) {
            addCriterion("OtherField4 >=", value, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4LessThan(String value) {
            addCriterion("OtherField4 <", value, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4LessThanOrEqualTo(String value) {
            addCriterion("OtherField4 <=", value, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4Like(String value) {
            addCriterion("OtherField4 like", value, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4NotLike(String value) {
            addCriterion("OtherField4 not like", value, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4In(List<String> values) {
            addCriterion("OtherField4 in", values, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4NotIn(List<String> values) {
            addCriterion("OtherField4 not in", values, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4Between(String value1, String value2) {
            addCriterion("OtherField4 between", value1, value2, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield4NotBetween(String value1, String value2) {
            addCriterion("OtherField4 not between", value1, value2, "otherfield4");
            return (Criteria) this;
        }

        public Criteria andOtherfield5IsNull() {
            addCriterion("OtherField5 is null");
            return (Criteria) this;
        }

        public Criteria andOtherfield5IsNotNull() {
            addCriterion("OtherField5 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfield5EqualTo(String value) {
            addCriterion("OtherField5 =", value, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5NotEqualTo(String value) {
            addCriterion("OtherField5 <>", value, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5GreaterThan(String value) {
            addCriterion("OtherField5 >", value, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5GreaterThanOrEqualTo(String value) {
            addCriterion("OtherField5 >=", value, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5LessThan(String value) {
            addCriterion("OtherField5 <", value, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5LessThanOrEqualTo(String value) {
            addCriterion("OtherField5 <=", value, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5Like(String value) {
            addCriterion("OtherField5 like", value, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5NotLike(String value) {
            addCriterion("OtherField5 not like", value, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5In(List<String> values) {
            addCriterion("OtherField5 in", values, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5NotIn(List<String> values) {
            addCriterion("OtherField5 not in", values, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5Between(String value1, String value2) {
            addCriterion("OtherField5 between", value1, value2, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andOtherfield5NotBetween(String value1, String value2) {
            addCriterion("OtherField5 not between", value1, value2, "otherfield5");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNull() {
            addCriterion("MType is null");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNotNull() {
            addCriterion("MType is not null");
            return (Criteria) this;
        }

        public Criteria andMtypeEqualTo(String value) {
            addCriterion("MType =", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotEqualTo(String value) {
            addCriterion("MType <>", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThan(String value) {
            addCriterion("MType >", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThanOrEqualTo(String value) {
            addCriterion("MType >=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThan(String value) {
            addCriterion("MType <", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThanOrEqualTo(String value) {
            addCriterion("MType <=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLike(String value) {
            addCriterion("MType like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotLike(String value) {
            addCriterion("MType not like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeIn(List<String> values) {
            addCriterion("MType in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotIn(List<String> values) {
            addCriterion("MType not in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeBetween(String value1, String value2) {
            addCriterion("MType between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotBetween(String value1, String value2) {
            addCriterion("MType not between", value1, value2, "mtype");
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