package org.example.encoding;

import java.io.UnsupportedEncodingException;

public class KoreanEncoding {
    public static void main(String[] args) throws Exception {
//        String korean = "한글";
//        byte[] bytes = korean.getBytes("UTF-16");
//        String string = new String(bytes, "UTF-16");
//        System.out.println(string);
//        String response = toKR("한글");
//        System.out.println(response);
//
//        System.out.println(toAscii("hello ascii"));
//        System.out.println(new String("hello".getBytes("ISO-8859-1"), "MS949"));

        checkEncoding();
    }

    public static String toKR(String str) {
        if (str == null || str.trim().equals("")) return "";
        try{
            return new String(str.getBytes("ISO-8859-1"), "EUC-KR");
        }catch(UnsupportedEncodingException ex){
            return null;
        }
    }

    public static String toKrMs(String str) {
        if (str == null || str.trim().equals("")) return "";
        try{
            return new String(str.getBytes("ISO-8859-1"), "MS949");
        }catch(UnsupportedEncodingException ex) {
            return null;
        }
    }

    public static String toAscii(String str) {
        if (str == null || str.trim().equals("")) return "";
        try {
            return new String(str.getBytes("EUC-KR"), "ISO-8859-1");
        }catch(UnsupportedEncodingException ex){
            return null;
        }
    }

    public static void checkEncoding() throws UnsupportedEncodingException {
        String testStr = "한글";
        byte[] bytes = testStr.getBytes("utf-8");
        testStr = new String(bytes);

        String[] charSet = {"utf-8", "euc-kr", "ksc5601", "iso-8859-1", "x-windows-949"};

        for(int i = 0; i<charSet.length; i++){
            for (int j = 0; j<charSet.length; j++){
                try{
                    System.out.println("[" + charSet[i] + "," + charSet[j] + "]" + new String(testStr.getBytes(charSet[i]), charSet[j]));
                } catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
