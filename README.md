## Tabla 1.Escenario 1 : arreglo completamente desordenado

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|:-----------------:|:----------------:|:----------------:|:--------------------:|-------------|
| 10.000 | 1317.7869 ms | 14.1799 ms | QuickSort | QuickSort actua de forma mas rapida  |
| 50.000 | 53216.3827 ms | 95.3659 ms | QuickSort | QuickSort actua mucho mas rapido que insercion |
| 100.000 | 326588.8126 ms  | 214.9199 ms | QuickSort | Al momento de ordenar con QuickSort el tiempo de ordenamiento es mucho mas bajo debido a que este es mejor para ordenar arreglos desordenados grandes |

---

## Tabla 2. Escenario 2: arreglo ordenado más una nueva persona

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|:-----------------:|:----------------:|:----------------:|:--------------------:|-------------|
| 10.001 | 2.9191 ms | 9.0812 ms | Inserción | Inserción se comporta mas rapidamente |
| 50.001 | 8.0274 ms | 72.6214 ms | Inserción | Inserción es mas rapido sin importar el tamaño del arreglo |
| 100.001 | 25.7077 ms | 246.5094 ms | Inserción | Inserción se comporta mucho mas rapido a pesar de que el tamaño del arreglo es muy grande |


---
## ¿ Que algoritmo fue mas rapido en el esenario desordenado ?

El algoritmo mas rapido fue el QuickSort debido a que para el ordenamiento de un arreglo de datos grande este siempre sera mas rapido y eficiente.

## ¿ Que algoritmo fue mas rapido en el esenario casi ordenado?

El algoritmo mas rapido fue el Insercion debido a que al ordenar un arreglo casi ordenado este realiza muy pocas comparaciones , recorriendo casi linealmente asta ordenar el ultimo dato.

## ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?

No los afecto por igual debido a que el tiempo varia diferente en cada algoritmo, en el insercion el tiempo de ordenamiento aumento demasiado, comparado al quickSort donde no aumento demasiado el tiempo sino crecio reguladamente.

## ¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?

Mejora debido a que no realiza muchos intercambios , sino recorre el arreglo casi linealmente y solo realiza unas pocas interacciones hasta encontrar la ubicacion del nuevo dato.

 ## ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?

 Porque QuickSort se basa en dividir el arreglo en dos mitades usando un pivote y cada mitad se va ordenando, de esta forma el ordenamiento se hace mas rapido en cada paso aprovechando el desorden.

 ## Conclusiones
 
 Se evidencio el tiempo de ordenamiento de los algortimos insercion y QuickSort, verificando como se comporta cada uno en diferentes contextos, comparando sus tiempos y analizando cuando es mas eficiente un algoritmo sobre otro.

 Se verifico como varia el tiempo de ejecucion de los metodos de ordenamiento con dos arreglos desordenados, analizando como el algortimo QuickSort es mucho mas eficiente frente al insercion, debido a que gracias a su complejidad O(n log n) divide el arreglo y los ordena mas facilmente comportandose de forma mas rapida.

 Se analizo como varia el tiempo de ejecucion entre dos metodos de ordenamiento con un arreglo casi ordenado, en donde el algoritmo insercion tarda menos tiempo en ordenarlo que el QuickSort debido a que este casi se comporta como O(n) realizando unas pocas comparaciones hasta determinar la posicion correcta del ultimo valor,aprovechando el ordenamiento de este. 