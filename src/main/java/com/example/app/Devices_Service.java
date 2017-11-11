package com.example.app;

import java.util.ArrayList;
import java.util.List;

public class Devices_Service {

    private List<Device> devices = new ArrayList<>();

    public List<Device> getDevices() {
        return devices;
    }

    public void addToDevicesBase(String deviceName, String deviceIP, String platformOnDevice, String visibilityOfDevice){
        int nextID = devices.size()+1;
        devices.add(new Device(nextID,deviceName,deviceIP,platformOnDevice,visibilityOfDevice));
    }
    public void  removeElement(int IDDevice){
        devices.remove(IDDevice-1);
    }
}
