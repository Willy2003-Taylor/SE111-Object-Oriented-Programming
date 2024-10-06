import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        int m1, n1, m2, n2, k, rownum_colnum;
        int k_check, m1_check, n1_check, m2_check, n2_check, m3_check, n3_check;
        String row_column;
        System.out.println("Please enter rows and columns of matrix A.");
        Scanner myscan = new Scanner(System.in);
        m1 = myscan.nextInt();
        n1 = myscan.nextInt();
        int[][] matrixA = new int[m1][n1];

        function.assign(m1, n1, matrixA);
        System.out.println("Print all elements in matrix A.");
        function.print(m1, n1, matrixA);
        System.out.println();
        System.out.println("Please enter multiple number k.");
        k = myscan.nextInt();
        int[][] matrix_constantly_multiplied = new int[m1][n1];

        matrix_constantly_multiplied = function.constant_multiple(k, m1, n1, matrixA);
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) System.out.print(matrix_constantly_multiplied[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        int[][] matrix_transposed = new int[m1][n1];
        matrix_transposed = function.transpose(m1, n1, matrixA);
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) System.out.print(matrix_transposed[i][j] + " ");
            System.out.println();

        }

        System.out.println();
        function.rotate(m1, n1, matrixA);
        System.out.println();
        function.find_min(m1, n1, matrixA);
        System.out.println();
        System.out.print("Please enter the given row or column.");
        row_column = myscan.next();
        rownum_colnum = myscan.nextInt();
        function.find_average(m1, n1, matrixA, row_column, rownum_colnum);

        System.out.println("Please enter rows and columns of matrix B.");
        m2 = myscan.nextInt();
        n2 = myscan.nextInt();

        if (m1 == m2 && n1 == n2) {
            int[][] matrixB = new int[m2][n2];
            function.assign(m2, n2, matrixB);
            System.out.println("Print all elements in matrix B.");
            function.print(m2, n2, matrixB);
            int[][] matrix_added = new int[m1][n1];
            matrix_added = function.addition(m1, n1, m2, n2, matrixA, matrixB);
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) System.out.print(matrix_added[i][j] + " ");
                System.out.println();
            }
        } else {
            do {
                System.out.println("The size of rwo matrices must be identical. Please enter matrix B again.");
                        Scanner myscan1 = new Scanner(System.in); m2 = myscan1.nextInt();
                n2 = myscan1.nextInt();
                if (m1 == m2 && n1 == n2) {
                    int[][] matrixB1 = new int[m2][n2];

                    function.assign(m2, n2, matrixB1);
                    System.out.println("Print all elements in matrix B.");
                    function.print(m2, n2, matrixB1);
                    int[][] matrix_added = new int[m1][n1];

                    matrix_added = function.addition(m1, n1, m2, n2, matrixA, matrixB1);
                    for (int i = 0; i < m1; i++) {
                        for (int j = 0; j < n1; j++)
                            System.out.print(matrix_added[i][j] + " ");
                        System.out.println();
                    }
                    break;
                }
            } while (true);
        }




        System.out.println();
        System.out.println("Please enter rows and columns of matrix A and B again.");

                m1 = myscan.nextInt(); n1 = myscan.nextInt();
        int[][] matrixA1 = new int[m1][n1];
        function.assign(m1, n1, matrixA1);
        System.out.println("Print all elements in matrix A.");
        function.print(m1, n1, matrixA1);
        m2 = myscan.nextInt();
        n2 = myscan.nextInt();
        if (n1 == m2) {
            int[][] matrixB2 = new int[m2][n2];
            function.assign(m2, n2, matrixB2);
            System.out.println("Print all elements in matrix B.");
            function.print(m2, n2, matrixB2);
            int[][] matrix_multiplied = new int[m1][n2];


            matrix_multiplied = function.multiplication(m1, n1, m2, n2, matrixA1, matrixB2);
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) System.out.print(matrix_multiplied[i][j] + " ");

                System.out.println();
            }
        } else {
            do {


                System.out.println("Matrix B is illegal. Please enter again.");
                Scanner myscan2 = new Scanner(System.in);
                m2 = myscan2.nextInt();
                n2 = myscan2.nextInt();
                if (n1 == m2) {
                    int[][] matrixB3 = new int[m2][n2];
                    function.assign(m2, n2, matrixB3);
                    System.out.println("Print all elements in matrix B.");
                    function.print(m2, n2, matrixB3);
                    function.multiplication(m1, n1, m2, n2, matrixA1, matrixB3);
                    break;

                }
            } while (true);
        }

        System.out.println("Please enter matrix A for checking.");
        m1_check = myscan.nextInt();
        n1_check = myscan.nextInt();
        int[][] matrixA_check = new int[m1_check][n1_check];
        function.assign(m1_check, n1_check, matrixA_check);
        function.print(m1_check, n1_check, matrixA_check);
        check.transpose_transpose(m1_check, n1_check, matrixA_check);

        System.out.println("Please enter matrix B for checking.");
        m2_check = myscan.nextInt();
        n2_check = myscan.nextInt();
        int[][] matrixB_check = new int[m2_check][n2_check];
        System.out.println("Please enter matrix C for checking.");
        m3_check = myscan.nextInt();
        n3_check = myscan.nextInt();
        int[][] matrixC_check = new int[m3_check][n3_check];
        function.assign(m2_check, n2_check, matrixB_check);
        function.print(m2_check, n2_check, matrixB_check);

        function.assign(m3_check, n3_check, matrixC_check);
        function.print(m3_check, n3_check, matrixC_check);

        check.additive_commutative_law(m1_check, n1_check, m2_check, n2_check, m3_check, n3_check, matrixA_check, matrixB_check, matrixC_check);


        check.multiplicative_commutative_law(m1_check, n1_check, m2_check, n2_check, matrixA_check, matrixB_check);


        check.transpose_addition(m1_check, n1_check, m2_check, n2_check, matrixA_check, matrixB_check);


        check.transpose_multiplication(m1_check, n1_check, m2_check, n2_check, matrixA_check, matrixB_check);

        System.out.println("Please enter constant number k.");
        k_check = myscan.nextInt();

        check.transpose_constant_multiplication(k_check, m1_check, n1_check, matrixA_check);
    }
}

class function {
    public static void assign(int m, int n, int[][] matrix) {
        Random generator = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = generator.nextInt(101);
        }
    }

    public static void print(int m, int n, int[][] matrix) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) System.out.print(matrix[i][j] + " ");

            System.out.println();
        }
    }

    public static int[][] constant_multiple(int k, int m, int n, int[][] matrix) {
        System.out.println("Make constant multiple operation.");
        int[][] matrix_constant_multipled = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) matrix_constant_multipled[i][j] = k * matrix[i][j];
        }
        return matrix_constant_multipled;
    }

    public static int[][] transpose(int m, int n, int[][] matrix) {
        int[][] matrix_transposed = new int[n][m];
        System.out.println("Make transpose operation.");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) matrix_transposed[j][i] = matrix[i][j];
        }
        return matrix_transposed;
    }

    public static int[][] transpose_check(int n, int m, int[][] matrix) {
        int[][] matrix_transposed_check = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) matrix_transposed_check[j][i] = matrix[i][j];
        }
        return matrix_transposed_check;
    }

    public static void rotate(int m, int n, int[][] matrix) {
        int[][] matrix_rotated = new int[m][n];
        System.out.println("Make rotate operation.");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix_rotated[m - i - 1][n - j - 1] = matrix[i][j];

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix_rotated[i][j] + " ");
            System.out.println();
        }
    }

    public static void find_min(int m, int n, int[][] matrix) {
        int min_element = 150;
        System.out.println("Find the minimum element in the matrix.");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                if (matrix[i][j] < min_element) min_element = matrix[i][j];
        }
        System.out.println(min_element);
    }

    public static void find_average(int m, int n, int[][] matrix, String rowcol, int rownum_colnum) {
        int sum = 0;
        double average = 0;
        System.out.println("Make find-average operation.");
        if ("r".equals(rowcol)) {
            for (int j = 0; j < n; j++)
                sum += matrix[rownum_colnum - 1][j];
            average = (double) (sum / n);
            System.out.println(average);
        } else if ("c".equals(rowcol)) {
            for (int i = 0; i < m; i++)
                sum += matrix[i][rownum_colnum - 1];
            average = (double) (sum / m);
            System.out.println(average);
        }
    }

    public static int[][] addition(int m1, int n1, int m2, int n2, int[][] matrix1, int[][] matrix2) {
        System.out.println("Make addition operation.");
        int[][] matrix_added = new int[m2][n2];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++)
                matrix_added[i][j] = matrix1[i][j] + matrix2[i][j];
        }
        return matrix_added;
    }

    public static int[][] multiplication(int m1, int n1, int m2, int n2, int[][] matrix1, int[][] matrix2) {
        System.out.println("Make multiplication operation.");
        int[][] matrix_multiplied = new int[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++)
                    matrix_multiplied[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
        return matrix_multiplied;
    }

    public static boolean arrayequals(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++)
            if (!Arrays.equals(arr1[i], arr2[i])) return false;
        return true;
    }
}

class check {
    public static void transpose_transpose(int m, int n, int[][] matrix) {
        int[][] transposed_tmp = new int[n][m];
        int[][] transposed = new int[m][n];
        transposed_tmp = function.transpose(m, n, matrix);
        transposed = function.transpose_check(n, m, transposed_tmp);
        function.print(m, n, transposed);
        if (function.arrayequals(transposed, matrix)) System.out.println("True");

        else System.out.println("False");
    }

    public static void additive_commutative_law(int m1, int n1, int m2, int n2, int m3, int n3, int[][] matrix1, int[][] matrix2, int[][] matrix3) {
        int[][] added_tmp1, added_tmp2 = new int[m1][n1];
        int[][] added1, added2 = new int[m1][n1];
        added_tmp1 = function.addition(m1, n1, m2, n2, matrix1, matrix2);
        added_tmp2 = function.addition(m2, n2, m3, n3, matrix2, matrix3);
        added1 = function.addition(m1, n1, m3, n3, added_tmp1, matrix3);
        added2 = function.addition(m1, n1, m2, n2, matrix1, added_tmp2);
        function.print(m1, n1, added1);
        function.print(m2, n2, added2);
        if (function.arrayequals(added1, added2)) System.out.println("True");
        else System.out.println("False");
    }

    public static void multiplicative_commutative_law(int m1, int n1, int m2, int n2, int[][] matrix1, int[][] matrix2) {
        int[][] mulitplied1 = new int[m1][n2];
        int[][] multiplied2 = new int[m2][n1];
        mulitplied1 = function.multiplication(m1, n1, m2, n2, matrix1, matrix2);
        multiplied2 = function.multiplication(m2, n2, m1, n1, matrix2, matrix1);
        function.print(m1, n2, mulitplied1);
        function.print(m2, n1, multiplied2);
        if (function.arrayequals(mulitplied1, multiplied2)) System.out.println("True");
        else System.out.println("False");
    }

    public static void transpose_addition(int m1, int n1, int m2, int n2, int[][] matrix1, int[][] matrix2) {
        int[][] added_tmp1 = new int[m1][n1];
        int[][] transposed_tmp1 = new int[n1][m1];
        int[][] transposed_tmp2 = new int[n1][m1];
        int[][] transposed_tmp3 = new int[n1][m1];
        int[][] added_tmp2 = new int[n1][m1];

        added_tmp1 = function.addition(m1, n1, m2, n2, matrix1, matrix2);
        transposed_tmp1 = function.transpose(m1, n1, added_tmp1);
        transposed_tmp2 = function.transpose(m1, n1, matrix1);
        transposed_tmp3 = function.transpose(m2, n2, matrix2);
        added_tmp2 = function.addition(n1, m1, n2, m2, transposed_tmp2, transposed_tmp3);
        function.print(n1, m1, transposed_tmp1);
        function.print(n2, m2, added_tmp2);
        if (function.arrayequals(transposed_tmp1, added_tmp2)) System.out.println("True");
        else System.out.println("False");
    }

    public static void transpose_multiplication(int m1, int n1, int m2, int n2, int[][] matrix1, int[][] matrix2) {
        int[][] multiplied_tmp1 = new int[m1][n2];
        int[][] transposed_tmp1 = new int[n2][m1];
        int[][] transposed_tmp2 = new int[n2][m2];
        int[][] transposed_tmp3 = new int[n1][m1];
        int[][] multiplied_tmp2 = new int[n2][m1];
        multiplied_tmp1 = function.multiplication(m1, n1, m2, n2, matrix1, matrix2);
        transposed_tmp1 = function.transpose(m1, n2, multiplied_tmp1);
        transposed_tmp2 = function.transpose(m2, n2, matrix2);
        transposed_tmp3 = function.transpose(m1, n1, matrix1);
        multiplied_tmp2 = function.multiplication(n2, m2, n1, m1, transposed_tmp2, transposed_tmp3);
        function.print(n2, m1, transposed_tmp1);
        function.print(n2, m1, multiplied_tmp2);
        if (function.arrayequals(transposed_tmp1, multiplied_tmp2)) System.out.println("True");
        else System.out.println("False");
    }

    public static void transpose_constant_multiplication(int k, int m, int n, int[][] matrix) {
        int[][] constantly_multiplied_tmp1 = new int[m][n];
        int[][] transposed_tmp1 = new int[n][m];
        int[][] transposed_tmp2 = new int[n][m];

        int[][] constantly_multiplied_tmp2 = new int[n][m];
        constantly_multiplied_tmp1 = function.constant_multiple(k, m, n, matrix);
        transposed_tmp1 = function.transpose(m, n, constantly_multiplied_tmp1);
        transposed_tmp2 = function.transpose(m, n, matrix);
        constantly_multiplied_tmp2 = function.constant_multiple(k, m, n,
                transposed_tmp2);
        function.print(n, m, transposed_tmp1);
        function.print(n, m, constantly_multiplied_tmp2);
        if (function.arrayequals(transposed_tmp1, constantly_multiplied_tmp2)) System.out.println("True");
        else System.out.println("False");
    }
}
