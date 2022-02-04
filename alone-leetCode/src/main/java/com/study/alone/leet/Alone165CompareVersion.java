package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 22:06
 */
public class Alone165CompareVersion {
    public static void main(String[] args) {
        System.out.println(compareVersion("1","1.0.0"));
    }

    public static int compareVersion(String version1, String version2){
        String[] vArr1 = version1.split("\\.");
        String[] vArr2 = version2.split("\\.");

        int n = Math.min(vArr1.length,vArr2.length);
        for(int i=0;i<n;i++){
            if(Integer.parseInt(vArr1[i])<Integer.parseInt(vArr2[i])){
                return -1;
            }
            if(Integer.parseInt(vArr1[i])>Integer.parseInt(vArr2[i])){
                return 1;
            }
        }
        if(vArr1.length>vArr2.length){
            for(int i= vArr2.length;i<vArr1.length;i++){
                if(Integer.parseInt(vArr1[i])>0){
                    return 1;
                }
            }
        }
        if(vArr1.length<vArr2.length){
            for(int i= vArr1.length;i<vArr2.length;i++){
                if(Integer.parseInt(vArr2[i])>0){
                    return -1;
                }
            }
        }
        return 0;
    }
}
