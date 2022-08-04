public class Teste {
    public static void main(String[] args) throws Exception {
        char turma;
        int valor;
        System.out.println("Por favor, entre com a sua turma na ADS: ");
        valor = System.in.read();
        turma = (char)valor;
        System.out.println("O valor lido foi: " + valor);
        System.out.println("Esse valor representa o caractere: " + turma);
            
    }
}
