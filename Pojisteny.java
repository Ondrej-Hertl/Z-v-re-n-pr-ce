package cz.itnetwork.evidencniaplikace;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ondřej
 */
public class Pojisteny {
    String jmeno;
    String prijmeni;
    private int vek;
    private String telefonniCislo;

    public Pojisteny(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    @Override
    public String toString() {
        return "Jméno: " + jmeno + ", Příjmení: " + prijmeni + ", Věk: " + vek + ", Telefonní číslo: " + telefonniCislo;
    }
}
