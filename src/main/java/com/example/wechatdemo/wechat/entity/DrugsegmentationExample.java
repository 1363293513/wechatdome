package com.example.wechatdemo.wechat.entity;

import java.util.ArrayList;
import java.util.List;

public class DrugsegmentationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugsegmentationExample() {
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

        public Criteria andDrugsegidIsNull() {
            addCriterion("drugSegId is null");
            return (Criteria) this;
        }

        public Criteria andDrugsegidIsNotNull() {
            addCriterion("drugSegId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsegidEqualTo(Integer value) {
            addCriterion("drugSegId =", value, "drugsegid");
            return (Criteria) this;
        }

        public Criteria andDrugsegidNotEqualTo(Integer value) {
            addCriterion("drugSegId <>", value, "drugsegid");
            return (Criteria) this;
        }

        public Criteria andDrugsegidGreaterThan(Integer value) {
            addCriterion("drugSegId >", value, "drugsegid");
            return (Criteria) this;
        }

        public Criteria andDrugsegidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugSegId >=", value, "drugsegid");
            return (Criteria) this;
        }

        public Criteria andDrugsegidLessThan(Integer value) {
            addCriterion("drugSegId <", value, "drugsegid");
            return (Criteria) this;
        }

        public Criteria andDrugsegidLessThanOrEqualTo(Integer value) {
            addCriterion("drugSegId <=", value, "drugsegid");
            return (Criteria) this;
        }

        public Criteria andDrugsegidIn(List<Integer> values) {
            addCriterion("drugSegId in", values, "drugsegid");
            return (Criteria) this;
        }

        public Criteria andDrugsegidNotIn(List<Integer> values) {
            addCriterion("drugSegId not in", values, "drugsegid");
            return (Criteria) this;
        }

        public Criteria andDrugsegidBetween(Integer value1, Integer value2) {
            addCriterion("drugSegId between", value1, value2, "drugsegid");
            return (Criteria) this;
        }

        public Criteria andDrugsegidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugSegId not between", value1, value2, "drugsegid");
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

        public Criteria andDscr1IsNull() {
            addCriterion("dscr1 is null");
            return (Criteria) this;
        }

        public Criteria andDscr1IsNotNull() {
            addCriterion("dscr1 is not null");
            return (Criteria) this;
        }

        public Criteria andDscr1EqualTo(String value) {
            addCriterion("dscr1 =", value, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1NotEqualTo(String value) {
            addCriterion("dscr1 <>", value, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1GreaterThan(String value) {
            addCriterion("dscr1 >", value, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1GreaterThanOrEqualTo(String value) {
            addCriterion("dscr1 >=", value, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1LessThan(String value) {
            addCriterion("dscr1 <", value, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1LessThanOrEqualTo(String value) {
            addCriterion("dscr1 <=", value, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1Like(String value) {
            addCriterion("dscr1 like", value, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1NotLike(String value) {
            addCriterion("dscr1 not like", value, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1In(List<String> values) {
            addCriterion("dscr1 in", values, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1NotIn(List<String> values) {
            addCriterion("dscr1 not in", values, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1Between(String value1, String value2) {
            addCriterion("dscr1 between", value1, value2, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr1NotBetween(String value1, String value2) {
            addCriterion("dscr1 not between", value1, value2, "dscr1");
            return (Criteria) this;
        }

        public Criteria andDscr2IsNull() {
            addCriterion("dscr2 is null");
            return (Criteria) this;
        }

        public Criteria andDscr2IsNotNull() {
            addCriterion("dscr2 is not null");
            return (Criteria) this;
        }

        public Criteria andDscr2EqualTo(String value) {
            addCriterion("dscr2 =", value, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2NotEqualTo(String value) {
            addCriterion("dscr2 <>", value, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2GreaterThan(String value) {
            addCriterion("dscr2 >", value, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2GreaterThanOrEqualTo(String value) {
            addCriterion("dscr2 >=", value, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2LessThan(String value) {
            addCriterion("dscr2 <", value, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2LessThanOrEqualTo(String value) {
            addCriterion("dscr2 <=", value, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2Like(String value) {
            addCriterion("dscr2 like", value, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2NotLike(String value) {
            addCriterion("dscr2 not like", value, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2In(List<String> values) {
            addCriterion("dscr2 in", values, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2NotIn(List<String> values) {
            addCriterion("dscr2 not in", values, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2Between(String value1, String value2) {
            addCriterion("dscr2 between", value1, value2, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr2NotBetween(String value1, String value2) {
            addCriterion("dscr2 not between", value1, value2, "dscr2");
            return (Criteria) this;
        }

        public Criteria andDscr3IsNull() {
            addCriterion("dscr3 is null");
            return (Criteria) this;
        }

        public Criteria andDscr3IsNotNull() {
            addCriterion("dscr3 is not null");
            return (Criteria) this;
        }

        public Criteria andDscr3EqualTo(String value) {
            addCriterion("dscr3 =", value, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3NotEqualTo(String value) {
            addCriterion("dscr3 <>", value, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3GreaterThan(String value) {
            addCriterion("dscr3 >", value, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3GreaterThanOrEqualTo(String value) {
            addCriterion("dscr3 >=", value, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3LessThan(String value) {
            addCriterion("dscr3 <", value, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3LessThanOrEqualTo(String value) {
            addCriterion("dscr3 <=", value, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3Like(String value) {
            addCriterion("dscr3 like", value, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3NotLike(String value) {
            addCriterion("dscr3 not like", value, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3In(List<String> values) {
            addCriterion("dscr3 in", values, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3NotIn(List<String> values) {
            addCriterion("dscr3 not in", values, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3Between(String value1, String value2) {
            addCriterion("dscr3 between", value1, value2, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr3NotBetween(String value1, String value2) {
            addCriterion("dscr3 not between", value1, value2, "dscr3");
            return (Criteria) this;
        }

        public Criteria andDscr4IsNull() {
            addCriterion("dscr4 is null");
            return (Criteria) this;
        }

        public Criteria andDscr4IsNotNull() {
            addCriterion("dscr4 is not null");
            return (Criteria) this;
        }

        public Criteria andDscr4EqualTo(String value) {
            addCriterion("dscr4 =", value, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4NotEqualTo(String value) {
            addCriterion("dscr4 <>", value, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4GreaterThan(String value) {
            addCriterion("dscr4 >", value, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4GreaterThanOrEqualTo(String value) {
            addCriterion("dscr4 >=", value, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4LessThan(String value) {
            addCriterion("dscr4 <", value, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4LessThanOrEqualTo(String value) {
            addCriterion("dscr4 <=", value, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4Like(String value) {
            addCriterion("dscr4 like", value, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4NotLike(String value) {
            addCriterion("dscr4 not like", value, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4In(List<String> values) {
            addCriterion("dscr4 in", values, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4NotIn(List<String> values) {
            addCriterion("dscr4 not in", values, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4Between(String value1, String value2) {
            addCriterion("dscr4 between", value1, value2, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr4NotBetween(String value1, String value2) {
            addCriterion("dscr4 not between", value1, value2, "dscr4");
            return (Criteria) this;
        }

        public Criteria andDscr5IsNull() {
            addCriterion("dscr5 is null");
            return (Criteria) this;
        }

        public Criteria andDscr5IsNotNull() {
            addCriterion("dscr5 is not null");
            return (Criteria) this;
        }

        public Criteria andDscr5EqualTo(Integer value) {
            addCriterion("dscr5 =", value, "dscr5");
            return (Criteria) this;
        }

        public Criteria andDscr5NotEqualTo(Integer value) {
            addCriterion("dscr5 <>", value, "dscr5");
            return (Criteria) this;
        }

        public Criteria andDscr5GreaterThan(Integer value) {
            addCriterion("dscr5 >", value, "dscr5");
            return (Criteria) this;
        }

        public Criteria andDscr5GreaterThanOrEqualTo(Integer value) {
            addCriterion("dscr5 >=", value, "dscr5");
            return (Criteria) this;
        }

        public Criteria andDscr5LessThan(Integer value) {
            addCriterion("dscr5 <", value, "dscr5");
            return (Criteria) this;
        }

        public Criteria andDscr5LessThanOrEqualTo(Integer value) {
            addCriterion("dscr5 <=", value, "dscr5");
            return (Criteria) this;
        }

        public Criteria andDscr5In(List<Integer> values) {
            addCriterion("dscr5 in", values, "dscr5");
            return (Criteria) this;
        }

        public Criteria andDscr5NotIn(List<Integer> values) {
            addCriterion("dscr5 not in", values, "dscr5");
            return (Criteria) this;
        }

        public Criteria andDscr5Between(Integer value1, Integer value2) {
            addCriterion("dscr5 between", value1, value2, "dscr5");
            return (Criteria) this;
        }

        public Criteria andDscr5NotBetween(Integer value1, Integer value2) {
            addCriterion("dscr5 not between", value1, value2, "dscr5");
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