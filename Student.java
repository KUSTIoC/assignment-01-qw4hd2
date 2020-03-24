/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper;

/**
 *
 * @author HP
 */
public class Student {
    private String regNo;
    private String sem;
   private String cnic;

    public Student(String regNo, String sem, String cnic) {
        this.regNo = regNo;
        this.sem = sem;
        this.cnic = cnic;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getSem() {
        return sem;
    }

    public String getCnic() {
        return cnic;
    }
    

   
    @Override
    public String toString() {
        return  "\nregNo=" + regNo + ", sem=" + sem + ", cnic=" + cnic ;
    }

   
    
    
}
