package com.company.application.view.storagedetail;

import com.company.application.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import com.company.inventorycontrolsystem.view.storage.StorageDetailView;

@Route(value = "storages/:id", layout = MainView.class)
@ViewController("ics_Storage.detail")
@ViewDescriptor("ext-storage-detail-view.xml")
public class ExtStorageDetailView extends StorageDetailView {
}