package org.sample.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SampleTblExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SampleTblExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSampleIdIsNull() {
            addCriterion("sample_id is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("sample_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(Integer value) {
            addCriterion("sample_id =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(Integer value) {
            addCriterion("sample_id <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(Integer value) {
            addCriterion("sample_id >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sample_id >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(Integer value) {
            addCriterion("sample_id <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sample_id <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<Integer> values) {
            addCriterion("sample_id in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<Integer> values) {
            addCriterion("sample_id not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(Integer value1, Integer value2) {
            addCriterion("sample_id between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sample_id not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNull() {
            addCriterion("sample_name is null");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNotNull() {
            addCriterion("sample_name is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNameEqualTo(String value) {
            addCriterion("sample_name =", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotEqualTo(String value) {
            addCriterion("sample_name <>", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThan(String value) {
            addCriterion("sample_name >", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sample_name >=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThan(String value) {
            addCriterion("sample_name <", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThanOrEqualTo(String value) {
            addCriterion("sample_name <=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLike(String value) {
            addCriterion("sample_name like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotLike(String value) {
            addCriterion("sample_name not like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameIn(List<String> values) {
            addCriterion("sample_name in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotIn(List<String> values) {
            addCriterion("sample_name not in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameBetween(String value1, String value2) {
            addCriterion("sample_name between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotBetween(String value1, String value2) {
            addCriterion("sample_name not between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleDateIsNull() {
            addCriterion("sample_date is null");
            return (Criteria) this;
        }

        public Criteria andSampleDateIsNotNull() {
            addCriterion("sample_date is not null");
            return (Criteria) this;
        }

        public Criteria andSampleDateEqualTo(Date value) {
            addCriterionForJDBCDate("sample_date =", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sample_date <>", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sample_date >", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sample_date >=", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateLessThan(Date value) {
            addCriterionForJDBCDate("sample_date <", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sample_date <=", value, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateIn(List<Date> values) {
            addCriterionForJDBCDate("sample_date in", values, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sample_date not in", values, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sample_date between", value1, value2, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sample_date not between", value1, value2, "sampleDate");
            return (Criteria) this;
        }

        public Criteria andSampleNumIsNull() {
            addCriterion("sample_num is null");
            return (Criteria) this;
        }

        public Criteria andSampleNumIsNotNull() {
            addCriterion("sample_num is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNumEqualTo(Integer value) {
            addCriterion("sample_num =", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotEqualTo(Integer value) {
            addCriterion("sample_num <>", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumGreaterThan(Integer value) {
            addCriterion("sample_num >", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sample_num >=", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumLessThan(Integer value) {
            addCriterion("sample_num <", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumLessThanOrEqualTo(Integer value) {
            addCriterion("sample_num <=", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumIn(List<Integer> values) {
            addCriterion("sample_num in", values, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotIn(List<Integer> values) {
            addCriterion("sample_num not in", values, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumBetween(Integer value1, Integer value2) {
            addCriterion("sample_num between", value1, value2, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sample_num not between", value1, value2, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleDivIsNull() {
            addCriterion("sample_div is null");
            return (Criteria) this;
        }

        public Criteria andSampleDivIsNotNull() {
            addCriterion("sample_div is not null");
            return (Criteria) this;
        }

        public Criteria andSampleDivEqualTo(String value) {
            addCriterion("sample_div =", value, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivNotEqualTo(String value) {
            addCriterion("sample_div <>", value, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivGreaterThan(String value) {
            addCriterion("sample_div >", value, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivGreaterThanOrEqualTo(String value) {
            addCriterion("sample_div >=", value, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivLessThan(String value) {
            addCriterion("sample_div <", value, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivLessThanOrEqualTo(String value) {
            addCriterion("sample_div <=", value, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivLike(String value) {
            addCriterion("sample_div like", value, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivNotLike(String value) {
            addCriterion("sample_div not like", value, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivIn(List<String> values) {
            addCriterion("sample_div in", values, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivNotIn(List<String> values) {
            addCriterion("sample_div not in", values, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivBetween(String value1, String value2) {
            addCriterion("sample_div between", value1, value2, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andSampleDivNotBetween(String value1, String value2) {
            addCriterion("sample_div not between", value1, value2, "sampleDiv");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Boolean value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Boolean value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Boolean value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Boolean> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(Integer value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Integer value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Integer value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Integer value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Integer value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<Integer> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<Integer> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(Integer value1, Integer value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeIsNull() {
            addCriterion("register_datetime is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeIsNotNull() {
            addCriterion("register_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeEqualTo(Date value) {
            addCriterion("register_datetime =", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeNotEqualTo(Date value) {
            addCriterion("register_datetime <>", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeGreaterThan(Date value) {
            addCriterion("register_datetime >", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_datetime >=", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeLessThan(Date value) {
            addCriterion("register_datetime <", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("register_datetime <=", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeIn(List<Date> values) {
            addCriterion("register_datetime in", values, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeNotIn(List<Date> values) {
            addCriterion("register_datetime not in", values, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeBetween(Date value1, Date value2) {
            addCriterion("register_datetime between", value1, value2, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("register_datetime not between", value1, value2, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("update_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("update_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("update_datetime =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("update_datetime <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("update_datetime >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_datetime >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("update_datetime <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("update_datetime <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("update_datetime in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("update_datetime not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("update_datetime between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("update_datetime not between", value1, value2, "updateDatetime");
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