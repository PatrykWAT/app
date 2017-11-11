package com.example.app;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
  public static List<String> list = new ArrayList<String>();

  public static void main(String[] args) throws MqttException {

    System.out.println("== START SUBSCRIBER ==");

    MqttClient client=new MqttClient("tcp://localhost:1883", MqttClient.generateClientId());
    client.setCallback( new SimpleMqttCallBack() );
    client.connect();

    client.subscribe("iot_data");

  }

  public static void addToList(String element){
      list.add(element);
  }

}
