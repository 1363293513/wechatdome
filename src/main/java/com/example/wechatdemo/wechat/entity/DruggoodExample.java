package com.example.wechatdemo.wechat.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DruggoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DruggoodExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDruggoodidIsNull() {
            addCriterion("drugGoodId is null");
            return (Criteria) this;
        }

        public Criteria andDruggoodidIsNotNull() {
            addCriterion("drugGoodId is not null");
            return (Criteria) this;
        }

        public Criteria andDruggoodidEqualTo(Integer value) {
            addCriterion("drugGoodId =", value, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andDruggoodidNotEqualTo(Integer value) {
            addCriterion("drugGoodId <>", value, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andDruggoodidGreaterThan(Integer value) {
            addCriterion("drugGoodId >", value, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andDruggoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugGoodId >=", value, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andDruggoodidLessThan(Integer value) {
            addCriterion("drugGoodId <", value, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andDruggoodidLessThanOrEqualTo(Integer value) {
            addCriterion("drugGoodId <=", value, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andDruggoodidIn(List<Integer> values) {
            addCriterion("drugGoodId in", values, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andDruggoodidNotIn(List<Integer> values) {
            addCriterion("drugGoodId not in", values, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andDruggoodidBetween(Integer value1, Integer value2) {
            addCriterion("drugGoodId between", value1, value2, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andDruggoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugGoodId not between", value1, value2, "druggoodid");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSloganIsNull() {
            addCriterion("slogan is null");
            return (Criteria) this;
        }

        public Criteria andSloganIsNotNull() {
            addCriterion("slogan is not null");
            return (Criteria) this;
        }

        public Criteria andSloganEqualTo(String value) {
            addCriterion("slogan =", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotEqualTo(String value) {
            addCriterion("slogan <>", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganGreaterThan(String value) {
            addCriterion("slogan >", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganGreaterThanOrEqualTo(String value) {
            addCriterion("slogan >=", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganLessThan(String value) {
            addCriterion("slogan <", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganLessThanOrEqualTo(String value) {
            addCriterion("slogan <=", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganLike(String value) {
            addCriterion("slogan like", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotLike(String value) {
            addCriterion("slogan not like", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganIn(List<String> values) {
            addCriterion("slogan in", values, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotIn(List<String> values) {
            addCriterion("slogan not in", values, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganBetween(String value1, String value2) {
            addCriterion("slogan between", value1, value2, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotBetween(String value1, String value2) {
            addCriterion("slogan not between", value1, value2, "slogan");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidIsNull() {
            addCriterion("parentParentId is null");
            return (Criteria) this;
        }

        public Criteria andParentparentidIsNotNull() {
            addCriterion("parentParentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentparentidEqualTo(Integer value) {
            addCriterion("parentParentId =", value, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidNotEqualTo(Integer value) {
            addCriterion("parentParentId <>", value, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidGreaterThan(Integer value) {
            addCriterion("parentParentId >", value, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentParentId >=", value, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidLessThan(Integer value) {
            addCriterion("parentParentId <", value, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentParentId <=", value, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidIn(List<Integer> values) {
            addCriterion("parentParentId in", values, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidNotIn(List<Integer> values) {
            addCriterion("parentParentId not in", values, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidBetween(Integer value1, Integer value2) {
            addCriterion("parentParentId between", value1, value2, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andParentparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentParentId not between", value1, value2, "parentparentid");
            return (Criteria) this;
        }

        public Criteria andDgry1IsNull() {
            addCriterion("dgry1 is null");
            return (Criteria) this;
        }

        public Criteria andDgry1IsNotNull() {
            addCriterion("dgry1 is not null");
            return (Criteria) this;
        }

        public Criteria andDgry1EqualTo(String value) {
            addCriterion("dgry1 =", value, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1NotEqualTo(String value) {
            addCriterion("dgry1 <>", value, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1GreaterThan(String value) {
            addCriterion("dgry1 >", value, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1GreaterThanOrEqualTo(String value) {
            addCriterion("dgry1 >=", value, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1LessThan(String value) {
            addCriterion("dgry1 <", value, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1LessThanOrEqualTo(String value) {
            addCriterion("dgry1 <=", value, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1Like(String value) {
            addCriterion("dgry1 like", value, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1NotLike(String value) {
            addCriterion("dgry1 not like", value, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1In(List<String> values) {
            addCriterion("dgry1 in", values, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1NotIn(List<String> values) {
            addCriterion("dgry1 not in", values, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1Between(String value1, String value2) {
            addCriterion("dgry1 between", value1, value2, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry1NotBetween(String value1, String value2) {
            addCriterion("dgry1 not between", value1, value2, "dgry1");
            return (Criteria) this;
        }

        public Criteria andDgry2IsNull() {
            addCriterion("dgry2 is null");
            return (Criteria) this;
        }

        public Criteria andDgry2IsNotNull() {
            addCriterion("dgry2 is not null");
            return (Criteria) this;
        }

        public Criteria andDgry2EqualTo(String value) {
            addCriterion("dgry2 =", value, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2NotEqualTo(String value) {
            addCriterion("dgry2 <>", value, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2GreaterThan(String value) {
            addCriterion("dgry2 >", value, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2GreaterThanOrEqualTo(String value) {
            addCriterion("dgry2 >=", value, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2LessThan(String value) {
            addCriterion("dgry2 <", value, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2LessThanOrEqualTo(String value) {
            addCriterion("dgry2 <=", value, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2Like(String value) {
            addCriterion("dgry2 like", value, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2NotLike(String value) {
            addCriterion("dgry2 not like", value, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2In(List<String> values) {
            addCriterion("dgry2 in", values, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2NotIn(List<String> values) {
            addCriterion("dgry2 not in", values, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2Between(String value1, String value2) {
            addCriterion("dgry2 between", value1, value2, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry2NotBetween(String value1, String value2) {
            addCriterion("dgry2 not between", value1, value2, "dgry2");
            return (Criteria) this;
        }

        public Criteria andDgry3IsNull() {
            addCriterion("dgry3 is null");
            return (Criteria) this;
        }

        public Criteria andDgry3IsNotNull() {
            addCriterion("dgry3 is not null");
            return (Criteria) this;
        }

        public Criteria andDgry3EqualTo(String value) {
            addCriterion("dgry3 =", value, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3NotEqualTo(String value) {
            addCriterion("dgry3 <>", value, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3GreaterThan(String value) {
            addCriterion("dgry3 >", value, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3GreaterThanOrEqualTo(String value) {
            addCriterion("dgry3 >=", value, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3LessThan(String value) {
            addCriterion("dgry3 <", value, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3LessThanOrEqualTo(String value) {
            addCriterion("dgry3 <=", value, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3Like(String value) {
            addCriterion("dgry3 like", value, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3NotLike(String value) {
            addCriterion("dgry3 not like", value, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3In(List<String> values) {
            addCriterion("dgry3 in", values, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3NotIn(List<String> values) {
            addCriterion("dgry3 not in", values, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3Between(String value1, String value2) {
            addCriterion("dgry3 between", value1, value2, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry3NotBetween(String value1, String value2) {
            addCriterion("dgry3 not between", value1, value2, "dgry3");
            return (Criteria) this;
        }

        public Criteria andDgry4IsNull() {
            addCriterion("dgry4 is null");
            return (Criteria) this;
        }

        public Criteria andDgry4IsNotNull() {
            addCriterion("dgry4 is not null");
            return (Criteria) this;
        }

        public Criteria andDgry4EqualTo(String value) {
            addCriterion("dgry4 =", value, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4NotEqualTo(String value) {
            addCriterion("dgry4 <>", value, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4GreaterThan(String value) {
            addCriterion("dgry4 >", value, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4GreaterThanOrEqualTo(String value) {
            addCriterion("dgry4 >=", value, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4LessThan(String value) {
            addCriterion("dgry4 <", value, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4LessThanOrEqualTo(String value) {
            addCriterion("dgry4 <=", value, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4Like(String value) {
            addCriterion("dgry4 like", value, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4NotLike(String value) {
            addCriterion("dgry4 not like", value, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4In(List<String> values) {
            addCriterion("dgry4 in", values, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4NotIn(List<String> values) {
            addCriterion("dgry4 not in", values, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4Between(String value1, String value2) {
            addCriterion("dgry4 between", value1, value2, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry4NotBetween(String value1, String value2) {
            addCriterion("dgry4 not between", value1, value2, "dgry4");
            return (Criteria) this;
        }

        public Criteria andDgry5IsNull() {
            addCriterion("dgry5 is null");
            return (Criteria) this;
        }

        public Criteria andDgry5IsNotNull() {
            addCriterion("dgry5 is not null");
            return (Criteria) this;
        }

        public Criteria andDgry5EqualTo(Integer value) {
            addCriterion("dgry5 =", value, "dgry5");
            return (Criteria) this;
        }

        public Criteria andDgry5NotEqualTo(Integer value) {
            addCriterion("dgry5 <>", value, "dgry5");
            return (Criteria) this;
        }

        public Criteria andDgry5GreaterThan(Integer value) {
            addCriterion("dgry5 >", value, "dgry5");
            return (Criteria) this;
        }

        public Criteria andDgry5GreaterThanOrEqualTo(Integer value) {
            addCriterion("dgry5 >=", value, "dgry5");
            return (Criteria) this;
        }

        public Criteria andDgry5LessThan(Integer value) {
            addCriterion("dgry5 <", value, "dgry5");
            return (Criteria) this;
        }

        public Criteria andDgry5LessThanOrEqualTo(Integer value) {
            addCriterion("dgry5 <=", value, "dgry5");
            return (Criteria) this;
        }

        public Criteria andDgry5In(List<Integer> values) {
            addCriterion("dgry5 in", values, "dgry5");
            return (Criteria) this;
        }

        public Criteria andDgry5NotIn(List<Integer> values) {
            addCriterion("dgry5 not in", values, "dgry5");
            return (Criteria) this;
        }

        public Criteria andDgry5Between(Integer value1, Integer value2) {
            addCriterion("dgry5 between", value1, value2, "dgry5");
            return (Criteria) this;
        }

        public Criteria andDgry5NotBetween(Integer value1, Integer value2) {
            addCriterion("dgry5 not between", value1, value2, "dgry5");
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