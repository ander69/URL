import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URL2 {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Utilizar : java URLDemo <URL>");
			System.exit(0);
			
		}
		try{
			URL u = new URL(args[0]);
			BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));
			String linea;
			
			while ((linea = in.readLine())!= null)
				System.out.println(linea);
			in.close();
			
		}catch (MalformedURLException e){
			System.out.println("URL error" +args[0]);
		}catch (Exception e) {
			System.out.println("error"+e.getMessage());
		}

	}	

	

}
