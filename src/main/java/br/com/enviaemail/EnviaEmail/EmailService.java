package br.com.enviaemail.EnviaEmail;


import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	
	public void enviar(String nome, String emailDestinatario) {
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthentication("junior.r.solo@gmail.com", "");
			email.setSSLOnConnect(true);
			
			email.setFrom("junior.solo@hotmail.com");
			email.setSubject("Você foi convidado pelo ListaVIP");
			email.setMsg("Olá " + nome + "você acaba de ser convidado pelo ListaVip.");
			email.addTo(emailDestinatario);
			email.send();
		}catch (Exception e) {
		 e.getStackTrace();
		}
		
	}
}
