package org.example;

public class Example4 {
}

class Car {
    void horn(){
        System.out.println("Нота Фа");
    }
}

class VW extends Car {
    @Override
    void horn() {
        System.out.println("Нота До");
    }
}
