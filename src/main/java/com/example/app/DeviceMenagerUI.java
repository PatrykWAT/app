package com.example.app;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

public class DeviceMenagerUI  {

    private HorizontalLayout horizontalLayout = new HorizontalLayout();
    private MainUI mainUI;

    public DeviceMenagerUI(MainUI mainUI) {
        this.mainUI=mainUI;
        addButtonsToDevicesManagerUI();
        mainUI.setContent(horizontalLayout);
    }

    public HorizontalLayout getHorizontalLayout() {
        return horizontalLayout;
    }

    private void addButtonsToDevicesManagerUI() {
        Button showAllDevicesButton = new Button("Pokaż urządzenia", clickEvent -> showAllDevices());
        Button addDeviceButton = new Button("Dodaj urzadzenie", clickEvent -> addDevice());
        horizontalLayout.addComponents(showAllDevicesButton, addDeviceButton);
    }


    private void addDevice() {
        horizontalLayout.setVisible(false);
        new AddDeviceUI(this.mainUI);
    }

    private void showAllDevices() {
        new ShowDevicesUI(mainUI.getDevicesService().getDevices(),this.mainUI);
    }


}
