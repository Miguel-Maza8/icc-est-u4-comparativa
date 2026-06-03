package controller;

import models.Persona;

public class SortPersonaMethods {
    public void insertionSort (Persona[] persona){
     for( int i = 1 ; i< persona.length ; i++){
        Persona aux = persona[i];
        int j = i-1;
        while(j >= 0 && persona[j].getCriterioOrdenamiento() > aux.getCriterioOrdenamiento()){
            persona[j+1]= persona[j];
            j--;

        }
        persona[j+1]=aux;
      
     }
    }
    public void quickSort(Persona[] personas, int inicio, int fin){
        if ( inicio < fin){
            int indicePivote = particionar(personas,inicio, fin);
            quickSort(personas, inicio, indicePivote-1);
            quickSort(personas, indicePivote+1, fin);

        }
    }
    private int particionar(Persona[] personas, int inicio, int fin){
        int medio = inicio + (fin - inicio) / 2;  
        intercambiar(personas, medio, fin);
        Persona pivote = personas[fin];
        int i = inicio-1;

        for ( int j = inicio ; j< fin ; j++){
            if( personas[j].getCriterioOrdenamiento()<= pivote.getCriterioOrdenamiento()){
                i++;
                intercambiar(personas,i,j);
            }
        }
        intercambiar(personas,i+1,fin);
        return i+1;

    }
    private void intercambiar (Persona[] personas, int i, int j){
        Persona aux = personas[i];
        personas[i] = personas[j];
        personas[j]= aux;
    }
}
