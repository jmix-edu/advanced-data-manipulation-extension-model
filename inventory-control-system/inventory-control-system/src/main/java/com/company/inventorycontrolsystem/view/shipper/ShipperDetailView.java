package com.company.inventorycontrolsystem.view.shipper;

import com.company.inventorycontrolsystem.entity.Shipper;

import io.jmix.flowui.view.DefaultMainViewParent;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "shippers/:id", layout = DefaultMainViewParent.class)
@ViewController("ics_Shipper.detail")
@ViewDescriptor("shipper-detail-view.xml")
@EditedEntityContainer("shipperDc")
public class ShipperDetailView extends StandardDetailView<Shipper> {
}