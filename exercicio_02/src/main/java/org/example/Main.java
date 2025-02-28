package org.example;

import org.example.entities.*;
import org.example.enums.TipoCarro;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("marcaCarro", "modeloCarro", 2022, 5, "Gasolina", TipoCarro.SEDAN);
        carro.exibirDetalhes();
        System.out.println();

        Caminhao caminhao = new Caminhao("marcaCaminhao", "modeloCaminhao", 2021, 2, "Diesel", 10);
        caminhao.exibirDetalhes();
        System.out.println();

        Onibus onibus = new Onibus("marcaOnibus", "modeloOnibus", 2020, 50, "Diesel", 6);
        onibus.exibirDetalhes();
        System.out.println();

        CarroEletrico carroEletrico = new CarroEletrico("marcaCarroEletrico", "modeloCarroEletrico", 2023, 5, "Elétrico", TipoCarro.SUV, 100);
        carroEletrico.exibirDetalhes();
        System.out.println();

        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("marcaCaminhaoRefrigerado", "modeloCaminhaoRefrigerado", 2022, 2, "Diesel", 15, -20);
        caminhaoRefrigerado.exibirDetalhes();


    }
}