package com.stackroute.workspaceService.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


@Document
@Data
@Component
public class MyCategory {

    @Id
    int categoryId;
    String categoryName;
    BigDecimal price;
    String[] additionalAmenities;


    double hourlyPrice;
    double dailyPrice;
    double monthlyPrice;
    int capacity;

    private MySpace mySpace;
    private MyAddress myaddress;
    private MyDimension myDimension;
    private MyLocation mylocation;



    public MyCategory() {
    }

    public MyCategory(int categoryId, String categoryName, BigDecimal price,double hourlyPrice,double dailyPrice,double monthlyPrice,int capacity, String[] additionalAmenities, MySpace mySpace, MyAddress myaddress, MyDimension myDimension, MyLocation mylocation) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.price = price;
        this.additionalAmenities = additionalAmenities;

        this.hourlyPrice=hourlyPrice;
        this.dailyPrice=dailyPrice;
        this.monthlyPrice=monthlyPrice;
        this.capacity=capacity;

        this.mySpace = mySpace;
        this.myaddress = myaddress;
        this.myDimension = myDimension;
        this.mylocation = mylocation;
    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String[] getAdditionalAmenities() {
        return additionalAmenities;
    }

    public void setAdditionalAmenities(String[] additionalAmenities) {
        this.additionalAmenities = additionalAmenities;
    }


    public MySpace getMySpace() {
        return mySpace;
    }

    public void setMySpace(MySpace mySpace) {
        this.mySpace = mySpace;
    }

    public MyAddress getMyAddress() {
        return myaddress;
    }

    public void setMyAddress(MyAddress myaddress) {
        this.myaddress = myaddress;
    }

    public MyDimension getMyDimension() {
        return myDimension;
    }

    public void setMyDimension(MyDimension myDimension) {
        this.myDimension = myDimension;
    }

    public MyLocation getLocation() {
        return mylocation;
    }

    public void setLocation(MyLocation location) {
        this.mylocation = location;
    }

    public double getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(double hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "MyCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                ", additionalAmenities=" + Arrays.toString(additionalAmenities) +
                ",hourlyPrice=" + hourlyPrice +
                ",dailyPrice=" + dailyPrice +
                ",monthlyPrice=" + monthlyPrice +
                ",capacity=" + capacity+
                ", mySpace=" + mySpace +
                ", myaddress=" + myaddress +
                ", myDimension=" + myDimension +
                ", mylocation=" + mylocation +
                '}';
    }
}

