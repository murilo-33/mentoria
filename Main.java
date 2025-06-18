import java.util.Scanner;
class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        double media1oBimestre, media2oBimestre, media1oSemestre;
        double media3oBimestre, media4oBimestre, media2oSemestre;
        double mediaFinal;
        System.out.println("Digite as 8 notas anuais do aluno:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        media1oBimestre = (notas[0] + notas[1]) / 2;
        media2oBimestre = (notas[2] + notas[3]) / 2;
        media3oBimestre = (notas[4] + notas[5]) / 2;
        media4oBimestre = (notas[6] + notas[7]) / 2;
        media1oSemestre = (media1oBimestre + media2oBimestre) / 2;
        media2oSemestre = (media3oBimestre + media4oBimestre) / 2;
        mediaFinal = (media1oSemestre + media2oSemestre) / 2;
        System.out.println("\nResultados:");
        System.out.println("Práticas");
        System.out.println("1º Bimestre: " + media1oBimestre);
        System.out.println("2º Bimestre: " + media2oBimestre);
        System.out.println("1º Semestre: " + media1oSemestre);
        System.out.println("----------------------");
        System.out.println("3º Bimestre: " + media3oBimestre);
        System.out.println("4º Bimestre: " + media4oBimestre);
        System.out.println("2º Semestre: " + media2oSemestre);
        System.out.println("-----------------------");
        System.out.println("Média Final: " + mediaFinal);

        scanner.close();
    }
}
