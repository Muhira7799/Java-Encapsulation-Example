class Encapsulation {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int newA) {
        this.a = newA;
    }
}

public class DemoEncapsulation {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setA(10);
        System.out.println("Value of a: " + obj.getA());
    }
}