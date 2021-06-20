package lesson10;

import java.util.ArrayList;

public class PhoneUtils {
    public static void printAllPhonesByProduction(ArrayList<Phone> phones, String production) {
        for (Phone phone : phones) {
            if (phone.getProizvoditel().equals(production)) {
                System.out.println(phone.toString());
            }
        }
    }

    public static void printTheBigestResolution(ArrayList<Phone> phones) {
        Phone bigestPhone = phones.get(0);
        for (Phone phone : phones) {
            if (phone.getDiagonal() > bigestPhone.getDiagonal()) {
                bigestPhone = phone;
            }
        }
        System.out.println(bigestPhone);
    }
}
