package com.example.app;

import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.components.grid.SingleSelectionModel;

import java.util.List;

public class ShowDevicesUI {
    private Grid<Device> gridOfDevice = new Grid<>();
    private MainUI mainUI;
    private List<Device> listofDevices;
    private VerticalLayout verticalLayout = new VerticalLayout();
    private Button deleteButton;
    private Button returnButton;


    public ShowDevicesUI(List<Device> list, MainUI mainUI) {
        this.mainUI=mainUI;
        listofDevices=list;
        showGrid();
    }

    private void showGrid() {
        gridOfDevice.setItems(listofDevices);
        gridOfDevice.addColumn(Device::getDeviceID).setCaption("ID");
        gridOfDevice.addColumn(Device::getDeviceName).setCaption("Nazwa");
        gridOfDevice.addColumn(Device::getDeviceIP).setCaption("IP");
        gridOfDevice.addColumn(Device::getPlatformUseOnDevice).setCaption("Platforma");
        gridOfDevice.addColumn(Device::getVisibilityOfDevice).setCaption("Widzialność");
        returnButton = new Button("Powrót", clickEvent -> returntoMainUI());
        deleteButton = new Button("Usuń", clickEvent -> removeDevice());
        verticalLayout.addComponents(gridOfDevice,returnButton,deleteButton);
        mainUI.setContent(verticalLayout);
    }
    private void removeDevice() {
      int tmp = Integer.parseInt(gridOfDevice.getSelectedItems().toString().substring(1,2));
      mainUI.getDevicesService().removeElement(tmp);
      verticalLayout=new VerticalLayout();
      showGrid();
    }

    private void returntoMainUI() {
        mainUI.setContent(mainUI.getHorizontalLayout());
    }


}
