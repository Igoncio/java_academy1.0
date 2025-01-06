package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimenssionais01 {
    public static void main(String[] args) {

        int[][] dias = new int [3][3];
        dias [0] [0] = 31;
        dias [0] [1] = 32;
        dias [0] [2] = 33;

        dias [1] [0] = 21;
        dias [1] [1] = 22;
        dias [1] [2] = 23;

//        for (int i = 0; i < dias.length; i++){
//            for (int j = 0; j< dias[0].length; j++){
//                System.out.println(dias[i][j]);
//            }
//        }

        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
