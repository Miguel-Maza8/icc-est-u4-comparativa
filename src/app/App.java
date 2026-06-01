package app;

import java.util.concurrent.Callable;

import controller.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.BenchmarKing;

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

        Resultado rInsert = BenchmarKing.medirTiempo(funiCallable,"Insercion Sort", "A", size);
        System.out.println( rInsert.getTiempoNano() + "=" + rInsert.getTiempoMillis());
        
        
         Callable<Void> funQuick = () -> {
            metodos.quickSort(copiaQuickSort, size, size);
            
            return null;

        };
        Resultado rQuirk = BenchmarKing.medirTiempo(funQuick,"Quirk short", "B", size);
        System.out.println( rQuirk.getAlgoritmo()+"=" + rQuirk.getTiempoMillis());

        



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
