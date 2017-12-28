package com.groupsix.freightlogisticssystem.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer orderId;

    private String orderPeople;

    private Integer orderCart;

    private String orderReachAddress;

    private String orderDepartureAddress;

    private Date orderReachTime;

    private Integer orderCommodity;

    private Integer orderCartNumber;

    private Date orderDepartureTime;

    private Integer orderState;

    private Float orderPrice;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderPeople() {
        return orderPeople;
    }

    public void setOrderPeople(String orderPeople) {
        this.orderPeople = orderPeople == null ? null : orderPeople.trim();
    }

    public Integer getOrderCart() {
        return orderCart;
    }

    public void setOrderCart(Integer orderCart) {
        this.orderCart = orderCart;
    }

    public String getOrderReachAddress() {
        return orderReachAddress;
    }

    public void setOrderReachAddress(String orderReachAddress) {
        this.orderReachAddress = orderReachAddress == null ? null : orderReachAddress.trim();
    }

    public String getOrderDepartureAddress() {
        return orderDepartureAddress;
    }

    public void setOrderDepartureAddress(String orderDepartureAddress) {
        this.orderDepartureAddress = orderDepartureAddress == null ? null : orderDepartureAddress.trim();
    }

    public Date getOrderReachTime() {
        return orderReachTime;
    }

    public void setOrderReachTime(Date orderReachTime) {
        this.orderReachTime = orderReachTime;
    }

    public Integer getOrderCommodity() {
        return orderCommodity;
    }

    public void setOrderCommodity(Integer orderCommodity) {
        this.orderCommodity = orderCommodity;
    }

    public Integer getOrderCartNumber() {
        return orderCartNumber;
    }

    public void setOrderCartNumber(Integer orderCartNumber) {
        this.orderCartNumber = orderCartNumber;
    }

    public Date getOrderDepartureTime() {
        return orderDepartureTime;
    }

    public void setOrderDepartureTime(Date orderDepartureTime) {
        this.orderDepartureTime = orderDepartureTime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
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
        Order other = (Order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderPeople() == null ? other.getOrderPeople() == null : this.getOrderPeople().equals(other.getOrderPeople()))
            && (this.getOrderCart() == null ? other.getOrderCart() == null : this.getOrderCart().equals(other.getOrderCart()))
            && (this.getOrderReachAddress() == null ? other.getOrderReachAddress() == null : this.getOrderReachAddress().equals(other.getOrderReachAddress()))
            && (this.getOrderDepartureAddress() == null ? other.getOrderDepartureAddress() == null : this.getOrderDepartureAddress().equals(other.getOrderDepartureAddress()))
            && (this.getOrderReachTime() == null ? other.getOrderReachTime() == null : this.getOrderReachTime().equals(other.getOrderReachTime()))
            && (this.getOrderCommodity() == null ? other.getOrderCommodity() == null : this.getOrderCommodity().equals(other.getOrderCommodity()))
            && (this.getOrderCartNumber() == null ? other.getOrderCartNumber() == null : this.getOrderCartNumber().equals(other.getOrderCartNumber()))
            && (this.getOrderDepartureTime() == null ? other.getOrderDepartureTime() == null : this.getOrderDepartureTime().equals(other.getOrderDepartureTime()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderPeople() == null) ? 0 : getOrderPeople().hashCode());
        result = prime * result + ((getOrderCart() == null) ? 0 : getOrderCart().hashCode());
        result = prime * result + ((getOrderReachAddress() == null) ? 0 : getOrderReachAddress().hashCode());
        result = prime * result + ((getOrderDepartureAddress() == null) ? 0 : getOrderDepartureAddress().hashCode());
        result = prime * result + ((getOrderReachTime() == null) ? 0 : getOrderReachTime().hashCode());
        result = prime * result + ((getOrderCommodity() == null) ? 0 : getOrderCommodity().hashCode());
        result = prime * result + ((getOrderCartNumber() == null) ? 0 : getOrderCartNumber().hashCode());
        result = prime * result + ((getOrderDepartureTime() == null) ? 0 : getOrderDepartureTime().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderPeople=").append(orderPeople);
        sb.append(", orderCart=").append(orderCart);
        sb.append(", orderReachAddress=").append(orderReachAddress);
        sb.append(", orderDepartureAddress=").append(orderDepartureAddress);
        sb.append(", orderReachTime=").append(orderReachTime);
        sb.append(", orderCommodity=").append(orderCommodity);
        sb.append(", orderCartNumber=").append(orderCartNumber);
        sb.append(", orderDepartureTime=").append(orderDepartureTime);
        sb.append(", orderState=").append(orderState);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}