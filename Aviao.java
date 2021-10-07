package Familia36;

import java.util.Date;

public class Aviao {
	
	//declarando atributos
	private String modelo;
	private String empresa;
	private String piloto;
	private String embarque;
	private String destino;
	
	
	//declaração do método especial Construtor
	public Aviao(String modelo, String empresa, String piloto, String embarque, String destino)
	{
		this.modelo = modelo;
		this.empresa = empresa;
		this.piloto = piloto;
		this.embarque = embarque;
		this.destino = destino;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPiloto() {
		return piloto;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getEmbarque() {
		return embarque;
	}

	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	public void imprimir()
	{
		System.out.println("\tDADOS DO VOO \n***************************\nModelo do avião: "+ modelo + "\nEmpresa: " + empresa + "\nPiloto: " + piloto + "\nEmbarque: " + embarque + "\nDestino: " + destino);
	}

}
