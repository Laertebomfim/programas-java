package br.com.empresa.programas.trabalhodoComArray.test;

import br.com.empresa.programas.trabalhodoComArray.executor.MainProgramaArray;

import java.util.Scanner;

public class workArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainProgramaArray mainProgramaArray = new MainProgramaArray(scanner,"c");

        mainProgramaArray.obterNumerosArray();
        mainProgramaArray.menuPrograma();

    }
}