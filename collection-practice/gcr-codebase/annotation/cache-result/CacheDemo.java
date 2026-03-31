public class CacheDemo {
    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        System.out.println(CacheExecutor.execute(calc, "slowSquare", 5));
        System.out.println(CacheExecutor.execute(calc, "slowSquare", 5));
        System.out.println(CacheExecutor.execute(calc, "slowSquare", 6));
    }
}
