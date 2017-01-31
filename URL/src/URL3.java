import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URL3 {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Utilizar : java getCabecera <URL>");
			System.exit(0);
		}
		try{
			URL u = new URL (args[0]);
			URLConnection uc = u.openConnection();
			System.out.println("Tipo de contenido [Content-type]:"+uc.getContentType());
			System.out.println("Codificacion [Content-encoding]:"+uc.getContentEncoding());
			System.out.println("Fecha: "+ new java.util.Date(uc.getDate()));
			System.out.println("Fecha modificacion [Last modified]:"+ new java.util.Date(uc.getLastModified()));
			System.out.println("Fecha expiracion [Experation date]:"+new java.util.Date(uc.getExpiration()));
			System.out.println("Tamaño [Content-length]:"+uc.getContentLength());

		}catch (MalformedURLException e){
			System.out.println("URL erronea: "+ args[0]);
			
		}catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
	}

}