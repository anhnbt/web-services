package com.example.ws;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/ws/users", new UserServiceImpl());
		System.out.println("Service is running");
	}
}