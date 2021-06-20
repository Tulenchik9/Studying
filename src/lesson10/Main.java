package lesson10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(5.5, "Intel Core", 8, "Galaxy", "Samsung");
        Phone phone11 = new Phone(5.5, "Intel Core", 8, "Galaxy", "Samsung");
        Phone phone2 = new Phone(5, "Pentium", 2, "GalaxyA", "Apple");
        Phone phone3 = new Phone(5, "Atom Celeron", 4, "GalaxyM", "Nokia");
        Phone phone4 = new Phone(3.5, "Intel Core", 6, "GalaxyA2", "Samsung");
        Phone phone5 = new Phone(3.5, "Core I5", 4, "GalaxyM3", "Sony");
        Phone phone6 = new Phone(4.5, "Intel Core", 4, "GalaxyS", "Motorola");
        Phone phone7 = new Phone(4, "Intel Pentium", 8, "GalaxyS3", "Samsung");
        Phone phone8 = new Phone(5.5, "Intel Core", 16, "GalaxyS2", "Xiaomi");
        Phone phone9 = new Phone(4, "Intel Core", 2, "GalaxyS", "Samsung");
        Phone phone10 = new Phone(5.5, "Intel Core", 16, "GalaxyA4", "Samsung");

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);
        phones.add(phone6);
        phones.add(phone7);
        phones.add(phone8);
        phones.add(phone9);
        phones.add(phone10);

        PhoneUtils.printAllPhonesByProduction(phones, "Samsung");
        PhoneUtils.printTheBigestResolution(phones);

        System.out.println(phone1.equals(phone11));
        System.out.println(phone1.hashCode());
        System.out.println(phone11.hashCode());
        System.out.println(phone5.hashCode());
    }
}
