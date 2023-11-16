package de.fhdw.bfwd423a.sohre.Demo04;

public class stringUtils {

    public static boolean sIna (String s, String[] a){
        boolean result;
        result = false;
        for (String e:a) {
            if(e.equals(s)){
                result = true;
                break;
            }
        }
        return result;
    }

    public static int numberOfVocals (String string){
        int result;

        result = 0;

        for (int i = 0; i < string.length(); i++) {
            char charAtPosI;

            string = string.toLowerCase();
            charAtPosI = string.charAt(i);


            if (charAtPosI == 'a' || charAtPosI == 'e' || charAtPosI == 'i' || charAtPosI == 'o' || charAtPosI == 'u') {
                result++;
            }
        }
        return result;
    }
}