package com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents;

import java.util.Date;

public class GoodsSupplyContract extends Document {

    String productType;
    int productQuantity;

    public GoodsSupplyContract(Date documentDate, String productType, int productQuantity) {
        super(documentDate);
        this.productType = productType;
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "GoodsSupplyContract{" +
                "productType='" + productType + '\'' +
                ", productQuantity=" + productQuantity +
                ", documentId=" + documentId +
                ", documentDate=" + documentDate +
                '}';
    }
}
