package com.maktab.inner_class;

public class Main {

    public static void main(String[] args) {
//        Main.staticMehtod();
//        new Main().noneStaticMethod();
        new InnerStatic("Inner Class Static...");
    }

    public void noneStaticMethod() {
        new Inner("Inner Class From none Static Method");
    }

    public static void staticMehtod() {
        Main m = new Main();
        m.new Inner("Inner Class From  Static Method");
    }

    class Inner {
        public Inner(String message) {
            System.out.println(message);
        }
    }

    static class InnerStatic {
        public InnerStatic(String message) {
            System.out.println(message);
        }

    }
}
