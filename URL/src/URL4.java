import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URL4 {

	public static void main(String[] args) {

		System.out.println("URL:");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String pagina;

		try {
			pagina = buf.readLine();
			URL u = new URL(pagina);
			URLConnection uc = u.openConnection();
			String ct = uc.getContentType();
			int cl = uc.getContentLength();
			if (ct.startsWith("text/") || cl == -1) {
				System.out.println("ERROR: Esta URL" + " es de tipo texto");
				return;
			}
			InputStream is = uc.getInputStream();
			BufferedInputStream in = new BufferedInputStream(is);
			String fich = u.getFile();
			fich = fich.substring(fich.lastIndexOf('/') + 1);
			FileOutputStream fout = new FileOutputStream(fich);
			BufferedOutputStream out = new BufferedOutputStream(fout);
			int i;
			while ((i = in.read()) != -1)
				out.write(i);
			out.flush();
			in.close();
			out.close();

		} catch (MalformedURLException e) {
			System.out.println("URL erronea: " + args[0]);
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}

	}

}
