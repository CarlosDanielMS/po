/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class ContaBancaria {
    String numeroDaConta;
    double saldo;
    Cliente cliente;

    public ContaBancaria(String numeroDaConta, double saldo, Cliente cliente) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso. Novo saldo: R$" + String.format("%.2f", saldo) + ".");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso. Novo saldo: R$" + String.format("%.2f", saldo) + ".");
            } else {
                System.out.println("Saldo insuficiente para o saque.");
            }
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                contaDestino.depositar(valor);
                System.out.println("Transferência de R$" + String.format("%.2f", valor) + " realizada com sucesso para a conta " + contaDestino.getNumeroDaConta() + ".");
            } else {
                System.out.println("Saldo insuficiente para a transferência.");
            }
        } else {
            System.out.println("O valor da transferência deve ser positivo.");
        }
    }

   
}
