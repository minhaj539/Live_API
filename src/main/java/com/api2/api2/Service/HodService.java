package com.api2.api2.Service;

import com.api2.api2.Models.HOD;
import com.api2.api2.Models.Student;
import com.api2.api2.Repository.HodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HodService {
    @Autowired
    HodRepository hodRepository;
    public String addHod(HOD hod){
        hodRepository.save(hod);
        return "HOD added successfully";
    }

    public String getHodMobile(){
        String hodMob="";
        List<HOD> hodList=hodRepository.findAll();
        int maxCountOfPassingStudents=0;
        for(HOD hod:hodList){
            int countOfPassingStudents=0;
            for(Student student:hod.getStudentList()){
                if(student.getMarks()>=40){
                    countOfPassingStudents++;
                }
            }
            if(countOfPassingStudents>maxCountOfPassingStudents){
                maxCountOfPassingStudents=countOfPassingStudents;
                hodMob=hod.getMobile();
            }
        }
    return hodMob;
    }
}
