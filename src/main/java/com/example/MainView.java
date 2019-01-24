package com.example;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends Composite<VerticalLayout> {

    public MainView() {
        getContent().add(
                new Button("Does it work?",
                        e -> Notification.show("Yes, it works!"))
        );
    }

}
