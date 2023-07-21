package org.example;

public class Main {

    private static  String[][] dadosPessoas = new String[][]{
            {"Ana", "Paulo", "Márcia", "Pedro", "Beatriz"},
            {"1.70", "1.72", "1.62", "1.90", "1.53" },
            {"80", "90", "61", "84", "49"}
    };
    
    private static float[] dadosIMC = new float[dadosPessoas[0].length];
    public static void main(String[] args) {

        // Calcula IMC
        calculaIMC();
        //Imprime tabela de dados
        imprimeDados();
        // A média aritmética de altura
        calculaMediaAltura();
        // A média aritmética de peso
        calculaMediaPeso();
        // O nome e IMC de cada uma das pessoas
        imprimeIMC();
        // O nome da pessoa mais alta e sua altura
        informaPessoaMaisAlta();
        // O nome da pessoa mais baixa e sua altura
        informaPessoaMaisBaixa();
        // O nome da pessoa mais pesada e seu peso
        informaPessoaMaisPesada();
        // O nome da pessoa mais leve e seu peso
        informaPessoaMaisLeve();
        // O nome da pessoa com o maior IMC e seu valor
        informaPessoaMaiorIMC();
        // O nome da pessoa com o menor IMC e seu valor
        informaPessoaMenorIMC();
    }

    private static void imprimeDados() {
        System.out.println("------------------------------------------");
        System.out.println("     NOME     ALTURA     PESO     IMC     ");
        System.out.println("------------------------------------------");
        for (int i = 0; i < dadosPessoas[0].length; i++) {
            System.out.printf("%9s      %s       %s      %.2f%n", dadosPessoas[0][i], dadosPessoas[1][i], dadosPessoas[2][i], dadosIMC[i]);
        }
        System.out.println("------------------------------------------");

    }

    private static void calculaMediaAltura(){
        float somaAlturas = 0;
        for (int i = 0; i < dadosPessoas[1].length; i++){
            somaAlturas += Float.parseFloat(dadosPessoas[1][i]);
        }
        float mediaAltura = somaAlturas/dadosPessoas[1].length;
        System.out.printf("A média aritmética das alturas é %.2f%n%n", mediaAltura);
    }

    private static void calculaMediaPeso(){
        float somaPesos = 0;
        for (int i = 0; i < dadosPessoas[2].length; i++){
            somaPesos += Float.parseFloat(dadosPessoas[2][i]);
        }
        float mediaPeso = somaPesos/dadosPessoas[2].length;
        System.out.printf("A média aritmética de peso é %.2f%n%n", mediaPeso);
    }

    private static void calculaIMC(){
        float imc;
        float peso;
        float altura;

        for (int i = 0; i < dadosPessoas[0].length; i++){
            peso = Float.parseFloat(dadosPessoas[2][i]);
            altura = Float.parseFloat(dadosPessoas[1][i]);
            imc = (altura*altura)/peso;
            dadosIMC[i] = imc;
        }
    }

    private static void imprimeIMC(){
        for (int i = 0; i < dadosPessoas[0].length; i++){
            System.out.printf("Nome: %s - IMC: %.2f%n", dadosPessoas[0][i], dadosIMC[i]);
        }
        System.out.println("");
    }

    private static void informaPessoaMaisAlta(){
        float maiorAltura = Float.parseFloat(dadosPessoas[1][0]);
        String pessoaMaisAlta = dadosPessoas[0][0];

        for (int i = 1; i < dadosPessoas[0].length; i++) {
            if (Float.parseFloat(dadosPessoas[1][i]) > maiorAltura) {
                maiorAltura = Float.parseFloat(dadosPessoas[1][i]);
                pessoaMaisAlta = dadosPessoas[0][i];
            }
        }

        System.out.printf("A pessoa mais alta é %s, sua altura é %.2f%n%n", pessoaMaisAlta, maiorAltura);
    }

    private static void informaPessoaMaisBaixa(){
        float menorAltura = Float.parseFloat(dadosPessoas[2][0]);
        String pessoaMaisBaixa = dadosPessoas[0][0];

        for (int i = 1; i < dadosPessoas[0].length; i++) {
            if (Float.parseFloat(dadosPessoas[1][i]) < menorAltura) {
                menorAltura = Float.parseFloat(dadosPessoas[1][i]);
                pessoaMaisBaixa = dadosPessoas[0][i];
            }
        }

        System.out.printf("A pessoa mais baixa é %s, sua altura é %.2f%n%n", pessoaMaisBaixa, menorAltura);
    }

    private static void informaPessoaMaisPesada(){
        int maiorPeso = Integer.parseInt(dadosPessoas[2][0]);
        String pessoaMaisPesada = dadosPessoas[0][0];

        for (int i = 1; i < dadosPessoas[0].length; i++) {
            if (Integer.parseInt(dadosPessoas[2][i]) > maiorPeso) {
                maiorPeso = Integer.parseInt(dadosPessoas[2][i]);
                pessoaMaisPesada = dadosPessoas[0][i];
            }
        }

        System.out.printf("A pessoa mais pesada é %s, seu peso é %d%n%n", pessoaMaisPesada, maiorPeso);
    }

    private static void informaPessoaMaisLeve(){
        int menorPeso = Integer.parseInt(dadosPessoas[2][0]);
        String pessoaMaisLeve = dadosPessoas[0][0];

        for (int i = 1; i < dadosPessoas[0].length; i++) {
            if (Integer.parseInt(dadosPessoas[2][i]) < menorPeso) {
                menorPeso = Integer.parseInt(dadosPessoas[2][i]);
                pessoaMaisLeve = dadosPessoas[0][i];
            }
        }

        System.out.printf("A pessoa mais leve é %s, seu peso é %d%n%n", pessoaMaisLeve, menorPeso);
    }

    private static void informaPessoaMaiorIMC(){
        float maiorIMC = Float.parseFloat(dadosPessoas[1][0]);
        String pessoaMaiorIMC = dadosPessoas[0][0];

        for (int i = 1; i < dadosPessoas[0].length; i++) {
            if (dadosIMC[i] > maiorIMC) {
                maiorIMC = dadosIMC[i];
                pessoaMaiorIMC = dadosPessoas[0][i];
            }
        }

        System.out.printf("A pessoa com maior IMC é %s, seu IMC é %.2f%n%n", pessoaMaiorIMC, maiorIMC);
    }

    private static void informaPessoaMenorIMC(){
        float menorIMC = dadosIMC[0];
        String pessoaMenorIMC = dadosPessoas[0][0];

        for (int i = 1; i < dadosIMC.length; i++) {
            if (dadosIMC[i] < menorIMC) {
                menorIMC = dadosIMC[i];
                pessoaMenorIMC = dadosPessoas[0][i];
            }
        }

        System.out.printf("A pessoa com menor IMC é %s, seu IMC é %.2f%n%n", pessoaMenorIMC, menorIMC);
    }
}