package com.api.parkingcontrol.models;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true, length = 7)
    private String licencePlateCar;

    @Column(nullable = false, length = 70)
    private String brandCar;

    @Column(nullable = false, length = 70)
    private String modelCar;

    @Column(nullable = false, length = 70)
    private String colorlCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false, length = 130)
    private String responsibleName;

    @Column(nullable = false, length = (13))
    private String apartment;

    @Column(nullable = false, length = (13))
    private String block;


    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return this.parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicencePlateCar() {
        return this.licencePlateCar;
    }

    public void setLicencePlateCar(String licencePlateCar) {
        this.licencePlateCar = licencePlateCar;
    }

    public String getBrandCar() {
        return this.brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return this.modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorlCar() {
        return this.colorlCar;
    }

    public void setColorlCar(String colorlCar) {
        this.colorlCar = colorlCar;
    }

    public LocalDateTime getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return this.responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return this.apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return this.block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

}
