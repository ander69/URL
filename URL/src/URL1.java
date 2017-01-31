import java.net.MalformedURLException;
import java.net.URL;

public class URL1 {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Utilizar : java URLDemo <URL>");
			System.exit(0);
			
		}
		try{
			
			URL u = new URL(args[0]);
			System.out.println("protocolo: "+ u.getProtocol());
			System.out.println("ordenador: "+u.getHost());
			System.out.println("fichero: "+ u.getFile());
			System.out.println("puerto: "+u.getPort());
			System.out.println("ref: "+ u.getRef());
			
		}catch (MalformedURLException e){
			System.out.println("URL error" +args[0]);
		}catch (Exception e) {
			System.out.println("error"+e.getMessage());
		}

	}

}
