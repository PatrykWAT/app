package com.example.app;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {
	public static void main(String[] args) throws MqttException {
		Subscriber.main(args);
		SpringApplication.run(AppApplication.class, args);
	}
}
