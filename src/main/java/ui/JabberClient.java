package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;


public class JabberClient {
    public static void main(String[] args) throws IOException {


       Socket socket = new Socket("127.0.0.1", 8877);
      
       try {
          System.out.println("socket = " + socket);
          BufferedReader in = new BufferedReader(new InputStreamReader(socket
                .getInputStream()));
          // Вывод автоматически Output быталкивается PrintWriter'ом.
          PrintWriter out = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())), true);
          for (int i = 0; i < 10; i++) {
             out.println("howdy " + i);
             String str = in.readLine();
             System.out.println(str);
          }
          out.println("END");
       }
       finally {
          System.out.println("closing...");
          socket.close();
       }
    }
 }