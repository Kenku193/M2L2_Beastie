package org.example;

public class Example3 {

    public static void main(String[] args) {
        A exemplyar = new E();
        exemplyar.method1();
        exemplyar.method2();
    }
}

abstract class A {

    abstract void method1();

    abstract void method2();

}

abstract class B extends A {

    @Override
    void method1() {
        System.out.println("class B method 1");
    }

}

abstract class C extends B {

    @Override
    void method2() {
        System.out.println("class C method 2");
    }

}

abstract class D extends C {

    abstract void method1();

}

class E extends D{
    @Override
    void method1() {
        System.out.println("class E method1");
    }
}
