/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jogo {
    private String nome;
    private String dataLancamento;
    private List<Jogador> jogadores;

    public Jogo(String nome, String dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.jogadores = new ArrayList<>();
    }

 
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
        System.out.println("Jogador adicionado: " + jogador);
    }

    public void exibirRanking() {
        Collections.sort(jogadores, new Comparator<Jogador>() {
            @Override
            public int compare(Jogador j1, Jogador j2) {
                return Integer.compare(j2.getPontuacao(), j1.getPontuacao()); // Ordena em ordem decrescente
            }
        });

        System.out.println("Ranking dos Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

    public void promoverJogadores() {
        for (Jogador jogador : jogadores) {
            if (jogador.getPontuacao() > 1000) { 
                jogador.promover();
            }
        }
    }


}

