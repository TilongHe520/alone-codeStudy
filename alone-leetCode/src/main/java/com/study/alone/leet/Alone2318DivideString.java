package com.study.alone.leet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 17:34
 */
public class Alone2318DivideString {
    public String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        int n = s.length();
        for (int i = 0;i<=n-k;i+=k){
            list.add(s.substring(i,i+k));
        }
        if (n % k == 0)
            return list.toArray(new String[0]);
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(n - n%k,n));
            for (int i = n%k;i<k;i++){
                sb.append(fill);
            }
            list.add(sb.toString());
            return list.toArray(new String[0]);
        }

    }
}
