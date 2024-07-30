import java.util.Scanner; // biblioteca

public class Aula01 {
    public static void main(String[] args) {
        //TechAcademy03 aula01
        Scanner prompt = new Scanner(System.in);

        System.out.println("Hello World");
        System.out.println("Digite Seu Nome: ");

        String nome = prompt.nextLine();
        System.out.println("Olá " +nome + " Seja Bem-vindo");
    }
}
