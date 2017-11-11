package com.example.app;

import com.vaadin.ui.*;
public class AddDeviceUI {

    private VerticalLayout verticalLayout = new VerticalLayout();
    private TextField nameOfDevice = new TextField("Nazwa Urządznia");
    private TextField IPofDevice = new TextField("IP");
  //  private NativeSelect<Platforms> platformsNativeSelect = new NativeSelect<>("Platforma");
    private NativeSelect<String> platformsNativeSelect = new NativeSelect<>("Platforma");
    // private RadioButtonGroup<VisibilityOfDevice> radioButtonGroup = new RadioButtonGroup<>("Status Prywatności");
    private RadioButtonGroup<String> radioButtonGroup = new RadioButtonGroup<>("Status Prywatności");
    private Button saveButton = new Button("Dodaj", clickEvent -> Save());
    private MainUI mainUI;

    public AddDeviceUI(MainUI mainUI) {
        this.mainUI=mainUI;
        platformsNativeSelect.setItems("Ardruino","Edison");
        radioButtonGroup.setItems("Publiczny", "Prywatny");
        addInteractionField();
    }

    private void addInteractionField() {
        verticalLayout.addComponents(nameOfDevice, IPofDevice, platformsNativeSelect, radioButtonGroup, saveButton);
        verticalLayout.setVisible(true);
        mainUI.setContent(verticalLayout);
    }

    private void Save() {
        mainUI.getDevicesService().addToDevicesBase(nameOfDevice.getValue(),
                IPofDevice.getValue(),
                platformsNativeSelect.getValue(),
                radioButtonGroup.getValue());
        mainUI.setContent(mainUI.getHorizontalLayout());
    }
}
