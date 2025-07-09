package Jdbc;

import jdbcUtil.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import dateEntity.entity;

@SuppressWarnings("unused")
public class jdbctest {
	public static void add(entity a) throws Exception {

		String sql = "insert into students values(null,'" + a.getStuname() + "','" + a.getAge() + "','" + a.getGender()
				+ "')";
		DButil db = new DButil();
		Connection con = db.getConnection();
		Statement statment = con.createStatement();
		int num = statment.executeUpdate(sql);
		System.out.println("操作了" + num + "条数据");
		statment.close();
		con.close();
	}

	public static void delete(int id) throws Exception {

		String sql = "delete from students where student_id="+id;
		DButil db = new DButil();
		Connection con = db.getConnection();
		Statement statment = con.createStatement();
		int num = statment.executeUpdate(sql);
		System.out.println("操作了" + num + "条数据");
		statment.close();
		con.close();
	}
	
	public static void update(entity a) throws Exception {
		String sql = "update students set name='"+a.getStuname()+"',age='"+a.getAge()+"',gender='"+a.getGender()+"' Where student_id="+a.getId();
		DButil db = new DButil();
		Connection con = db.getConnection();
		Statement statment = con.createStatement();
		int num = statment.executeUpdate(sql);
		System.out.println("操作了" + num + "条数据");
		statment.close();
		con.close();
	}

	public static void main(String[] args) {
//		try {
//			entity a = new entity();
//			a.setAge(17);
//			a.setGender("girl");
//			a.setStuname("kimi");
//			jdbctest.add(a);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println("插入失败");
//
//		}
//		try {
//			jdbctest.delete(6);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println("删除失败");
//
//		}
		try {
			entity a = new entity();
			a.setId(5);
			a.setAge(51);
			a.setGender("man");
			a.setStuname("kimi");
			jdbctest.update(a);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("插入失败");

		}
		

	}
}