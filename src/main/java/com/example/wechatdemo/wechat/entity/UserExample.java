package com.example.wechatdemo.wechat.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUstateIsNull() {
            addCriterion("ustate is null");
            return (Criteria) this;
        }

        public Criteria andUstateIsNotNull() {
            addCriterion("ustate is not null");
            return (Criteria) this;
        }

        public Criteria andUstateEqualTo(String value) {
            addCriterion("ustate =", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateNotEqualTo(String value) {
            addCriterion("ustate <>", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateGreaterThan(String value) {
            addCriterion("ustate >", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateGreaterThanOrEqualTo(String value) {
            addCriterion("ustate >=", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateLessThan(String value) {
            addCriterion("ustate <", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateLessThanOrEqualTo(String value) {
            addCriterion("ustate <=", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateLike(String value) {
            addCriterion("ustate like", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateNotLike(String value) {
            addCriterion("ustate not like", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateIn(List<String> values) {
            addCriterion("ustate in", values, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateNotIn(List<String> values) {
            addCriterion("ustate not in", values, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateBetween(String value1, String value2) {
            addCriterion("ustate between", value1, value2, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateNotBetween(String value1, String value2) {
            addCriterion("ustate not between", value1, value2, "ustate");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUageIsNull() {
            addCriterion("uage is null");
            return (Criteria) this;
        }

        public Criteria andUageIsNotNull() {
            addCriterion("uage is not null");
            return (Criteria) this;
        }

        public Criteria andUageEqualTo(Integer value) {
            addCriterion("uage =", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotEqualTo(Integer value) {
            addCriterion("uage <>", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageGreaterThan(Integer value) {
            addCriterion("uage >", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageGreaterThanOrEqualTo(Integer value) {
            addCriterion("uage >=", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageLessThan(Integer value) {
            addCriterion("uage <", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageLessThanOrEqualTo(Integer value) {
            addCriterion("uage <=", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageIn(List<Integer> values) {
            addCriterion("uage in", values, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotIn(List<Integer> values) {
            addCriterion("uage not in", values, "uage");
            return (Criteria) this;
        }

        public Criteria andUageBetween(Integer value1, Integer value2) {
            addCriterion("uage between", value1, value2, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotBetween(Integer value1, Integer value2) {
            addCriterion("uage not between", value1, value2, "uage");
            return (Criteria) this;
        }

        public Criteria andUpictureIsNull() {
            addCriterion("upicture is null");
            return (Criteria) this;
        }

        public Criteria andUpictureIsNotNull() {
            addCriterion("upicture is not null");
            return (Criteria) this;
        }

        public Criteria andUpictureEqualTo(String value) {
            addCriterion("upicture =", value, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureNotEqualTo(String value) {
            addCriterion("upicture <>", value, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureGreaterThan(String value) {
            addCriterion("upicture >", value, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureGreaterThanOrEqualTo(String value) {
            addCriterion("upicture >=", value, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureLessThan(String value) {
            addCriterion("upicture <", value, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureLessThanOrEqualTo(String value) {
            addCriterion("upicture <=", value, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureLike(String value) {
            addCriterion("upicture like", value, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureNotLike(String value) {
            addCriterion("upicture not like", value, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureIn(List<String> values) {
            addCriterion("upicture in", values, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureNotIn(List<String> values) {
            addCriterion("upicture not in", values, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureBetween(String value1, String value2) {
            addCriterion("upicture between", value1, value2, "upicture");
            return (Criteria) this;
        }

        public Criteria andUpictureNotBetween(String value1, String value2) {
            addCriterion("upicture not between", value1, value2, "upicture");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNull() {
            addCriterion("upwd is null");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNotNull() {
            addCriterion("upwd is not null");
            return (Criteria) this;
        }

        public Criteria andUpwdEqualTo(String value) {
            addCriterion("upwd =", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotEqualTo(String value) {
            addCriterion("upwd <>", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThan(String value) {
            addCriterion("upwd >", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThanOrEqualTo(String value) {
            addCriterion("upwd >=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThan(String value) {
            addCriterion("upwd <", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThanOrEqualTo(String value) {
            addCriterion("upwd <=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLike(String value) {
            addCriterion("upwd like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotLike(String value) {
            addCriterion("upwd not like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdIn(List<String> values) {
            addCriterion("upwd in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotIn(List<String> values) {
            addCriterion("upwd not in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdBetween(String value1, String value2) {
            addCriterion("upwd between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotBetween(String value1, String value2) {
            addCriterion("upwd not between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUsexIsNull() {
            addCriterion("usex is null");
            return (Criteria) this;
        }

        public Criteria andUsexIsNotNull() {
            addCriterion("usex is not null");
            return (Criteria) this;
        }

        public Criteria andUsexEqualTo(String value) {
            addCriterion("usex =", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotEqualTo(String value) {
            addCriterion("usex <>", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThan(String value) {
            addCriterion("usex >", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThanOrEqualTo(String value) {
            addCriterion("usex >=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThan(String value) {
            addCriterion("usex <", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThanOrEqualTo(String value) {
            addCriterion("usex <=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLike(String value) {
            addCriterion("usex like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotLike(String value) {
            addCriterion("usex not like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexIn(List<String> values) {
            addCriterion("usex in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotIn(List<String> values) {
            addCriterion("usex not in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexBetween(String value1, String value2) {
            addCriterion("usex between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotBetween(String value1, String value2) {
            addCriterion("usex not between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUry1IsNull() {
            addCriterion("ury1 is null");
            return (Criteria) this;
        }

        public Criteria andUry1IsNotNull() {
            addCriterion("ury1 is not null");
            return (Criteria) this;
        }

        public Criteria andUry1EqualTo(String value) {
            addCriterion("ury1 =", value, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1NotEqualTo(String value) {
            addCriterion("ury1 <>", value, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1GreaterThan(String value) {
            addCriterion("ury1 >", value, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1GreaterThanOrEqualTo(String value) {
            addCriterion("ury1 >=", value, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1LessThan(String value) {
            addCriterion("ury1 <", value, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1LessThanOrEqualTo(String value) {
            addCriterion("ury1 <=", value, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1Like(String value) {
            addCriterion("ury1 like", value, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1NotLike(String value) {
            addCriterion("ury1 not like", value, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1In(List<String> values) {
            addCriterion("ury1 in", values, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1NotIn(List<String> values) {
            addCriterion("ury1 not in", values, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1Between(String value1, String value2) {
            addCriterion("ury1 between", value1, value2, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry1NotBetween(String value1, String value2) {
            addCriterion("ury1 not between", value1, value2, "ury1");
            return (Criteria) this;
        }

        public Criteria andUry2IsNull() {
            addCriterion("ury2 is null");
            return (Criteria) this;
        }

        public Criteria andUry2IsNotNull() {
            addCriterion("ury2 is not null");
            return (Criteria) this;
        }

        public Criteria andUry2EqualTo(String value) {
            addCriterion("ury2 =", value, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2NotEqualTo(String value) {
            addCriterion("ury2 <>", value, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2GreaterThan(String value) {
            addCriterion("ury2 >", value, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2GreaterThanOrEqualTo(String value) {
            addCriterion("ury2 >=", value, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2LessThan(String value) {
            addCriterion("ury2 <", value, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2LessThanOrEqualTo(String value) {
            addCriterion("ury2 <=", value, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2Like(String value) {
            addCriterion("ury2 like", value, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2NotLike(String value) {
            addCriterion("ury2 not like", value, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2In(List<String> values) {
            addCriterion("ury2 in", values, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2NotIn(List<String> values) {
            addCriterion("ury2 not in", values, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2Between(String value1, String value2) {
            addCriterion("ury2 between", value1, value2, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry2NotBetween(String value1, String value2) {
            addCriterion("ury2 not between", value1, value2, "ury2");
            return (Criteria) this;
        }

        public Criteria andUry3IsNull() {
            addCriterion("ury3 is null");
            return (Criteria) this;
        }

        public Criteria andUry3IsNotNull() {
            addCriterion("ury3 is not null");
            return (Criteria) this;
        }

        public Criteria andUry3EqualTo(String value) {
            addCriterion("ury3 =", value, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3NotEqualTo(String value) {
            addCriterion("ury3 <>", value, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3GreaterThan(String value) {
            addCriterion("ury3 >", value, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3GreaterThanOrEqualTo(String value) {
            addCriterion("ury3 >=", value, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3LessThan(String value) {
            addCriterion("ury3 <", value, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3LessThanOrEqualTo(String value) {
            addCriterion("ury3 <=", value, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3Like(String value) {
            addCriterion("ury3 like", value, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3NotLike(String value) {
            addCriterion("ury3 not like", value, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3In(List<String> values) {
            addCriterion("ury3 in", values, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3NotIn(List<String> values) {
            addCriterion("ury3 not in", values, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3Between(String value1, String value2) {
            addCriterion("ury3 between", value1, value2, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry3NotBetween(String value1, String value2) {
            addCriterion("ury3 not between", value1, value2, "ury3");
            return (Criteria) this;
        }

        public Criteria andUry4IsNull() {
            addCriterion("ury4 is null");
            return (Criteria) this;
        }

        public Criteria andUry4IsNotNull() {
            addCriterion("ury4 is not null");
            return (Criteria) this;
        }

        public Criteria andUry4EqualTo(Integer value) {
            addCriterion("ury4 =", value, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry4NotEqualTo(Integer value) {
            addCriterion("ury4 <>", value, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry4GreaterThan(Integer value) {
            addCriterion("ury4 >", value, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ury4 >=", value, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry4LessThan(Integer value) {
            addCriterion("ury4 <", value, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry4LessThanOrEqualTo(Integer value) {
            addCriterion("ury4 <=", value, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry4In(List<Integer> values) {
            addCriterion("ury4 in", values, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry4NotIn(List<Integer> values) {
            addCriterion("ury4 not in", values, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry4Between(Integer value1, Integer value2) {
            addCriterion("ury4 between", value1, value2, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry4NotBetween(Integer value1, Integer value2) {
            addCriterion("ury4 not between", value1, value2, "ury4");
            return (Criteria) this;
        }

        public Criteria andUry5IsNull() {
            addCriterion("ury5 is null");
            return (Criteria) this;
        }

        public Criteria andUry5IsNotNull() {
            addCriterion("ury5 is not null");
            return (Criteria) this;
        }

        public Criteria andUry5EqualTo(Date value) {
            addCriterion("ury5 =", value, "ury5");
            return (Criteria) this;
        }

        public Criteria andUry5NotEqualTo(Date value) {
            addCriterion("ury5 <>", value, "ury5");
            return (Criteria) this;
        }

        public Criteria andUry5GreaterThan(Date value) {
            addCriterion("ury5 >", value, "ury5");
            return (Criteria) this;
        }

        public Criteria andUry5GreaterThanOrEqualTo(Date value) {
            addCriterion("ury5 >=", value, "ury5");
            return (Criteria) this;
        }

        public Criteria andUry5LessThan(Date value) {
            addCriterion("ury5 <", value, "ury5");
            return (Criteria) this;
        }

        public Criteria andUry5LessThanOrEqualTo(Date value) {
            addCriterion("ury5 <=", value, "ury5");
            return (Criteria) this;
        }

        public Criteria andUry5In(List<Date> values) {
            addCriterion("ury5 in", values, "ury5");
            return (Criteria) this;
        }

        public Criteria andUry5NotIn(List<Date> values) {
            addCriterion("ury5 not in", values, "ury5");
            return (Criteria) this;
        }

        public Criteria andUry5Between(Date value1, Date value2) {
            addCriterion("ury5 between", value1, value2, "ury5");
            return (Criteria) this;
        }

        public Criteria andUry5NotBetween(Date value1, Date value2) {
            addCriterion("ury5 not between", value1, value2, "ury5");
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