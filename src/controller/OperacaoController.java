package controller;

import br.edu.fateczl.fila.*;
import model.Cliente;

public class OperacaoController {
	
	public void caixa(Fila<Cliente> f) {
		
		while(!f.isEmpty()) {
			try {
				Cliente cliente = f.remove();
				float valor = cliente.getQtdPecas() * cliente.getValorPecas();
				System.out.println("Cliente: " + cliente.getNome() + ". Valor total: " + valor);
			} catch (Exception e) {
				System.out.println("Fila Vazia");
			}
		}
	}

}
