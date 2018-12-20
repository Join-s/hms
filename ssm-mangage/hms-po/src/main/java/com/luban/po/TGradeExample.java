package com.luban.po;

import java.util.ArrayList;
import java.util.List;

public class TGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGradeExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andMagidIsNull() {
            addCriterion("magid is null");
            return (Criteria) this;
        }

        public Criteria andMagidIsNotNull() {
            addCriterion("magid is not null");
            return (Criteria) this;
        }

        public Criteria andMagidEqualTo(Integer value) {
            addCriterion("magid =", value, "magid");
            return (Criteria) this;
        }

        public Criteria andMagidNotEqualTo(Integer value) {
            addCriterion("magid <>", value, "magid");
            return (Criteria) this;
        }

        public Criteria andMagidGreaterThan(Integer value) {
            addCriterion("magid >", value, "magid");
            return (Criteria) this;
        }

        public Criteria andMagidGreaterThanOrEqualTo(Integer value) {
            addCriterion("magid >=", value, "magid");
            return (Criteria) this;
        }

        public Criteria andMagidLessThan(Integer value) {
            addCriterion("magid <", value, "magid");
            return (Criteria) this;
        }

        public Criteria andMagidLessThanOrEqualTo(Integer value) {
            addCriterion("magid <=", value, "magid");
            return (Criteria) this;
        }

        public Criteria andMagidIn(List<Integer> values) {
            addCriterion("magid in", values, "magid");
            return (Criteria) this;
        }

        public Criteria andMagidNotIn(List<Integer> values) {
            addCriterion("magid not in", values, "magid");
            return (Criteria) this;
        }

        public Criteria andMagidBetween(Integer value1, Integer value2) {
            addCriterion("magid between", value1, value2, "magid");
            return (Criteria) this;
        }

        public Criteria andMagidNotBetween(Integer value1, Integer value2) {
            addCriterion("magid not between", value1, value2, "magid");
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andTutorIsNull() {
            addCriterion("Tutor is null");
            return (Criteria) this;
        }

        public Criteria andTutorIsNotNull() {
            addCriterion("Tutor is not null");
            return (Criteria) this;
        }

        public Criteria andTutorEqualTo(String value) {
            addCriterion("Tutor =", value, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorNotEqualTo(String value) {
            addCriterion("Tutor <>", value, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorGreaterThan(String value) {
            addCriterion("Tutor >", value, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorGreaterThanOrEqualTo(String value) {
            addCriterion("Tutor >=", value, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorLessThan(String value) {
            addCriterion("Tutor <", value, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorLessThanOrEqualTo(String value) {
            addCriterion("Tutor <=", value, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorLike(String value) {
            addCriterion("Tutor like", value, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorNotLike(String value) {
            addCriterion("Tutor not like", value, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorIn(List<String> values) {
            addCriterion("Tutor in", values, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorNotIn(List<String> values) {
            addCriterion("Tutor not in", values, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorBetween(String value1, String value2) {
            addCriterion("Tutor between", value1, value2, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutorNotBetween(String value1, String value2) {
            addCriterion("Tutor not between", value1, value2, "tutor");
            return (Criteria) this;
        }

        public Criteria andTutortelIsNull() {
            addCriterion("Tutortel is null");
            return (Criteria) this;
        }

        public Criteria andTutortelIsNotNull() {
            addCriterion("Tutortel is not null");
            return (Criteria) this;
        }

        public Criteria andTutortelEqualTo(String value) {
            addCriterion("Tutortel =", value, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelNotEqualTo(String value) {
            addCriterion("Tutortel <>", value, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelGreaterThan(String value) {
            addCriterion("Tutortel >", value, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelGreaterThanOrEqualTo(String value) {
            addCriterion("Tutortel >=", value, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelLessThan(String value) {
            addCriterion("Tutortel <", value, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelLessThanOrEqualTo(String value) {
            addCriterion("Tutortel <=", value, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelLike(String value) {
            addCriterion("Tutortel like", value, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelNotLike(String value) {
            addCriterion("Tutortel not like", value, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelIn(List<String> values) {
            addCriterion("Tutortel in", values, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelNotIn(List<String> values) {
            addCriterion("Tutortel not in", values, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelBetween(String value1, String value2) {
            addCriterion("Tutortel between", value1, value2, "tutortel");
            return (Criteria) this;
        }

        public Criteria andTutortelNotBetween(String value1, String value2) {
            addCriterion("Tutortel not between", value1, value2, "tutortel");
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