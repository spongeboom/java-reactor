package com.sample.dispatcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerInitializer {

    public static void main(String[] args) {
        int port = 5000;
        System.out.println("Server ON : "+ port);

        try {
            ServerSocket socket = new ServerSocket(port);
            Dispatcher dispatcher = new Dispatcher();

            while (true){
                dispatcher.dispatch(socket);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
