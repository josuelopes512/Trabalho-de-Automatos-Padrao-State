public class Questao3a {
	public void executar(String lang){
		int contador = 0, tm = 0;

		for (int i = 0; i+1 < lang.length() ; i++) {
			if(lang.charAt(i) ==  111 || lang.charAt(i) == 107){
				if((lang.charAt(i) == 111) && (lang.charAt(i+1) == 107)){
					contador++;
				}
			}
			else{
				tm++;
			}
		}

		if(tm != 0 || contador == 0){
			System.err.println("Linguagem invalida!");
		} 
        else if(contador >= 1){
			System.out.println("Linguagem Aprovada!");
		} 
	}
}
