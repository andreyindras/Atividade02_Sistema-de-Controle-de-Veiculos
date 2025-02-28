package org.example.entities;

public class Caminhao extends Veiculo {

    private double capacidadeCarga;
    private double tanque = 300.0;
    private double consumo = 6.0;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double ajuste = capacidadeCarga * 0.01;

        if (ajuste > 0.25) {
            ajuste = 0.25;
        }

        double novoConsumo = consumo * (1 - ajuste);

        return tanque * novoConsumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
    }
}
