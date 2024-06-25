import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        // O usuário para digitar o primeiro número
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        
        // O usuário para digitar o segundo número
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            // O método começará a contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Se os números estiverem errados, mostramos a mensagem de erro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    // Este método faz a contagem de um número até o outro
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Se o primeiro número for maior que o segundo, lançamos um erro
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Calculamos quantas vezes vamos contar
        int contagem = parametroDois - parametroUm;

        // Contamos de 1 até a quantidade calculada
        for (int i = 1; i <= contagem; i++) {
            // Imprimimos cada número na tela
            System.out.println("Imprimindo o número " + i);
        }
    }
}

