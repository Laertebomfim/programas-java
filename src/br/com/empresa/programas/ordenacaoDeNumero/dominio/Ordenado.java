package br.com.empresa.programas.ordenacaoDeNumero.dominio;


import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Ordenado implements Funcionalidade{
    public int[] numerosDigitados;
    Scanner scanner;

    public Ordenado(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String requisitaNumero() {
        return scanner.nextLine();
    }

    @Override
    public int quntosNumerosParaOrdena() {
        System.out.println("Quantos números você deseja ordenar?");
        return Integer.parseInt(requisitaNumero());
    }

    @Override
    public void buscaNumerosASerOrdenados(int numerosDesejados) {
        int[] numeros = new int[numerosDesejados];

        System.out.println("Digite somente um número inteiro e dê enter.");
        for(int cont = 0 ;cont < numerosDesejados;cont++){
            numeros[cont] = Integer.parseInt(scanner.nextLine());
        }
        this.numerosDigitados = numeros;
    }

    @Override
    public void ordenaExibir() {
        Arrays.sort(numerosDigitados);
        for (int numero : numerosDigitados){
            System.out.print(numero);
        }
    }
}
