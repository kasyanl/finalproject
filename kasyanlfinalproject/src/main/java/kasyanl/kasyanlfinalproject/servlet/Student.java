package kasyanl.kasyanlfinalproject.servlet;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Student {
    public static List<Student> total = new ArrayList<>();
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private int age;
}

