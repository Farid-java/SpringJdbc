package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jdbc.springJdbc.Student;

public class DaoImpl implements Dao{

	private JdbcTemplate jdbcTemplate;
	String sql="insert into springJdbc values(?,?,?)";
	
	
	public int insert(Student student) {
		int update=jdbcTemplate.update(sql, student.getId(),student.getName(),student.getCollegename());
		return update;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int update(Student student) {
		String update="update springjdbc set name=? , collegename=? where id=? ";
		int udates=jdbcTemplate.update(update, student.getName(),student.getCollegename(),student.getId());
		
		return udates;
	}
	public int delete(int id) {
		String delete="delete from springjdbc where id=? ";
		int idd=jdbcTemplate.update(delete,id );
		
		return idd;
	}
	public Student fetch(int id) {
		String sql="select * from springjdbc where id=?";
		RowMapper<Student> rowmapper=new RowMapperImpl();
		Student student=jdbcTemplate.queryForObject(sql,rowmapper ,id );
		
		return student;
	}
	public List<Student> fetchAll() {
		String sql="select * from springjdbc";
		List<Student> student = jdbcTemplate.query(sql, new RowMapperImpl());
		return student;
	}
}
