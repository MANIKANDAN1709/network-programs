import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*; 
import java.lang.Process;
public class PingIP {

  public static void runSystemCommand(String command) {

		try {
			Runtime r = Runtime.getRuntime(); 								// creating the process
			Process p = r.exec(command);      								//execute the process method
			InputStreamReader sc=new InputStreamReader(p.getInputStream()); //create a object for inputstram reader and get the input
			BufferedReader inputStream = new BufferedReader(sc); 			//pass the input streamobject value to store the data in bufferreader

			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a domain: ");  
        String ip= sc.nextLine();   
		runSystemCommand("ping " + ip);

	
	}
}