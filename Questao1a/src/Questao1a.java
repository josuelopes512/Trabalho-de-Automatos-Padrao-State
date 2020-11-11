public class Questao1a{
    
    public void executar(String lang){
        int k = lang.length() - 1, contador = 0, tp = 0;

        if(lang.length() % 2 != 0) {
			System.err.println("Sequencia Invalida\n");
			return;
		}

        for (int i = 0; i <= ((lang.length() - 1)/2); i++) {
            if (lang.charAt(i) == 97 || lang.charAt(k) == 98) {
                if(lang.charAt(i) == lang.charAt(k)){
                    contador++;
                } 
            }
            else{
                tp++;
            }
            k--;
        }

        if(tp != 0) 
            System.err.println("Sequencia Invalida!\n");
        else if(contador == lang.length()/2) 
            System.out.println("Linguagem Aprovada!\n");
        else   
            System.err.println("Sequencia Invalida!\n");

    }
}
