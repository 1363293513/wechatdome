package com.example.wechatdemo.wechat.entity;

import java.util.ArrayList;
import java.util.List;

public class CommentforgoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentforgoodExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("commentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("commentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("commentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("commentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("commentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("commentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("commentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("commentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("commentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("commentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentId not between", value1, value2, "commentid");
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

        public Criteria andUserfaceIsNull() {
            addCriterion("userface is null");
            return (Criteria) this;
        }

        public Criteria andUserfaceIsNotNull() {
            addCriterion("userface is not null");
            return (Criteria) this;
        }

        public Criteria andUserfaceEqualTo(String value) {
            addCriterion("userface =", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceNotEqualTo(String value) {
            addCriterion("userface <>", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceGreaterThan(String value) {
            addCriterion("userface >", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceGreaterThanOrEqualTo(String value) {
            addCriterion("userface >=", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceLessThan(String value) {
            addCriterion("userface <", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceLessThanOrEqualTo(String value) {
            addCriterion("userface <=", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceLike(String value) {
            addCriterion("userface like", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceNotLike(String value) {
            addCriterion("userface not like", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceIn(List<String> values) {
            addCriterion("userface in", values, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceNotIn(List<String> values) {
            addCriterion("userface not in", values, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceBetween(String value1, String value2) {
            addCriterion("userface between", value1, value2, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceNotBetween(String value1, String value2) {
            addCriterion("userface not between", value1, value2, "userface");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSpecIsNull() {
            addCriterion("spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(String value) {
            addCriterion("spec =", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(String value) {
            addCriterion("spec <>", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(String value) {
            addCriterion("spec >", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("spec >=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(String value) {
            addCriterion("spec <", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("spec <=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLike(String value) {
            addCriterion("spec like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(String value) {
            addCriterion("spec not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<String> values) {
            addCriterion("spec in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<String> values) {
            addCriterion("spec not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(String value1, String value2) {
            addCriterion("spec between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("spec not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
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

        public Criteria andAddtwocontentIsNull() {
            addCriterion("addtwocontent is null");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentIsNotNull() {
            addCriterion("addtwocontent is not null");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentEqualTo(String value) {
            addCriterion("addtwocontent =", value, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentNotEqualTo(String value) {
            addCriterion("addtwocontent <>", value, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentGreaterThan(String value) {
            addCriterion("addtwocontent >", value, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentGreaterThanOrEqualTo(String value) {
            addCriterion("addtwocontent >=", value, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentLessThan(String value) {
            addCriterion("addtwocontent <", value, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentLessThanOrEqualTo(String value) {
            addCriterion("addtwocontent <=", value, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentLike(String value) {
            addCriterion("addtwocontent like", value, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentNotLike(String value) {
            addCriterion("addtwocontent not like", value, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentIn(List<String> values) {
            addCriterion("addtwocontent in", values, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentNotIn(List<String> values) {
            addCriterion("addtwocontent not in", values, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentBetween(String value1, String value2) {
            addCriterion("addtwocontent between", value1, value2, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwocontentNotBetween(String value1, String value2) {
            addCriterion("addtwocontent not between", value1, value2, "addtwocontent");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgIsNull() {
            addCriterion("addtwoimg is null");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgIsNotNull() {
            addCriterion("addtwoimg is not null");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgEqualTo(String value) {
            addCriterion("addtwoimg =", value, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgNotEqualTo(String value) {
            addCriterion("addtwoimg <>", value, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgGreaterThan(String value) {
            addCriterion("addtwoimg >", value, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgGreaterThanOrEqualTo(String value) {
            addCriterion("addtwoimg >=", value, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgLessThan(String value) {
            addCriterion("addtwoimg <", value, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgLessThanOrEqualTo(String value) {
            addCriterion("addtwoimg <=", value, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgLike(String value) {
            addCriterion("addtwoimg like", value, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgNotLike(String value) {
            addCriterion("addtwoimg not like", value, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgIn(List<String> values) {
            addCriterion("addtwoimg in", values, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgNotIn(List<String> values) {
            addCriterion("addtwoimg not in", values, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgBetween(String value1, String value2) {
            addCriterion("addtwoimg between", value1, value2, "addtwoimg");
            return (Criteria) this;
        }

        public Criteria andAddtwoimgNotBetween(String value1, String value2) {
            addCriterion("addtwoimg not between", value1, value2, "addtwoimg");
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