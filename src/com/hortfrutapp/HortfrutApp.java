package com.hortfrutapp;

import com.hortfrutapp.view.Atendente;
import com.hortfrutapp.service.Estoque;

public class HortfrutApp {

    public static void main(String[] args) {
        Atendente atendente = new Atendente();
        Estoque estoque = new Estoque();
        int opcaoMenu = 0;

        do {
            opcaoMenu = atendente.menu();

            if (opcaoMenu >= 1 && opcaoMenu <= 4) {        
                estoque.gerenciadorApp(opcaoMenu, atendente);
            } else if (opcaoMenu == 5) {                  
                atendente.encerrando();
            } else {
                atendente.erro();
            }
            } while (opcaoMenu != 5);                     
    }
}