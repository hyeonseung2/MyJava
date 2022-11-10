package FriendDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class FriendDao {
		public boolean insert(FriendDto dto) {
			
			Connection conn=null;
			PreparedStatement pstmt=null;
			int rowCount=0;
			try {
				conn=new DBConnect().getConn();
				String sql="INSERT INTO member"
						+" (NUM, NAME, PhONE, BIRTH)"
						+" VALUES(FRIEND_seq.NEXTVAL, ?, ?, ?)";
				
			}
		}
	}

