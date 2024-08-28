/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Jogador {
    private String nome;
    private int nivel;
    private int pontuacao;

    public Jogador(String nome, int nivel, int pontuacao) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void promover() {
        nivel++;
        System.out.println(nome + " foi promovido para o nível " + nivel + "!");
    }


}

