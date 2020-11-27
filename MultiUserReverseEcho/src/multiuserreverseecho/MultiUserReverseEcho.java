/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiuserreverseecho;

import java.net.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nsun3
 */
public class MultiUserReverseEcho extends Thread {

    Socket stk;
    
    public MultiUserReverseEcho(Socket stk) {
        this.stk = stk;
    }
    
    public void run() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
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
            stk.close();
            
        } catch (IOException ex) {
            Logger.getLogger(MultiUserReverseEcho.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(MultiUserReverseEcho.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(2000);
        Socket stk;
        int count = 1;
        MultiUserReverseEcho mure; 
        do {
            stk = ss.accept();
            System.out.println("Client connected: " + count++);
            mure = new MultiUserReverseEcho(stk);
            mure.start();
        }while(true);
        
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
