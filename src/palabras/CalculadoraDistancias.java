package palabras;

/**
 * Esta clase proporciona métodos para calcular la distancia de edición
 * (también conocida como distancia de Levenshtein) entre dos cadenas de texto.
 * <p>
 * La distancia de edición mide cuántas operaciones (inserciones, eliminaciones o sustituciones)
 * son necesarias para transformar una cadena en otra.
 * <p>
 * Este cálculo sigue la definición explicada por Jurafsky en el contexto del procesamiento de lenguaje natural.
 */
public class CalculadoraDistancias {

    /**
     * Obtiene el carácter de una cadena en una posición específica.
     *
     * @param s La cadena de la cual se quiere obtener el carácter.
     * @param i El índice del carácter a obtener.
     * @return El carácter en la posición i de la cadena s.
     */
    public static char getCaracter(String s, int i) {
        return s.charAt(i);
    }

    /**
     * Calcula la distancia de edición entre dos cadenas de texto.
     * <p>
     * La distancia de edición representa el número mínimo de operaciones necesarias
     * para convertir una cadena en otra. Se permite:
     * <ul>
     *     <li>Insertar un carácter (+1)</li>
     *     <li>Eliminar un carácter (+1)</li>
     *     <li>Sustituir un carácter (+2 si son distintos, +0 si son iguales)</li>
     * </ul>
     *
     * @param s1 La primera cadena de entrada.
     * @param s2 La segunda cadena de entrada.
     * @return La distancia de edición entre s1 y s2.
     */
    public static int calcularDistancia(String s1, String s2) {

        int long1 = s1.length();
        int long2 = s2.length();

        // Matriz donde se almacenarán las distancias parciales
        int[][] matrizDistancias = new int[long1 + 1][long2 + 1];

        // Inicialización de la primera columna (eliminaciones)
        for (int i = 0; i <= long1; i++) {
            matrizDistancias[i][0] = i;
        }

        // Inicialización de la primera fila (inserciones)
        for (int j = 0; j <= long2; j++) {
            matrizDistancias[0][j] = j;
        }

        // Rellenar la matriz comparando caracteres de ambas cadenas
        for (int i = 1; i <= long1; i++) {
            for (int j = 1; j <= long2; j++) {

                // Si los caracteres son iguales, no se penaliza la sustitución
                if (getCaracter(s1, i - 1) == getCaracter(s2, j - 1)) {
                    matrizDistancias[i][j] = Math.min(
                            Math.min(matrizDistancias[i - 1][j] + 1,        // eliminación
                                    matrizDistancias[i][j - 1] + 1),       // inserción
                            matrizDistancias[i - 1][j - 1]                  // sin coste si son iguales
                    );
                } else {
                    // Si los caracteres son distintos, sustitución cuesta 2
                    matrizDistancias[i][j] = Math.min(
                            Math.min(matrizDistancias[i - 1][j] + 1,        // eliminación
                                    matrizDistancias[i][j - 1] + 1),       // inserción
                            matrizDistancias[i - 1][j - 1] + 2              // sustitución
                    );
                }
            }
        }

        // Devuelve la distancia final (en la esquina inferior derecha de la matriz)
        return matrizDistancias[long1][long2];
    }
}

