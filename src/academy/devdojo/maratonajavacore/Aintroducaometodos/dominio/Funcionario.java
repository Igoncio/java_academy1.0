package academy.devdojo.maratonajavacore.Aintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario01;
    public double salario02;
    public double salario03;

    public void imprime(){
        System.out.println("nome - "+this.nome);
        System.out.println("idade - "+this.idade);
        System.out.println("salario 01 - "+this.salario01);
        System.out.println("salario 02 - "+this.salario02);
        System.out.println("salario 03 - "+this.salario03);
    }

    public void media(){
        System.out.println("--------------------------");
        double media = (salario01 + salario02 + salario03)/3;
        System.out.println("Media salarial = "+media);
    }
}
