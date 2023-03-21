package com.api.parkingcontrol.dtos;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ParkingSpotDto {
    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7)
    private String licencePlateCar;
    @NotBlank
    private String brandCar;
    @NotBlank
    private String modelCar;
    @NotBlank
    private String colorlCar;
    @NotBlank
    private LocalDateTime registrationDate;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String block;

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
