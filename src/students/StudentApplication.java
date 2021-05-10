/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package students;

import javax.sql.rowset.serial.SQLInputImpl;

/**
 *
 * @author djohanne
 */
public class StudentApplication 
{
    public static void main(String[] args) 
    { 
        Student s1 = new Student("Dimitri Johannes", "05/02/1985", "Male", "AppDev");
        Student s2 = new Student("Fowzia Johannes", "05/02/1985", "Female", "MulDev");
        Student s3 = new Student("Nuriyat Johannes", "05/02/1985", "Female", "WebDev");
        Student s4 = new Student("Naqeeb Johannes", "05/02/1985", "Male", "MobDev");
        Student s5 = new Student("Niyal Johannes", "05/02/1985", "Female", "DBADev");
        Student[] stu = {s1, s2, s3, s4, s5};
        
        StudentImplementation sImp = new StudentImplementation();
        
        System.out.println(sImp.isEmpty());
        
        for(int i=0; i<5; i++)
        {
            sImp.push(stu[i]);
        }

        System.out.println(sImp.isEmpty());
        
        System.out.println(sImp.peek());
        System.out.println(sImp.pop());
    }
    
}
