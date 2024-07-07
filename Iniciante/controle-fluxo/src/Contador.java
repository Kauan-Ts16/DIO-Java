import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INICIO DO PROGRAMA

        // COLETANDO INFORMAÇÕES

        System.out.print("Digite o primeiro Parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo Parâmetro: ");
        int parametroDois = scanner.nextInt();


        // CENÁRIO SEM ERROS

        try {
            contar(parametroUm, parametroDois);
        }

        // CENÁRIO EM QUE O PARÂMETRO 1 É MAIOR QUE O 2

        catch (ParametrosInvalidosException e) {
            System.out.println("erro: "+ e.getMessage());
        }

        // FIM DA EXECUÇÃO

        finally {
            scanner.close();
        }

    }


    // MÉTODO CONTAR

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++ ) {
            System.out.println("Imprimindo o Número :" + i);
        }

    }
}
