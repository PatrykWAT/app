package com.example.app;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import org.springframework.context.annotation.Import;

@SpringUI
@Theme("valo")

public class MainUI extends UI {

    private HorizontalLayout horizontalLayout = new HorizontalLayout();
    private Devices_Service devicesService=new Devices_Service();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        addHeaderInMainUI();
        addButtonsInMainUI();
        setContent(horizontalLayout);
    }

    public HorizontalLayout getHorizontalLayout() {
        return horizontalLayout;
    }

    private void addHeaderInMainUI() {

    }

    private void addButtonsInMainUI() {
        Button devicesManagerButton = new Button("Zarządzaj Urządzeniami", clickEvent -> DeviceManagerUI());
        devicesManagerButton.setResponsive(true);
        devicesManagerButton.setHeight("200px");
        devicesManagerButton.setWidth("200px");


        Button showData = new Button("Pokaz wyniki", clickEvent -> showListOfData());
        showData.setResponsive(true);
        showData.setHeight("200px");
        showData.setWidth("200px");

        horizontalLayout.addComponents(devicesManagerButton, showData);

    }

    private void showListOfData() {
        new ShowEvents(this);
    }

    private void DeviceManagerUI() {
        new DeviceMenagerUI(this);
    }

    public Devices_Service getDevicesService() {
        return devicesService;
    }
}

