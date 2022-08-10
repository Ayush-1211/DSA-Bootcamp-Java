package com.ayush.access;

public class ObjectDemo {

    int num;
    float name;

    public ObjectDemo(int num, float num2) {
        this.num = num;
        this.name = num2;
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        //return num;
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 12.07f);
        ObjectDemo obj2 = new ObjectDemo(12, 7.12f);
//        ObjectDemo obj2 = obj1;

//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());

        if(obj1 == obj2) {
            System.out.println("obj1 is equal to obj2");
        }

        if(obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass());
    }
}
