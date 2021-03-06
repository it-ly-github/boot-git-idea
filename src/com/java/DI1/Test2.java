package com.java.DI1;

/**
 * @author Ly
 * @date 2020/3/23 -14:17
 */
//public class Test2 {

    class A {
        public void m(A a) {
            System.out.println("AA");
        }
        public void m(D d) {
            System.out.println("AD");
        }
    }
    class B extends A {
        @Override
        public void m(A a) {
            System.out.println("BA");
        }
        public void m(B b) {
            System.out.println("BD");
        }
        public static void main(String[] args) {
            A a = new B();
            B b = new B();
            C c = new C();
            D d = new D();
            a.m(a);
            a.m(b);
            a.m(c);
            a.m(d);
        }
    }
    class C extends B{}
    class D extends B{}
//}
