package academy.devdojo.maratonajavacore.Aintroducaometodos.test;

import academy.devdojo.maratonajavacore.Aintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Roberto";
        funcionario.idade = 23;
        funcionario.salario01 = 10;
        funcionario.salario02 = 30;
        funcionario.salario03 = 10;

        funcionario.imprime();
        funcionario.media();
    }
}
