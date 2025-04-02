package palabras;

public class CalculadoraDistancias{
    /**
     * * Calcula la distancia de edició n, tal y como la expone
     * * Jurafsky entre las cadenas ` s1` y ` s2`.
     * */

    public static char getCaracter(String s, int i){
        return s.charAt(i);
    }

    public static int calcularDistancia(String s1, String s2) {

        int long1 = s1.length();
        int long2 = s2.length();

        int distancia = 0;

        int[][] matrizDistancias = new int[long1 + 1][long2 + 1];

        for (int i = 0; i<=long1; i++){
            matrizDistancias[i][0]=i;
        }
        for (int j = long2; j>=0; j--){
            matrizDistancias[0][j]=j;
        }

        for (int i = 1; i<long1; i++){
            for (int j = 1; j<long2; j++) {
                if (getCaracter(s1, i) == getCaracter(s2, j)) {
                    matrizDistancias[i][j] = Math.min(Math.min(matrizDistancias[i - 1][j] + 1, matrizDistancias[i][j - 1] + 1), matrizDistancias[i - 1][j - 1]);
                    System.out.println("\n\n"+matrizDistancias[i][j]);
                } else {
                    matrizDistancias[i][j] = Math.min(Math.min(matrizDistancias[i - 1][j] + 1, matrizDistancias[i][j - 1] + 1), matrizDistancias[i - 1][j - 1] + 2);
                    System.out.println("\n\n"+matrizDistancias[i][j]);
                }
            }
        }

        distancia+=Math.abs(long1-long2)+matrizDistancias[long1][long2];

        System.out.println(matrizDistancias[long1][long2]);
        return matrizDistancias[long1-1][long2-1];
    }
}
