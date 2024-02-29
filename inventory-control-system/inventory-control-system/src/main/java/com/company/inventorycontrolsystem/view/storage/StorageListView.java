package com.company.inventorycontrolsystem.view.storage;

import com.company.inventorycontrolsystem.entity.Storage;

import io.jmix.flowui.view.DefaultMainViewParent;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "storages", layout = DefaultMainViewParent.class)
@ViewController("ics_Storage.list")
@ViewDescriptor("storage-list-view.xml")
@LookupComponent("storagesDataGrid")
@DialogMode(width = "64em")
public class StorageListView extends StandardListView<Storage> {
}