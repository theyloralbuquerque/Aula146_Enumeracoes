package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusDoPedido;

public class Program {

	public static void main(String[] args) {
		
		// variável pedido do tipo Pedido
		// id(do pedido) = 1080
		// momento = new Date(), chama/executa o valor do instante atual do sistema, ou seja, momento vai receber o instante que o programa for executado como valor..
		// status = StatusDoPedido.AGUARDANDO_PAGAMENTO, ou seja, vai receber o enumerador AGUARDANDO_PAGAMENTO que está na classe enum StatusDoPedido. 
		Pedido pedido = new Pedido(1080, new Date(), StatusDoPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		StatusDoPedido sp1 = StatusDoPedido.ENTREGUE; 
		
		StatusDoPedido sp2 = StatusDoPedido.valueOf("ENTREGUE"); // .valueOf(), converte a String ENTREGUE em enum. 
		
		System.out.println(sp1);
		System.out.println(sp2);
	}

}
