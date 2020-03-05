import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        myInterfaceAdd(s -> System.out.println("*" + s + "*"));
        consumerAdd(s -> System.out.println("*" + s + "*"));
        System.out.println(myInterfaceSquare(i -> i * i));
        System.out.println(functionSquare(i -> i * i));
    }

    public static void myInterfaceAdd(MyInterfaceAdd myInterfaceAdd) {
        myInterfaceAdd.addStar("Lintao"); // TODO: 题目要求方法参数为接口，所以这里把参数写死了
    }

    public static void consumerAdd(Consumer<String> consumer) {
        consumer.accept("Lintao");
    }

    public static int myInterfaceSquare(MyInterfaceSquare myInterfaceSquare) {
        return myInterfaceSquare.square(5);
    }

    public static int functionSquare(Function<Integer, Integer> function ) {
        return function.apply(5);
    }
}
