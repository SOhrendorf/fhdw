package de.fhdw.bfwd423a.sohre.NRW.Datenstrukturklassen.linear;

public class TestClass {
    public static void main(String[] args) {
        List<String> testListe;
        testListe = new List<String>();

        testListe.insert("Simon");
        testListe.toFirst();
        System.out.println(testListe.getContent());
    }
}
