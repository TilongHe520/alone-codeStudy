package com.study.alone.offer;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 14:17
 */
public class Alone116OfferFindCircleNum {
    public static void main(String[] args) {
        //[[1,0,0,1],[0,1,1,0],[0,1,1,1],[1,0,1,1]]
        int[][] isConnected = new int[][]{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        System.out.println(findCircleNum(isConnected));
    }
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int m = isConnected[0].length;
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isConnected[i][j]==1){
                    dfs(i,j,isConnected);
                    res++;
                }
            }
        }
        return res;
    }

    public static void dfs(int i,int j,int[][] isConnected){
        if(i<0||j<0||i>=isConnected.length||j>=isConnected[0].length||isConnected[i][j] != 1){
            return;
        }
        isConnected[i][j]=0;
        dfs(i,j+1,isConnected);
        dfs(i,j-1,isConnected);
        dfs(i+1,j,isConnected);
        dfs(i-1,j,isConnected);

    }
}
