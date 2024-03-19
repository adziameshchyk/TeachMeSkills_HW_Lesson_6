# OOP in Java. Classes and objects

>This repository was created for homework in lesson №5 - "Classes and objects".
## Tasks

### Mandatory tasks:
0. Write the “Shapes” class hierarchy.   
   Shape -> Triangle -> Rectangle -> Circle.  
   Implement the function for calculating the area for each type of figure and calculating the perimeter.  
   Create an array of 5 shapes.   
   Display the sum of the perimeter of all the shapes in the array.  

1. Create the classes “Director”, “Worker”, “Accountant”.  
   Implement an interface with a method that prints the job title and implement this method in the created classes.  
### Additional tasks:
2. Create a system for document accounting.

   Create a Register class that will have methods:  
   - saving the document in the register  
   - providing information about the document  
   
   The system can work with three types of documents:  
   1. Contract for the supply of goods   
      Contains fields:  
      - Document Number  
      - Product type  
      - Number of goods  
      - Document date  
   
   2. Contract with employee  
      Contains fields:
      - Document Number
      - Document date
      - Contract end date
      - Employee name
   
   3. Financial invoice  
   Contains fields:
      - Total amount for the month
      - Document date
      - Document Number
      - Department code         
     
   <br/>  

   - The register class must contain an array within itself, and when adding a document to the register, this added document must be added to the array;  
   - The array for the register class must be size 10;  
   - For Document Date fields, use the Date data type;  
   - In the method of providing information about a document, information about the document passed as an input parameter should be displayed.  
     (to do this, in the class that describes the document, you should override the toString() method);
   - Each class for describing documents must contain a constructor with and without parameters;
   - To simulate the operation of the system, create a Main class that will contain only one method public static void main  
     In this method, write code to create each of the document types, add them to the register, and display the document information;
   - Place all classes in packages
   - When completing the task, use the concepts of interfaces and abstract classes.
