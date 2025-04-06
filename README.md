📏 Distancia de Edición entre Palabras (Java)

¡Bienvenido! 👋 Este es un proyecto Java que calcula la distancia de edición entre dos palabras —es decir, cuántas operaciones necesitas para transformar una palabra en otra.

    🧠 Usa una versión adaptada del algoritmo de Levenshtein, comúnmente utilizado en procesamiento de lenguaje natural.

🧰 ¿Qué hace este programa?

Dado dos palabras como entrada, calcula cuántas operaciones (inserciones, eliminaciones o sustituciones) se requieren para convertir una en otra.
Por ejemplo:

$ java Principal casa cosa

🔁 El programa te dirá que se necesitan 2 operaciones para convertir "casa" en "cosa".
📁 Estructura del proyecto

📦 proyecto-raíz
 ┣ 📂palabras
 ┃ ┗ 📄CalculadoraDistancias.java
 ┣ 📂aplicacion
 ┃ ┗ 📄Principal.java
 ┗ 📄README.md

🚀 Cómo ejecutar el proyecto
1. ✅ Asegúrate de tener Java instalado

Puedes verificar con:

java -version

Y compilar con:

javac -version

2. 🛠️ Compilar

Abre una terminal y ejecuta lo siguiente desde la raíz del proyecto:

javac palabras/CalculadoraDistancias.java aplicacion/Principal.java

3. ▶️ Ejecutar

Ahora ejecuta el programa pasando dos palabras como argumentos:

java aplicacion.Principal palabra1 palabra2

Ejemplo:

java aplicacion.Principal mesa masa

Salida:

La distancia entre las palabras mesa y masa es 2

📚 ¿Cómo se calcula la distancia?

    ✔️ Coincidencia: sin coste

    ➕ Inserción: +1

    ➖ Eliminación: +1

    🔄 Sustitución: +2 (si los caracteres son distintos)

    📌 Esto significa que cambiar una letra cuesta más que simplemente borrar o añadir.

💡 Mejora posible

Puedes extenderlo para:

    Leer desde archivo

    Usar interfaz gráfica

    Hacer que el coste de sustitución sea configurable

🧑‍💻 Autor

Desarrollado por Pablo Molina García e Ignacio Etcheverría Mosquera con ☕ y ❤️