package com.login_functionality.login_service.Service;

import com.login_functionality.login_service.Entity.Student;
import com.login_functionality.login_service.Repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
public class StudentLoginService {

    @Autowired
    private StudentRepository studentRepository;

    public boolean login(String username, String password) {
        Student student = studentRepository.findByUsername(username);
        if (student != null && student.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}

