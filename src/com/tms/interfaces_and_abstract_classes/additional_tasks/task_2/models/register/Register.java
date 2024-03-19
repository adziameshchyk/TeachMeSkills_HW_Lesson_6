package com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.register;

import com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents.Document;

public class Register implements Registrable {

    Document[] documents = new Document[10];

    @Override
    public void saveDocumentInRegister(Document document) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = document;
                return;
            }
        }
        System.out.println("Register is full, no space.");
    }

    public void getInformationAboutDocument(int documentId) {
        for (Document document : documents) {
            if (document == null) {
                continue;
            }
            if (document.documentId == documentId) {
                System.out.println(document);
                return;
            }
        }
    }

}
