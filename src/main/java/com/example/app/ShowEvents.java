package com.example.app;

import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class ShowEvents {
        private MainUI mainUI;
        private TextField textField;
        private Button returnButton;
        private VerticalLayout verticalLayout=new VerticalLayout();

        public ShowEvents(MainUI mainUI){
            this.mainUI=mainUI;
            textField=new TextField(Subscriber.list.toString());
            returnButton=new Button("Powrót", clickEvent -> returnToMainUI());
            verticalLayout.addComponents(textField,returnButton);
            mainUI.setContent(verticalLayout);
        }

    private void returnToMainUI() {
        mainUI.setContent(mainUI.getHorizontalLayout());
    }
}
