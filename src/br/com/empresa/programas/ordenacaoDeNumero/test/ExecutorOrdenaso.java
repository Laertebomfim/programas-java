package br.com.empresa.programas.ordenacaoDeNumero.test;

import br.com.empresa.programas.ordenacaoDeNumero.dominio.Ordenado;
import br.com.empresa.programas.ordenacaoDeNumero.dominio.OrdenadoDeNumeros;

import java.util.Arrays;
import java.util.Scanner;

public class ExecutorOrdenaso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrdenadoDeNumeros ordenadoDeNumeros = new OrdenadoDeNumeros(scanner);

        ordenadoDeNumeros.execulta();
    }
}
