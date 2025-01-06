package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;

        int resto = 21 % 2;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
//        System.out.println(isDezMaiorQueVinte);

        boolean isDezIgualAQueVinte = 10 == 20;
//        System.out.println(isDezIgualAQueVinte);

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 3 || salario > 4644;



    int contador = 0;
    contador += 1;
    contador ++;

    System.out.println(contador);

    }
}
