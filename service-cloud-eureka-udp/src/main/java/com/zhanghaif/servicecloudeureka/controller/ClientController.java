package com.zhanghaif.servicecloudeureka.controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientController {

	 	private final static int PORT = 8086;
	 	
	    private static final String HOSTNAME = "localhost";
	    
	    
	    public static void main(String[] args) {
	        //传入0表示让操作系统分配一个端口号
	        try (DatagramSocket socket = new DatagramSocket(0)) {
	            socket.setSoTimeout(10000);
	            InetAddress host = InetAddress.getByName(HOSTNAME);
	            //指定包要发送的目的地
	            DatagramPacket request = new DatagramPacket(new byte[1], 1, host, PORT);
	            //为接受的数据包创建空间
	            DatagramPacket response = new DatagramPacket(new byte[1024], 1024);
	            socket.send(request);
	            socket.receive(response);
	            String result = new String(response.getData(), 0, response.getLength(), "ASCII");
	            System.out.println(result);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
}
