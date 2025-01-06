package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {

//        numeros pares ate 1000000
//        for (int i = 0; i <= 1000000; i ++) {
//            if(i % 2 == 0){
//            System.out.println(i);
//            }
//        }

        for(int i = 0; i <= 50; i++){
            if(i <= 25){
                System.out.println(i);
            }
            else {
                break;
            }

        }
    }
}
