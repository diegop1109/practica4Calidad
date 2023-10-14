package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	private String titular;
	private String numero;
	private double Saldo;
	private List movimientos=new ArrayList<Movimiento>();
	

	public Cuenta(double saldo, String titular, String numero) {
		super();
		Saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public void Ingresar(double i) {
		this.setSaldo(this.getSaldo()+i);
	}

	public void Retirar(double i) {
		if ((this.getSaldo()-i>=-500) & (i>0)) this.setSaldo(this.getSaldo()-i);
		else System.out.println("no es posible retirar "+i+" debido a fondos insuficientes");
	}

}
