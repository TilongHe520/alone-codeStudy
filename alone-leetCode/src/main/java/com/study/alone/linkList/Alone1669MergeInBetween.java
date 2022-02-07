package com.study.alone.linkList;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/7 18:35
 */
public class Alone1669MergeInBetween {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        Map<Integer,ListNode> map1 = new HashMap<>();
        Map<Integer,ListNode> map2 = new HashMap<>();
        int i=0,j=0;
        while(temp1!=null){
            map1.put(i++,temp1);
            temp1 = temp1.next;
        }

        while(temp2!=null){
            map2.put(j++,temp2);
            temp2 = temp2.next;
        }

        ListNode left1 = map1.get(a-1);
        ListNode right1 = map1.get(b+1);
        ListNode left2 = map2.get(map2.size()-1);

        left1.next = list2;
        left2.next = right1;

        return list1;
    }
}
