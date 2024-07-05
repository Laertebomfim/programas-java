package br.com.empresa.programas.trabalhodoComArray.executor;

import br.com.empresa.programas.trabalhodoComArray.dominio.ProgramaArray;

import java.util.Scanner;

public class MainProgramaArray extends ProgramaArray {

    public MainProgramaArray(Scanner scanner, int[] arrayDoUsuario, String controleDoUsuario) {
        super(scanner,controleDoUsuario, arrayDoUsuario);
    }
    public MainProgramaArray(Scanner scanner, String controleDoUsuario) {
        super(scanner, controleDoUsuario);
    }
    public void obterNumerosArray(){
        obterNumeros();
    }
    public void menuPrograma(){
        do {
            execultaOrdemDoUsuario(obterOrdemDoUsuario());
            System.out.println("""
            _________ Você gostaria de continuar ________
            Para = p
            """);
            setControleDoUsuario(scanner.nextLine());
        }while (!controleDoUsuario.equalsIgnoreCase("p"));
    }


}
