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
public class StudentImplementation 
{
    Student s = new Student();
    Student[] sArray;
    int top;
    
    public StudentImplementation()
    {
        sArray = new Student[5];
        top=-1;
    }
    
    public void push(Student s)
    {
        top++;
        sArray[top]=s;
    }
    
    public Student pop()
    {
        top--;
        return sArray[top];
    }
        
    public Student peek()
    {
        return sArray[top];
    }
            
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
            else
            {
                return false;
            }
    }   
}
