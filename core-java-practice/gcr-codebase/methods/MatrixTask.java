public class MatrixTask {

    public static int[][] buildMatrix(int r, int c) {
        int[][] data = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                data[i][j] = (int) (Math.random() * 10);
            }
        }
        return data;
    }

    public static int[][] sumMatrix(int[][] first, int[][] second) {
        int[][] sum = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        return sum;
    }

    public static int[][] diffMatrix(int[][] first, int[][] second) {
        int[][] diff = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                diff[i][j] = first[i][j] - second[i][j];
            }
        }
        return diff;
    }

    public static int[][] productMatrix(int[][] left, int[][] right) {
        int[][] product = new int[left.length][right[0].length];

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right[0].length; j++) {
                for (int k = 0; k < right.length; k++) {
                    product[i][j] += left[i][k] * right[k][j];
                }
            }
        }
        return product;
    }

    public static void printMatrix(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                System.out.print(values[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int rowCount = 2;
        int colCount = 2;

        int[][] firstMatrix = buildMatrix(rowCount, colCount);
        int[][] secondMatrix = buildMatrix(rowCount, colCount);

        System.out.println("First Matrix");
        printMatrix(firstMatrix);
        System.out.println("Second Matrix");
        printMatrix(secondMatrix);

        System.out.println("Addition Result");
        printMatrix(sumMatrix(firstMatrix, secondMatrix));
        System.out.println("Subtraction Result");
        printMatrix(diffMatrix(firstMatrix, secondMatrix));
        System.out.println("Multiplication Result");
        printMatrix(productMatrix(firstMatrix, secondMatrix));
    }
}
