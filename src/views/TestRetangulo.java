package views;

import model.Retangulo;

import java.util.Scanner;

public class TestRetangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Valor da altura");
        retangulo.altura = ler.nextInt();

        System.out.println("Valor da largura");
        retangulo.largura = ler.nextInt();


        System.out.println(retangulo.mostarDados());
    }
}
