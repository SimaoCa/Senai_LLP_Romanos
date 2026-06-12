import java.util.Scanner;

public class RomanoParaInt {

    public static int AlgarismoRomanoParaInteiro(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int atual = valorRomano(s.charAt(i));

            if (i < s.length() - 1) {

                int proximo = valorRomano(s.charAt(i + 1));

                if (atual < proximo) {
                    total -= atual;
                } else {
                    total += atual;
                }

            } else {
                total += atual;
            }
        }

        return total;
    }

    public static int valorRomano(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        // Passando argumento pela linha de comando
        if (args.length > 0) {
            String algarismos = String.join("", args);
            int valor = AlgarismoRomanoParaInteiro(algarismos);
            System.out.println(valor);
            return;
        }

        // Entrada pelo teclado
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o algarismo romano: ");
        String algarismos = sc.nextLine().toUpperCase();

        int valor = AlgarismoRomanoParaInteiro(algarismos);

        System.out.println("Valor inteiro: " + valor);

        sc.close();
    }
}