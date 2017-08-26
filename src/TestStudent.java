
import com.ss1.Student;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lan
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student0 = new Student();
        student0.setName("Ngoc");
        student0.setEmail("ngocnvd00435");
        student0.setBirthDay("14/12/1995");
        
        Student student1 = new Student();
        student1.setName("dung");
        student1.setEmail("ngocnvd00435");
        student1.setBirthDay("14/12/1995");
        
       ArrayList<Student> listStudent = new ArrayList<>();
       listStudent.add(student1);
       listStudent.add(student0);
       
       
        System.out.println(listStudent.get(0).getName());
       
       
    }
}
