package aula2;

//Atributos
// - marca String
// - modelo String
// - ano int
// - km
// - cor
// - placa
// - status (sim ou nao)
// - velocidade

public class Carro {
	
	// Atributos
	 private String marca;
	 private String modelo;
	 private int ano;
	 private int km;
	 private String cor;
	 private String placa;
	 private boolean status;
	 
	 // Construtores
	 // caso todos os atributos tenham que ser informados, não há motivo em criar um construtor onde apenas alguns atributos são informados.
	 public Carro(String marca, String modelo, int ano) {
		 this.marca = marca;
		 this.modelo = modelo;
		 this.ano = ano;
	 }
	 
	 // este construtor não admite valores nulos, já que temos que informar todos os atributos.
	 public Carro(String marca, String modelo, int ano, int km, String cor, String placa, boolean status) {
		 this.marca = marca;
		 this.modelo = modelo;
		 this.ano = ano;
		 this.km = km;
		 this.cor = cor;
		 this.placa = placa;
		 this.status = status;
	 }
	 
	 // métodos getters (acessores) e setters (modificadores)
	 public String getMarca() {
		 return marca;
	 }
	 public void setMarca(String marcaNova) {
		 this.marca = marcaNova;
	 }
	 
	 public String getModelo() {
		 return modelo;
	 }
	 public void setModelo(String modeloNovo) {
		 this.modelo = modeloNovo;
	 }
	 
	 public int getAno() {
		 return ano;
	 }
	 public void setAno(int anoNovo) {
		 this.ano = anoNovo;
	 }
	 
	 public int getKm() {
		 return km;
	 }
	 public void setKm(int kmNovo) {
		 this.km = kmNovo;
	 }
	 
	 public String getCor() {
		 return cor;
	 }
	 public void setCor(String corNova) {
		 this.cor = corNova;
	 }
	 
	 public String getPlaca() {
		 return placa;
	 }
	 public void setPlaca(String placaNova) {
		 this.placa = placaNova; 
	 }
	 
	 public boolean isStatus() {
		 return status;
	 }
	 public void setStatus(boolean statusNovo) {
		 this.status = statusNovo;
	 }
}