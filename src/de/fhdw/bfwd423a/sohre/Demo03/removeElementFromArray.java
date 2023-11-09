package de.fhdw.bfwd423a.sohre.Demo03;

public class removeElementFromArray {
    public static int[] removeElementFromArray(int[] intArray,int e){
        int[] resultArray;
        resultArray = new int[] {};

        if(contains.contains(intArray, e)){
            resultArray = new int[intArray.length-1];

            int help = -1;
            boolean deleted = false;

            for (int i = 0; i < resultArray.length; i++) {
                help++;
                if (intArray[i] == e && deleted == false){
                    help++;
                    resultArray[i] = intArray[help];
                    deleted = true;
                }else{
                    resultArray[i] = intArray[help];
                }
            }
        }else{
            resultArray = intArray; // ist keine Kopie, aber naja Kopf hoch :D
        }
        return resultArray;
    }
}
