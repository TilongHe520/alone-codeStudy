package com.study.alone.leet;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 15:19
 */
public class Alone347TopFrequent {
    public static void main(String[] args) {

        int[] nums = new int[]{4,1,-1,2,-1,2,3};
        System.out.println(topKFrequent(nums,2)[0]);
    }

    public static int[] topKFrequent(int[] nums, int k){

        if (nums.length==k){
            return nums;
        }
        int[] result = new int[k];

        Arrays.sort(nums);

        Map<Integer,Integer> map = new HashMap<>();
        for (int i:nums){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int n  :map.keySet()){
            list.add(map.get(n));
        }

        Collections.sort(list);
        System.out.println(list.toString());
        for (int i=0;i<k;i++){
            for (int m:map.keySet()){
                if (map.get(m).equals(list.get(list.size()-1-i))){
                    result[i] = m;
                    map.remove(m);
                    break;
                }
            }

        }
        return result;
    }
}
