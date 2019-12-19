package Ques3;

import Ques3.Kazoku.Anak;
import Ques3.Kazoku.Ayah;
import Ques3.Kazoku.Ibu;
import Ques3.Kazoku.Keluarga;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Deklarasi object Keluarga
        Keluarga kaz1 = new Keluarga("Henken", "Tokyo");
        //Menanmbag keluarga
        Ayah ayah = new Ayah(1090, "Yoi Henken", 30);
        Ibu ibu = new Ibu(1075, "Senko Henken", 1000);
        ArrayList<Anak> anakList = new ArrayList<>();
        anakList.add(new Anak(1, "Kaze", 14, "Pelajar"));
        anakList.add(new Anak(2, "Hon", 12, "Pelajar"));
        anakList.add(new Anak(3, "Yami", 7, "Pelajar"));
        kaz1.addAnggotaKeluarga(ayah, ibu, anakList);
        //Output dengan method keluarga
        kaz1.getDataKeluarga();
    }
}
