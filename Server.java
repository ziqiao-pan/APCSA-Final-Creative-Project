package com.bio;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss=new ServerSocket(4797);

        Socket s=ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        FileOutputStream fos = new FileOutputStream("D:\\server1\\"+GetFileName.getFileName()+".txt");


        String line=null;
        while((line=br.readLine())!=null) {
            System.out.println(line);
            fos.write(line.getBytes());
        }
        fos.close();
        MoveFile.copyFolder("D:\\server1","D:\\server2");
    }
}
