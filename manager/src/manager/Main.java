package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Integer, MemberVo> db = new HashMap<Integer, MemberVo>();
		
		//C(insert)
		MemberVo vo1 = new MemberVo(1, "test1", "1234", "nick1");
		vo1.setRegdate(new Date());
		MemberVo vo2 = new MemberVo(2, "test2", "1234", "nick2");
		vo2.setRegdate(new Date());
		MemberVo vo3 = new MemberVo(3, "test3", "1234", "nick3");
		vo3.setRegdate(new Date());
		
		
		db.put(1, vo1);
		db.put(2, vo2);
		db.put(3, vo3);
		System.out.println("저장 완료!");
		//R(select)
		List<MemberVo> ls = new ArrayList<>(db.values());
		for(MemberVo tmp : ls) {
			System.out.println("tmp=============="+tmp);
		}
		
		System.out.println("전체조회완료");
		MemberVo vo = null;
		vo = db.get(1);
		
		System.out.println("vo=================="+vo.getNum());
		System.out.println("vo=================="+vo.getMemberId());
		System.out.println("vo=================="+vo.getNickName());
		System.out.println("vo=================="+vo.getMemberPw());
		System.out.println("vo=================="+vo.getRegdate());

		vo = db.get(4);
		
		System.out.println("vo================"+vo);
		System.out.println("조회완료");
		//U(update)
		vo = db.get(1);
		
		if(vo != null) {
			vo.setMemberPw("4321");
			vo.setNickName("바뀐닉넴");
			db.put(vo.getNum(), vo);
			
		}
		
		System.out.println("vo=================="+vo);
		System.out.println("수정");

		//D(delete)
		db.remove(2);
		ls = new ArrayList<>(db.values());
		for(MemberVo tmp : ls) {
			System.out.println("tmp=============="+tmp);
		}
		System.out.println("삭제완료");
		db.clear();
		System.out.println("전체삭제완료");
		ls = new ArrayList<>(db.values());

		System.out.println("ls====================="+ls);
		

		
	}
}
