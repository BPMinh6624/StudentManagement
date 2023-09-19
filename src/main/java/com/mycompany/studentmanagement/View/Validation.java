/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement.View;

import com.mycompany.studentmanagement.Model.Report;
import com.mycompany.studentmanagement.Model.Student;
import java.util.ArrayList;

/**
 *
 * @author tuanh
 */
public class Validation {
    
  
    
    
    
     public boolean checkReport(ArrayList<Report> list_Rp, int id, String courseName) {
        for (Report rp : list_Rp) {
            if (id == rp.getId() && courseName.equalsIgnoreCase(rp.getCourseName()) ) {
                return false;
            }
        }
        return true;
    }
}
