package com.example.wechatdemo.wechat.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodserviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodserviceExample() {
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

        public Criteria andGsry1IsNull() {
            addCriterion("gsry1 is null");
            return (Criteria) this;
        }

        public Criteria andGsry1IsNotNull() {
            addCriterion("gsry1 is not null");
            return (Criteria) this;
        }

        public Criteria andGsry1EqualTo(String value) {
            addCriterion("gsry1 =", value, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1NotEqualTo(String value) {
            addCriterion("gsry1 <>", value, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1GreaterThan(String value) {
            addCriterion("gsry1 >", value, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1GreaterThanOrEqualTo(String value) {
            addCriterion("gsry1 >=", value, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1LessThan(String value) {
            addCriterion("gsry1 <", value, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1LessThanOrEqualTo(String value) {
            addCriterion("gsry1 <=", value, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1Like(String value) {
            addCriterion("gsry1 like", value, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1NotLike(String value) {
            addCriterion("gsry1 not like", value, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1In(List<String> values) {
            addCriterion("gsry1 in", values, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1NotIn(List<String> values) {
            addCriterion("gsry1 not in", values, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1Between(String value1, String value2) {
            addCriterion("gsry1 between", value1, value2, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry1NotBetween(String value1, String value2) {
            addCriterion("gsry1 not between", value1, value2, "gsry1");
            return (Criteria) this;
        }

        public Criteria andGsry2IsNull() {
            addCriterion("gsry2 is null");
            return (Criteria) this;
        }

        public Criteria andGsry2IsNotNull() {
            addCriterion("gsry2 is not null");
            return (Criteria) this;
        }

        public Criteria andGsry2EqualTo(String value) {
            addCriterion("gsry2 =", value, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2NotEqualTo(String value) {
            addCriterion("gsry2 <>", value, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2GreaterThan(String value) {
            addCriterion("gsry2 >", value, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2GreaterThanOrEqualTo(String value) {
            addCriterion("gsry2 >=", value, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2LessThan(String value) {
            addCriterion("gsry2 <", value, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2LessThanOrEqualTo(String value) {
            addCriterion("gsry2 <=", value, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2Like(String value) {
            addCriterion("gsry2 like", value, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2NotLike(String value) {
            addCriterion("gsry2 not like", value, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2In(List<String> values) {
            addCriterion("gsry2 in", values, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2NotIn(List<String> values) {
            addCriterion("gsry2 not in", values, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2Between(String value1, String value2) {
            addCriterion("gsry2 between", value1, value2, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry2NotBetween(String value1, String value2) {
            addCriterion("gsry2 not between", value1, value2, "gsry2");
            return (Criteria) this;
        }

        public Criteria andGsry3IsNull() {
            addCriterion("gsry3 is null");
            return (Criteria) this;
        }

        public Criteria andGsry3IsNotNull() {
            addCriterion("gsry3 is not null");
            return (Criteria) this;
        }

        public Criteria andGsry3EqualTo(String value) {
            addCriterion("gsry3 =", value, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3NotEqualTo(String value) {
            addCriterion("gsry3 <>", value, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3GreaterThan(String value) {
            addCriterion("gsry3 >", value, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3GreaterThanOrEqualTo(String value) {
            addCriterion("gsry3 >=", value, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3LessThan(String value) {
            addCriterion("gsry3 <", value, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3LessThanOrEqualTo(String value) {
            addCriterion("gsry3 <=", value, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3Like(String value) {
            addCriterion("gsry3 like", value, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3NotLike(String value) {
            addCriterion("gsry3 not like", value, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3In(List<String> values) {
            addCriterion("gsry3 in", values, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3NotIn(List<String> values) {
            addCriterion("gsry3 not in", values, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3Between(String value1, String value2) {
            addCriterion("gsry3 between", value1, value2, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry3NotBetween(String value1, String value2) {
            addCriterion("gsry3 not between", value1, value2, "gsry3");
            return (Criteria) this;
        }

        public Criteria andGsry4IsNull() {
            addCriterion("gsry4 is null");
            return (Criteria) this;
        }

        public Criteria andGsry4IsNotNull() {
            addCriterion("gsry4 is not null");
            return (Criteria) this;
        }

        public Criteria andGsry4EqualTo(String value) {
            addCriterion("gsry4 =", value, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4NotEqualTo(String value) {
            addCriterion("gsry4 <>", value, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4GreaterThan(String value) {
            addCriterion("gsry4 >", value, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4GreaterThanOrEqualTo(String value) {
            addCriterion("gsry4 >=", value, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4LessThan(String value) {
            addCriterion("gsry4 <", value, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4LessThanOrEqualTo(String value) {
            addCriterion("gsry4 <=", value, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4Like(String value) {
            addCriterion("gsry4 like", value, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4NotLike(String value) {
            addCriterion("gsry4 not like", value, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4In(List<String> values) {
            addCriterion("gsry4 in", values, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4NotIn(List<String> values) {
            addCriterion("gsry4 not in", values, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4Between(String value1, String value2) {
            addCriterion("gsry4 between", value1, value2, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry4NotBetween(String value1, String value2) {
            addCriterion("gsry4 not between", value1, value2, "gsry4");
            return (Criteria) this;
        }

        public Criteria andGsry5IsNull() {
            addCriterion("gsry5 is null");
            return (Criteria) this;
        }

        public Criteria andGsry5IsNotNull() {
            addCriterion("gsry5 is not null");
            return (Criteria) this;
        }

        public Criteria andGsry5EqualTo(Integer value) {
            addCriterion("gsry5 =", value, "gsry5");
            return (Criteria) this;
        }

        public Criteria andGsry5NotEqualTo(Integer value) {
            addCriterion("gsry5 <>", value, "gsry5");
            return (Criteria) this;
        }

        public Criteria andGsry5GreaterThan(Integer value) {
            addCriterion("gsry5 >", value, "gsry5");
            return (Criteria) this;
        }

        public Criteria andGsry5GreaterThanOrEqualTo(Integer value) {
            addCriterion("gsry5 >=", value, "gsry5");
            return (Criteria) this;
        }

        public Criteria andGsry5LessThan(Integer value) {
            addCriterion("gsry5 <", value, "gsry5");
            return (Criteria) this;
        }

        public Criteria andGsry5LessThanOrEqualTo(Integer value) {
            addCriterion("gsry5 <=", value, "gsry5");
            return (Criteria) this;
        }

        public Criteria andGsry5In(List<Integer> values) {
            addCriterion("gsry5 in", values, "gsry5");
            return (Criteria) this;
        }

        public Criteria andGsry5NotIn(List<Integer> values) {
            addCriterion("gsry5 not in", values, "gsry5");
            return (Criteria) this;
        }

        public Criteria andGsry5Between(Integer value1, Integer value2) {
            addCriterion("gsry5 between", value1, value2, "gsry5");
            return (Criteria) this;
        }

        public Criteria andGsry5NotBetween(Integer value1, Integer value2) {
            addCriterion("gsry5 not between", value1, value2, "gsry5");
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