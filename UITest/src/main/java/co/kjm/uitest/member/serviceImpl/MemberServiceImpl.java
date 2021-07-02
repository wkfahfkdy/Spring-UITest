package co.kjm.uitest.member.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kjm.uitest.member.map.MemberMapper;
import co.kjm.uitest.member.service.MemberService;
import co.kjm.uitest.member.vo.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService {

	@Autowired MemberMapper map;
	
	@Override
	public MemberVO memberLogin(MemberVO vo) {
		
		return map.memberLogin(vo);
	}

}