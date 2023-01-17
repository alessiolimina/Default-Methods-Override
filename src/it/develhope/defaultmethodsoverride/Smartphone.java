package it.develhope.defaultmethodsoverride;

import java.util.Objects;

public class Smartphone implements Cloneable{
    public String brandName;
    public String modelName;
    public int batterymAh;
    public SmartphonePrice producerPrice;
    public SmartphonePrice retailPrice;

    @Override
    public String toString() {
        return "Smartphone, brand name " + brandName + ", model name " + modelName + ", battery " + batterymAh + " mAh, producer price " + producerPrice + " and retail price " + retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return Objects.equals(this.brandName, smartphone.brandName) && Objects.equals(this.modelName, smartphone.modelName) && Objects.equals(this.batterymAh, smartphone.batterymAh) && Objects.equals(this.producerPrice, smartphone.producerPrice) && Objects.equals(this.retailPrice, smartphone.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
       Smartphone clonedSmartphone = (Smartphone)super.clone();
       this.retailPrice = clonedSmartphone.retailPrice;
       this.producerPrice = clonedSmartphone.producerPrice;
       return clonedSmartphone;
    }

    public Smartphone (String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice =retailP;

    }
}
