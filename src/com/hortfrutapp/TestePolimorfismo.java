package com.hortfrutapp;

import com.hortfrutapp.model.*;
import java.util.*;

public class TestePolimorfismo {
    public static void main(String[] args) {
        // POLIMORFISMO: Lista que pode guardar qualquer tipo de Produto!
        List<Produto> listaProdutos = new ArrayList<>();
        
        // Criando objetos de diferentes tipos (Fruta e Verdura)
        Fruta banana = new Fruta("Banana", 3.50, 20, 0.15);
        Verdura alface = new Verdura("Alface", 2.00, 10, "Folhosa");
        
        // POLIMORFISMO: Mesma lista guardando tipos diferentes!
        listaProdutos.add(banana);  // Fruta sendo tratada como Produto
        listaProdutos.add(alface);  // Verdura sendo tratada como Produto
        
        // POLIMORFISMO: toString() correto é chamado automaticamente
        System.out.println("=== LISTA DE PRODUTOS ===");
        for(Produto produto : listaProdutos) {
            // Cada objeto chama seu próprio toString()!
            System.out.println(produto); 
        }
        
        // Chamando método que usa instanceof (versão tradicional)
        mostrarDetalhes(listaProdutos);
        
        // Chamando método que usa pattern matching (versão moderna)
        mostrarDetalhesModerno(listaProdutos);
    }
    
    // INSTANCEOF: Descobrindo o tipo real do objeto em tempo de execução
    public static void mostrarDetalhes(List<Produto> lista) {
        System.out.println("\n=== DETALHES COM INSTANCEOF (TRADICIONAL) ===");
        
        for(Produto produto : lista) {
            // Verifica se é uma Fruta
            if(produto instanceof Fruta) {
                System.out.println("É uma FRUTA: " + produto.getNome());
                // Para acessar métodos específicos, precisaria fazer cast:
                // Fruta f = (Fruta) produto;
                // System.out.println("Peso: " + f.getPeso());
                
            } else if(produto instanceof Verdura) {
                System.out.println("É uma VERDURA: " + produto.getNome());
                // Para acessar métodos específicos, precisaria fazer cast:
                // Verdura v = (Verdura) produto;
                // System.out.println("Tipo: " + v.getTipo());
            }
        }
    }
    
    // PATTERN MATCHING: Versão moderna do instanceof (Java 14+)
    public static void mostrarDetalhesModerno(List<Produto> lista) {
        System.out.println("\n=== DETALHES COM PATTERN MATCHING (MODERNO) ===");
        
        for(Produto produto : lista) {
            // Pattern matching: já cria a variável do tipo correto!
            if(produto instanceof Fruta fruta) {
                // Variável 'fruta' já é do tipo Fruta, sem precisar de cast
                System.out.println("🍎 Fruta: " + fruta.getNome() + " - Peso: " + fruta.getPeso() + "kg");
                
            } else if(produto instanceof Verdura verdura) {
                // Variável 'verdura' já é do tipo Verdura, sem precisar de cast
                System.out.println("🥬 Verdura: " + verdura.getNome() + " - Tipo: " + verdura.getTipo());
            }
        }
    }
    
    /*
     * CONCEITOS DEMONSTRADOS:
     * 
     * 1. POLIMORFISMO:
     *    - Uma List<Produto> pode guardar Fruta, Verdura, etc.
     *    - Cada objeto chama seu próprio toString() automaticamente
     *    - "Uma interface, múltiplos comportamentos"
     * 
     * 2. INSTANCEOF:
     *    - Verifica o tipo real de um objeto em tempo de execução
     *    - Versão tradicional: instanceof + cast manual
     *    - Pattern matching: instanceof + variável automática
     * 
     * 3. HERANÇA:
     *    - Fruta e Verdura herdam de Produto
     *    - Podem ser tratadas como Produto (polimorfismo)
     *    - Mas mantêm suas características específicas
     */
}