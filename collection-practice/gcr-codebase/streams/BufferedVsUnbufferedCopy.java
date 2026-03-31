import java.io.*;

public class BufferedVsUnbufferedCopy {

    static final int BUFFER_SIZE = 4096;

    static void copyUnbuffered(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;

        long start = System.nanoTime();
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }
        long end = System.nanoTime();

        fis.close();
        fos.close();

        System.out.println("Unbuffered Time (ns): " + (end - start));
    }

    static void copyBuffered(String src, String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;

        long start = System.nanoTime();
        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        long end = System.nanoTime();

        bis.close();
        bos.close();

        System.out.println("Buffered Time (ns): " + (end - start));
    }

    public static void main(String[] args) {

        String sourceFile = "largeFile.dat";          // e.g. 100MB file
        String unbufferedCopy = "unbufferedCopy.dat";
        String bufferedCopy = "bufferedCopy.dat";

        try {
            copyUnbuffered(sourceFile, unbufferedCopy);
            copyBuffered(sourceFile, bufferedCopy);
        } catch (IOException e) {
            System.out.println("File not found or IO error occurred.");
        }
    }
}
