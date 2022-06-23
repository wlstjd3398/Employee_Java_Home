package chapter13;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberListController {
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	@GetMapping("/members")
	public String list(@ModelAttribute("cmd")ListRequest listRequest) {
		return "member/list";
	}
	
	// 클라이언트가 보내는 값을 해당 기간에 맞는 회원 정보들을 조회하도록 구현하세요
		// 위와같이 커맨드객체 사용하거나 HtttpServletRequest를 사용해야함
		@PostMapping("/members")
		public String search(@ModelAttribute("cmd")ListRequest listRequest, Errors errors, Model model) {
			// 커맨드 객체를
			new ListRequestValidator().validate(listRequest, errors);
			
			if(errors.hasErrors()) {
				return "member/list";
			}
			
			// 기간에 맞는 회원정보들을 조회
			List<Member> memberList = memberDao.selectByRegdate(listRequest.getFrom(), listRequest.getTo());
			
			// 조회 결과를 뷰에서 사용하도록 코드를 추가하세요
			model.addAttribute("members", memberList);
			
			System.out.println(memberList);
			
			// 조회 결과를 보여줄 뷰를 생성
			return "member/list";
			
		}
}
