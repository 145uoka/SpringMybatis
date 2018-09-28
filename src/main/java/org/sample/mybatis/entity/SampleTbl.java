package org.sample.mybatis.entity;

import java.util.Date;

public class SampleTbl {
    private Integer sampleId;

    private String sampleName;

    private Date sampleDate;

    private Integer sampleNum;

    private String sampleDiv;

    private Boolean deleteFlag;

    private Integer versionNo;

    private Date registerDatetime;

    private Date updateDatetime;

    public Integer getSampleId() {
        return sampleId;
    }

    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public Date getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(Date sampleDate) {
        this.sampleDate = sampleDate;
    }

    public Integer getSampleNum() {
        return sampleNum;
    }

    public void setSampleNum(Integer sampleNum) {
        this.sampleNum = sampleNum;
    }

    public String getSampleDiv() {
        return sampleDiv;
    }

    public void setSampleDiv(String sampleDiv) {
        this.sampleDiv = sampleDiv;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    public Date getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(Date registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sampleId=").append(sampleId);
        sb.append(", sampleName=").append(sampleName);
        sb.append(", sampleDate=").append(sampleDate);
        sb.append(", sampleNum=").append(sampleNum);
        sb.append(", sampleDiv=").append(sampleDiv);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", versionNo=").append(versionNo);
        sb.append(", registerDatetime=").append(registerDatetime);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append("]");
        return sb.toString();
    }
}