/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c1=new Scanner(System.in);
        Scanner c2=new Scanner(System.in);
        Scanner c3=new Scanner(System.in);
        Scanner c4=new Scanner(System.in);
        Scanner c5=new Scanner(System.in);
        System.out.println("*****************PAPER DETAIL*****************");
        System.out.print("Enter the Paper title ");
        String paper_tile=c1.nextLine();
        
        
        System.out.print("Enter the Paper ID ");
        String paper_id= c1.nextLine();
        
        
        System.out.print("Enter the course code ");
        int course_code=c1.nextInt();
        
        
        System.out.print("Enter the number of incharge ");
       String incharge=c2.nextLine();
        
        
        System.out.print("Enter the name of the semister ");
        String semister=c2.nextLine();
        
        
        DateTime dateTime = new DateTime("24/3/2020","10:59am");
        
        
        System.out.print("Enter the type of exam ");
       String exam_type=c2.nextLine();
        
        
        System.out.print("Enter the name of the invigilator ");
        String invigilator=c2.nextLine();
        
        
        System.out.print("Enter the location ");
        String location=c2.nextLine();
        
        
        System.out.print("Enter the Number of Students ");
        int numofstudent=c1.nextInt();
        
        boolean collected=false;
         
         
       System.out.println("*****************COURSE DETAIL*****************");
       System.out.print("Enter the name of the course ");
       String course_name=c3.nextLine();
       System.out.println("Enter the course_code ");
       int coures_code=c3.nextInt();
       System.out.println("Enter the name of course you selectede (BSSE, BSCS, MCS) ");
       String program_name=c4.nextLine();
       System.out.println("*****************FACULTY DETAIL*****************");
       System.out.println("Enter the Name ");
       String name=c4.nextLine();
       System.out.println("Enter the Faculty_id");
       String Id=c4.nextLine();
       System.out.println("*****************STUDENT DETAIL*****************");
       System.out.println("Enter Your RegNumber ");
       String regNO=c5.nextLine();
       System.out.println("Enter Your Semister ");
       String sem=c5.nextLine();
       System.out.println("Enter your CNIC number " );
       String cnic=c5.nextLine();
       Paper h1=new Paper( paper_tile,paper_id,course_code,incharge,semister,dateTime,exam_type,invigilator, location,numofstudent,collected);
       Course h2=new Course(course_name,coures_code,program_name);
       Faculty h3=new Faculty(name,Id);
       Student h4=new Student(regNO,sem,cnic); 
       System.out.print(h1);
       System.out.println(h2);
       System.out.println(h3);
       System.out.println(h4);
    }
}
