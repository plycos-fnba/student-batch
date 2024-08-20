package com.fnba.springbatch.config;

import com.fnba.springbatch.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    public Student process(Student student) throws Exception {
        student.setId(null);
        return student;
    }
}
