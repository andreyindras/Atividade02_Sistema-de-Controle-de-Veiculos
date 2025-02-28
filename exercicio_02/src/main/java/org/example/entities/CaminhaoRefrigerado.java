package org.example.entities;

public class CaminhaoRefrigerado extends Caminhao {

    private double temperaturaMinima;
    private double tanque = 300.0;
    private double consumo = 6.0;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia() {
        return super.calcularAutonomia() * 0.9;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Temperatura Mínima: " + temperaturaMinima + "°C");
    }
}