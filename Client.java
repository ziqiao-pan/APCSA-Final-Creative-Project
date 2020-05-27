package com.bio;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket s=new Socket(InetAddress.getLocalHost(),4797);

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line=null;
        while((line=sc.nextLine())!=null) {

            if("#".equals(line))
                break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        CloseSocket.close(s);
    }

}
