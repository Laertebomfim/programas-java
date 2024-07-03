package br.com.empresa.programas.ordenacaoDeNumero.dominio;

import java.util.Scanner;

public class OrdenadoDeNumeros extends Ordenado{
    public OrdenadoDeNumeros(Scanner scanner) {
        super(scanner);
    }
    public void execulta(){
        buscaNumerosASerOrdenados(quntosNumerosParaOrdena());
        ordenaExibir();
    }
}
