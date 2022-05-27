package com.example.wechatdemo.wechat.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDofficeIsNull() {
            addCriterion("doffice is null");
            return (Criteria) this;
        }

        public Criteria andDofficeIsNotNull() {
            addCriterion("doffice is not null");
            return (Criteria) this;
        }

        public Criteria andDofficeEqualTo(String value) {
            addCriterion("doffice =", value, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeNotEqualTo(String value) {
            addCriterion("doffice <>", value, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeGreaterThan(String value) {
            addCriterion("doffice >", value, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeGreaterThanOrEqualTo(String value) {
            addCriterion("doffice >=", value, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeLessThan(String value) {
            addCriterion("doffice <", value, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeLessThanOrEqualTo(String value) {
            addCriterion("doffice <=", value, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeLike(String value) {
            addCriterion("doffice like", value, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeNotLike(String value) {
            addCriterion("doffice not like", value, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeIn(List<String> values) {
            addCriterion("doffice in", values, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeNotIn(List<String> values) {
            addCriterion("doffice not in", values, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeBetween(String value1, String value2) {
            addCriterion("doffice between", value1, value2, "doffice");
            return (Criteria) this;
        }

        public Criteria andDofficeNotBetween(String value1, String value2) {
            addCriterion("doffice not between", value1, value2, "doffice");
            return (Criteria) this;
        }

        public Criteria andDrankIsNull() {
            addCriterion("drank is null");
            return (Criteria) this;
        }

        public Criteria andDrankIsNotNull() {
            addCriterion("drank is not null");
            return (Criteria) this;
        }

        public Criteria andDrankEqualTo(String value) {
            addCriterion("drank =", value, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankNotEqualTo(String value) {
            addCriterion("drank <>", value, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankGreaterThan(String value) {
            addCriterion("drank >", value, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankGreaterThanOrEqualTo(String value) {
            addCriterion("drank >=", value, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankLessThan(String value) {
            addCriterion("drank <", value, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankLessThanOrEqualTo(String value) {
            addCriterion("drank <=", value, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankLike(String value) {
            addCriterion("drank like", value, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankNotLike(String value) {
            addCriterion("drank not like", value, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankIn(List<String> values) {
            addCriterion("drank in", values, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankNotIn(List<String> values) {
            addCriterion("drank not in", values, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankBetween(String value1, String value2) {
            addCriterion("drank between", value1, value2, "drank");
            return (Criteria) this;
        }

        public Criteria andDrankNotBetween(String value1, String value2) {
            addCriterion("drank not between", value1, value2, "drank");
            return (Criteria) this;
        }

        public Criteria andDqualificationIsNull() {
            addCriterion("dqualification is null");
            return (Criteria) this;
        }

        public Criteria andDqualificationIsNotNull() {
            addCriterion("dqualification is not null");
            return (Criteria) this;
        }

        public Criteria andDqualificationEqualTo(String value) {
            addCriterion("dqualification =", value, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationNotEqualTo(String value) {
            addCriterion("dqualification <>", value, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationGreaterThan(String value) {
            addCriterion("dqualification >", value, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationGreaterThanOrEqualTo(String value) {
            addCriterion("dqualification >=", value, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationLessThan(String value) {
            addCriterion("dqualification <", value, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationLessThanOrEqualTo(String value) {
            addCriterion("dqualification <=", value, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationLike(String value) {
            addCriterion("dqualification like", value, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationNotLike(String value) {
            addCriterion("dqualification not like", value, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationIn(List<String> values) {
            addCriterion("dqualification in", values, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationNotIn(List<String> values) {
            addCriterion("dqualification not in", values, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationBetween(String value1, String value2) {
            addCriterion("dqualification between", value1, value2, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDqualificationNotBetween(String value1, String value2) {
            addCriterion("dqualification not between", value1, value2, "dqualification");
            return (Criteria) this;
        }

        public Criteria andDdescriptIsNull() {
            addCriterion("ddescript is null");
            return (Criteria) this;
        }

        public Criteria andDdescriptIsNotNull() {
            addCriterion("ddescript is not null");
            return (Criteria) this;
        }

        public Criteria andDdescriptEqualTo(String value) {
            addCriterion("ddescript =", value, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptNotEqualTo(String value) {
            addCriterion("ddescript <>", value, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptGreaterThan(String value) {
            addCriterion("ddescript >", value, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptGreaterThanOrEqualTo(String value) {
            addCriterion("ddescript >=", value, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptLessThan(String value) {
            addCriterion("ddescript <", value, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptLessThanOrEqualTo(String value) {
            addCriterion("ddescript <=", value, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptLike(String value) {
            addCriterion("ddescript like", value, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptNotLike(String value) {
            addCriterion("ddescript not like", value, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptIn(List<String> values) {
            addCriterion("ddescript in", values, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptNotIn(List<String> values) {
            addCriterion("ddescript not in", values, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptBetween(String value1, String value2) {
            addCriterion("ddescript between", value1, value2, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDdescriptNotBetween(String value1, String value2) {
            addCriterion("ddescript not between", value1, value2, "ddescript");
            return (Criteria) this;
        }

        public Criteria andDeducationIsNull() {
            addCriterion("deducation is null");
            return (Criteria) this;
        }

        public Criteria andDeducationIsNotNull() {
            addCriterion("deducation is not null");
            return (Criteria) this;
        }

        public Criteria andDeducationEqualTo(String value) {
            addCriterion("deducation =", value, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationNotEqualTo(String value) {
            addCriterion("deducation <>", value, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationGreaterThan(String value) {
            addCriterion("deducation >", value, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationGreaterThanOrEqualTo(String value) {
            addCriterion("deducation >=", value, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationLessThan(String value) {
            addCriterion("deducation <", value, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationLessThanOrEqualTo(String value) {
            addCriterion("deducation <=", value, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationLike(String value) {
            addCriterion("deducation like", value, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationNotLike(String value) {
            addCriterion("deducation not like", value, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationIn(List<String> values) {
            addCriterion("deducation in", values, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationNotIn(List<String> values) {
            addCriterion("deducation not in", values, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationBetween(String value1, String value2) {
            addCriterion("deducation between", value1, value2, "deducation");
            return (Criteria) this;
        }

        public Criteria andDeducationNotBetween(String value1, String value2) {
            addCriterion("deducation not between", value1, value2, "deducation");
            return (Criteria) this;
        }

        public Criteria andDexperienceIsNull() {
            addCriterion("dexperience is null");
            return (Criteria) this;
        }

        public Criteria andDexperienceIsNotNull() {
            addCriterion("dexperience is not null");
            return (Criteria) this;
        }

        public Criteria andDexperienceEqualTo(String value) {
            addCriterion("dexperience =", value, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceNotEqualTo(String value) {
            addCriterion("dexperience <>", value, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceGreaterThan(String value) {
            addCriterion("dexperience >", value, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("dexperience >=", value, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceLessThan(String value) {
            addCriterion("dexperience <", value, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceLessThanOrEqualTo(String value) {
            addCriterion("dexperience <=", value, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceLike(String value) {
            addCriterion("dexperience like", value, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceNotLike(String value) {
            addCriterion("dexperience not like", value, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceIn(List<String> values) {
            addCriterion("dexperience in", values, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceNotIn(List<String> values) {
            addCriterion("dexperience not in", values, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceBetween(String value1, String value2) {
            addCriterion("dexperience between", value1, value2, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDexperienceNotBetween(String value1, String value2) {
            addCriterion("dexperience not between", value1, value2, "dexperience");
            return (Criteria) this;
        }

        public Criteria andDwardsIsNull() {
            addCriterion("dwards is null");
            return (Criteria) this;
        }

        public Criteria andDwardsIsNotNull() {
            addCriterion("dwards is not null");
            return (Criteria) this;
        }

        public Criteria andDwardsEqualTo(String value) {
            addCriterion("dwards =", value, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsNotEqualTo(String value) {
            addCriterion("dwards <>", value, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsGreaterThan(String value) {
            addCriterion("dwards >", value, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsGreaterThanOrEqualTo(String value) {
            addCriterion("dwards >=", value, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsLessThan(String value) {
            addCriterion("dwards <", value, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsLessThanOrEqualTo(String value) {
            addCriterion("dwards <=", value, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsLike(String value) {
            addCriterion("dwards like", value, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsNotLike(String value) {
            addCriterion("dwards not like", value, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsIn(List<String> values) {
            addCriterion("dwards in", values, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsNotIn(List<String> values) {
            addCriterion("dwards not in", values, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsBetween(String value1, String value2) {
            addCriterion("dwards between", value1, value2, "dwards");
            return (Criteria) this;
        }

        public Criteria andDwardsNotBetween(String value1, String value2) {
            addCriterion("dwards not between", value1, value2, "dwards");
            return (Criteria) this;
        }

        public Criteria andDgoodatIsNull() {
            addCriterion("dgoodat is null");
            return (Criteria) this;
        }

        public Criteria andDgoodatIsNotNull() {
            addCriterion("dgoodat is not null");
            return (Criteria) this;
        }

        public Criteria andDgoodatEqualTo(String value) {
            addCriterion("dgoodat =", value, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatNotEqualTo(String value) {
            addCriterion("dgoodat <>", value, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatGreaterThan(String value) {
            addCriterion("dgoodat >", value, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatGreaterThanOrEqualTo(String value) {
            addCriterion("dgoodat >=", value, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatLessThan(String value) {
            addCriterion("dgoodat <", value, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatLessThanOrEqualTo(String value) {
            addCriterion("dgoodat <=", value, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatLike(String value) {
            addCriterion("dgoodat like", value, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatNotLike(String value) {
            addCriterion("dgoodat not like", value, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatIn(List<String> values) {
            addCriterion("dgoodat in", values, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatNotIn(List<String> values) {
            addCriterion("dgoodat not in", values, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatBetween(String value1, String value2) {
            addCriterion("dgoodat between", value1, value2, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDgoodatNotBetween(String value1, String value2) {
            addCriterion("dgoodat not between", value1, value2, "dgoodat");
            return (Criteria) this;
        }

        public Criteria andDhospitalIsNull() {
            addCriterion("dhospital is null");
            return (Criteria) this;
        }

        public Criteria andDhospitalIsNotNull() {
            addCriterion("dhospital is not null");
            return (Criteria) this;
        }

        public Criteria andDhospitalEqualTo(String value) {
            addCriterion("dhospital =", value, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalNotEqualTo(String value) {
            addCriterion("dhospital <>", value, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalGreaterThan(String value) {
            addCriterion("dhospital >", value, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalGreaterThanOrEqualTo(String value) {
            addCriterion("dhospital >=", value, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalLessThan(String value) {
            addCriterion("dhospital <", value, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalLessThanOrEqualTo(String value) {
            addCriterion("dhospital <=", value, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalLike(String value) {
            addCriterion("dhospital like", value, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalNotLike(String value) {
            addCriterion("dhospital not like", value, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalIn(List<String> values) {
            addCriterion("dhospital in", values, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalNotIn(List<String> values) {
            addCriterion("dhospital not in", values, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalBetween(String value1, String value2) {
            addCriterion("dhospital between", value1, value2, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDhospitalNotBetween(String value1, String value2) {
            addCriterion("dhospital not between", value1, value2, "dhospital");
            return (Criteria) this;
        }

        public Criteria andDaddressIsNull() {
            addCriterion("daddress is null");
            return (Criteria) this;
        }

        public Criteria andDaddressIsNotNull() {
            addCriterion("daddress is not null");
            return (Criteria) this;
        }

        public Criteria andDaddressEqualTo(String value) {
            addCriterion("daddress =", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotEqualTo(String value) {
            addCriterion("daddress <>", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressGreaterThan(String value) {
            addCriterion("daddress >", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressGreaterThanOrEqualTo(String value) {
            addCriterion("daddress >=", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLessThan(String value) {
            addCriterion("daddress <", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLessThanOrEqualTo(String value) {
            addCriterion("daddress <=", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLike(String value) {
            addCriterion("daddress like", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotLike(String value) {
            addCriterion("daddress not like", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressIn(List<String> values) {
            addCriterion("daddress in", values, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotIn(List<String> values) {
            addCriterion("daddress not in", values, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressBetween(String value1, String value2) {
            addCriterion("daddress between", value1, value2, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotBetween(String value1, String value2) {
            addCriterion("daddress not between", value1, value2, "daddress");
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

        public Criteria andDry1IsNull() {
            addCriterion("dry1 is null");
            return (Criteria) this;
        }

        public Criteria andDry1IsNotNull() {
            addCriterion("dry1 is not null");
            return (Criteria) this;
        }

        public Criteria andDry1EqualTo(String value) {
            addCriterion("dry1 =", value, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1NotEqualTo(String value) {
            addCriterion("dry1 <>", value, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1GreaterThan(String value) {
            addCriterion("dry1 >", value, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1GreaterThanOrEqualTo(String value) {
            addCriterion("dry1 >=", value, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1LessThan(String value) {
            addCriterion("dry1 <", value, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1LessThanOrEqualTo(String value) {
            addCriterion("dry1 <=", value, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1Like(String value) {
            addCriterion("dry1 like", value, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1NotLike(String value) {
            addCriterion("dry1 not like", value, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1In(List<String> values) {
            addCriterion("dry1 in", values, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1NotIn(List<String> values) {
            addCriterion("dry1 not in", values, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1Between(String value1, String value2) {
            addCriterion("dry1 between", value1, value2, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry1NotBetween(String value1, String value2) {
            addCriterion("dry1 not between", value1, value2, "dry1");
            return (Criteria) this;
        }

        public Criteria andDry2IsNull() {
            addCriterion("dry2 is null");
            return (Criteria) this;
        }

        public Criteria andDry2IsNotNull() {
            addCriterion("dry2 is not null");
            return (Criteria) this;
        }

        public Criteria andDry2EqualTo(String value) {
            addCriterion("dry2 =", value, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2NotEqualTo(String value) {
            addCriterion("dry2 <>", value, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2GreaterThan(String value) {
            addCriterion("dry2 >", value, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2GreaterThanOrEqualTo(String value) {
            addCriterion("dry2 >=", value, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2LessThan(String value) {
            addCriterion("dry2 <", value, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2LessThanOrEqualTo(String value) {
            addCriterion("dry2 <=", value, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2Like(String value) {
            addCriterion("dry2 like", value, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2NotLike(String value) {
            addCriterion("dry2 not like", value, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2In(List<String> values) {
            addCriterion("dry2 in", values, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2NotIn(List<String> values) {
            addCriterion("dry2 not in", values, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2Between(String value1, String value2) {
            addCriterion("dry2 between", value1, value2, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry2NotBetween(String value1, String value2) {
            addCriterion("dry2 not between", value1, value2, "dry2");
            return (Criteria) this;
        }

        public Criteria andDry3IsNull() {
            addCriterion("dry3 is null");
            return (Criteria) this;
        }

        public Criteria andDry3IsNotNull() {
            addCriterion("dry3 is not null");
            return (Criteria) this;
        }

        public Criteria andDry3EqualTo(String value) {
            addCriterion("dry3 =", value, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3NotEqualTo(String value) {
            addCriterion("dry3 <>", value, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3GreaterThan(String value) {
            addCriterion("dry3 >", value, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3GreaterThanOrEqualTo(String value) {
            addCriterion("dry3 >=", value, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3LessThan(String value) {
            addCriterion("dry3 <", value, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3LessThanOrEqualTo(String value) {
            addCriterion("dry3 <=", value, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3Like(String value) {
            addCriterion("dry3 like", value, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3NotLike(String value) {
            addCriterion("dry3 not like", value, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3In(List<String> values) {
            addCriterion("dry3 in", values, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3NotIn(List<String> values) {
            addCriterion("dry3 not in", values, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3Between(String value1, String value2) {
            addCriterion("dry3 between", value1, value2, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry3NotBetween(String value1, String value2) {
            addCriterion("dry3 not between", value1, value2, "dry3");
            return (Criteria) this;
        }

        public Criteria andDry4IsNull() {
            addCriterion("dry4 is null");
            return (Criteria) this;
        }

        public Criteria andDry4IsNotNull() {
            addCriterion("dry4 is not null");
            return (Criteria) this;
        }

        public Criteria andDry4EqualTo(String value) {
            addCriterion("dry4 =", value, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4NotEqualTo(String value) {
            addCriterion("dry4 <>", value, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4GreaterThan(String value) {
            addCriterion("dry4 >", value, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4GreaterThanOrEqualTo(String value) {
            addCriterion("dry4 >=", value, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4LessThan(String value) {
            addCriterion("dry4 <", value, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4LessThanOrEqualTo(String value) {
            addCriterion("dry4 <=", value, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4Like(String value) {
            addCriterion("dry4 like", value, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4NotLike(String value) {
            addCriterion("dry4 not like", value, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4In(List<String> values) {
            addCriterion("dry4 in", values, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4NotIn(List<String> values) {
            addCriterion("dry4 not in", values, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4Between(String value1, String value2) {
            addCriterion("dry4 between", value1, value2, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry4NotBetween(String value1, String value2) {
            addCriterion("dry4 not between", value1, value2, "dry4");
            return (Criteria) this;
        }

        public Criteria andDry5IsNull() {
            addCriterion("dry5 is null");
            return (Criteria) this;
        }

        public Criteria andDry5IsNotNull() {
            addCriterion("dry5 is not null");
            return (Criteria) this;
        }

        public Criteria andDry5EqualTo(Date value) {
            addCriterion("dry5 =", value, "dry5");
            return (Criteria) this;
        }

        public Criteria andDry5NotEqualTo(Date value) {
            addCriterion("dry5 <>", value, "dry5");
            return (Criteria) this;
        }

        public Criteria andDry5GreaterThan(Date value) {
            addCriterion("dry5 >", value, "dry5");
            return (Criteria) this;
        }

        public Criteria andDry5GreaterThanOrEqualTo(Date value) {
            addCriterion("dry5 >=", value, "dry5");
            return (Criteria) this;
        }

        public Criteria andDry5LessThan(Date value) {
            addCriterion("dry5 <", value, "dry5");
            return (Criteria) this;
        }

        public Criteria andDry5LessThanOrEqualTo(Date value) {
            addCriterion("dry5 <=", value, "dry5");
            return (Criteria) this;
        }

        public Criteria andDry5In(List<Date> values) {
            addCriterion("dry5 in", values, "dry5");
            return (Criteria) this;
        }

        public Criteria andDry5NotIn(List<Date> values) {
            addCriterion("dry5 not in", values, "dry5");
            return (Criteria) this;
        }

        public Criteria andDry5Between(Date value1, Date value2) {
            addCriterion("dry5 between", value1, value2, "dry5");
            return (Criteria) this;
        }

        public Criteria andDry5NotBetween(Date value1, Date value2) {
            addCriterion("dry5 not between", value1, value2, "dry5");
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