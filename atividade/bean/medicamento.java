package bean;

public class medicamento {

  public int codigo;
  public String nome;
  public String laboratorio;
  public String tipo;
  public int quantity;

  public void Medicamento() {

  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getCodigo() {
    return codigo;

  }

  public void setNome(String nome) {
    this.nome = nome;

  }

  public String getNome() {
    return nome;

  }

  public void setLaboratorio(String laboratorio) {
    this.laboratorio = laboratorio;

  }

  public String getLaboratorio() {
    return laboratorio;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;

  }

  public String getTipo() {
    return tipo;

  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;

  }

  public int getQuantity() {
    return quantity;
  }

}
