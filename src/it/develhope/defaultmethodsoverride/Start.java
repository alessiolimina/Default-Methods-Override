package it.develhope.defaultmethodsoverride;

public class Start {
    public static void main(String[] args) {
    System.out.println("------------Creating smartphones---------------------");

    SmartphonePrice producerPrice1 = new SmartphonePrice("€", 159.99);
    SmartphonePrice retailPrice1 = new SmartphonePrice("€", 299.99);
    Smartphone smartphone1 = new Smartphone("Apple", "Iphone", 2500, producerPrice1, retailPrice1);
    System.out.println("First one: " + smartphone1);

    System.out.println("------------------------------------------------------");

    SmartphonePrice producerPrice2 = new SmartphonePrice("€", 59.99);
    SmartphonePrice retailPrice2 = new SmartphonePrice("€", 129.99);
    Smartphone smartphone2 = new Smartphone("Samsung", "A31", 3200, producerPrice2, retailPrice2);
    System.out.println("Second one: "+ smartphone2);

    System.out.println("------------------------------------------------------");

    System.out.println("The first smartphone is equal to the second one? " + smartphone1.equals(smartphone2));

    System.out.println("------------------------------------------------------");

    try {Smartphone clonedsmartphone2 = smartphone2.clone();
    System.out.println("Cloned one: " + clonedsmartphone2);
    System.out.println("The cloned smartphone is equal to the original one? " + smartphone2.equals(clonedsmartphone2));
    }catch (Exception exception){
    exception.printStackTrace();
    System.out.println("Error");
    }

    System.out.println("---------------------------------------------------------");}
}

