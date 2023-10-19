package de.fhdw.bfwd423a.sohre.Demo01;
public class Example02 {

        public static void main(String[] args){
            aufgabeA();
            aufgabeB();
            aufgabeC();
        }
        public static void aufgabeA(){
            switch ('A'){
                case 'A':
                    System.out.println("Die Ampel ist grün! YAY");
                    break;
                case 'B':
                    System.out.println("Die Ampel ist rot. Schade");
                    break;
            }
        }
        public static void aufgabeB() {
            switch (0) {
                case 0:
                    System.out.println("Die Zahl ist 0");
                    break;
                case 1:
                    System.out.println("Die Zahl ist 1");
                    break;
                default:
                    System.out.println("Die Zahl ist etwas anderes");
            }
        }
        public static void aufgabeC(){
            switch("Simon"){
                case "Jonas":
                    System.out.println("Jonas hat Hunger");
                    break;
                case "Simon":
                    System.out.println("Simon hat morgens gute Laune");
                    break;
                default:
                    System.out.println("Saskia hat keine Lust mehr");
            }
        }
}

