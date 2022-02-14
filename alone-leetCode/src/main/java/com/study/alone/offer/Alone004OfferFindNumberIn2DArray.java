package com.study.alone.offer;

/**
 * @Author: hetilong
 * @Date: 2022/2/13 12:14
 */
public class Alone004OfferFindNumberIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}};
        System.out.println(findNumberIn2DArray(matrix,1));
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0){
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        if(matrix[0][0]>target|| matrix[n-1][m-1]<target){
            return false;
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }
}
