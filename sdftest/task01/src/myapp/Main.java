package myapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket; 


public class Main{
    public static void main(String[] args){

        // String[] arrSplit = args[0].split(" ");
        String serverName = args[0];
        String serverPort = args[1];

        String name = "Ng Chin Ling";
        String email = "nchinling@gmail.com";
        // System.out.println(arrSplit[0]);
        // System.out.println(arrSplit[1]);
        try{
            // while(true){
                
    
                Socket sock = new Socket(serverName
                    , Integer.parseInt(serverPort));
                System.out.printf("Client started on %s at port %s\n", serverName, serverPort);
            
                // Get the input data from the server program
                InputStream is = sock.getInputStream();
                // DataInputStream dis = new DataInputStream(is);
                ObjectInputStream ois = new ObjectInputStream(is);

                // Write and response
                OutputStream os = sock.getOutputStream();
                // DataOutputStream dos = new DataOutputStream(os);
                ObjectOutputStream oos = new ObjectOutputStream(os);

                //Convert ois.readUTF to String type.
                String data = ois.readUTF();
                System.out.println(data);

                float mean = Calculator.getMean(data);
                System.out.printf("The mean is %f\n", mean);
          
                
                float sd = Calculator.getSd(data);
                System.out.printf("The standard deviation is %f\n",sd);
               
                
                oos.writeUTF(name);
                oos.flush();
                oos.writeUTF(email);
                oos.flush();


                oos.writeFloat(mean);
                oos.flush();
                oos.writeFloat(sd);
                oos.flush();

                System.out.println("Nice!");

            
            // }

            ois.close();
            // dis.close();
            is.close();
            sock.close();

            
        } catch (EOFException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } 

        
    }
}