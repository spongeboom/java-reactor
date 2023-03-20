package com.sample.dispatcher;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {

    public static void main(String[] args) {
        System.out.println("Client ON");

        try {
          String message;

          Socket socket = new Socket("127.0.0.1", 5000);
          OutputStream out = socket.getOutputStream();
          message = "0x5001|홍길동|22";
          out.write(message.getBytes());
          socket.close();

          Socket socket2 = new Socket("127.0.0.1", 5000);
          OutputStream out2 = socket2.getOutputStream();
          message = "0x6001|test|1234|홍길동|22|women";
          out2.write(message.getBytes());
          socket2.close();

        } catch (UnknownHostException e){
            e.printStackTrace();
        } catch ( IOException ioe ){
            ioe.printStackTrace();
        }
    }
}
