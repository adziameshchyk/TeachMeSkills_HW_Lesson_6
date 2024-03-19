package com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.register;

import com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents.Document;

public class Register {

    Document[] documents = new Document[10];


    public void saveDocumentInRegister(Document document) {

    }

    public void getInformationAboutDocument(Document document) {
        System.out.println(document.toString());
    }

}
