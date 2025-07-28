package com.hortfrutapp.model;


public class Fruta extends Produto {

	private double peso;
	
		public Fruta () {
			this.peso = 0.0;
		}
		
		public Fruta (String nome, double preco, int quantidade, double peso) {
			super(nome, preco, quantidade);
			this.peso = peso;
		}

			public double getPeso (){
				return peso;
			}

			public void setPeso (double peso){
				this.peso = peso;
			}
		
			@Override
			public String toString() {
				return "Fruta [nome=" + nome + ", preco=R$" + preco + ", quantidade=" + quantidade + ", peso=" + peso + "kg]";
			}
}
