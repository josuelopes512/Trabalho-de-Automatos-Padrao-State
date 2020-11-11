public class Questao3b {
    public void executar(String lang) {
        int contador0 = 0, contador1 = 0, tm = 0;
        for (int i = 0; i <= (lang.length() - 1); i++) {
            if (lang.charAt(i) == '0' || lang.charAt(i) == '1') {
                if (lang.charAt(i) == '0')
                    contador0++;
                if (lang.charAt(i) == '1')
                    contador1++;
            } else {
                tm++;
            }
        }
        if (tm != 0 || contador0 == 0 || contador1 == 0)
            System.err.println("Linguagem invalida!");
        else if ((contador0 % 2 == 0) && (contador1 % 2 == 0))
            System.out.println("Linguagem Aprovada!");
        else
            System.err.println("Linguagem Invalida!");
    }
}
