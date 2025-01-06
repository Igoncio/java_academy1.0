package academy.devdojo.maratonajava.introducao;

public class ExerciciosBasicos {
    public static void main(String[] args) {
        String usuario = "admin";
        String senha = "12345";

        if (usuario.equals("admin") && senha.equals("12345")) {
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }

    }
}
