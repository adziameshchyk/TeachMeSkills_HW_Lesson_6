package com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents;

import java.util.Date;

public class FinancialInvoice extends Document {

    double totalAmountForMonth;
    String departmentCode;

    public FinancialInvoice(Date documentDate, double totalAmountForMonth, String departmentCode) {
        super(documentDate);
        this.totalAmountForMonth = totalAmountForMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "totalAmountForMonth=" + totalAmountForMonth +
                ", departmentCode='" + departmentCode + '\'' +
                ", documentId=" + documentId +
                ", documentDate=" + documentDate +
                '}';
    }
}
