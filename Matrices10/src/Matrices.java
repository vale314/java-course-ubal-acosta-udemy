public class Matrices {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        var matriz1 = new int[3][3];

        matriz[0][0] = 0;

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
