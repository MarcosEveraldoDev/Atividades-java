package farmacia;

import java.util.Scanner;

import bean.Medicamento;

public class Farmacia {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String nome1, nome2, nome3;
    String laboratorio1, laboratorio2, laboratorio3;
    String tipo1, tipo2, tipo3;
    int quantity1, quantity2, quantity3;
    int codigo1, codigo2, codigo3;
    Medicamento medicamento1 = new Medicamento();
    Medicamento medicamento2 = new Medicamento();
    Medicamento medicamento3 = new Medicamento();

    System.out.println("Digite o nome do medicamento 1");
    nome1 = sc.next();
    medicamento1.setNome(nome1);

    System.out.println("Digite o codigo do medicamento 1");
    codigo1 = sc.nextInt();
    medicamento1.setCodigo(codigo1);

    System.out.println("Digite o laboratorio do medicamento 1 ");
    laboratorio1 = sc.next();
    medicamento1.setLaboratorio(laboratorio1);

    System.out.println("Digite o tipo do medicamento 1 ");
    tipo1 = sc.next();
    medicamento1.setTipo(tipo1);

    System.out.println("Digite a quantidade do medicamento 1 ");
    quantity1 = sc.nextInt();
    medicamento1.setQuantity(quantity1);

    System.out.println("Digite o nome do medicamento 2 ");
    nome2 = sc.next();
    medicamento2.setNome(nome2);

    System.out.println("Digite o codigo do medicamento 2 ");
    codigo2 = sc.nextInt();
    medicamento2.setCodigo(codigo2);

    System.out.println("Digite o laboratorio do medicamento 2 ");
    laboratorio2 = sc.next();
    medicamento2.setLaboratorio(laboratorio2);

    System.out.println("Digite o tipo do medicamento 2 ");
    tipo2 = sc.next();
    medicamento2.setTipo(tipo2);

    System.out.println("Digite a quantidade do medicamento 2  ");
    quantity2 = sc.nextInt();
    medicamento2.setQuantity(quantity2);

    System.out.println("Digite o nome do medicamento 3 ");
    nome3 = sc.next();
    medicamento3.setNome(nome3);

    System.out.println("Digite o codigo do medicamento 3 ");
    codigo3 = sc.nextInt();
    medicamento3.setCodigo(codigo3);

    System.out.println("Digite o laboratorio do medicamento 3  ");
    laboratorio3 = sc.next();
    medicamento3.setLaboratorio(laboratorio3);

    System.out.println("Digite o tipo do medicamento 3  ");
    tipo3 = sc.next();
    medicamento3.setTipo(tipo3);

    System.out.println("Digite a quantidade do medicamento 3  ");
    quantity3 = sc.nextInt();
    medicamento3.setQuantity(quantity3);

    System.out.println("o nome do medicamento1 é " + medicamento1.getNome());
    System.out.println(" o codigo do medicamento1 é " + medicamento1.getCodigo());
    System.out.println(" o laboratorio do medicamento1 é " + medicamento1.getLaboratorio());
    System.out.println(" o tipo do medicamento1 é " + medicamento1.getTipo());
    System.out.println(" a quantidade do medicamento1 é " + medicamento1.getQuantity());
    System.out.println();

    System.out.println(" o nome  do medicamento2 é " + medicamento2.getNome());
    System.out.println(" o codigo do medicamento2 é " + medicamento2.getCodigo());
    System.out.println(" o laboratorio do medicamento2 é " + medicamento2.getLaboratorio());
    System.out.println(" o tipo do medicamento2 é " + medicamento2.getTipo());
    System.out.println(" a quantidade do medicamento2 é " + medicamento2.getQuantity());
    System.out.println();

    System.out.println(" o nome do medicamento3 é " + medicamento3.getNome());
    System.out.println(" o codigo do medicamento3 é " + medicamento3.getCodigo());
    System.out.println(" o laboratorio do medicamento3 é " + medicamento3.getLaboratorio());
    System.out.println(" o tipo do medicamento3 é " + medicamento3.getTipo());
    System.out.println(" a quantidade do medicamento3 é " + medicamento3.getQuantity());

  }
}
