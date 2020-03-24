/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*Implement a Course class. A course object keeps track of the following information: course’s
name, course code, program name (BSSE, BSCS, MCS), semester the course is offered in (e.g.
Fall 2019). All the instance variables should be private.
*/
package paper;

/**
 *
 * @author HP
 */
public  class  Course {
        private String course_name;
        private int coures_code;
        private String program_name;

    public Course(String course_name, int coures_code, String program_name) {
        this.course_name = course_name;
        this.coures_code = coures_code;
        this.program_name = program_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCoures_code(int coures_code) {
        this.coures_code = coures_code;
    }

    public void setProgram_name(String program_name) {
        this.program_name = program_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public int getCoures_code() {
        return coures_code;
    }

    public String getProgram_name() {
        return program_name;
    }
        
       /* Course(String course_name,int coures_code, String program_name){
        setcourse(course_name);
        setcourse_codes(coures_code);
        setprogram(program_name);
    }

   

   
        public void setcourse(String course_name) {
            this.course_name = course_name;
        }

        public void setcourse_codes(int coures_code) {
            this.coures_code = coures_code;
        }

        public void setprogram(String program_name) {
            this.program_name = program_name;
        }
        
        public String getCourse() {
            return course_name;
        }

        public int getcoures_code() {
            return coures_code;
        }

        public String getprogram() {
            return program_name;
        }*/
         @Override
        public String toString() {
            return "\ncourse_name :" + course_name + "\t\t\t\t\t coures_code :" + coures_code + "\t\t\t\t\t\t\t\t\tprogram_name :" + program_name ;
        }
}
