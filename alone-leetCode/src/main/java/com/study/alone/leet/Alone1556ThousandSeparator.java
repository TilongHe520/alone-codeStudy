package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/20 12:06
 */
public class Alone1556ThousandSeparator {
    public String thousandSeparator(int n) {
        if (n < 1000) {
            return String.valueOf(n);
        }

        String s = String.valueOf(n);
        StringBuffer sb = new StringBuffer();
        int len = s.length();
        if (len % 3 == 0) {
            for (int i = 3; i <= len; i += 3) {
                sb.append(s.substring(i - 3, i));
                sb.append(".");
            }
        }
        if (len % 3 == 1) {
            sb.append(s.substring(0, 1));
            sb.append(".");
            for (int i = 4; i <= len; i += 3) {
                sb.append(s.substring(i - 3, i));
                sb.append(".");
            }
        }
        if (len % 3 == 2) {
            sb.append(s.substring(0, 2));
            sb.append(".");
            for (int i = 5; i <= len; i += 3) {
                sb.append(s.substring(i - 3, i));
                sb.append(".");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
