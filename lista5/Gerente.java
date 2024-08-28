/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Gerente extends Funcionario {
    double bonusFixo;

    public Gerente(String nome, double salario, double bonusFixo) {
        super(nome, salario, "Gerente");
        this.bonusFixo = bonusFixo;
    }

}
