package com.example.wechatdemo.wechat.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppointmentExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameIsNull() {
            addCriterion("ayuyuename is null");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameIsNotNull() {
            addCriterion("ayuyuename is not null");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameEqualTo(String value) {
            addCriterion("ayuyuename =", value, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameNotEqualTo(String value) {
            addCriterion("ayuyuename <>", value, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameGreaterThan(String value) {
            addCriterion("ayuyuename >", value, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameGreaterThanOrEqualTo(String value) {
            addCriterion("ayuyuename >=", value, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameLessThan(String value) {
            addCriterion("ayuyuename <", value, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameLessThanOrEqualTo(String value) {
            addCriterion("ayuyuename <=", value, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameLike(String value) {
            addCriterion("ayuyuename like", value, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameNotLike(String value) {
            addCriterion("ayuyuename not like", value, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameIn(List<String> values) {
            addCriterion("ayuyuename in", values, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameNotIn(List<String> values) {
            addCriterion("ayuyuename not in", values, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameBetween(String value1, String value2) {
            addCriterion("ayuyuename between", value1, value2, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAyuyuenameNotBetween(String value1, String value2) {
            addCriterion("ayuyuename not between", value1, value2, "ayuyuename");
            return (Criteria) this;
        }

        public Criteria andAemailIsNull() {
            addCriterion("aemail is null");
            return (Criteria) this;
        }

        public Criteria andAemailIsNotNull() {
            addCriterion("aemail is not null");
            return (Criteria) this;
        }

        public Criteria andAemailEqualTo(String value) {
            addCriterion("aemail =", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailNotEqualTo(String value) {
            addCriterion("aemail <>", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailGreaterThan(String value) {
            addCriterion("aemail >", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailGreaterThanOrEqualTo(String value) {
            addCriterion("aemail >=", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailLessThan(String value) {
            addCriterion("aemail <", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailLessThanOrEqualTo(String value) {
            addCriterion("aemail <=", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailLike(String value) {
            addCriterion("aemail like", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailNotLike(String value) {
            addCriterion("aemail not like", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailIn(List<String> values) {
            addCriterion("aemail in", values, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailNotIn(List<String> values) {
            addCriterion("aemail not in", values, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailBetween(String value1, String value2) {
            addCriterion("aemail between", value1, value2, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailNotBetween(String value1, String value2) {
            addCriterion("aemail not between", value1, value2, "aemail");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNull() {
            addCriterion("atime is null");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNotNull() {
            addCriterion("atime is not null");
            return (Criteria) this;
        }

        public Criteria andAtimeEqualTo(Date value) {
            addCriterion("atime =", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotEqualTo(Date value) {
            addCriterion("atime <>", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThan(Date value) {
            addCriterion("atime >", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("atime >=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThan(Date value) {
            addCriterion("atime <", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThanOrEqualTo(Date value) {
            addCriterion("atime <=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeIn(List<Date> values) {
            addCriterion("atime in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotIn(List<Date> values) {
            addCriterion("atime not in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeBetween(Date value1, Date value2) {
            addCriterion("atime between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotBetween(Date value1, Date value2) {
            addCriterion("atime not between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andAmonenyIsNull() {
            addCriterion("amoneny is null");
            return (Criteria) this;
        }

        public Criteria andAmonenyIsNotNull() {
            addCriterion("amoneny is not null");
            return (Criteria) this;
        }

        public Criteria andAmonenyEqualTo(String value) {
            addCriterion("amoneny =", value, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyNotEqualTo(String value) {
            addCriterion("amoneny <>", value, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyGreaterThan(String value) {
            addCriterion("amoneny >", value, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyGreaterThanOrEqualTo(String value) {
            addCriterion("amoneny >=", value, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyLessThan(String value) {
            addCriterion("amoneny <", value, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyLessThanOrEqualTo(String value) {
            addCriterion("amoneny <=", value, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyLike(String value) {
            addCriterion("amoneny like", value, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyNotLike(String value) {
            addCriterion("amoneny not like", value, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyIn(List<String> values) {
            addCriterion("amoneny in", values, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyNotIn(List<String> values) {
            addCriterion("amoneny not in", values, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyBetween(String value1, String value2) {
            addCriterion("amoneny between", value1, value2, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAmonenyNotBetween(String value1, String value2) {
            addCriterion("amoneny not between", value1, value2, "amoneny");
            return (Criteria) this;
        }

        public Criteria andAstateIsNull() {
            addCriterion("astate is null");
            return (Criteria) this;
        }

        public Criteria andAstateIsNotNull() {
            addCriterion("astate is not null");
            return (Criteria) this;
        }

        public Criteria andAstateEqualTo(String value) {
            addCriterion("astate =", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotEqualTo(String value) {
            addCriterion("astate <>", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateGreaterThan(String value) {
            addCriterion("astate >", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateGreaterThanOrEqualTo(String value) {
            addCriterion("astate >=", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateLessThan(String value) {
            addCriterion("astate <", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateLessThanOrEqualTo(String value) {
            addCriterion("astate <=", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateLike(String value) {
            addCriterion("astate like", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotLike(String value) {
            addCriterion("astate not like", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateIn(List<String> values) {
            addCriterion("astate in", values, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotIn(List<String> values) {
            addCriterion("astate not in", values, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateBetween(String value1, String value2) {
            addCriterion("astate between", value1, value2, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotBetween(String value1, String value2) {
            addCriterion("astate not between", value1, value2, "astate");
            return (Criteria) this;
        }

        public Criteria andAry1IsNull() {
            addCriterion("ary1 is null");
            return (Criteria) this;
        }

        public Criteria andAry1IsNotNull() {
            addCriterion("ary1 is not null");
            return (Criteria) this;
        }

        public Criteria andAry1EqualTo(String value) {
            addCriterion("ary1 =", value, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1NotEqualTo(String value) {
            addCriterion("ary1 <>", value, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1GreaterThan(String value) {
            addCriterion("ary1 >", value, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1GreaterThanOrEqualTo(String value) {
            addCriterion("ary1 >=", value, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1LessThan(String value) {
            addCriterion("ary1 <", value, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1LessThanOrEqualTo(String value) {
            addCriterion("ary1 <=", value, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1Like(String value) {
            addCriterion("ary1 like", value, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1NotLike(String value) {
            addCriterion("ary1 not like", value, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1In(List<String> values) {
            addCriterion("ary1 in", values, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1NotIn(List<String> values) {
            addCriterion("ary1 not in", values, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1Between(String value1, String value2) {
            addCriterion("ary1 between", value1, value2, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry1NotBetween(String value1, String value2) {
            addCriterion("ary1 not between", value1, value2, "ary1");
            return (Criteria) this;
        }

        public Criteria andAry2IsNull() {
            addCriterion("ary2 is null");
            return (Criteria) this;
        }

        public Criteria andAry2IsNotNull() {
            addCriterion("ary2 is not null");
            return (Criteria) this;
        }

        public Criteria andAry2EqualTo(String value) {
            addCriterion("ary2 =", value, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2NotEqualTo(String value) {
            addCriterion("ary2 <>", value, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2GreaterThan(String value) {
            addCriterion("ary2 >", value, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2GreaterThanOrEqualTo(String value) {
            addCriterion("ary2 >=", value, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2LessThan(String value) {
            addCriterion("ary2 <", value, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2LessThanOrEqualTo(String value) {
            addCriterion("ary2 <=", value, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2Like(String value) {
            addCriterion("ary2 like", value, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2NotLike(String value) {
            addCriterion("ary2 not like", value, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2In(List<String> values) {
            addCriterion("ary2 in", values, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2NotIn(List<String> values) {
            addCriterion("ary2 not in", values, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2Between(String value1, String value2) {
            addCriterion("ary2 between", value1, value2, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry2NotBetween(String value1, String value2) {
            addCriterion("ary2 not between", value1, value2, "ary2");
            return (Criteria) this;
        }

        public Criteria andAry3IsNull() {
            addCriterion("ary3 is null");
            return (Criteria) this;
        }

        public Criteria andAry3IsNotNull() {
            addCriterion("ary3 is not null");
            return (Criteria) this;
        }

        public Criteria andAry3EqualTo(String value) {
            addCriterion("ary3 =", value, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3NotEqualTo(String value) {
            addCriterion("ary3 <>", value, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3GreaterThan(String value) {
            addCriterion("ary3 >", value, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3GreaterThanOrEqualTo(String value) {
            addCriterion("ary3 >=", value, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3LessThan(String value) {
            addCriterion("ary3 <", value, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3LessThanOrEqualTo(String value) {
            addCriterion("ary3 <=", value, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3Like(String value) {
            addCriterion("ary3 like", value, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3NotLike(String value) {
            addCriterion("ary3 not like", value, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3In(List<String> values) {
            addCriterion("ary3 in", values, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3NotIn(List<String> values) {
            addCriterion("ary3 not in", values, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3Between(String value1, String value2) {
            addCriterion("ary3 between", value1, value2, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry3NotBetween(String value1, String value2) {
            addCriterion("ary3 not between", value1, value2, "ary3");
            return (Criteria) this;
        }

        public Criteria andAry4IsNull() {
            addCriterion("ary4 is null");
            return (Criteria) this;
        }

        public Criteria andAry4IsNotNull() {
            addCriterion("ary4 is not null");
            return (Criteria) this;
        }

        public Criteria andAry4EqualTo(Integer value) {
            addCriterion("ary4 =", value, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry4NotEqualTo(Integer value) {
            addCriterion("ary4 <>", value, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry4GreaterThan(Integer value) {
            addCriterion("ary4 >", value, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ary4 >=", value, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry4LessThan(Integer value) {
            addCriterion("ary4 <", value, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry4LessThanOrEqualTo(Integer value) {
            addCriterion("ary4 <=", value, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry4In(List<Integer> values) {
            addCriterion("ary4 in", values, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry4NotIn(List<Integer> values) {
            addCriterion("ary4 not in", values, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry4Between(Integer value1, Integer value2) {
            addCriterion("ary4 between", value1, value2, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry4NotBetween(Integer value1, Integer value2) {
            addCriterion("ary4 not between", value1, value2, "ary4");
            return (Criteria) this;
        }

        public Criteria andAry5IsNull() {
            addCriterion("ary5 is null");
            return (Criteria) this;
        }

        public Criteria andAry5IsNotNull() {
            addCriterion("ary5 is not null");
            return (Criteria) this;
        }

        public Criteria andAry5EqualTo(Date value) {
            addCriterion("ary5 =", value, "ary5");
            return (Criteria) this;
        }

        public Criteria andAry5NotEqualTo(Date value) {
            addCriterion("ary5 <>", value, "ary5");
            return (Criteria) this;
        }

        public Criteria andAry5GreaterThan(Date value) {
            addCriterion("ary5 >", value, "ary5");
            return (Criteria) this;
        }

        public Criteria andAry5GreaterThanOrEqualTo(Date value) {
            addCriterion("ary5 >=", value, "ary5");
            return (Criteria) this;
        }

        public Criteria andAry5LessThan(Date value) {
            addCriterion("ary5 <", value, "ary5");
            return (Criteria) this;
        }

        public Criteria andAry5LessThanOrEqualTo(Date value) {
            addCriterion("ary5 <=", value, "ary5");
            return (Criteria) this;
        }

        public Criteria andAry5In(List<Date> values) {
            addCriterion("ary5 in", values, "ary5");
            return (Criteria) this;
        }

        public Criteria andAry5NotIn(List<Date> values) {
            addCriterion("ary5 not in", values, "ary5");
            return (Criteria) this;
        }

        public Criteria andAry5Between(Date value1, Date value2) {
            addCriterion("ary5 between", value1, value2, "ary5");
            return (Criteria) this;
        }

        public Criteria andAry5NotBetween(Date value1, Date value2) {
            addCriterion("ary5 not between", value1, value2, "ary5");
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