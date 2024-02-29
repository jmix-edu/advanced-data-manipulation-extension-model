package com.company.application.view.storagelist;

import com.company.application.app.StorageService;
import com.company.application.entity.ExtStorage;
import com.company.application.view.main.MainView;
import com.company.inventorycontrolsystem.entity.Storage;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import com.company.inventorycontrolsystem.view.storage.StorageListView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "storages", layout = MainView.class)
@ViewController("ics_Storage.list")
@ViewDescriptor("ext-storage-list-view.xml")
public class ExtStorageListView extends StorageListView {
    @Autowired
    private StorageService storageService;

    @Subscribe
    public void onInit(final InitEvent event) {
        List<ExtStorage> extStorages = storageService.fetchExtStorage();

        List<Storage> storages = storageService.fetchStorage();
    }
}