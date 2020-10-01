package com.novikov.homeworks.homework5;

import java.util.Date;
import java.util.Objects;

public class Order {
    private String item;
    private Date deliveryDate;
    private String size;
    private double price;

    public Order(String item, Date deliveryDate, String size, double price) {
        this.item = item;
        this.deliveryDate = deliveryDate;
        this.size = size;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 &&
                Objects.equals(item, order.item) &&
                Objects.equals(deliveryDate, order.deliveryDate) &&
                Objects.equals(size, order.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, deliveryDate, size, price);
    }

}
