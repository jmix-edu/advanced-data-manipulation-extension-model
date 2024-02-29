package com.company.inventorycontrolsystem.view.shipper;

import com.company.inventorycontrolsystem.entity.Shipper;

import io.jmix.flowui.view.DefaultMainViewParent;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "shippers", layout = DefaultMainViewParent.class)
@ViewController("ics_Shipper.list")
@ViewDescriptor("shipper-list-view.xml")
@LookupComponent("shippersDataGrid")
@DialogMode(width = "64em")
public class ShipperListView extends StandardListView<Shipper> {
}