package com.groupsix.freightlogisticssystem.pojo;

import java.io.Serializable;

public class Cart implements Serializable {
    private Integer cartId;

    private String cartName;

    private Integer cartType;

    private Float cartLength;

    private Float cartPrice;

    private String cartDescript;

    private String cartPictureAddress;

    private static final long serialVersionUID = 1L;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName == null ? null : cartName.trim();
    }

    public Integer getCartType() {
        return cartType;
    }

    public void setCartType(Integer cartType) {
        this.cartType = cartType;
    }

    public Float getCartLength() {
        return cartLength;
    }

    public void setCartLength(Float cartLength) {
        this.cartLength = cartLength;
    }

    public Float getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(Float cartPrice) {
        this.cartPrice = cartPrice;
    }

    public String getCartDescript() {
        return cartDescript;
    }

    public void setCartDescript(String cartDescript) {
        this.cartDescript = cartDescript == null ? null : cartDescript.trim();
    }

    public String getCartPictureAddress() {
        return cartPictureAddress;
    }

    public void setCartPictureAddress(String cartPictureAddress) {
        this.cartPictureAddress = cartPictureAddress == null ? null : cartPictureAddress.trim();
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
        Cart other = (Cart) that;
        return (this.getCartId() == null ? other.getCartId() == null : this.getCartId().equals(other.getCartId()))
            && (this.getCartName() == null ? other.getCartName() == null : this.getCartName().equals(other.getCartName()))
            && (this.getCartType() == null ? other.getCartType() == null : this.getCartType().equals(other.getCartType()))
            && (this.getCartLength() == null ? other.getCartLength() == null : this.getCartLength().equals(other.getCartLength()))
            && (this.getCartPrice() == null ? other.getCartPrice() == null : this.getCartPrice().equals(other.getCartPrice()))
            && (this.getCartDescript() == null ? other.getCartDescript() == null : this.getCartDescript().equals(other.getCartDescript()))
            && (this.getCartPictureAddress() == null ? other.getCartPictureAddress() == null : this.getCartPictureAddress().equals(other.getCartPictureAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCartId() == null) ? 0 : getCartId().hashCode());
        result = prime * result + ((getCartName() == null) ? 0 : getCartName().hashCode());
        result = prime * result + ((getCartType() == null) ? 0 : getCartType().hashCode());
        result = prime * result + ((getCartLength() == null) ? 0 : getCartLength().hashCode());
        result = prime * result + ((getCartPrice() == null) ? 0 : getCartPrice().hashCode());
        result = prime * result + ((getCartDescript() == null) ? 0 : getCartDescript().hashCode());
        result = prime * result + ((getCartPictureAddress() == null) ? 0 : getCartPictureAddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartId=").append(cartId);
        sb.append(", cartName=").append(cartName);
        sb.append(", cartType=").append(cartType);
        sb.append(", cartLength=").append(cartLength);
        sb.append(", cartPrice=").append(cartPrice);
        sb.append(", cartDescript=").append(cartDescript);
        sb.append(", cartPictureAddress=").append(cartPictureAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}