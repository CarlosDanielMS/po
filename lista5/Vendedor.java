/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

public class Vendedor extends Funcionario {
    double totalVendas;
    double percentualBonus;


    public Vendedor(String nome, double salario, double percentualBonus) {
        super(nome, salario, "Vendedor");
        this.percentualBonus = percentualBonus;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
