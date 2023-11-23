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

    public static boolean palindrom(String world){
        boolean palindorm;
        char[] charArray = world.toCharArray();

        palindorm = true;

        for(int i = 0; i < charArray.length/2;i++){
            if(charArray[i] != charArray[charArray.length - i-1]){
                palindorm = false;
                break;
            }
        }
        return palindorm;
    }

    public static String repeatString(String word, int n){
        String result;

        result = word;

        for (int i = 1; i < n ; i++){
            result = result.concat(word);
        }
        return result;
    }
}