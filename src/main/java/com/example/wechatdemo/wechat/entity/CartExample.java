package com.example.wechatdemo.wechat.entity;

import java.util.ArrayList;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCartidIsNull() {
            addCriterion("cartId is null");
            return (Criteria) this;
        }

        public Criteria andCartidIsNotNull() {
            addCriterion("cartId is not null");
            return (Criteria) this;
        }

        public Criteria andCartidEqualTo(Integer value) {
            addCriterion("cartId =", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotEqualTo(Integer value) {
            addCriterion("cartId <>", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThan(Integer value) {
            addCriterion("cartId >", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartId >=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThan(Integer value) {
            addCriterion("cartId <", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThanOrEqualTo(Integer value) {
            addCriterion("cartId <=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidIn(List<Integer> values) {
            addCriterion("cartId in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotIn(List<Integer> values) {
            addCriterion("cartId not in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidBetween(Integer value1, Integer value2) {
            addCriterion("cartId between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartId not between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNull() {
            addCriterion("goodId is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("goodId =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("goodId <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("goodId >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodId >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("goodId <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("goodId <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("goodId in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("goodId not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("goodId between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodId not between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andRy1IsNull() {
            addCriterion("ry1 is null");
            return (Criteria) this;
        }

        public Criteria andRy1IsNotNull() {
            addCriterion("ry1 is not null");
            return (Criteria) this;
        }

        public Criteria andRy1EqualTo(String value) {
            addCriterion("ry1 =", value, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1NotEqualTo(String value) {
            addCriterion("ry1 <>", value, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1GreaterThan(String value) {
            addCriterion("ry1 >", value, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1GreaterThanOrEqualTo(String value) {
            addCriterion("ry1 >=", value, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1LessThan(String value) {
            addCriterion("ry1 <", value, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1LessThanOrEqualTo(String value) {
            addCriterion("ry1 <=", value, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1Like(String value) {
            addCriterion("ry1 like", value, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1NotLike(String value) {
            addCriterion("ry1 not like", value, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1In(List<String> values) {
            addCriterion("ry1 in", values, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1NotIn(List<String> values) {
            addCriterion("ry1 not in", values, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1Between(String value1, String value2) {
            addCriterion("ry1 between", value1, value2, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy1NotBetween(String value1, String value2) {
            addCriterion("ry1 not between", value1, value2, "ry1");
            return (Criteria) this;
        }

        public Criteria andRy2IsNull() {
            addCriterion("ry2 is null");
            return (Criteria) this;
        }

        public Criteria andRy2IsNotNull() {
            addCriterion("ry2 is not null");
            return (Criteria) this;
        }

        public Criteria andRy2EqualTo(String value) {
            addCriterion("ry2 =", value, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2NotEqualTo(String value) {
            addCriterion("ry2 <>", value, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2GreaterThan(String value) {
            addCriterion("ry2 >", value, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2GreaterThanOrEqualTo(String value) {
            addCriterion("ry2 >=", value, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2LessThan(String value) {
            addCriterion("ry2 <", value, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2LessThanOrEqualTo(String value) {
            addCriterion("ry2 <=", value, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2Like(String value) {
            addCriterion("ry2 like", value, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2NotLike(String value) {
            addCriterion("ry2 not like", value, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2In(List<String> values) {
            addCriterion("ry2 in", values, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2NotIn(List<String> values) {
            addCriterion("ry2 not in", values, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2Between(String value1, String value2) {
            addCriterion("ry2 between", value1, value2, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy2NotBetween(String value1, String value2) {
            addCriterion("ry2 not between", value1, value2, "ry2");
            return (Criteria) this;
        }

        public Criteria andRy3IsNull() {
            addCriterion("ry3 is null");
            return (Criteria) this;
        }

        public Criteria andRy3IsNotNull() {
            addCriterion("ry3 is not null");
            return (Criteria) this;
        }

        public Criteria andRy3EqualTo(String value) {
            addCriterion("ry3 =", value, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3NotEqualTo(String value) {
            addCriterion("ry3 <>", value, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3GreaterThan(String value) {
            addCriterion("ry3 >", value, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3GreaterThanOrEqualTo(String value) {
            addCriterion("ry3 >=", value, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3LessThan(String value) {
            addCriterion("ry3 <", value, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3LessThanOrEqualTo(String value) {
            addCriterion("ry3 <=", value, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3Like(String value) {
            addCriterion("ry3 like", value, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3NotLike(String value) {
            addCriterion("ry3 not like", value, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3In(List<String> values) {
            addCriterion("ry3 in", values, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3NotIn(List<String> values) {
            addCriterion("ry3 not in", values, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3Between(String value1, String value2) {
            addCriterion("ry3 between", value1, value2, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy3NotBetween(String value1, String value2) {
            addCriterion("ry3 not between", value1, value2, "ry3");
            return (Criteria) this;
        }

        public Criteria andRy4IsNull() {
            addCriterion("ry4 is null");
            return (Criteria) this;
        }

        public Criteria andRy4IsNotNull() {
            addCriterion("ry4 is not null");
            return (Criteria) this;
        }

        public Criteria andRy4EqualTo(String value) {
            addCriterion("ry4 =", value, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4NotEqualTo(String value) {
            addCriterion("ry4 <>", value, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4GreaterThan(String value) {
            addCriterion("ry4 >", value, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4GreaterThanOrEqualTo(String value) {
            addCriterion("ry4 >=", value, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4LessThan(String value) {
            addCriterion("ry4 <", value, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4LessThanOrEqualTo(String value) {
            addCriterion("ry4 <=", value, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4Like(String value) {
            addCriterion("ry4 like", value, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4NotLike(String value) {
            addCriterion("ry4 not like", value, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4In(List<String> values) {
            addCriterion("ry4 in", values, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4NotIn(List<String> values) {
            addCriterion("ry4 not in", values, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4Between(String value1, String value2) {
            addCriterion("ry4 between", value1, value2, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy4NotBetween(String value1, String value2) {
            addCriterion("ry4 not between", value1, value2, "ry4");
            return (Criteria) this;
        }

        public Criteria andRy5IsNull() {
            addCriterion("ry5 is null");
            return (Criteria) this;
        }

        public Criteria andRy5IsNotNull() {
            addCriterion("ry5 is not null");
            return (Criteria) this;
        }

        public Criteria andRy5EqualTo(Integer value) {
            addCriterion("ry5 =", value, "ry5");
            return (Criteria) this;
        }

        public Criteria andRy5NotEqualTo(Integer value) {
            addCriterion("ry5 <>", value, "ry5");
            return (Criteria) this;
        }

        public Criteria andRy5GreaterThan(Integer value) {
            addCriterion("ry5 >", value, "ry5");
            return (Criteria) this;
        }

        public Criteria andRy5GreaterThanOrEqualTo(Integer value) {
            addCriterion("ry5 >=", value, "ry5");
            return (Criteria) this;
        }

        public Criteria andRy5LessThan(Integer value) {
            addCriterion("ry5 <", value, "ry5");
            return (Criteria) this;
        }

        public Criteria andRy5LessThanOrEqualTo(Integer value) {
            addCriterion("ry5 <=", value, "ry5");
            return (Criteria) this;
        }

        public Criteria andRy5In(List<Integer> values) {
            addCriterion("ry5 in", values, "ry5");
            return (Criteria) this;
        }

        public Criteria andRy5NotIn(List<Integer> values) {
            addCriterion("ry5 not in", values, "ry5");
            return (Criteria) this;
        }

        public Criteria andRy5Between(Integer value1, Integer value2) {
            addCriterion("ry5 between", value1, value2, "ry5");
            return (Criteria) this;
        }

        public Criteria andRy5NotBetween(Integer value1, Integer value2) {
            addCriterion("ry5 not between", value1, value2, "ry5");
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