package com.alperenyalcin.encapsulationcalisanornegi;

public class Calisan {

    private int id;
    private String isim;
    private String soyisim;
    private int maas;

    public Calisan(){}

    public Calisan(int id, String isim, String soyisim, int maas) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.maas = maas;
    }

    public void setMaas(int maas) {
        if (maas > 2000 && maas < 10000) {
            this.maas = maas;
        }

    }

    public int getMaas() {
        return maas;
    }
}
