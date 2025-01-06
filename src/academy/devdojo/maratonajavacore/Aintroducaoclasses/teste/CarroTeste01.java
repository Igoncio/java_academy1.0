package academy.devdojo.maratonajavacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajavacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca azul";
        carro1.ano = 1988;
        carro1.modelo = "TSI";

        carro2.nome = "Konnissieg";
        carro2.modelo = "celta";
        carro2.ano = 2010;

        System.out.println("Carro 1 -");
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);


        System.out.println("\nCarro 2 -");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);
    }
}
