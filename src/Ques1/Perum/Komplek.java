package Ques1.Perum;

import java.util.ArrayList;

public class Komplek {
    private String idKomplek;
    private String namaKomplek;
    private int jmlRumah;
    private ArrayList<String> idRumah = new ArrayList<String>();

    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }

    public void addRumah(String idRumah){
        this.idRumah.add(idRumah);
        jmlRumah++;
    }

    public String getIdKomplek() {
        return idKomplek;
    }

    public void setIdKomplek(String idKomplek) {
        this.idKomplek = idKomplek;
    }

    public String getNamaKomplek() {
        return namaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {
        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {
        return jmlRumah;
    }

    public void setJmlRumah(int jmlRumah) {
        this.jmlRumah = jmlRumah;
    }

    public String getIdRumah(int index) {
        return idRumah.get(index);
    }

    public void setIdRumah(ArrayList <String> idRumah) {
        this.idRumah = idRumah;
    }
    public void getDataKomplek(){
        System.out.println("Output ---->\n");
        System.out.println("Nama Komplek\t: " + getNamaKomplek());
        System.out.println("Rumah\t: ");
        for (int i = 0; i < getJmlRumah(); i++) {
            System.out.println("\t" + (i+1) + ". " + getIdRumah(i));
        }
    }

}
