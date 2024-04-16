package Logica;

import java.util.ArrayList;

import java.util.List;


import Dominio.Cliente;

import Interface.Metodos;

public class ImpGenerica implements Metodos {
	List<Cliente>lista= new ArrayList<Cliente>();

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		lista.add(cliente);
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Cliente buscar(Long numTarjeta, Cliente cliente) {
		boolean bandera=false;
		// tuvimos que pasar el atributo a buscar con su tipo de variable
		// TODO Auto-generated method stub
		for (Cliente c : lista) {
			//foreach para con variable tipo objeto el cual los registros de clientes 
			//se fuardan en se y  los busca en lista
			if(c.getNumTarjeta().equals(numTarjeta)) {
		//con el if comparamos si la variable de tipo obejto c.getNumtarjeta es igual aque se busca
				System.out.println("vas bien carnal");	
				bandera=true;
			}
			if(bandera==false) {
				System.out.println("El numero de Tarjeta no existe ");
			}
		}
		return (cliente);
	}

	@Override
	public void editar(int indice, Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		
	}

	
}