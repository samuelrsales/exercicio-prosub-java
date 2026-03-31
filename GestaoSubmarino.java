import java.util.Scanner;

public class GestaoSubmarino {
    public static void main(String[] args) {
        double repasse;
        Scanner scanner = new Scanner(System.in);


        System.out.println("--- SISTEMA DE COMANDO PROSUB 2026 ---");
        System.out.println("Informe o repasse anual (em bilhões): ");
        repasse = scanner.nextDouble();
        scanner.nextLine();

        if (repasse < 0.5) {
            System.out.println("Status: ALERTA: Risco de paralisação total. Data estimada: 2045");
        } else if (repasse >= 0.5 && repasse <= 1) {
            System.out.println("Status: Ritmo lento: Finalização prevista para 2037");
        } else if (repasse > 1) {
            System.out.println("Projeto acelerado: Possibilidade de antecipação da entrega");
        }

        
        String codigoPais;
        String nivelAcesso;

        System.out.println("Informe o país de origem da solicitação: ");
        codigoPais = scanner.nextLine();
        
        System.out.println("Nível de acesso solicitado: ");
        nivelAcesso = scanner.nextLine();
        
        if (nivelAcesso.equalsIgnoreCase("total") && !codigoPais.equalsIgnoreCase("brasil")) {
            System.out.println("ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados");
        } else {
            System.out.println("Acesso autorizado ao Almirantado");
        }
        
        double temperaturaReator;
        System.out.println("Digite a temperatura do Reator: ");
        temperaturaReator =  scanner.nextDouble();

        if (temperaturaReator < 280) {
            System.out.println("STATUS: Aumentar potência do reator");
        } else if (temperaturaReator <= 280 && temperaturaReator >= 350) {
            System.out.println("STATUS: Operação Normal - Cruzeiro");
        } else if (temperaturaReator > 350) {
            System.out.println("STATUS: EMERGÊNCIA: Acionar sistema de resfriamento e emergência");
        }

        scanner.close();
    }
}