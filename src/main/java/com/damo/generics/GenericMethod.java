package main.java.com.damo.generics;

class Cks<T> implements Comparable<Cks> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public int compareTo(Cks o) {
        return 100000;
    }
}

public class GenericMethod {

    private static <T> boolean isEqual(
            GenericClass<T> g1, GenericClass<T> g2) {
        return g1.getItem().equals(g2.getItem());
    }

    private static <T extends Comparable<T>> int compare(
            T t1, T t2) {
        return t1.compareTo(t2);
    }

    public static void main(String[] args) {
        Cks<String> g1 = new Cks<>();
//        g1.setItem("xi'an");

        Cks<String> g2 = new Cks<>();
//        g2.setItem("xi'an");

//        boolean isEqual = GenericMethod.isEqual(g1, g2);
//        System.out.println(isEqual);

        int compareResult = GenericMethod.compare(g1, g2);
        System.out.println(compareResult);
    }
}
