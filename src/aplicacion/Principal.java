package aplicacion;

import palabras.CalculadoraDistancias;

/**
 * Clase principal de la aplicación que calcula la distancia de edición entre dos palabras
 * proporcionadas como argumentos por línea de comandos.
 * <p>
 * Utiliza la clase {@link palabras.CalculadoraDistancias} para realizar el cálculo
 * de la distancia entre las cadenas introducidas.
 */
public class Principal {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * <p>
     * Toma dos argumentos desde la línea de comandos, los interpreta como palabras,
     * y muestra en consola la distancia de edición entre ellas.
     *
     * @param args Argumentos de la línea de comandos. Se esperan exactamente dos elementos:
     *             <ul>
     *                 <li><code>args[0]</code>: La primera palabra</li>
     *                 <li><code>args[1]</code>: La segunda palabra</li>
     *             </ul>
     * @throws ArrayIndexOutOfBoundsException si no se proporcionan dos argumentos.
     */
    public static void main(String[] args) {
        System.out.println("La distancia entre las palabras " + args[0] + " y " + args[1] + " es " +
                CalculadoraDistancias.calcularDistancia(args[0], args[1]));
    }
}

