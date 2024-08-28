/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Veiculo {
    String marca;
    String modelo;
    int ano;
    Motor motor;

    public Veiculo(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }


    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void ligarMotor() {
        motor.ligar();
    }

    public void desligarMotor() {
        motor.desligar();
    }

    public void exibirInformacoes() {
        System.out.println("Veículo: " + marca + " " + modelo + ", Ano: " + ano);
        System.out.println("Informações do Motor: " + motor);
    }
}

