package cz.itnetwork.evidencniaplikace;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ondřej
 */
import cz.itnetwork.evidencniaplikace.Pojisteny;
import java.util.ArrayList;
import java.util.List;

class SpravcePojisteny {
  private final List<Pojisteny> pojisteni = new ArrayList<>();
  
  public void pridatPojisteneho(Pojisteny pojisteny) {
    this.pojisteni.add(pojisteny);
  }
  
  public Pojisteny vyhledatPojisteneho(String jmeno, String prijmeni) {
    for (Pojisteny pojisteny : pojisteni) {
      if (pojisteny.jmeno.equals(jmeno) && pojisteny.prijmeni.equals(prijmeni)) {
        return pojisteny;
      }
    }
    return null;
  }
  
  public void zobrazitSeznamPojistenych() {
    System.out.println("Seznam pojištěných:");
    for (Pojisteny pojisteny : pojisteni) {
      System.out.println(pojisteny);
    }
  }
}
