package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ2.java v1.0 2020/7/2 2:55 下午 chenpeng Exp $
 */
public class JZ2 {

    /*
    * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
    * 则经过替换之后的字符串为We%20Are%20Happy。
    * */

    public static String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }else
                sb.append("%20");
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello world");
        String s = replaceSpace(sb);
        System.out.println(s);

    }
}
