- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- PROFUNDIZACIÓN EN LISTAS, SETS Y MAPS
Contador de Frecuencia de Palabras
Programa Java que analiza un archivo de texto y cuenta la frecuencia de aparición de cada palabra.

Descripción
El programa lee el archivo ContarPalabras.txt y genera un reporte detallado mostrando cuántas veces aparece cada palabra en el texto. Las palabras se procesan en minúsculas y se ignoran signos de puntuación comunes.

Funcionalidades
- Lectura de archivos: Lee y procesa el contenido de archivos de texto
- Normalización de texto: Convierte todas las palabras a minúsculas para evitar duplicados
- Separación inteligente: Divide el texto por espacios, comas y puntos
- Conteo de frecuencias: Utiliza HashMap para almacenar y contar las apariciones de cada palabra
- Salida formateada: Muestra los resultados con formato visual (palabras subrayadas)
- Manejo de excepciones: Gestiona errores de lectura del archivo
- Pluralización correcta: Diferencia entre "vez" y "veces" según la frecuencia

Estructura del Proyecto
- ContarFrecuencia.java - Clase principal que procesa el archivo y muestra las estadísticas de frecuencia
