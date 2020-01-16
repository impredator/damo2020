package main.java.com.damo.generics;

class GenecicKlass<P> {
    P ob;

    public GenecicKlass(P ob) {
        this.ob = ob;
    }

    public P getOb() {
        return ob;
    }

    void getType() {
        System.out.println("Type is " + ob.getClass().getName());
    }
}

public class ScratchGenerics {
    public static void main(String[] args) {
        GenecicKlass<Double> dOb = new GenecicKlass<>(3.14);
        dOb.getType();
        System.out.println("Value is " + dOb.getOb());

        GenecicKlass<String> strOb = new GenecicKlass<>("Generics demo");
        strOb.getType();
        System.out.println("Value is " + strOb.getOb());
    }
}
