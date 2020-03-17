# exam-management-system
An example assignment Object Oriented Programming 
Assignment 01 – CS213 Spring 2020

1.	The University requires you to develop an Exam Management System. As part of the system, implement a Paper class. An object of the class should keep track of the following information: paper’s title, paper’s id number, course code, course incharge, semester and program names, the date and time of the paper, type of the exam, invigilator, location, number of students in the paper, and whether the paper is collected or not. All the instance variables should be private.

a.	Write a constructor that initializes the instance variables. By default, a newly created paper is not collected.

b.	Date and time of the paper have user defined data types.

c.	Write a constructor for the Paper class that takes the paper id, course code, and number of students. By default, a newly created paper is not collected.

d.	Write the get methods for all the fields. Write a set method for the instance variable that specifies whether the paper is collected. Note that because being collected is a Boolean value, by convention, the names you should use should be similar to isCollected() and setIsCollected(). 

e.	Write a toString() method to display the details.

2.	Write a Test class with a main method that creates three Paper objects. Then use System.out.println() to print the objects.

3.	Implement a Course class. A course object keeps track of the following information: course’s name, course code, program name (BSSE, BSCS, MCS), semester the course is offered in (e.g. Fall 2019). All the instance variables should be private.

a.	Write a constructor for the Course class. The constructor takes as parameter the name and the course code of the course. 

b.	Write a get method for the name and course code field. Write a set method for the course code. The name of the course cannot be changed once it has been created. 

c.	Write a toString() method. How can we make use of the toString() method of the Course class when writing the toString() of the Paper class?

4.	Modify the main method to create two Course objects. Associate papers with courses. Print courses using System.out.println().

5.	Can you write an analysis for a simple Exam Management System? Classes are Student, Course, Paper, and Faculty. Think about what instance variables and methods you should define for each of these classes. You can start by drawing a UML diagram of the classes. What additional classes do you think can be added to the system. (This part can be submitted handwritten or typed)

Due Date: March 24, 2020
