/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Motor {
    double potencia;
    String tipoCombustivel;
    boolean estado;

    public Motor(double potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.estado = false;
    }

    public void ligar() {
        if (!estado) {
            estado = true;
            System.out.println("Motor ligado.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public void desligar() {
        if (estado) {
            estado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

}
