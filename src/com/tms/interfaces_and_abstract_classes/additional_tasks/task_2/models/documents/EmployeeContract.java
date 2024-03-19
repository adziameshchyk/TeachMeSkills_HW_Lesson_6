package com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents;

import java.util.Date;

public class EmployeeContract extends Document {

    String employeeName;
    Date contractEndDate;

    public EmployeeContract(Date documentDate, String employeeName, Date contractEndDate) {
        super(documentDate);
        this.employeeName = employeeName;
        this.contractEndDate = contractEndDate;
    }

    @Override
    public String toString() {
        return "EmployeeContract{" +
                "employeeName='" + employeeName + '\'' +
                ", contractEndDate=" + contractEndDate +
                ", documentId=" + documentId +
                ", documentDate=" + documentDate +
                '}';
    }
}
