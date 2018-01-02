package com.groupsix.freightlogisticssystem.pojo;

import java.io.Serializable;
import java.util.Date;

public class Cargo implements Serializable {
    private Integer cId;

    private String cName;

    private Integer cWeight;

    private String cDescript;

    private Date cReleaseTime;

    private String cOwner;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getcWeight() {
        return cWeight;
    }

    public void setcWeight(Integer cWeight) {
        this.cWeight = cWeight;
    }

    public String getcDescript() {
        return cDescript;
    }

    public void setcDescript(String cDescript) {
        this.cDescript = cDescript == null ? null : cDescript.trim();
    }

    public Date getcReleaseTime() {
        return cReleaseTime;
    }

    public void setcReleaseTime(Date cReleaseTime) {
        this.cReleaseTime = cReleaseTime;
    }

    public String getcOwner() {
        return cOwner;
    }

    public void setcOwner(String cOwner) {
        this.cOwner = cOwner == null ? null : cOwner.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Cargo other = (Cargo) that;
        return (this.getcId() == null ? other.getcId() == null : this.getcId().equals(other.getcId()))
            && (this.getcName() == null ? other.getcName() == null : this.getcName().equals(other.getcName()))
            && (this.getcWeight() == null ? other.getcWeight() == null : this.getcWeight().equals(other.getcWeight()))
            && (this.getcDescript() == null ? other.getcDescript() == null : this.getcDescript().equals(other.getcDescript()))
            && (this.getcReleaseTime() == null ? other.getcReleaseTime() == null : this.getcReleaseTime().equals(other.getcReleaseTime()))
            && (this.getcOwner() == null ? other.getcOwner() == null : this.getcOwner().equals(other.getcOwner()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getcId() == null) ? 0 : getcId().hashCode());
        result = prime * result + ((getcName() == null) ? 0 : getcName().hashCode());
        result = prime * result + ((getcWeight() == null) ? 0 : getcWeight().hashCode());
        result = prime * result + ((getcDescript() == null) ? 0 : getcDescript().hashCode());
        result = prime * result + ((getcReleaseTime() == null) ? 0 : getcReleaseTime().hashCode());
        result = prime * result + ((getcOwner() == null) ? 0 : getcOwner().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cName=").append(cName);
        sb.append(", cWeight=").append(cWeight);
        sb.append(", cDescript=").append(cDescript);
        sb.append(", cReleaseTime=").append(cReleaseTime);
        sb.append(", cOwner=").append(cOwner);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}