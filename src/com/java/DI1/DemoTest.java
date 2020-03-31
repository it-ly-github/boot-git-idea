package com.java.DI1;

public class DemoTest {


//    public static void main(String[] args) {
//
//          String str = "abcdef";
//        String s = str.substring(4, 3);
//        System.out.println(s);
//
////        String abc = "laowang";
////        abc = abc+"xiaowang";
////        System.out.println(abc);
////
////        String str = "abcdef";
////        str = str.substring(0, 1);
////        System.out.println(str);
////
////        System.out.println(3*0.1);
////
////        Double f = 0.34;
//
////        Integer i1 = new Integer(10);
////        Integer i2 = new Integer(10);
////          System.out.println(i1==i2);
////          System.out.println(i1.equals(i2));
////        Integer i3 = Integer.valueOf(10);
////        Integer i4 = Integer.valueOf(10);
//
////        System.out.println(i3 == i4);
////        String[] abc = new String[]{"a","b","c"};
////        System.out.println(abc.length);
////        String str = "Hello Word";
////        System.out.println(str.length());
////
////
////        short b = 1;
////        b += 1;
////        System.out.println(b);
//
//
////        System.out.println(String.format("Short短整数取值范围：最大值%s，最小值%s", Short.MAX_VALUE, Short.MIN_VALUE));
////        System.out.println(String.format("Integer最大值%s,最小值%s", Integer.MAX_VALUE, Integer.MIN_VALUE));
////        System.out.println(String.format("Byte：最大值%s，最小值%s", Byte.MAX_VALUE, Byte.MIN_VALUE));
////        System.out.println(String.format("Long：最大值%s，最小值%s", Long.MAX_VALUE, Long.MIN_VALUE));
////        System.out.println(String.format("Character：最大值%s，最小值%s", Character.MAX_VALUE, Character.MIN_VALUE));
////
////        Set<Short> set = new HashSet<>();
////        for (short i = 0; i < 5; i++) {
////            set.add(i);
////            set.remove(i - 1);
////        }
////        System.out.println(set.size());
//    }

//    public static void main(String[] args) {
//        String str = new String("laowang");
//        change(str);
////        str = "xiaowang";
//        System.out.println(str);
//    }
//
//    public static void change(String str){
//        str = "xiaowang";
//        System.out.println(str);
//    }

    /*public static void main(String[] args) {
        String s = new String("laowang");
        String s1 = s.intern();
        System.out.println(s==s1);

        StringBuffer sf = new StringBuffer("laowang");
        change(sf);
//        str = "xiaowang";
        System.out.println(sf);
    }

    public static void change(StringBuffer sf){
        sf.append("xiaowang");
//        System.out.println(str);
    }*/

    public static void main(String[] args) {
//        Thread t = new Thread(){
//            public void run(){
//                pong();
//            }
//        };
//        t.run();
//        System.out.println("ping");
        int n = 30;
        int i = fibonacci(n);
        System.out.println(i);
    }

    static void pong(){
        System.out.println("pong");
    }


    public static int fibonacci(int n){
        if (n <= 0){
            return 0;
        } else if(n > 0 && n <= 2){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}
