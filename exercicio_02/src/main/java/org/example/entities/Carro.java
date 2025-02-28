package org.example.entities;

import org.example.enums.TipoCarro;

public class Carro extends Veiculo {

    private TipoCarro tipoCarro;
    private double tanque = 50.0;
    private double consumo = 12.0;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, TipoCarro tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return tanque * consumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de Carro: " + tipoCarro);
    }
}
