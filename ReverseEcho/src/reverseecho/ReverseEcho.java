/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseecho;

import java.net.*;
import java.io.*;

/**
 *
 * @author nsun3
 */
public class ReverseEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        do {
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        } while (!msg.equals("dne"));
        
        ss.close();
        stk.close();
    }
    
}

class Client {

    public static void main(String[] args) throws Exception {
        
        Socket stk = new Socket("192.168.1.67", 2000); // "192.168.1.67" is equal to "localhost"
        
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;

        do {
            //read from keyboard
            msg = keyb.readLine();
            
            //send to serversocker
            ps.println(msg);
            
            //read from serversocker
            msg = br.readLine();
            
            //print the message
            System.out.println("From Server: " + msg);
        } while (!msg.equals("dne"));
        
        stk.close();
    }
    
}
