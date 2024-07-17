import counter.Counter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Contagem inicial: " + Counter.getCount());

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        System.out.println("Após criar dois objetos Counter: " + Counter.getCount());
    }
}