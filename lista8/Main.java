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
        ItemPedido item1 = new ItemPedido("Produto A", 3, 50.00);
        ItemPedido item2 = new ItemPedido("Produto B", 2, 30.00);
        ItemPedido item3 = new ItemPedido("Produto C", 1, 20.00);

        Pedido pedido = new Pedido(12345, "2024-08-28");

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        System.out.println("Valor Total do Pedido: R$" + String.format("%.2f", pedido.calcularValorTotal()));

        pedido.removerItem("Produto B");

        System.out.println("Valor Total do Pedido após remoção: R$" + String.format("%.2f", pedido.calcularValorTotal()));

        System.out.println(pedido);
    }
}
