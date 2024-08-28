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
        Carro carro = new Carro("Toyota", "Corolla", 2022, 15000.0);

        System.out.println(carro);

        carro.alterarKilometragem(16000.0);

        carro.alterarKilometragem(200.0, true);

        carro.alterarKilometragem(-50.0, true);

        System.out.println(carro);
    }
}

