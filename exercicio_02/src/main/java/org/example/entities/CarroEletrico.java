package org.example.entities;

import org.example.enums.TipoCarro;

public class CarroEletrico extends Carro {

    private double bateriaKWh;
    private double consumo = 5.0;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, TipoCarro tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        return consumo * bateriaKWh;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bateria (kWh): " + bateriaKWh);
    }
}
