package com.groupsix.freightlogisticssystem.pojo;

import java.io.Serializable;
import java.util.Date;

public class ReleaseInfo implements Serializable {
    private Integer relId;

    private Integer relType;

    private Date relTime;

    private String departureAddress;

    private String arrivedAddress;

    private Integer cargoWeight;

    private String cargoName;

    private String vehicleType;

    private Double price;

    private String deliveryPhone;

    private String pickupPhone;

    private static final long serialVersionUID = 1L;

    public Integer getRelId() {
        return relId;
    }

    public void setRelId(Integer relId) {
        this.relId = relId;
    }

    public Integer getRelType() {
        return relType;
    }

    public void setRelType(Integer relType) {
        this.relType = relType;
    }

    public Date getRelTime() {
        return relTime;
    }

    public void setRelTime(Date relTime) {
        this.relTime = relTime;
    }

    public String getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress == null ? null : departureAddress.trim();
    }

    public String getArrivedAddress() {
        return arrivedAddress;
    }

    public void setArrivedAddress(String arrivedAddress) {
        this.arrivedAddress = arrivedAddress == null ? null : arrivedAddress.trim();
    }

    public Integer getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Integer cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName == null ? null : cargoName.trim();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType == null ? null : vehicleType.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone == null ? null : deliveryPhone.trim();
    }

    public String getPickupPhone() {
        return pickupPhone;
    }

    public void setPickupPhone(String pickupPhone) {
        this.pickupPhone = pickupPhone == null ? null : pickupPhone.trim();
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
        ReleaseInfo other = (ReleaseInfo) that;
        return (this.getRelId() == null ? other.getRelId() == null : this.getRelId().equals(other.getRelId()))
            && (this.getRelType() == null ? other.getRelType() == null : this.getRelType().equals(other.getRelType()))
            && (this.getRelTime() == null ? other.getRelTime() == null : this.getRelTime().equals(other.getRelTime()))
            && (this.getDepartureAddress() == null ? other.getDepartureAddress() == null : this.getDepartureAddress().equals(other.getDepartureAddress()))
            && (this.getArrivedAddress() == null ? other.getArrivedAddress() == null : this.getArrivedAddress().equals(other.getArrivedAddress()))
            && (this.getCargoWeight() == null ? other.getCargoWeight() == null : this.getCargoWeight().equals(other.getCargoWeight()))
            && (this.getCargoName() == null ? other.getCargoName() == null : this.getCargoName().equals(other.getCargoName()))
            && (this.getVehicleType() == null ? other.getVehicleType() == null : this.getVehicleType().equals(other.getVehicleType()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getDeliveryPhone() == null ? other.getDeliveryPhone() == null : this.getDeliveryPhone().equals(other.getDeliveryPhone()))
            && (this.getPickupPhone() == null ? other.getPickupPhone() == null : this.getPickupPhone().equals(other.getPickupPhone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRelId() == null) ? 0 : getRelId().hashCode());
        result = prime * result + ((getRelType() == null) ? 0 : getRelType().hashCode());
        result = prime * result + ((getRelTime() == null) ? 0 : getRelTime().hashCode());
        result = prime * result + ((getDepartureAddress() == null) ? 0 : getDepartureAddress().hashCode());
        result = prime * result + ((getArrivedAddress() == null) ? 0 : getArrivedAddress().hashCode());
        result = prime * result + ((getCargoWeight() == null) ? 0 : getCargoWeight().hashCode());
        result = prime * result + ((getCargoName() == null) ? 0 : getCargoName().hashCode());
        result = prime * result + ((getVehicleType() == null) ? 0 : getVehicleType().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDeliveryPhone() == null) ? 0 : getDeliveryPhone().hashCode());
        result = prime * result + ((getPickupPhone() == null) ? 0 : getPickupPhone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relId=").append(relId);
        sb.append(", relType=").append(relType);
        sb.append(", relTime=").append(relTime);
        sb.append(", departureAddress=").append(departureAddress);
        sb.append(", arrivedAddress=").append(arrivedAddress);
        sb.append(", cargoWeight=").append(cargoWeight);
        sb.append(", cargoName=").append(cargoName);
        sb.append(", vehicleType=").append(vehicleType);
        sb.append(", price=").append(price);
        sb.append(", deliveryPhone=").append(deliveryPhone);
        sb.append(", pickupPhone=").append(pickupPhone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}