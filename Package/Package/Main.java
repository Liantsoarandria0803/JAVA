import p1.A;
public class Main {
    public static void main(String[] args) {
    A a = new A(23);
    a.createB();
    a.createD();
    a.show();
    System.out.println("A utilise B:");
    a.showB();
    System.out.println("A utilise D");
    a.showD();
    }
}
