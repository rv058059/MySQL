package dbconnect;

import java.sql.ResultSet;

public class DBconnect_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id, year,ton;
		String name;
		ResultSet rs;
		//[MySQL�N���X�̃C���X�^���X����]
		MySQL mysql = new MySQL();
		//[�e�[�u��������������Ă���]
		rs = mysql.selectAll();
		
		try {
			while(rs.next()){
				id = rs.getInt("id");
				name = rs.getString("name");
				year = rs.getInt("year");
				ton = rs.getInt("ton");
				System.out.println("ID�F" + id);
				System.out.println("name�F" + name);
				System.out.println("year�F" + year);
				System.out.println("ton�F" + ton);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //try catch�ň͂�
		MySQL graph = new MySQL();
		graph.setBounds(5,5,655,455);
		graph.setVisible(true);;

		
	}
	
}
