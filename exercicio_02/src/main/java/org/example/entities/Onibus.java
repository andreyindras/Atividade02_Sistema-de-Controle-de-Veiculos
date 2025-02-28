package org.example.entities;

public class Onibus extends Veiculo {

    private int quantidadeEixos;
    private double tanque = 200.0;
    private double consumo = 5.0;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);

        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("Quantidade de eixos invalida!");
        }

        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        return tanque * consumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Eixos: " + quantidadeEixos);
    }
}
