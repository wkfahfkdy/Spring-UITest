package co.kjm.uitest.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kjm.uitest.member.service.MemberService;
import co.kjm.uitest.member.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberDao;
	
	@RequestMapping("login.do")
	public String memberlogin(MemberVO vo, Model model) {
		
		vo = memberDao.memberLogin(vo);
		System.out.println(vo);
		if(vo == null) {
			vo = new MemberVO();
			vo.setId("Guest");
		} 
		
		model.addAttribute("vo", vo.getId());
		
		return "loginok";
	}
}
