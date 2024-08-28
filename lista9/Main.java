/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(150.0, "Gasolina");

        Veiculo veiculo = new Veiculo("Ford", "Mustang", 2024, motor);

        veiculo.exibirInformacoes();

        veiculo.ligarMotor();

        veiculo.desligarMotor();

        veiculo.exibirInformacoes();
    }
}

