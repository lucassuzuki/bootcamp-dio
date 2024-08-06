package pilares;

import pilares.apps.FacebookMessenger;
import pilares.apps.MSNMessenger;
import pilares.apps.ServicoMensagemInstantanea;
import pilares.apps.Telegram;

public class ComputadorLucas {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido="fbm";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
