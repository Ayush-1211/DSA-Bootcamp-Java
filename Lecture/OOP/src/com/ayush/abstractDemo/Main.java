package com.ayush.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        son.career();

        Daughter daughter = new Daughter(28);
        daughter.career();

        //Parent mom = new Parent();    // we cannot create object of an abstract class directly like this

        Parent.hello();

        son.normal();
    }
}
