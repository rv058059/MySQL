package dbconnect;

import java.sql.ResultSet;

public class DBconnect_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id, year,ton;
		String name;
		ResultSet rs;
		//[MySQLクラスのインスタンス生成]
		MySQL mysql = new MySQL();
		//[テーブルから情報を持ってくる]
		rs = mysql.selectAll();
		
		try {
			while(rs.next()){
				id = rs.getInt("id");
				name = rs.getString("name");
				year = rs.getInt("year");
				ton = rs.getInt("ton");
				System.out.println("ID：" + id);
				System.out.println("name：" + name);
				System.out.println("year：" + year);
				System.out.println("ton：" + ton);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //try catchで囲む
		MySQL graph = new MySQL();
		graph.setBounds(5,5,655,455);
		graph.setVisible(true);;

		
	}
	
}
