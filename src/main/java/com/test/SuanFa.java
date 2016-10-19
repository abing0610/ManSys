package com.test;

/**
 * Created by abing on 2015/11/18.
 */
public class SuanFa {

    public static int calcute(int[] testcase){
        int p_l = 0;
        int p_r = testcase.length - 1;
        int max_l = testcase[p_l];
        int max_r = testcase[p_r];
        int vloume = 0;
        while (p_r > p_l) {
            if (max_l < max_r){
                p_l = p_l + 1;
                if (testcase[p_l] >= max_l) {
                    max_l = testcase[p_l];
                }else {
                    vloume = vloume + (max_l - testcase[p_l]);
                }
            }else {
                p_r = p_r - 1;
                if (testcase[p_r] >= max_r){
                    max_r = testcase[p_r];
                }else {
                    vloume = vloume + (max_r - testcase[p_r]);
                }
            }
        }
        return vloume;
    }


    public static void main(String[] args) {
//        int[] a = {2,5,1,3,1,2,1,7,7,6};
        int[] a = {2,5,1,2,3,4,7,7,6};
        int i = SuanFa.calcute(a);
        System.out.println(i);
    }

}
