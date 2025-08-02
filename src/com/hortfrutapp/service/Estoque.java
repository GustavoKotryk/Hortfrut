package com.hortfrutapp.service;
import com.hortfrutapp.model.*;
import com.hortfrutapp.view.Atendente;

import java.util.List;
import java.util.ArrayList;

public class Estoque {

    private List<Produto> estoqueProdutos; 
    
	public Estoque() {
        estoqueProdutos = new ArrayList<>();
    }
	
	public List<Produto> getEstoqueProdutos() {
        return estoqueProdutos;
    }
    
    public void setEstoqueProdutos(List<Produto> estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

	public void gerenciadorApp (int opcao, Atendente atendente){
        switch (opcao){
            case 1 -> {
                Fruta fruta = atendente.cadastrarFrutas(); 
                if (fruta != null) {
                    estoqueProdutos.add(fruta); 
                }
            }
            case 2 -> {
                Verdura verdura = atendente.cadastrarVerduras();
                if (verdura != null) {
                    estoqueProdutos.add(verdura); 
                }
            }
            
            case 3 -> {
                if (estoqueProdutos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado!");
                } else {
                    System.out.println("=== LISTA DE PRODUTOS ===");
                    for (Produto produto : estoqueProdutos) {
                        System.out.println(produto); 
                    }
                }
            }

            case 4 -> {
                System.out.print("Digite o nome do produto para remover: ");
                String nome = atendente.lerNome(); 
                boolean removido = false;
                
                for (int indice = 0; indice < estoqueProdutos.size(); indice++) {
                    if (estoqueProdutos.get(indice).getNome().equalsIgnoreCase(nome)) {
                        estoqueProdutos.remove(indice);
                        removido = true;
                        System.out.println("Produto removido com sucesso!");
                        break;
                    }
                }
                
                if (!removido) {
                    System.out.println("Produto não encontrado: " + nome);
                }
            }
     }
	}
}