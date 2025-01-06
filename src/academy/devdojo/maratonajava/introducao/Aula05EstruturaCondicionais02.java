package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main (String[] args){
        String resultado;
        String msgDar = "eu vou dar";
        String msgNaoDar = "nao vou dar";
        double salario = 5000;
        if(salario < 5000){
            resultado = msgDar;
        }else{
            resultado = msgNaoDar;
        }

        System.out.println(resultado);



    }
}
