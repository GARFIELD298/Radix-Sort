# Programa de Tabla Hash
Este proyecto lo hice para ordenar una lista de números utilizando el algoritmo Radix Sort, un método muy eficiente cuando se trabaja con valores enteros. El programa toma los datos desde un archivo, los ordena por dígitos y luego los guarda ya ordenados en un archivo de salida.

## ¿Qué hace mi programa?
1. Primero abre un archivo llamado radix.txt.
2. Cada número del archivo se guarda dentro de una lista.
3. Esa lista se convierte en un arreglo de enteros.
4. Aplico el algoritmo Radix Sort, que ordena los números por dígitos (unidades, decenas, centenas, etc.).
5. Después de ordenar todo, genero un archivo llamado salida.txt.
6. En ese archivo se escriben todos los números ya ordenados de menor a mayor.
7. Al final aparece el mensaje: "Radix Sort terminado. Revisa salida.txt".

## ¿Cómo funciona la función hash?
Radix Sort ordena los números dígito por dígito, usando internamente Counting Sort para cada posición.

Mi programa funciona así:
Primero obtiene el número más grande para saber cuántas posiciones decimales debe revisar.
Luego empieza ordenando por el dígito de las unidades.
Después por las decenas, luego las centenas, y así sucesivamente.
Para cada etapa usa un Counting Sort modificado, que acomoda los números según el dígito actual.
Este proceso continúa hasta que ya no queden más posiciones por ordenar.
Es especialmente útil cuando se trabaja con listas grandes de números enteros.

## Formato del archivo radix.txt
El archivo debe verse así:
170
45
75
90
802
24
2
66
1000
120
30
5
1250

Cada número debe ir en una línea diferente.

## Archivos generados
salida.txt → Contiene todos los números ya ordenados con Radix Sort.
Ejemplo:
2
5
24
30
45
66
75
90
120
170
802
1000
1250

## Cómo lo ejecuto
Primero compilo el programa:
Luego lo ejecuto:

Debo asegurarme de que el archivo radix.txt esté en la misma carpeta del programa.
Cuando el programa termine, reviso el archivo Salida.txt para ver los números ordenados.


## ¿Para qué me sirve este proyecto?
Este proyecto me ayuda a practicar:
El algoritmo Radix Sort
Uso de Counting Sort para ordenar por dígitos
Ordenamiento no comparativo
Manejo de arreglos y listas en Java
Lectura y escritura de archivos
Optimización de ordenamientos cuando los datos son enteros

Es un muy buen ejercicio para entender algoritmos avanzados de ordenamiento y estructuras numéricas.