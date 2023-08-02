package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberDao {
	
	//임시 db 역할
	private Map<Integer, MemberVo> db = new HashMap<Integer, MemberVo>();
	
	
	//create
	public void insertMember(MemberVo vo) {
		vo.setRegdate(new Date());
		db.put(vo.getNum(), vo);
		
	}
	
	//read
	public MemberVo selectMember(int num) {
		return db.get(num);
	}
	
	
	public List<MemberVo> selectMebmerAll(){
		return new ArrayList<MemberVo>(db.values());
	}
	
	//update
	public void updateMember(MemberVo vo) {
		db.put(vo.getNum(), vo);
	}
	
	//delete
	
	public void deleteMember(int num) {
		db.remove(num);	
	}
	
	public void deleteMemberAll() {
		db.clear();
	}
	

			


}
