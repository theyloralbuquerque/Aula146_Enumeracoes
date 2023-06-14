package entities;

import java.util.Date;

import entities.enums.StatusDoPedido;

public class Pedido {
	
	private Integer id; // atributo id do tipo Integer.
	private Date momento; // atributo momento do tipo Date.
	private StatusDoPedido status; // atributo status do tipo StatusDoPedido.
	
	public Pedido() { // construtor padrão.
		
	}

	public Pedido(Integer id, Date momento, StatusDoPedido status) { // construtor com argumentos
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() { // get
		return id;
	}

	public void setId(Integer id) { // set
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}
	
	public String toString() { // toString
		return "Pedido: " + id + "\n" +
			   "Momento: " + momento + "\n" + 
			   "Status: " + status;
	}
	

	
}
