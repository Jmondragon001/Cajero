package Principal;

import java.util.Scanner;

import Dominio.Cliente;
import Logica.ImpCliente;
import Logica.ImpGenerica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// necesito variables
		Long numTarjeta;
		String nombreC;
		String appC;
		String apmC;
		Long celularC;
		// varaibale de tipo objeto
		Cliente cliente = null;// reserva de espacio de memoria

		Scanner lectura = null;
		// instancia de la clase que va en la logica

		int menuPrincipal = 0, menuCliente, subMenuCliente, menuTarj, menuBenef, subMenuBen, indice = 0;
		ImpCliente impCliente = new ImpCliente();
		// crear menu principal

		do {
			System.out.println("1---Alta de Cliente");
			System.out.println("2---Consultar saldo");
			System.out.println("3---Deposito en efectivo");
			System.out.println("4---Retiro en efectivo ");
			System.out.println("5---SALIR ");
			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();

		
			

			switch (menuPrincipal) {
			case 1:
				
					System.out.println("\n Ingresa el numero de Tarjeta");
					lectura = new Scanner(System.in);
					numTarjeta = lectura.nextLong();
					System.out.println("\n Ingresa el nombre de cliente");
					lectura = new Scanner(System.in);
					nombreC = lectura.nextLine();
					System.out.println("\n Ingrese el apellido paterno");
					lectura = new Scanner(System.in);
					appC = lectura.nextLine();
					System.out.println("\n Ingrese el apellido materno");
					lectura = new Scanner(System.in);
					apmC = lectura.nextLine();
					System.out.println("\n Ingrese el numero celular");
					lectura = new Scanner(System.in);
					celularC = lectura.nextLong();
					cliente = new Cliente(numTarjeta, nombreC, appC, apmC, celularC);
					impCliente.guardar(cliente);

					break;
					
				

			case 2:
				System.out.println("\n Ingresa el numero de Tarjeta");
				lectura = new Scanner(System.in);
				numTarjeta = lectura.nextLong();
				impCliente.buscar(numTarjeta, cliente);
				break;
				
				
				
			case 3 :
				System.out.println("Ingrese su numero de Tarjeta ");
				lectura = new Scanner(System.in);
				numTarjeta = lectura.nextLong();
				
				
				
				break;
			case 4 :
				System.out.println("\n Ingresa el numero de Tarjeta");
				lectura = new Scanner(System.in);
				numTarjeta = lectura.nextLong();
				break;
			}
			
		
		}while(menuPrincipal<5);
	}
}
