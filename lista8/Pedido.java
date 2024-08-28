/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    int numero;
    String data;
    List<ItemPedido> itens;

    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item);
    }

    public void removerItem(String produto) {
        ItemPedido itemParaRemover = null;
        for (ItemPedido item : itens) {
            if (item.getProduto().equalsIgnoreCase(produto)) {
                itemParaRemover = item;
                break;
            }
        }
        if (itemParaRemover != null) {
            itens.remove(itemParaRemover);
            System.out.println("Item removido: " + itemParaRemover);
        } else {
            System.out.println("Item com produto \"" + produto + "\" não encontrado.");
        }
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularValorTotal();
        }
        return total;
    }

}
