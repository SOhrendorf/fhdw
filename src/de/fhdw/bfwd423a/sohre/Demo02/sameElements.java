package de.fhdw.bfwd423a.sohre.Demo02;

public class sameElements {
    public static void main(String[] args) {
        int[] elementA = {1,2,3};
        int[] elementB = {2,1,3,5};

        System.out.println(sameElemente(elementA, elementB));
    }

    static boolean sameElemente(int[] param, int[] param2){
        for (int k = 0; k < param2.length; k++) {
            for (int i = 0; i < param.length; i++) {
                if (param[i] == param2[k]) {
                    param[i] = 0;
                    param2[k] = 0;
                }
            }
        }

        for (int j = 0; j < param.length; j++){
            if (param[j] != 0 || param2[j] != 0){
                return false;
            }
        }
        return true;
    }
}
