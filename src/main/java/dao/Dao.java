package dao;

import java.util.List;

import com.jdbc.springJdbc.Student;

public interface Dao {

public int insert(Student student);
public int  update(Student student);
public int delete(int id);

public Student fetch(int id);
public List<Student> fetchAll();
}
