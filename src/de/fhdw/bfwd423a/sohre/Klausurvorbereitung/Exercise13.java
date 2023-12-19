package de.fhdw.bfwd423a.sohre.Klausurvorbereitung;

public class Exercise13 {
    public static void main(String[] args) {
        String name = "Simon";
        System.out.println(alignLeft(name,8));
    }

    public static String alignLeft(String s, int i){
        String result ="";
        if (s.length() > i){
            result = s.substring(0,i);
        }else {
            for (int j = s.length(); j < i; j++){
                result += ".";
            }
            result += s;
        }
        return result;
    }
}
