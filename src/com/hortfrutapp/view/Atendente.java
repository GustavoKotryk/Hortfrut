package com.hortfrutapp.view;
import com.hortfrutapp.model.*;

import java.util.Scanner;

public class Atendente {
    Scanner leia = new Scanner(System.in);

    public int menu() {
        System.out.println("\n====FRUTARIA DEUS REINA====");
        System.out.println("|| 1 - Cadastrar Fruta  ||");
        System.out.println("|| 2 - Cadastrar Verdura||");
        System.out.println("|| 3 - Listar Produtos  ||");  
        System.out.println("|| 4 - Remover Produto  ||");  
        System.out.println("===========================");
        System.out.println("||       5 - Sair       ||");  
        System.out.println("Digite a opção desejada: ");
        int opcao = leia.nextInt();
        return opcao;
    }

    public Fruta cadastrarFrutas() {
        System.out.println("\nDigite o nome da Fruta: ");
        leia.nextLine(); 
        String nome = leia.nextLine();
        System.out.println("Digite o Preço da Fruta: ");
        double preco = leia.nextDouble();
        System.out.println("Digite a Quantidade de Frutas: ");
        int quantidade = leia.nextInt();
        System.out.println("Digite o Peso da Fruta (em Kg): ");
        double peso = leia.nextDouble();
        System.out.println("\nFruta cadastrada com sucesso!");

        return new Fruta(nome, preco, quantidade, peso);
    }

    public Verdura cadastrarVerduras() {
        System.out.println("\nDigite o Nome da Verdura: ");
        leia.nextLine(); 
        String nome = leia.nextLine();
        System.out.println("Digite o Preço da Verdura: ");
        double preco = leia.nextDouble();
        System.out.println("Digite a Quantidade de Verduras: ");
        int quantidade = leia.nextInt();
        leia.nextLine(); 
        System.out.println("Digite o Tipo da Verdura: ");
        String tipo = leia.nextLine();
        System.out.println("\nVerdura cadastrada com sucesso!");

        return new Verdura(nome, preco, quantidade, tipo);
    }

    public String lerNome() {
        System.out.print("Digite o nome do produto para remover: ");
        leia.nextLine(); 
        String nome = leia.nextLine();
        return nome;
    }

    public void erro() {
        System.out.println("Erro: Opção inválida! Por favor, escolha uma opção entre 1 e 5.");
    }

    public void encerrando() {
       System.out.print("Saindo...");
    }
}