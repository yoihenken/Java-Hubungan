package Ques1;

import Ques1.Perum.Komplek;
import Ques1.Perum.Rumah;

public class main {
    public static void main(String[] args) {
        //Membuat objek Rumah
        Rumah house1 = new Rumah("A1", "Bagus", 4);
        Rumah house2 = new Rumah("A2", "Bayu", 2);
        Rumah house3 = new Rumah("A3", "Prasongko", 1);

        //Membuat objek Komplek
        Komplek komplek1 = new Komplek("A", "Anggur");

        komplek1.addRumah(house1.getIdRumah());
        komplek1.addRumah(house2.getIdRumah());
        komplek1.addRumah(house3.getIdRumah());

        komplek1.getDataKomplek();
    }
}
