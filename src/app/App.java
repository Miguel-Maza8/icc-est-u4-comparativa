package app;

import java.util.concurrent.Callable;

import controller.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {
        int size = 10000;
        Persona[] base = generarPersonas(size);
        Persona[] copiaInsercion = base.clone();
        Persona[] copiaQuickSort = base.clone();
        SortPersonaMethods metodos = new SortPersonaMethods();
        


        Callable<Void> funiCallable = () -> {
            metodos.insertionSort(copiaInsercion);
            
            return null;
        };

        Resultado rInsert = Benchmarking.medirTiempo(funiCallable,"Insercion Sort", "A", copiaInsercion.length);
        System.out.println( "Desordenado" + " | " + "Insercion" +" | " + size + " | " + rInsert.getTiempoMillis()+ " ms " + " | "  + rInsert.getTiempoNano());
        
        
         Callable<Void> funQuick = () -> {
            metodos.quickSort(copiaQuickSort, 0, copiaQuickSort.length-1);
            
            return null;

        };
        Resultado rQuirk = Benchmarking.medirTiempo(funQuick,"Quirk short", "B", copiaQuickSort.length);
        System.out.println( "Desordenado" + " | " + "QuickSort" + " | "+size + " | "  + rQuirk.getTiempoMillis() +" ms " + " | " + rQuirk.getTiempoNano());

        metodos.insertionSort(base);

        Persona[] nuevoArreglo = new Persona[base.length+1];
        for (int i = 0; i < base.length; i++) {
              nuevoArreglo[i] = base[i];
         }
         nuevoArreglo[base.length] = new Persona("Miguel", 26);

         Persona[] insercionUno = nuevoArreglo.clone();
         Persona[] quickSortUno = nuevoArreglo.clone();


         Callable<Void> funciMasUno = () -> {
             metodos.insertionSort(insercionUno);
             return null;
         };
        
         Resultado rInsertUno = Benchmarking.medirTiempo(funciMasUno,"Insercion Sort", "B", insercionUno.length);
         System.out.println( "Casi ordenado + 1 persona" + " | " + "Insercion" +" | " + insercionUno.length + " | " + rInsertUno.getTiempoMillis()+ " ms " + " | "  + rInsertUno .getTiempoNano());
         

          Callable<Void> funciQuikUno = () -> {
             metodos.quickSort(quickSortUno,0,quickSortUno.length-1);
             return null;
         };
         Resultado rQuikUno = Benchmarking.medirTiempo(funciQuikUno,"Quirk short", "B", quickSortUno.length);
         System.out.println( "Casi ordenado + 1 persona" + " | " + "QuickSort" +" | " + quickSortUno.length + " | " + rQuikUno.getTiempoMillis()+ "ms" + " | "  + rQuikUno.getTiempoNano());
         
        int size2 = 50000;
        Persona[] base2 = generarPersonas(size2);
        Persona[] arregloInsercion = base2.clone();
        Persona[] arregloQuirkShort = base2.clone();
        
         Callable<Void> insercionOrdenado = () -> {
            metodos.insertionSort(arregloInsercion);
            
            return null;
        }; 

        System.out.println();
        
        Resultado rPersonas = Benchmarking.medirTiempo(insercionOrdenado,"Insercion Sort", "A", arregloInsercion.length);
        System.out.println( "Desordenado" + " | " + "Insercion" +" | " + size2 + " | " + rPersonas.getTiempoMillis()+  " ms " +" | "  + rPersonas.getTiempoNano());
        
        Callable<Void> quickShortOrdenado = () -> {
            metodos.quickSort(arregloQuirkShort, 0, arregloQuirkShort.length-1  );
            
            return null;

        };
        Resultado rPersonasQ = Benchmarking.medirTiempo(quickShortOrdenado,"Quirk short", "A", arregloQuirkShort.length);
        System.out.println( "Desordenado" + " | " + "QuickSort" + " | "+size2+ " | "  + rPersonasQ.getTiempoMillis() +" ms " + " | " + rPersonasQ.getTiempoNano());

        metodos.insertionSort(base2);
        Persona[] nuevoArreglo2 = new Persona[base2.length+1];
        for (int i = 0; i < base2.length; i++) {
              nuevoArreglo2[i] = base2[i];
         }
         nuevoArreglo2[base2.length] = new Persona("Evelyn", 22);

         Persona[] ordenadoInserccion2 = nuevoArreglo2.clone();
         Persona[] ordenadoQuikShort2 = nuevoArreglo2.clone();

         Callable<Void> inserMasUno = () -> {
             metodos.insertionSort(ordenadoInserccion2);
             return null;
         };
         Resultado rOrdenado2 = Benchmarking.medirTiempo(inserMasUno,"Insercion Sort", "B", ordenadoInserccion2.length);
         System.out.println( "Casi ordenado + 1 persona" + " | " + "Insercion" +" | " + ordenadoInserccion2.length + " | " + rOrdenado2.getTiempoMillis()+ " ms " +" | "  + rOrdenado2.getTiempoNano());
         
         Callable<Void> quikMasUno = () -> {
             metodos.quickSort(ordenadoQuikShort2,0, ordenadoQuikShort2.length-1);
             return null;
         };
         Resultado rOrdenado2Q = Benchmarking.medirTiempo(quikMasUno,"Quirk short", "B", ordenadoQuikShort2.length);
         System.out.println( "Casi ordenado + 1 persona" + " | " + "QuickSort" +" | " + ordenadoQuikShort2.length + " | " + rOrdenado2Q.getTiempoMillis()+ " ms "+  " | "  + rOrdenado2Q.getTiempoNano());
         
        int size3 = 100000;
        Persona[] base3 = generarPersonas(size3);
        Persona[] arregloInsercionCopia = base3.clone();
        Persona[] arregloQuirkShortCopia = base3.clone();
        
         Callable<Void> insercionPorOrdenar = () -> {
            metodos.insertionSort(arregloInsercionCopia);
            
            return null;
        }; 

        System.out.println();
        
        Resultado rPersonas3 = Benchmarking.medirTiempo(insercionPorOrdenar,"Insercion Sort", "A", arregloInsercionCopia.length);
        System.out.println( "Desordenado" + " | " + "Insercion" +" | " + arregloInsercionCopia.length + " | " + rPersonas3.getTiempoMillis()+" ms " +  " | "  + rPersonas3.getTiempoNano());
        
        Callable<Void> quickShortPorOrdenadar = () -> {
            metodos.quickSort(arregloQuirkShortCopia, 0, arregloQuirkShortCopia.length-1  );
            
            return null;

        };
        Resultado rPersonasQ3 = Benchmarking.medirTiempo(quickShortPorOrdenadar,"Quirk short", "A", arregloQuirkShortCopia.length);
        System.out.println( "Desordenado" + " | " + "QuickSort" + " | "+arregloQuirkShortCopia.length+ " | "  + rPersonasQ3.getTiempoMillis() + " ms "+ " | " + rPersonasQ3.getTiempoNano());
        

        metodos.insertionSort(base3);
        Persona[] nuevoArreglo3 = new Persona[base3.length+1];
        for (int i = 0; i < base3.length; i++) {
              nuevoArreglo3[i] = base3[i];
         }
         nuevoArreglo3[base3.length] = new Persona("Pedri", 25);

         Persona[] ordenadoInserccion3 = nuevoArreglo3.clone();
         Persona[] ordenadoQuikShort3 = nuevoArreglo3.clone();

         Callable<Void> inserMasUno3 = () -> {
             metodos.insertionSort(ordenadoInserccion3);
             return null;
         };
         Resultado rOrdenadoI3= Benchmarking.medirTiempo(inserMasUno3,"Insercion Sort", "B", ordenadoInserccion3.length);
         System.out.println( "Casi ordenado + 1 persona" + " | " + "Insercion" +" | " + ordenadoInserccion3.length + " | " + rOrdenadoI3.getTiempoMillis()+ " ms " + " | "  + rOrdenadoI3.getTiempoNano());
         
         Callable<Void> quikMasUno3 = () -> {
             metodos.quickSort(ordenadoQuikShort3,0, ordenadoQuikShort3.length-1);
             return null;
         };
         Resultado rOrdenado3Q = Benchmarking.medirTiempo(quikMasUno3,"Quirk short", "B", ordenadoQuikShort3.length);
         System.out.println( "Casi ordenado + 1 persona" + " | " + "QuickSort" +" | " + ordenadoQuikShort3.length + " | " + rOrdenado3Q.getTiempoMillis()+ " ms " + " | "  + rOrdenado3Q.getTiempoNano());
    }
    public static Persona[] generarPersonas( int cantidad){
            Persona[] personas =  new Persona[cantidad];
            for (int i = 0; i < cantidad; i++){
                String nombre = "Persona" + (i+1);
                int edad = (int) (Math.random()* 101);
                personas[i] = new Persona(nombre, edad);
            }

            return personas; 
        }
}
