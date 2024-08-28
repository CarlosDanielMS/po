/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Carro {
    String marca;
    String modelo;
    int ano;
    double kilometragem;

    public Carro(String marca, String modelo, int ano, double kilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
    }

    public String getMarca() {
        return marca;
    }
   
    public void alterarKilometragem(double novaKilometragem) {
        if (novaKilometragem >= 0) {
            this.kilometragem = novaKilometragem;
            System.out.println("Kilometragem alterada para: " + kilometragem + " km");
        } else {
            System.out.println("A quilometragem não pode ser negativa.");
        }
    }

    public void alterarKilometragem(double quilometragemPercorrida, boolean viagem) {
        if (viagem && quilometragemPercorrida >= 0) {
            this.kilometragem += quilometragemPercorrida;
            System.out.println("Kilometragem após viagem: " + kilometragem + " km");
        } else {
            System.out.println("A quilometragem percorrida deve ser positiva para viagens.");
        }
    }

}
