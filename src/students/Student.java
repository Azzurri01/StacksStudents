/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package students;

/**
 *
 * @author djohanne
 */
public class Student {
    private String studentName, dob, gender, studyProgramme;
    
    public Student()
    {
    }
    
    public Student(String inStudentName, String inDob, String inGender, String inStudyProgramme)
    {
        studentName=inStudentName;
        dob=inDob;
        gender=inGender;
        studyProgramme=inStudyProgramme;
    }
    
    public void setName(String inName)
    {
        studentName=inName;
    }
    
    public void setDob(String inDob)
    {
        dob=inDob;
    }
       
    public void setGender(String inGender)
    {
        gender=inGender;
    }
          
    public void setStudyProgram(String inStudyProgram)
    {
        studyProgramme=inStudyProgram;
    }
    
    public String getName()
    {
        return studentName;
    }
    
    public String getDob()
    {
        return dob;
    }
       
    public String getGender()
    {
        return gender;
    }
          
    public String getStudyProgram()
    {
        return studyProgramme;
    }
    
    @Override
    public String toString()
    {
        return "Student name: " + studentName + ", Student DOB: " + dob + ", Gender: " + gender + ", Student programme: " + studyProgramme;
    }
}
