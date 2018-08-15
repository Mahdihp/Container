package com.maktab.inner_class;

public class Main {

    public void noneStaticMethod() {
        new Inner();
    }

    public static void staticMehtod() {
        Main m = new Main();
        m.new Inner();
    }

    class Inner {
        public void f() {
            System.out.println("Inner Class Method.");
        }
    }

    static class InnerStatic {
        public void f() {
            System.out.println("Inner Class Method.");
        }

    }
}
