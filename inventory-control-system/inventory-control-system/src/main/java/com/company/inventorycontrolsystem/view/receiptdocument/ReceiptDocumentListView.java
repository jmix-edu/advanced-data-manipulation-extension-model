package com.company.inventorycontrolsystem.view.receiptdocument;

import com.company.inventorycontrolsystem.entity.ReceiptDocument;

import io.jmix.flowui.view.DefaultMainViewParent;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "receiptDocuments", layout = DefaultMainViewParent.class)
@ViewController("ics_ReceiptDocument.list")
@ViewDescriptor("receipt-document-list-view.xml")
@LookupComponent("receiptDocumentsDataGrid")
@DialogMode(width = "64em")
public class ReceiptDocumentListView extends StandardListView<ReceiptDocument> {
}