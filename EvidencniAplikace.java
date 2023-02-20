/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.evidencniaplikace;

/**
 *
 * @author Ondřej
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidencniAplikace {
    private List<Pojisteny> pojisteni = new ArrayList<>();

    public void pridatPojisteneho(Pojisteny pojisteny) {
        pojisteni.add(pojisteny);
    }

    public void zobrazitSeznamPojistenych() {
        System.out.println("Seznam pojištěných:");
        for (Pojisteny p : pojisteni) {
            System.out.println(p);
        }
    }

    public Pojisteny vyhledatPojisteneho(String jmeno, String prijmeni) {
        for (Pojisteny p : pojisteni) {
            if (p.getJmeno().equals(jmeno) && p.getPrijmeni().equals(prijmeni)) {
                return p;
            }
        }
        return null;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvidencniAplikace aplikace = new EvidencniAplikace();

        while (true) {
            System.out.println("1. Přidat pojištěného");
            System.out.println("2. Zobrazit seznam pojištěných");
            System.out.println("3. Vyhledat pojištěného");
            System.out.println("4. Konec");
            System.out.print("Váš výběr: ");
            int volba = sc.nextInt();

            if (volba == 1) {
                sc.nextLine();
                System.out.print("Zadejte jméno: ");
                String jmeno = sc.nextLine();
                System.out.print("Zadejte příjmení: ");
                String prijmeni = sc.nextLine();
                System.out.print("Zadejte věk: ");
                int vek = sc.nextInt();
                sc.nextLine();
                System.out.print("Zadejte telefonní číslo: ");
                String telefon = sc.nextLine();
                Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefon);
                aplikace.pridatPojisteneho(pojisteny);
            } else if (volba == 2) {
                aplikace.zobrazitSeznamPojistenych();
            } else if (volba == 3) {
                sc.nextLine();
                System.out.print("Zadejte jméno: ");
                String jmeno = sc.nextLine();
                System.out.print("Zadejte příjmení: ");
                String prijmeni = sc.nextLine();
                Pojisteny pojisteny = aplikace.vyhledatPojisteneho(jmeno, prijmeni);
                if (pojisteny == null) {
                    System.out.println("Pojisteny s zadanymi jmenem a prijmenim nebyl nalezen");
                }else {
                    System.out.println(pojisteny);
                }
            } else if (volba == 4) {
break;
}
}
}
}
