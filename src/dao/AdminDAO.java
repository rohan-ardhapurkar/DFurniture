package dao;
import java.sql.*;
import java.util.*;
import com.Admin;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class AdminDAO {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	public int saveData(Admin admin) {
		String sql="insert into admin(name,email,pass) values('"+admin.getName()+"','"+admin.getEmail()+"','"+admin.getPassword()+"')";
		return template.update(sql);
		
	}
}
