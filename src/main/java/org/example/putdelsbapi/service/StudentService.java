package org.example.putdelsbapi.service;

import org.example.putdelsbapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class StudentService {
    List<Student> student = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Jesi", "AI"),
                    new Student(2, "Kann", "ECE")
            )
    );


    public List<Student> getStd() {
        return student;
    }

    public Student getStdId(int id) {
        int index = 0;
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getRollno() == id) {
                index = i;
                return student.get(index);
            }
        }
        return null;
    }

    public void addStd(Student student) {
        this.student.add(student);
    }

    public String modStud(Student student) {
        int index = 0;
        for (int i = 0; i < this.student.size(); i++) {
            if (this.student.get(i).getRollno() == student.getRollno()) {
                index = i;
                this.student.set(index, student);
                return "successfully student updated";
            }
        }
        return "student not found";
    }

    public  String deletestdid(int id) {
        boolean found = false;
        for(int i = 0; i <student.size();i++)
        {
            if(student.get(i).getRollno() == id)
            {
                student.remove(i);
                found = true;
            }
        }
        if(found == true)
        {
            return "student deleted successfully";
        }
        else{

            return "student not found";
        }
    }
}
