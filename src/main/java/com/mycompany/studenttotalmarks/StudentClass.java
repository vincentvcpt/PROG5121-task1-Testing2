package com.mycompany.studenttotalmarks;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emeris
 */
public class StudentClass 
{
    // declare variables 
    private String stNumber, qualification;
    
    // constructor for the getters/setters
    public StudentClass(String stNumber, String qualification)
    {
        this.stNumber = stNumber;
        this.qualification = qualification;
    }
    
    //getters for get the method
    
    public String getStNumber()
    {
       return stNumber;
    }
    public String getQualification()
    {
        return qualification;
    }
    
    // method to calculate the avg
    public int calculateAvg(int task1, int task2, int poe)
    {
        int totalAvg;
        totalAvg = (task1 + task2+ poe)/3;
        return totalAvg;
    }
    // decision method to check, pass, PD, fail
    public String checkResult(int finalMark)
    {
        String passedWD ="Passed with distinction";
        String normalPass = "Passed";
        String notPassed ="Fail";
        
        if (finalMark >74)
        {
            return passedWD;
            
        }else 
            if (finalMark >49)
        {
            return normalPass;
            
        }else 
            {
                return notPassed;
            }
    }
    
}
