package com.company.inventorycontrolsystem.view.storage;

import com.company.inventorycontrolsystem.entity.Storage;

import io.jmix.flowui.view.DefaultMainViewParent;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "storages/:id", layout = DefaultMainViewParent.class)
@ViewController("ics_Storage.detail")
@ViewDescriptor("storage-detail-view.xml")
@EditedEntityContainer("storageDc")
public class StorageDetailView extends StandardDetailView<Storage> {
}