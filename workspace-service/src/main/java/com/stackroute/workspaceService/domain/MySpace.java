package com.stackroute.workspaceService.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Data
public class MySpace {
    @Id
    int spaceId;
    String spaceName;
    String spaceImageUrl;
    BigDecimal totalprice;
    double hourlyPrice;
    double dailyPrice;
    double monthlyPrice;
    int capacity;
    private MyLocation mylocation;

    public MySpace() {
    }

    public MySpace(int spaceId, String spaceName, String spaceImageUrl, BigDecimal totalprice,double hourlyPrice,double dailyPrice,double monthlyPrice,int capacity,MyLocation mylocation) {
        this.spaceId = spaceId;
        this.spaceName = spaceName;
        this.spaceImageUrl = spaceImageUrl;
        this.totalprice = totalprice;
        this.hourlyPrice=hourlyPrice;
        this.dailyPrice=dailyPrice;
        this.monthlyPrice=monthlyPrice;
        this.capacity=capacity;
        this.mylocation = mylocation;
    }


    @Override
    public String toString() {
        return "Space{" +
                "spaceId=" + spaceId +
                ", spaceName='" + spaceName + '\'' +
                ", spaceImageUrl='" + spaceImageUrl + '\'' +
                ", totalprice=" + totalprice +
                ",hourlyPrice=" + hourlyPrice +
                ",dailyPrice=" + dailyPrice +
                ",monthlyPrice=" + monthlyPrice +
                ",capacity=" + capacity+
                ", mylocation=" + mylocation +
                '}';
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

    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getSpaceImageUrl() {
        return spaceImageUrl;
    }

    public void setSpaceImageUrl(String spaceImageUrl) {
        this.spaceImageUrl = spaceImageUrl;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }


    public MyLocation getLocation() {
        return mylocation;
    }

    public void setLocation(MyLocation location) {
        this.mylocation = location;
    }

}

