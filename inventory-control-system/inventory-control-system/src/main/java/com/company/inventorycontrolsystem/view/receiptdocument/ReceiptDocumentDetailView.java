package com.company.inventorycontrolsystem.view.receiptdocument;

import com.company.inventorycontrolsystem.entity.ReceiptDocument;

import io.jmix.flowui.view.DefaultMainViewParent;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "receiptDocuments/:id", layout = DefaultMainViewParent.class)
@ViewController("ics_ReceiptDocument.detail")
@ViewDescriptor("receipt-document-detail-view.xml")
@EditedEntityContainer("receiptDocumentDc")
public class ReceiptDocumentDetailView extends StandardDetailView<ReceiptDocument> {
}