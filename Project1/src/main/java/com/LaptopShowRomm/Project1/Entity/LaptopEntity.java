package com.LaptopShowRomm.Project1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class LaptopEntity {

    @Id
    private int laptopNumber;
    private String brand;
    private String model;
    private int price;
    private String processor;
    private int ramSize;
    private int romSize;
    private String display;
    private String colour;

}
