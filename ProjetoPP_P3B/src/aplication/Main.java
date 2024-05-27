package aplication;

import entites.*;
import interfac.Carro;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new CarroBasico();
        Set<Integer> opcoesEscolhidas = new HashSet<>();

        boolean feito = false;

        while (!feito) {
            System.out.println("\nConfiguração Atual do Carro: " + carro.getDescricao());
            System.out.println("Custo Atual: R$ " + carro.getCusto());
            System.out.println("\nEscolha uma opção para adicionar:");
            System.out.println("1. Sistema de Navegação (R$ 7500)");
            System.out.println("2. Bancos de Couro (R$ 12500)");
            System.out.println("3. Sistema de Som Premium (R$ 5000)");
            System.out.println("4. Concluir");
            System.out.print("Digite sua escolha: ");

            int escolha = scanner.nextInt();
            if (escolha >= 1 && escolha <= 3 && opcoesEscolhidas.contains(escolha)) {
                System.out.println("Esta opção já foi adicionada. Por favor, escolha outra opção.");
                continue;
            }

            switch (escolha) {
                case 1:
                    carro = new SistemaDeNavegacao(carro);
                    opcoesEscolhidas.add(escolha);
                    break;
                case 2:
                    carro = new BancosDeCouro(carro);
                    opcoesEscolhidas.add(escolha);
                    break;
                case 3:
                    carro = new SistemaDeSomPremium(carro);
                    opcoesEscolhidas.add(escolha);
                    break;
                case 4:
                    feito = true;
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }

        System.out.println("\nConfiguração Final do Carro: " + carro.getDescricao());
        System.out.println("Custo Total: R$ " + carro.getCusto());
        scanner.close();
    }
}
