public class StringConcatenationPerformance {

    private static final int N = 1_000_000;

    public static void main(String[] args) {

        long start, end;

        //  Using String (O(N^2)) 
        String str = "";
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            str = str + "a";
        }
        end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + " ms");

        //  Using StringBuilder (O(N)) 
        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");

        //  Using StringBuffer (O(N)) 
        StringBuffer sbuf = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sbuf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");
    }
}
