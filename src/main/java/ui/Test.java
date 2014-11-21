package ui;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;





import users.dto.User;




public class Test  {
	public void u(String s) throws UnknownHostException, IOException{
		
		System.out.println(s);
		
		 Socket socket = new Socket("127.0.0.1", 2233);
		 
		 
		 OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		
		osw.write(s);
		osw.flush();
		osw.close();
	}
	public void getObject(User user) throws UnknownHostException, IOException{
		user.print();
		
		 Socket socket = new Socket("127.0.0.1", 2233);
		 ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		 oos.writeObject(user);
		
		 oos.flush();
		 oos.close();
	}
	
}
