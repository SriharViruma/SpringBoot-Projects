package com.spring.demo.Service;
import com.spring.demo.Model.Student;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
public class StudentService {
    List<Student> studentList = new ArrayList<>(List.of(
            new Student(101, "srihar", 11),
             new Student(102, "yaad", 12),
            new Student(103, "kavin", 13)

    ));

    public List<Student> GetStudentsList() {
        return studentList;
    }

    public int GetIndex(Student student){
        int index = 0;
        for(int i = 0 ; i < studentList.size();i++){
            if (studentList.get(i).getStudentId() == student.getStudentId())
                index = i;
        }

        return index;

    }


    public Student getStudentById(int id) {
        for (Student i : studentList) {
            if (i.getStudentId() == id) {
                return i;
            }
        }
        return new Student(404, "None", 0);
    }

    public void AddStudent(Student student) {
        studentList.add(student);
    }

    public void UpdateStudent(Student student) {
        int index = GetIndex(student);
        studentList.set(index,student);
    }

    public void DeleteStudent(int id) {
        int index = -1;
        for(Student std : studentList){
            if (std.getStudentId() == id){
                break;
            }
            index++;
        }
        if (index != -1){
            studentList.remove(index);
        }

    }
}
