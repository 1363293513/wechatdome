package com.example.wechatdemo.wechat.entity;

import java.util.ArrayList;
import java.util.List;

public class DrugclassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugclassificationExample() {
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

        public Criteria andDrugclassidIsNull() {
            addCriterion("drugClassId is null");
            return (Criteria) this;
        }

        public Criteria andDrugclassidIsNotNull() {
            addCriterion("drugClassId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugclassidEqualTo(Integer value) {
            addCriterion("drugClassId =", value, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andDrugclassidNotEqualTo(Integer value) {
            addCriterion("drugClassId <>", value, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andDrugclassidGreaterThan(Integer value) {
            addCriterion("drugClassId >", value, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andDrugclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugClassId >=", value, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andDrugclassidLessThan(Integer value) {
            addCriterion("drugClassId <", value, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andDrugclassidLessThanOrEqualTo(Integer value) {
            addCriterion("drugClassId <=", value, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andDrugclassidIn(List<Integer> values) {
            addCriterion("drugClassId in", values, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andDrugclassidNotIn(List<Integer> values) {
            addCriterion("drugClassId not in", values, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andDrugclassidBetween(Integer value1, Integer value2) {
            addCriterion("drugClassId between", value1, value2, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andDrugclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugClassId not between", value1, value2, "drugclassid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDcry1IsNull() {
            addCriterion("dcry1 is null");
            return (Criteria) this;
        }

        public Criteria andDcry1IsNotNull() {
            addCriterion("dcry1 is not null");
            return (Criteria) this;
        }

        public Criteria andDcry1EqualTo(String value) {
            addCriterion("dcry1 =", value, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1NotEqualTo(String value) {
            addCriterion("dcry1 <>", value, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1GreaterThan(String value) {
            addCriterion("dcry1 >", value, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1GreaterThanOrEqualTo(String value) {
            addCriterion("dcry1 >=", value, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1LessThan(String value) {
            addCriterion("dcry1 <", value, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1LessThanOrEqualTo(String value) {
            addCriterion("dcry1 <=", value, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1Like(String value) {
            addCriterion("dcry1 like", value, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1NotLike(String value) {
            addCriterion("dcry1 not like", value, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1In(List<String> values) {
            addCriterion("dcry1 in", values, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1NotIn(List<String> values) {
            addCriterion("dcry1 not in", values, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1Between(String value1, String value2) {
            addCriterion("dcry1 between", value1, value2, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry1NotBetween(String value1, String value2) {
            addCriterion("dcry1 not between", value1, value2, "dcry1");
            return (Criteria) this;
        }

        public Criteria andDcry2IsNull() {
            addCriterion("dcry2 is null");
            return (Criteria) this;
        }

        public Criteria andDcry2IsNotNull() {
            addCriterion("dcry2 is not null");
            return (Criteria) this;
        }

        public Criteria andDcry2EqualTo(String value) {
            addCriterion("dcry2 =", value, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2NotEqualTo(String value) {
            addCriterion("dcry2 <>", value, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2GreaterThan(String value) {
            addCriterion("dcry2 >", value, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2GreaterThanOrEqualTo(String value) {
            addCriterion("dcry2 >=", value, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2LessThan(String value) {
            addCriterion("dcry2 <", value, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2LessThanOrEqualTo(String value) {
            addCriterion("dcry2 <=", value, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2Like(String value) {
            addCriterion("dcry2 like", value, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2NotLike(String value) {
            addCriterion("dcry2 not like", value, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2In(List<String> values) {
            addCriterion("dcry2 in", values, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2NotIn(List<String> values) {
            addCriterion("dcry2 not in", values, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2Between(String value1, String value2) {
            addCriterion("dcry2 between", value1, value2, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry2NotBetween(String value1, String value2) {
            addCriterion("dcry2 not between", value1, value2, "dcry2");
            return (Criteria) this;
        }

        public Criteria andDcry3IsNull() {
            addCriterion("dcry3 is null");
            return (Criteria) this;
        }

        public Criteria andDcry3IsNotNull() {
            addCriterion("dcry3 is not null");
            return (Criteria) this;
        }

        public Criteria andDcry3EqualTo(String value) {
            addCriterion("dcry3 =", value, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3NotEqualTo(String value) {
            addCriterion("dcry3 <>", value, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3GreaterThan(String value) {
            addCriterion("dcry3 >", value, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3GreaterThanOrEqualTo(String value) {
            addCriterion("dcry3 >=", value, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3LessThan(String value) {
            addCriterion("dcry3 <", value, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3LessThanOrEqualTo(String value) {
            addCriterion("dcry3 <=", value, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3Like(String value) {
            addCriterion("dcry3 like", value, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3NotLike(String value) {
            addCriterion("dcry3 not like", value, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3In(List<String> values) {
            addCriterion("dcry3 in", values, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3NotIn(List<String> values) {
            addCriterion("dcry3 not in", values, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3Between(String value1, String value2) {
            addCriterion("dcry3 between", value1, value2, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry3NotBetween(String value1, String value2) {
            addCriterion("dcry3 not between", value1, value2, "dcry3");
            return (Criteria) this;
        }

        public Criteria andDcry4IsNull() {
            addCriterion("dcry4 is null");
            return (Criteria) this;
        }

        public Criteria andDcry4IsNotNull() {
            addCriterion("dcry4 is not null");
            return (Criteria) this;
        }

        public Criteria andDcry4EqualTo(String value) {
            addCriterion("dcry4 =", value, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4NotEqualTo(String value) {
            addCriterion("dcry4 <>", value, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4GreaterThan(String value) {
            addCriterion("dcry4 >", value, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4GreaterThanOrEqualTo(String value) {
            addCriterion("dcry4 >=", value, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4LessThan(String value) {
            addCriterion("dcry4 <", value, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4LessThanOrEqualTo(String value) {
            addCriterion("dcry4 <=", value, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4Like(String value) {
            addCriterion("dcry4 like", value, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4NotLike(String value) {
            addCriterion("dcry4 not like", value, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4In(List<String> values) {
            addCriterion("dcry4 in", values, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4NotIn(List<String> values) {
            addCriterion("dcry4 not in", values, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4Between(String value1, String value2) {
            addCriterion("dcry4 between", value1, value2, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry4NotBetween(String value1, String value2) {
            addCriterion("dcry4 not between", value1, value2, "dcry4");
            return (Criteria) this;
        }

        public Criteria andDcry5IsNull() {
            addCriterion("dcry5 is null");
            return (Criteria) this;
        }

        public Criteria andDcry5IsNotNull() {
            addCriterion("dcry5 is not null");
            return (Criteria) this;
        }

        public Criteria andDcry5EqualTo(Integer value) {
            addCriterion("dcry5 =", value, "dcry5");
            return (Criteria) this;
        }

        public Criteria andDcry5NotEqualTo(Integer value) {
            addCriterion("dcry5 <>", value, "dcry5");
            return (Criteria) this;
        }

        public Criteria andDcry5GreaterThan(Integer value) {
            addCriterion("dcry5 >", value, "dcry5");
            return (Criteria) this;
        }

        public Criteria andDcry5GreaterThanOrEqualTo(Integer value) {
            addCriterion("dcry5 >=", value, "dcry5");
            return (Criteria) this;
        }

        public Criteria andDcry5LessThan(Integer value) {
            addCriterion("dcry5 <", value, "dcry5");
            return (Criteria) this;
        }

        public Criteria andDcry5LessThanOrEqualTo(Integer value) {
            addCriterion("dcry5 <=", value, "dcry5");
            return (Criteria) this;
        }

        public Criteria andDcry5In(List<Integer> values) {
            addCriterion("dcry5 in", values, "dcry5");
            return (Criteria) this;
        }

        public Criteria andDcry5NotIn(List<Integer> values) {
            addCriterion("dcry5 not in", values, "dcry5");
            return (Criteria) this;
        }

        public Criteria andDcry5Between(Integer value1, Integer value2) {
            addCriterion("dcry5 between", value1, value2, "dcry5");
            return (Criteria) this;
        }

        public Criteria andDcry5NotBetween(Integer value1, Integer value2) {
            addCriterion("dcry5 not between", value1, value2, "dcry5");
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