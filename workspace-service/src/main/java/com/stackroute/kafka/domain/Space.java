package com.stackroute.kafka.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;


import java.math.BigDecimal;
import java.util.List;


@Data
public class Space {
    @Id
    int spaceId;
    String spaceName;
    String spaceImageUrl;
    BigDecimal totalprice;
    double hourlyPrice;
    double monthlyPrice;
    double dailyPrice;
    int capacity;
    private Location location;
    private Address address;
    private List<Category> category;
    private Amenities amenities;
    private User user;

    public Space() {
    }

    public Space(int spaceId, String spaceName, String spaceImageUrl, BigDecimal totalprice,double hourlyPrice, double monthlyPrice, double dailyPrice, int capacity,Location location, Address address, List<Category> category, Amenities amenities, User user) {
        this.spaceId = spaceId;
        this.spaceName = spaceName;
        this.spaceImageUrl = spaceImageUrl;
        this.totalprice = totalprice;

        this.hourlyPrice = hourlyPrice;
        this.monthlyPrice = monthlyPrice;
        this.dailyPrice = dailyPrice;
        this.capacity = capacity;
        this.location = location;
        this.address = address;
        this.category = category;
        this.amenities = amenities;
        this.user = user;
    }


    public int getSpaceId() {
        return spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public String getSpaceImageUrl() {
        return spaceImageUrl;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public double getHourlyPrice(){return hourlyPrice;}
    public double getDailyPrice(){return dailyPrice;}
    public double getMonthlyPrice(){return monthlyPrice;}
    public int getCapacity(){return capacity;}

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setAmenities(Amenities amenities) {
        this.amenities = amenities;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Location getLocation() {
        return location;
    }

    public Address getAddress() {
        return address;
    }

    public void setHourlyPrice(double hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Category> getCategory() {
        return category;
    }

    public Amenities getAmenities() {
        return amenities;
    }

    @Override
    public String toString() {
        return "Space{" +
                "location=" + location +
                ", address=" + address +
                ", category=" + category +
                ", amenities=" + amenities +
                ", user=" + user +
                ", spaceId=" + spaceId +
                ", spaceName='" + spaceName + '\'' +
                ", spaceImageUrl='" + spaceImageUrl + '\'' +
                ", totalprice=" + totalprice +
                ",hourlyPrice=" + hourlyPrice +
                ",dailyPrice=" + dailyPrice +
                ",monthlyPrice=" + monthlyPrice +
                ",capacity=" + capacity+
                '}';
    }
}
