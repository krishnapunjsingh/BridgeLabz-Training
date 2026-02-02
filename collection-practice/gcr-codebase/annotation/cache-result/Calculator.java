public class Calculator {

    @CacheResult
    public int slowSquare(int x) {
        System.out.println("Computing square...");
        try {
            Thread.sleep(2000); // simulate expensive computation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x * x;
    }
}
