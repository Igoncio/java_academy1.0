package academy.devdojo.maratonajavacore.Aintroducaometodos.test;

import academy.devdojo.maratonajavacore.Aintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(15);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
