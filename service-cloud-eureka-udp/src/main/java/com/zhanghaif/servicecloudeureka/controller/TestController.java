package com.zhanghaif.servicecloudeureka.controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;
/**
 * udp服务
 * @author zhanghaifeng
 *
 */
public class TestController {

	private final static int PORT = 8086;
	
	public static void main(String[] args) {
		try (DatagramSocket socket = new DatagramSocket(PORT)) {
            while (true) {
                try {
                    DatagramPacket request = new DatagramPacket(new byte[1024], 1024);
                    socket.receive(request);
                    
                    String daytime = new Date().toString();
                    byte[] data = daytime.getBytes("ASCII");
                    DatagramPacket response = new DatagramPacket(data, data.length, request.getAddress(), request.getPort());
                    socket.send(response);
                    System.out.println(daytime + " " + request.getAddress());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
