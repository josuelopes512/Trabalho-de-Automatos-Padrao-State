public class Questao1b {
	public void teste(int k) {
	       float x = 0;
	       x = (float) Math.sqrt(k);
	       if(x == (int)x){
	           System.out.println("Linguagem Aprovada!\n");
	       }
	       else{
	           System.err.println("Sequencia Invalida\n");
	       }
	    }
	public void executar(String lang) {
        for(int i = 0; i < lang.length(); i++){
            if(lang.charAt(i) != 'a'){
                System.err.println("Sequencia Invalida\n");
			    return;
            }
        }
        teste(lang.length());  
    }
}