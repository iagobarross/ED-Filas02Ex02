package view;

import br.edu.fateczl.fila.*;
import model.Cliente;
import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) {
		
		Fila<Cliente> f = new Fila<>();
		OperacaoController opCont = new OperacaoController();
		
		for(int i = 0; i < 20; i++) {
			Cliente cliente = new Cliente("" + i, (int)((Math.random() * 31) + 20), (float)(Math.random() * 96) + 5);
			f.insert(cliente);
		}
		
		opCont.caixa(f);
		
	}

}
