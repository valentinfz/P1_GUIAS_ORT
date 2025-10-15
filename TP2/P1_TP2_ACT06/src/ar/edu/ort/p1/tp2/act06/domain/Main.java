package ar.edu.ort.p1.tp2.act06.domain;

import ar.edu.ort.p1.tp2.act06.classes.Cliente;
import ar.edu.ort.p1.tp2.act06.classes.Frigorifico;
import ar.edu.ort.p1.tp2.act06.classes.Item;
import ar.edu.ort.p1.tp2.act06.classes.Pedido;
import ar.edu.ort.p1.tp2.act06.classes.Producto;
import ar.edu.ort.p1.tp2.act06.classes.Vendedor;
import ar.edu.ort.p1.tp2.act06.enums.TipoPais;

public class Main {

	public static void main(String[] args) {

		// === Crear frigorífico ===
		Frigorifico frigorifico = new Frigorifico();

		// === Agregar vendedores ===
		Vendedor v1 = new Vendedor("V001", "Carlos");
		Vendedor v2 = new Vendedor("V002", "Lucía");
		Vendedor v3 = new Vendedor("V003", "Pedro");

		frigorifico.agregarVendedor(v1);
		frigorifico.agregarVendedor(v2);
		frigorifico.agregarVendedor(v3);

		// === Agregar clientes ===
		Cliente c1 = new Cliente("20-12345678-9", "Carnes del Sur", 11223344, TipoPais.ARGENTINA);
		Cliente c2 = new Cliente("23-87654321-0", "Exportadora Andina", 22334455, TipoPais.CHILE);
		Cliente c3 = new Cliente("24-99887766-5", "FrigoBrasil", 33445566, TipoPais.BRASIL);
		Cliente c4 = new Cliente("25-11112222-3", "Carnes del Este", 44556677, TipoPais.URUGUAY);

		frigorifico.agregarCliente(c1);
		frigorifico.agregarCliente(c2);
		frigorifico.agregarCliente(c3);
		frigorifico.agregarCliente(c4);

		// === Crear productos ===
		Producto p1 = new Producto("P01", "Lomo", 2500.0);
		Producto p2 = new Producto("P02", "Asado", 1800.0);
		Producto p3 = new Producto("P03", "Chorizo", 1200.0);

		// === Crear pedidos ===
		Pedido ped1 = new Pedido(0, c1.getCuit()); // vendedor Carlos (posición 0)
		ped1.agregarItem(new Item(p1, 5)); // 5 lomos
		ped1.agregarItem(new Item(p2, 3)); // 3 asados

		Pedido ped2 = new Pedido(1, c2.getCuit()); // vendedor Lucía (posición 1)
		ped2.agregarItem(new Item(p3, 10)); // 10 chorizos

		Pedido ped3 = new Pedido(0, c3.getCuit()); // vendedor Carlos (posición 0)
		ped3.agregarItem(new Item(p1, 2));
		ped3.agregarItem(new Item(p3, 4));

		Pedido ped4 = new Pedido(2, c4.getCuit()); // vendedor Pedro (posición 2)
		ped4.agregarItem(new Item(p2, 6));

		// === Agregar pedidos al frigorífico ===
		frigorifico.agregarPedido(ped1);
		frigorifico.agregarPedido(ped2);
		frigorifico.agregarPedido(ped3);
		frigorifico.agregarPedido(ped4);

		System.out.println("\n=== INFORME DE CANTIDAD DE PEDIDOS ===");
		frigorifico.informarCantPedidos();

		System.out.println("\n=== CLIENTES POR PAÍS ===");
		frigorifico.mostrarClientesPorPais();

		System.out.println("\n=== PAÍS MÁS RENTABLE ===");
		System.out.println("El país más rentable es: " + frigorifico.paisMasRentable());
	}
}
