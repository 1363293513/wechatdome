package com.example.wechatdemo.wechat.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPcontentIsNull() {
            addCriterion("pcontent is null");
            return (Criteria) this;
        }

        public Criteria andPcontentIsNotNull() {
            addCriterion("pcontent is not null");
            return (Criteria) this;
        }

        public Criteria andPcontentEqualTo(String value) {
            addCriterion("pcontent =", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotEqualTo(String value) {
            addCriterion("pcontent <>", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentGreaterThan(String value) {
            addCriterion("pcontent >", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentGreaterThanOrEqualTo(String value) {
            addCriterion("pcontent >=", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLessThan(String value) {
            addCriterion("pcontent <", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLessThanOrEqualTo(String value) {
            addCriterion("pcontent <=", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLike(String value) {
            addCriterion("pcontent like", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotLike(String value) {
            addCriterion("pcontent not like", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentIn(List<String> values) {
            addCriterion("pcontent in", values, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotIn(List<String> values) {
            addCriterion("pcontent not in", values, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentBetween(String value1, String value2) {
            addCriterion("pcontent between", value1, value2, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotBetween(String value1, String value2) {
            addCriterion("pcontent not between", value1, value2, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPtagIsNull() {
            addCriterion("ptag is null");
            return (Criteria) this;
        }

        public Criteria andPtagIsNotNull() {
            addCriterion("ptag is not null");
            return (Criteria) this;
        }

        public Criteria andPtagEqualTo(String value) {
            addCriterion("ptag =", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagNotEqualTo(String value) {
            addCriterion("ptag <>", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagGreaterThan(String value) {
            addCriterion("ptag >", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagGreaterThanOrEqualTo(String value) {
            addCriterion("ptag >=", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagLessThan(String value) {
            addCriterion("ptag <", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagLessThanOrEqualTo(String value) {
            addCriterion("ptag <=", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagLike(String value) {
            addCriterion("ptag like", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagNotLike(String value) {
            addCriterion("ptag not like", value, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagIn(List<String> values) {
            addCriterion("ptag in", values, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagNotIn(List<String> values) {
            addCriterion("ptag not in", values, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagBetween(String value1, String value2) {
            addCriterion("ptag between", value1, value2, "ptag");
            return (Criteria) this;
        }

        public Criteria andPtagNotBetween(String value1, String value2) {
            addCriterion("ptag not between", value1, value2, "ptag");
            return (Criteria) this;
        }

        public Criteria andPpicIsNull() {
            addCriterion("ppic is null");
            return (Criteria) this;
        }

        public Criteria andPpicIsNotNull() {
            addCriterion("ppic is not null");
            return (Criteria) this;
        }

        public Criteria andPpicEqualTo(String value) {
            addCriterion("ppic =", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotEqualTo(String value) {
            addCriterion("ppic <>", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicGreaterThan(String value) {
            addCriterion("ppic >", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicGreaterThanOrEqualTo(String value) {
            addCriterion("ppic >=", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicLessThan(String value) {
            addCriterion("ppic <", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicLessThanOrEqualTo(String value) {
            addCriterion("ppic <=", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicLike(String value) {
            addCriterion("ppic like", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotLike(String value) {
            addCriterion("ppic not like", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicIn(List<String> values) {
            addCriterion("ppic in", values, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotIn(List<String> values) {
            addCriterion("ppic not in", values, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicBetween(String value1, String value2) {
            addCriterion("ppic between", value1, value2, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotBetween(String value1, String value2) {
            addCriterion("ppic not between", value1, value2, "ppic");
            return (Criteria) this;
        }

        public Criteria andPtimeIsNull() {
            addCriterion("ptime is null");
            return (Criteria) this;
        }

        public Criteria andPtimeIsNotNull() {
            addCriterion("ptime is not null");
            return (Criteria) this;
        }

        public Criteria andPtimeEqualTo(Date value) {
            addCriterion("ptime =", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotEqualTo(Date value) {
            addCriterion("ptime <>", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeGreaterThan(Date value) {
            addCriterion("ptime >", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ptime >=", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeLessThan(Date value) {
            addCriterion("ptime <", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeLessThanOrEqualTo(Date value) {
            addCriterion("ptime <=", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeIn(List<Date> values) {
            addCriterion("ptime in", values, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotIn(List<Date> values) {
            addCriterion("ptime not in", values, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeBetween(Date value1, Date value2) {
            addCriterion("ptime between", value1, value2, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotBetween(Date value1, Date value2) {
            addCriterion("ptime not between", value1, value2, "ptime");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPry1IsNull() {
            addCriterion("pry1 is null");
            return (Criteria) this;
        }

        public Criteria andPry1IsNotNull() {
            addCriterion("pry1 is not null");
            return (Criteria) this;
        }

        public Criteria andPry1EqualTo(String value) {
            addCriterion("pry1 =", value, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1NotEqualTo(String value) {
            addCriterion("pry1 <>", value, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1GreaterThan(String value) {
            addCriterion("pry1 >", value, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1GreaterThanOrEqualTo(String value) {
            addCriterion("pry1 >=", value, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1LessThan(String value) {
            addCriterion("pry1 <", value, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1LessThanOrEqualTo(String value) {
            addCriterion("pry1 <=", value, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1Like(String value) {
            addCriterion("pry1 like", value, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1NotLike(String value) {
            addCriterion("pry1 not like", value, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1In(List<String> values) {
            addCriterion("pry1 in", values, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1NotIn(List<String> values) {
            addCriterion("pry1 not in", values, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1Between(String value1, String value2) {
            addCriterion("pry1 between", value1, value2, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry1NotBetween(String value1, String value2) {
            addCriterion("pry1 not between", value1, value2, "pry1");
            return (Criteria) this;
        }

        public Criteria andPry2IsNull() {
            addCriterion("pry2 is null");
            return (Criteria) this;
        }

        public Criteria andPry2IsNotNull() {
            addCriterion("pry2 is not null");
            return (Criteria) this;
        }

        public Criteria andPry2EqualTo(String value) {
            addCriterion("pry2 =", value, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2NotEqualTo(String value) {
            addCriterion("pry2 <>", value, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2GreaterThan(String value) {
            addCriterion("pry2 >", value, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2GreaterThanOrEqualTo(String value) {
            addCriterion("pry2 >=", value, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2LessThan(String value) {
            addCriterion("pry2 <", value, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2LessThanOrEqualTo(String value) {
            addCriterion("pry2 <=", value, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2Like(String value) {
            addCriterion("pry2 like", value, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2NotLike(String value) {
            addCriterion("pry2 not like", value, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2In(List<String> values) {
            addCriterion("pry2 in", values, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2NotIn(List<String> values) {
            addCriterion("pry2 not in", values, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2Between(String value1, String value2) {
            addCriterion("pry2 between", value1, value2, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry2NotBetween(String value1, String value2) {
            addCriterion("pry2 not between", value1, value2, "pry2");
            return (Criteria) this;
        }

        public Criteria andPry3IsNull() {
            addCriterion("pry3 is null");
            return (Criteria) this;
        }

        public Criteria andPry3IsNotNull() {
            addCriterion("pry3 is not null");
            return (Criteria) this;
        }

        public Criteria andPry3EqualTo(String value) {
            addCriterion("pry3 =", value, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3NotEqualTo(String value) {
            addCriterion("pry3 <>", value, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3GreaterThan(String value) {
            addCriterion("pry3 >", value, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3GreaterThanOrEqualTo(String value) {
            addCriterion("pry3 >=", value, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3LessThan(String value) {
            addCriterion("pry3 <", value, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3LessThanOrEqualTo(String value) {
            addCriterion("pry3 <=", value, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3Like(String value) {
            addCriterion("pry3 like", value, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3NotLike(String value) {
            addCriterion("pry3 not like", value, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3In(List<String> values) {
            addCriterion("pry3 in", values, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3NotIn(List<String> values) {
            addCriterion("pry3 not in", values, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3Between(String value1, String value2) {
            addCriterion("pry3 between", value1, value2, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry3NotBetween(String value1, String value2) {
            addCriterion("pry3 not between", value1, value2, "pry3");
            return (Criteria) this;
        }

        public Criteria andPry4IsNull() {
            addCriterion("pry4 is null");
            return (Criteria) this;
        }

        public Criteria andPry4IsNotNull() {
            addCriterion("pry4 is not null");
            return (Criteria) this;
        }

        public Criteria andPry4EqualTo(Integer value) {
            addCriterion("pry4 =", value, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry4NotEqualTo(Integer value) {
            addCriterion("pry4 <>", value, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry4GreaterThan(Integer value) {
            addCriterion("pry4 >", value, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry4GreaterThanOrEqualTo(Integer value) {
            addCriterion("pry4 >=", value, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry4LessThan(Integer value) {
            addCriterion("pry4 <", value, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry4LessThanOrEqualTo(Integer value) {
            addCriterion("pry4 <=", value, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry4In(List<Integer> values) {
            addCriterion("pry4 in", values, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry4NotIn(List<Integer> values) {
            addCriterion("pry4 not in", values, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry4Between(Integer value1, Integer value2) {
            addCriterion("pry4 between", value1, value2, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry4NotBetween(Integer value1, Integer value2) {
            addCriterion("pry4 not between", value1, value2, "pry4");
            return (Criteria) this;
        }

        public Criteria andPry5IsNull() {
            addCriterion("pry5 is null");
            return (Criteria) this;
        }

        public Criteria andPry5IsNotNull() {
            addCriterion("pry5 is not null");
            return (Criteria) this;
        }

        public Criteria andPry5EqualTo(Date value) {
            addCriterion("pry5 =", value, "pry5");
            return (Criteria) this;
        }

        public Criteria andPry5NotEqualTo(Date value) {
            addCriterion("pry5 <>", value, "pry5");
            return (Criteria) this;
        }

        public Criteria andPry5GreaterThan(Date value) {
            addCriterion("pry5 >", value, "pry5");
            return (Criteria) this;
        }

        public Criteria andPry5GreaterThanOrEqualTo(Date value) {
            addCriterion("pry5 >=", value, "pry5");
            return (Criteria) this;
        }

        public Criteria andPry5LessThan(Date value) {
            addCriterion("pry5 <", value, "pry5");
            return (Criteria) this;
        }

        public Criteria andPry5LessThanOrEqualTo(Date value) {
            addCriterion("pry5 <=", value, "pry5");
            return (Criteria) this;
        }

        public Criteria andPry5In(List<Date> values) {
            addCriterion("pry5 in", values, "pry5");
            return (Criteria) this;
        }

        public Criteria andPry5NotIn(List<Date> values) {
            addCriterion("pry5 not in", values, "pry5");
            return (Criteria) this;
        }

        public Criteria andPry5Between(Date value1, Date value2) {
            addCriterion("pry5 between", value1, value2, "pry5");
            return (Criteria) this;
        }

        public Criteria andPry5NotBetween(Date value1, Date value2) {
            addCriterion("pry5 not between", value1, value2, "pry5");
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