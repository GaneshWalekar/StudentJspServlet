package org.example.dao;




import org.example.model.Student;
import org.example.util.DbUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    List<Student> students=new ArrayList<>();
    DbUtility dbUtility=new DbUtility();
    int returnValue=0;

    public int addStudent(Student student){
        String query ="INSERT INTO STUDENT_INFO (name, college, class) VALUES (?,?,?);";
        try {
            Connection con = dbUtility.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,student.getName());
            ps.setString(2,student.getClg());
            ps.setString(3,student.getCls());
            returnValue = ps.executeUpdate();

            con.close();
            return returnValue;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Student> listStudent(){
        String query ="SELECT * FROM STUDENT_INFO";
        try {
            Connection con = dbUtility.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs =ps.executeQuery();
            Student student = new Student();
            while(rs.next()){
                student.setName(rs.getString("name"));
                student.setClg(rs.getString("college"));
                student.setCls(rs.getString("class"));
                students.add(student);
            }
            con.close();
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
