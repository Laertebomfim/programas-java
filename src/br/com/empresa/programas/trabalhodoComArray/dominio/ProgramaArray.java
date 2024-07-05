package br.com.empresa.programas.trabalhodoComArray.dominio;

import java.util.Scanner;

public abstract class ProgramaArray {
    protected Scanner scanner;
    protected int[] arrayDoUsuario;
    protected String controleDoUsuario;

    public ProgramaArray(Scanner scanner,String controleDoUsuario, int[] arrayDoUsuario) {
        this(scanner,controleDoUsuario);
        this.arrayDoUsuario = arrayDoUsuario;
    }

    public ProgramaArray(Scanner scanner, String controleDoUsuario) {
        this.scanner = scanner;
        this.controleDoUsuario = controleDoUsuario;
        Metodos.setScanner(this.scanner);
    }

    protected void tamanhoveto(){
        System.out.println("tamanho da matris ?");
        arrayDoUsuario = new int[Integer.parseInt(scanner.nextLine())];
    }

    protected void obterNumeros(){
        tamanhoveto();

        System.out.println("Digite somente um número inteiro e dê enter.");
        for (int posicao = 0; posicao < arrayDoUsuario.length; posicao++) {
            arrayDoUsuario[posicao] = Integer.parseInt(scanner.nextLine());
        }
    }

    protected String obterOrdemDoUsuario(){
        System.out.println("""
                    ______________________________________________
                    O que você gostaria de fazer com a sua matriz?\s
                    Ordena = O
                    Encontrar Pare = P
                    Encontrar múltiplos de determinado número = M\s
                    ______________________________________________
                    """);
        String ordem = "";
        do {
            if (!ordem.isEmpty()){
                System.out.println("Você digitou algum caracter que não foi solicitado, digite novamente.");
            }
            ordem = scanner.nextLine();
        }while (!(ordem.equalsIgnoreCase("o")
                || ordem.equalsIgnoreCase("p")
                || ordem.equalsIgnoreCase("m")));

        return ordem;
    }

    protected void execultaOrdemDoUsuario(String ordem){

        switch (ordem.toUpperCase()){
            case "O":
                Metodos.ORDENA.setArrayDesponibilizado(arrayDoUsuario);
                Metodos.ORDENA.ordemArray();
                break;
            case "P":
                Metodos.PARE.setArrayDesponibilizado(arrayDoUsuario);
                Metodos.PARE.ordemArray();
                break;
            case "M":
                Metodos.MULTIPLO.setArrayDesponibilizado(arrayDoUsuario);
                Metodos.MULTIPLO.setMultiplo(5);
                Metodos.MULTIPLO.ordemArray();
                break;
        }
    }

    public void setControleDoUsuario(String controleDoUsuario) {
        this.controleDoUsuario = controleDoUsuario;
    }
}

