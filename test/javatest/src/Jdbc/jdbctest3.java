package Jdbc;

import dateEntity.entity;
import jdbcUtil.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@SuppressWarnings("unused")
public class jdbctest3 {
	public static void listdatas() throws Exception {
		String sql = "select * from students";
		DButil db = new DButil();
		Connection con = db.getConnection();
		PreparedStatement statement = con.prepareStatement(sql);
		ResultSet st=statement.executeQuery();
		while (st.next()){
			int id=st.getInt("student_id");
			String name=st.getString("name");
			int age=st.getInt("age");
			String gender=st.getString("gender");
			System.out.println("student_id="+id+",name="+name+",age="+age+",gender="+gender);
			System.out.println("---------------------------------------------");
		}

	}
	public static void main(String[] args) throws Exception {
		jdbctest3.listdatas();
	}

}
