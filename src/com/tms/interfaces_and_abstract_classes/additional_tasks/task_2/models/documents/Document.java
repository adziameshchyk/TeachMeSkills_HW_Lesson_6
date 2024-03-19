package com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents;

import java.util.Date;

public abstract class  Document {

    static int documentIdCount = 1;
    int documentId;
    Date documentDate;

    public Document() {
    }

    public Document(Date documentDate) {
        this.documentId = documentIdCount++;
        this.documentDate = documentDate;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId=" + documentId +
                ", documentDate=" + documentDate +
                '}';
    }
}
