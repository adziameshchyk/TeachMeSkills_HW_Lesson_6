package com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.runner;

import com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents.Document;
import com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents.EmployeeContract;
import com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents.FinancialInvoice;
import com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.documents.GoodsSupplyContract;
import com.tms.interfaces_and_abstract_classes.additional_tasks.task_2.models.register.Register;

import java.util.Calendar;
import java.util.Date;

/**
 * Task
 *
 * Create a system for document accounting.
 *
 * Create a Register class that will have methods:
 *  -saving the document in the register
 *  -providing information about the document
 *
 * The system can work with three types of documents:
 *  1.Contract for the supply of goods
 *    Contains fields:
 *      -Document Number
 *      -Product type
 *      -Number of goods
 *      -Document date
 *  2. Contract with employee
 *    Contains fields:
 *      -Document Number
 *      -Document date
 *      -Contract end date
 *      -Employee name
 *  3. Financial invoice
 *    Contains fields:
 *      -Total amount for the month
 *      -Document date
 *      -Document Number
 *      -Department code
 *
 * -The register class must contain an array within itself, and when adding a document to the register, this added document must be added to the array;
 * -The array for the register class must be size 10;
 * -For Document Date fields, use the Date data type;
 * -In the method of providing information about a document, information about the document passed as an input parameter should be displayed.
 *  (to do this, in the class that describes the document, you should override the toString() method);
 * -Each class for describing documents must contain a constructor with and without parameters;
 * -To simulate the operation of the system, create a Main class that will contain only one method public static void main
 *  In this method, write code to create each of the document types, add them to the register, and display the document information;
 * -Place all classes in packages;
 * -When completing the task, use the concepts of interfaces and abstract classes.
 */

public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        Document cableSupplyContract = new GoodsSupplyContract(new Date(), "Cable", 100);
        Document managerContract = new EmployeeContract(new Date(), "Alex", new Date(125, Calendar.JUNE, 11));
        Document financialInvoice = new FinancialInvoice(new Date(), 2500d, "code-department-1");

        register.saveDocumentInRegister(cableSupplyContract);
        register.saveDocumentInRegister(managerContract);
        register.saveDocumentInRegister(financialInvoice);

        register.getInformationAboutDocument(cableSupplyContract);
        register.getInformationAboutDocument(managerContract);
        register.getInformationAboutDocument(financialInvoice);
    }

}
