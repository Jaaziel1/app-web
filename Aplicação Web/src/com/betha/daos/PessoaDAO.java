package com.betha.daos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.betha.business.Pessoa;

public class PessoaDAO {
	private List<Pessoa> lista;

	public PessoaDAO() {
		this.lista = new ArrayList<Pessoa>();
		this.lista.add(new Pessoa(1, "Cristiano Soares Teixeira",
				"Rua Estephano Dagostim, 127", "3432-7448"));
		this.lista.add(new Pessoa(2, "Maria Jos� da Silva",
				"Rua Geral, sem n�mero", "3432-0000"));
		this.lista.add(new Pessoa(3, "Jo�o Pereira",
				"Avenida Centen�rio, 1542", "3437-7445"));
		this.lista.add(new Pessoa(4, "Eduardo Gon�alves",
				"Rua Machado de Assis, 345", "8841-6952"));
		this.lista.add(new Pessoa(5, "Joana Gusm�o",
				"Travessa Elias Benedetti", "2106-4545"));
		this.lista.add(new Pessoa(6, "F�bio de Souza Machado",
				"Rua Carlos Henrique Medeiros, 234", "4545-2421"));
		this.lista.add(new Pessoa(7, "Jo�o Pereira",
				"Avenida Centen�rio, 1542", "3437-7445"));
	}

	public Pessoa buscarPorCodigo(Integer codigo) {

		for (Iterator iterator = this.lista.iterator(); iterator.hasNext();) {
			Pessoa pessoa = (Pessoa) iterator.next();
			if (pessoa.getCodigo() == codigo)
				return pessoa;
		}
		return null;
	}
	public ArrayList<Pessoa> listarTodas(){
		return (ArrayList<Pessoa>) this.lista;
	}
}
