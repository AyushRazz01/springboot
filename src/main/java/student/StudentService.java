package student;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student getStudent() {
        return new Student();
    }
}
