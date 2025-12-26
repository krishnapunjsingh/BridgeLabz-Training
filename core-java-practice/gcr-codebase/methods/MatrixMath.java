public class MatrixMath {

    public static double[][] createMatrix(int rows, int cols) {
        double[][] mat = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        return mat;
    }

    public static double[][] getTranspose(double[][] mat) {
        double[][] trans = new double[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                trans[j][i] = mat[i][j];
            }
        }
        return trans;
    }

    public static double det2x2(double[][] mat) {
        return (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
    }

    public static double det3x3(double[][] mat) {
        return mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1])
             - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
             + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
    }

    public static double[][] inverse2x2Matrix(double[][] mat) {
        double det = det2x2(mat);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / det;
        inv[0][1] = -mat[0][1] / det;
        inv[1][0] = -mat[1][0] / det;
        inv[1][1] = mat[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3Matrix(double[][] mat) {
        double det = det3x3(mat);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1]) / det;
        inv[0][1] = -(mat[0][1]*mat[2][2] - mat[0][2]*mat[2][1]) / det;
        inv[0][2] =  (mat[0][1]*mat[1][2] - mat[0][2]*mat[1][1]) / det;

        inv[1][0] = -(mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0]) / det;
        inv[1][1] =  (mat[0][0]*mat[2][2] - mat[0][2]*mat[2][0]) / det;
        inv[1][2] = -(mat[0][0]*mat[1][2] - mat[0][2]*mat[1][0]) / det;

        inv[2][0] =  (mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0]) / det;
        inv[2][1] = -(mat[0][0]*mat[2][1] - mat[0][1]*mat[2][0]) / det;
        inv[2][2] =  (mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0]) / det;

        return inv;
    }

    public static void printMatrix(double[][] mat) {
        if (mat == null) {
            System.out.println("Inverse not possible");
            return;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("%.2f\t", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        double[][] myMatrix = createMatrix(3, 3);

        System.out.println("Matrix");
        printMatrix(myMatrix);
        System.out.println("Transpose");
        printMatrix(getTranspose(myMatrix));
        System.out.println("Determinant");
        System.out.println(det3x3(myMatrix));
        System.out.println("Inverse");
        printMatrix(inverse3x3Matrix(myMatrix));
    }
}
