package model;


public class Computador {
private String nome, descricao, ip;
private int sala;
private char bloco;


public Computador() {
}

 public Computador(String nome, String descricao, String ip, int sala, char bloco) {
this.nome = nome;
this.descricao = descricao;
this.ip = ip;
this.sala = sala;
this.bloco = bloco;
}

 public String getNome() {
return nome;
}

 public void setNome(String nome) {
this.nome = nome;
}

 public String getDescricao() {
return descricao;
}

 public void setDescricao(String descricao) {
this.descricao = descricao;
}

 public String getIp() {
return ip;
}

 public void setIp(String ip) {
this.ip = ip;
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

 public void setBloco(char andar) {
this.bloco = andar;
}
public String toString() {
return "IP: "+ip+"\nNome: "+nome+"\nDescrição: "+
"\nSala: "+sala+"\nAndar: ";
}

}