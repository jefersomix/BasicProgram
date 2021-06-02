package model;

public class Computador {
	private String nome, ip, descricao;
	private double memoria;
	int sala;
	char bloco;

	public Computador() {

	}

	public Computador(String ip) {
		this.ip = ip;
	}

	public Computador(String nome, String ip, String descricao, double memoria, int sala, char bloco) {
		super();
		this.nome = nome;
		this.ip = ip;
		this.descricao = descricao;
		this.memoria = memoria;
		this.sala = sala;
		this.bloco = bloco;
	}

	public Computador(String nome, String descricao, double memoria, int sala, char bloco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.memoria = memoria;
		this.sala = sala;
		this.bloco = bloco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public char getBloco() {
		return bloco;
	}

	public void setBloco(char bloco) {
		this.bloco = bloco;
	}
		
	public String toString() {
		return "\nNome: "+nome+
		"\nIP: "+ip;
		}
	

}
