package Jdbc;

import jdbcUtil.DButil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import dateEntity.entity;

@SuppressWarnings("unused")
public class jdbctest2 {
	public static void add(entity a) throws Exception {

		String sql = "insert into students values(null,?,?,?)";
		DButil db = new DButil();
		Connection con = db.getConnection();
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, a.getStuname());
		statement.setInt(2, a.getAge());
		statement.setString(3, a.getGender());
		int num = statement.executeUpdate();
		System.out.println("操作了" + num + "条数据");
		statement.close();
		con.close();
	}

	public static void delete(int id) throws Exception {

		String sql = "delete from students where student_id=?";
		DButil db = new DButil();
		Connection con = db.getConnection();
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(2, id);
		int num = statement.executeUpdate(sql);
		System.out.println("操作了" + num + "条数据");
		statement.close();
		con.close();
	}

	public static void update(entity a) throws Exception {
		String sql = "update students set name=?,age=?,gender=? Where student_id=?";
		DButil db = new DButil();
		Connection con = db.getConnection();
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, a.getStuname());
		statement.setInt(2, a.getAge());
		statement.setString(3, a.getGender());
		statement.setInt(2, a.getId());
		int num = statement.executeUpdate(sql);
		System.out.println("操作了" + num + "条数据");
		statement.close();
		con.close();
	}

	public static void main(String[] args) {
		try {
			entity a = new entity();
			a.setAge(7);
			a.setGender("wksa");
			a.setStuname("chat");
			jdbctest.add(a);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("插入失败");

		}
//		try {
//			jdbctest.delete(6);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println("删除失败");
//
//		}
//		try {
//			entity a = new entity();
//			a.setId(5);
//			a.setAge(51);
//			a.setGender("man");
//			a.setStuname("kimi");
//			jdbctest2.update(a);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println("插入失败");

	}

}
