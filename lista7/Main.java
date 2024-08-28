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
        Funcionario funcionario1 = new Funcionario("Alice Costa", 5000.00);
        Funcionario funcionario2 = new Funcionario("Bob Silva", 6000.00);
        Funcionario funcionario3 = new Funcionario("Carlos Oliveira", 5500.00);

        Empresa empresa = new Empresa();

        empresa.contratarFuncionario(funcionario1);
        empresa.contratarFuncionario(funcionario2);
        empresa.contratarFuncionario(funcionario3);

        System.out.println("Folha de Pagamento Total: R$" + String.format("%.2f", empresa.calcularFolhaDePagamento()));

        empresa.demitirFuncionario("Bob Silva");

        System.out.println("Folha de Pagamento Total após demissão: R$" + String.format("%.2f", empresa.calcularFolhaDePagamento()));
        
        System.out.println(empresa);
    }
}
