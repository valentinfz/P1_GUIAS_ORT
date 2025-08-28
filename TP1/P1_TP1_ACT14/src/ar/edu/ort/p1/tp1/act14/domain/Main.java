package ar.edu.ort.p1.tp1.act14.domain;

import ar.edu.ort.p1.tp1.act14.classes.CocinaCocinero;
import ar.edu.ort.p1.tp1.act14.classes.ItemBebida;
import ar.edu.ort.p1.tp1.act14.classes.ItemPlato;
import ar.edu.ort.p1.tp1.act14.classes.Mesa;
import ar.edu.ort.p1.tp1.act14.classes.Pedido;
import ar.edu.ort.p1.tp1.act14.classes.Restaurante;
import ar.edu.ort.p1.tp1.act14.classes.SalonMozo;
import ar.edu.ort.p1.tp1.act14.enums.EstadoMesa;
import ar.edu.ort.p1.tp1.act14.enums.TipoCategoria;
import ar.edu.ort.p1.tp1.act14.enums.TipoMetodoPago;

public class Main {
	public static void main(String[] args) {
		// Crear restaurante
		Restaurante restaurante = new Restaurante();

		// Crear mesas
		Mesa mesa1 = new Mesa(1, 4, EstadoMesa.LIBRE);
		Mesa mesa2 = new Mesa(2, 6, EstadoMesa.LIBRE);
		restaurante.agregarMesa(mesa1);
		restaurante.agregarMesa(mesa2);

		// Crear empleados
		SalonMozo mozo1 = new SalonMozo("Juan Pérez", 1001, "2020-01-01", "09:00", "17:00",
				TipoCategoria.MOZO_DE_INTERIORES);
		CocinaCocinero cocinero1 = new CocinaCocinero("Ana Gómez", 2001, "2019-06-01", "SeguroART", 5);
		CocinaCocinero cocinero2 = new CocinaCocinero("Luis Martínez", 2002, "2018-03-15", "SeguroART", 8);
		restaurante.agregarEmpleado(mozo1);
		restaurante.agregarEmpleado(cocinero1);
		restaurante.agregarEmpleado(cocinero2);

		// Crear ítems del menú
		ItemPlato plato1 = new ItemPlato("Ensalada", 500.0, "Ensalada verde", true, false); // Vegano
		ItemPlato plato2 = new ItemPlato("Pizza", 800.0, "Pizza sin gluten", false, true); // Celíaco
		ItemBebida bebida1 = new ItemBebida("Agua", 200.0, 500, false); // Sin alcohol
		ItemBebida bebida2 = new ItemBebida("Cerveza", 300.0, 330, true); // Con alcohol
		restaurante.agregarItem(plato1);
		restaurante.agregarItem(plato2);
		restaurante.agregarItem(bebida1);
		restaurante.agregarItem(bebida2);

		// Crear pedidos y asignarlos
		Pedido pedido1 = new Pedido(mesa1, mozo1, cocinero1, TipoMetodoPago.EFECTIVO);
		pedido1.agregarProducto(plato1); // Ensalada, 0% descuento (vegano)
		pedido1.agregarProducto(bebida1); // Agua, 10% descuento
		pedido1.agregarProducto(bebida1); // Otra agua
		cocinero1.asignarPedido(pedido1); // Asignar explícitamente

		Pedido pedido2 = new Pedido(mesa1, mozo1, cocinero1, TipoMetodoPago.CREDITO);
		pedido2.agregarProducto(plato2); // Pizza, 0% descuento (crédito)
		pedido2.agregarProducto(bebida2); // Cerveza
		cocinero1.asignarPedido(pedido2); // Asignar explícitamente

		Pedido pedido3 = new Pedido(mesa2, mozo1, cocinero2, TipoMetodoPago.EFECTIVO);
		pedido3.agregarProducto(bebida1); // Agua
		pedido3.agregarProducto(bebida2); // Cerveza
		pedido3.agregarProducto(bebida2); // Otra cerveza
		cocinero2.asignarPedido(pedido3); // Asignar explícitamente

		// Pruebas
		System.out.println("=== Prueba B: Pedidos por cocinero (legajo 2001) ===");
		restaurante.mostrarPedidosDelCocinero(2001);

		System.out.println("\n=== Prueba C: Liberar mesa 1 ===");
		restaurante.liberarMesa(1);

		System.out.println("\n=== Prueba D: Pedido con más bebidas (EFECTIVO) ===");
		Pedido pedidoMasBebidas = restaurante.pedidoConMasBebidas(TipoMetodoPago.EFECTIVO);
		if (pedidoMasBebidas != null) {
			System.out.println(pedidoMasBebidas);
		} else {
			System.out.println("No hay pedidos con método EFECTIVO");
		}
	}
}
