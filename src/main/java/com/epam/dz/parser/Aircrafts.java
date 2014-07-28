package com.epam.dz.parser;

public class Aircrafts {
    private int id;
    private String model;
    private String individualNum;
    private String origin;

    @Override
    public String toString() {
        return "Aircrafts{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", individualNum='" + individualNum + '\'' +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                ", seats=" + seats +
                ", rockets=" + rockets +
                ", rocketsNum=" + rocketsNum +
                ", price=" + price +
                '}';
    }

    private String type;
    private int seats;
    private boolean rockets;
    private int rocketsNum;
    private double price;

 public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIndividualNum() {
        return individualNum;
    }

    public void setIndividualNum(String individualNum) {
        this.individualNum = individualNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isRockets() {
        return rockets;
    }

    public void setRockets(boolean rockets) {
        this.rockets = rockets;
    }

    public int getRocketsNum() {
        return rocketsNum;
    }

    public void setRocketsNum(int rocketsNum) {
        this.rocketsNum = rocketsNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
