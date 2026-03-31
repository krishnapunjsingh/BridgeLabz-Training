public class CompareStringBuilderWithStringBuffer {
    public static void main(String[] args) {
        int n = 1000000;
        StringBuilder sb = new StringBuilder();

        long startBuilder = System.nanoTime();
        for(int i=0;i<n;i++){
            sb.append("Hello");
        }
        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        StringBuffer sbb = new StringBuffer();
        long startBuffer = System.nanoTime();
        for(int i=0;i<n;i++){
            sbb.append("Hello");
        }
        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        System.out.println("Builder Time: " + builderTime);
        System.out.println("Buffer Time: " + bufferTime);
    }
}
