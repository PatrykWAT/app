package com.example.app;

import java.util.ArrayList;
import java.util.List;

public class Device {
    private int deviceID;
    private String deviceName;
    private String deviceIP;
    private String platformUseOnDevice;
    private List<String> installedApplicationOnDevice = new ArrayList<>();
    private String visibilityOfDevice;
    private String connectionStatus;

    public Device(int deviceID, String deviceName, String deviceIP, String platformUseOnDevice,
                  String visibilityOfDevice) {
        this.deviceID = deviceID;
        this.deviceName = deviceName;
        this.deviceIP = deviceIP;
        this.platformUseOnDevice = platformUseOnDevice;
        this.visibilityOfDevice = visibilityOfDevice;
        this.connectionStatus = "OFFLINE";
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceIP() {
        return deviceIP;
    }

    public void setDeviceIP(String deviceIP) {
        this.deviceIP = deviceIP;
    }

    public String getPlatformUseOnDevice() {
        return platformUseOnDevice;
    }

    public void setPlatformUseOnDevice(String platformUseOnDevice) {
        this.platformUseOnDevice = platformUseOnDevice;
    }

    public List<String> getInstalledApplicationOnDevice() {
        return installedApplicationOnDevice;
    }

    public void setInstalledApplicationOnDevice(List<String> installedApplicationOnDevice) {
        this.installedApplicationOnDevice = installedApplicationOnDevice;
    }

    public String getVisibilityOfDevice() {
        return visibilityOfDevice;
    }

    public void setVisibilityOfDevice(String visibilityOfDevice) {
        this.visibilityOfDevice = visibilityOfDevice;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }
    @Override
    public String toString(){
        return Integer.toString(deviceID);
    }
}
