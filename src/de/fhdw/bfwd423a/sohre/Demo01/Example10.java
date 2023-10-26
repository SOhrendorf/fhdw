package de.fhdw.bfwd423a.sohre.Demo01;

public class Example10 {
    public static void main(String[] args) {
        System.out.print("Die Anzahl an gekauften Schokoladen beträgt: ");
        System.out.println(getNumberofChocolatesForCoupons(90, 5,5));
    }

    public static int getNumberofChocolatesForCoupons(int pMoney, int pCost, int pCoupon){
        int collectCoupon;
        int bought;
        collectCoupon = 0;
        bought = 0;
        while(pMoney >= pCost || collectCoupon >= pCoupon){
            if(collectCoupon >= pCoupon){
                collectCoupon = collectCoupon-pCoupon;
            }else {
                pMoney = pMoney - pCost;
            }
            collectCoupon++;
            bought++;
        }
        return(bought);
    }

    public static int mhhh(int pMoney, int pCost, int pCoupon){
        int bought;
        bought = 0;
        while(pMoney >= pCost){
            pMoney = pMoney-pCost;
            bought++;
            if(bought % pCoupon == 0){
                pMoney = pMoney+pCost;
            }
        }
        return(bought);
    }
}
