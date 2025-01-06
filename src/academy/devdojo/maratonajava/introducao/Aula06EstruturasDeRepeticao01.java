package academy.devdojo.maratonajava.introducao;

import javax.swing.plaf.IconUIResource;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        int cont = 12;

        while(cont < 10){
            System.out.println(++cont);

        }
        do {
            System.out.println("no DOwhile");

        } while (cont < 10);


        for (int i=0; i<11; i++){
            System.out.println("for"+i);

        }
    }
}
