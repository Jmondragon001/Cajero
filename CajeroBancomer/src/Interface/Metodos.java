package Interface;

import Dominio.Cliente;

public interface Metodos {
	public void guardar(Cliente cliente);
	public void listar();
	public  Cliente buscar(Long numTarjeta, Cliente cliente);
	public void editar(int indice, Cliente cliente);
	public void eliminar(int indice);
	

}
