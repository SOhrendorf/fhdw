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
        String[] vocals;

        result = 0;
        vocals = new String[] {"a","e","i","o","u"};
        for (String e:vocals) {
            if (string.contains(e)) {
                result++;
            }
        }
        return result;
    }
}