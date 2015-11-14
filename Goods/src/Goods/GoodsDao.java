package Goods;
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class GoodsDao {
	public GoodsDao(){
		
	}
	public void SaveGoods(Goods goods){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/java";
			Connection conn = (Connection) DriverManager.getConnection(url,"java","yy19931001");
			String create_tb = "CREATE TABLE IF NOT EXISTS  tb_goods(name varchar(20),price double,description varchar(50));";
			PreparedStatement create_ps = (PreparedStatement) conn.prepareStatement(create_tb);		
			create_ps.executeUpdate();
			
			String insert_tb = "insert tb_goods(name,price,description)values(?,?,?)";
			PreparedStatement insert_ps = (PreparedStatement) conn.prepareStatement(insert_tb);	
			insert_ps.setString(1,goods.getName() );
			insert_ps.setDouble(2, goods.getPrice());
			insert_ps.setString(3, goods.getDescrString());
			insert_ps.executeUpdate();
			insert_ps.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
