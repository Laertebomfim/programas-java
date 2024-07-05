package br.com.empresa.programas.trabalhodoComArray.dominio;

import java.util.Arrays;
import java.util.Scanner;

public enum Metodos {
    ORDENA(){
        @Override
        /**
          @ordenado serve para não altera o array original
         */
        public void ordemArray() {
            int[] ordenado = Arrays.copyOf(arrayDesponibilizado,arrayDesponibilizado.length);
            Arrays.sort(ordenado);
            System.out.println("__________ Ordena Matriz ___________");
            for (int numero : ordenado){
                System.out.print(numero+" ");
            }
            System.out.println(" ");
        }
    },
        PARE(){
            @Override
            public void ordemArray() {
                System.out.println("______ Números pares da matriz ________");
                for(int numeros : arrayDesponibilizado){
                    if(numeros %2 == 0){
                        System.out.print(numeros + " ");
                    }
                }
                System.out.println(" ");
            }
        },

    MULTIPLO(){
        @Override
        public void ordemArray() {
            System.out.println("Qual número você quer encontrar múltiplos dele?");
            setMultiplo(Integer.parseInt(Metodos.scanner.nextLine()));

            System.out.println("______Os números que são múltiplos de "+ multiplo+"_____");
            for(int num : arrayDesponibilizado){
                if(num % multiplo == 0){
                    System.out.print(num+" ");
                }
            }
            System.out.println(" ");
        }

    };

    int[] arrayDesponibilizado;
    int multiplo;
    static Scanner scanner;
    Metodos() {
    }

    public void setArrayDesponibilizado(int[] arrayDesponibilizado) {
        this.arrayDesponibilizado = arrayDesponibilizado;
    }

    public void setMultiplo(int multiplo) {
        this.multiplo = multiplo;
    }

    public static void setScanner(Scanner scanner) {

        Metodos.scanner = scanner;
    }

    public abstract void ordemArray();
}
