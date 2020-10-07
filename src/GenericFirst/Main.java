package GenericFirst;

public class Main {

    public static void main(String[] args) {
        Box<String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);
        Box<Integer> sample2 = new Box<>(1);
        System.out.println(sample2);
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);

        // превоначальный код не работал, так как в классе Box отсутствовало поле private T obj
    }
}
