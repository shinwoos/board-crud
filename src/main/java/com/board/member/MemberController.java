package com.board.member;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller 
public class MemberController {
	
	@Inject
	MemberService memberService;
	
	//01. 게시판 전체 조회
	 @RequestMapping(value= "/list.do" ,method = RequestMethod.GET) 
	public String selectList(Model model) {
		List<MemberVO> selectList = memberService.selectList();
		
		System.out.println(selectList);
		
		//model
		model.addAttribute("selectList", selectList);
		return "main";
	}
	 
	 @RequestMapping(value= "/insertList.do", method = RequestMethod.POST)
	public String insertList(@RequestParam Map<String, Object> map) {
		System.out.println("dd");
		
		System.out.println(map);
		System.out.println(map.get("id").toString());
		System.out.println(map.get("name").toString());
		System.out.println(map.get("title").toString());
		System.out.println(map.get("contents").toString());
		
		MemberVO vo = new MemberVO();
		
		System.out.println(vo.getId() + vo.getName() + vo.getTitle() + vo.getContents());
		vo.setId(map.get("id").toString());
		vo.setName(map.get("name").toString());
		vo.setTitle(map.get("title").toString());
		vo.setContents(map.get("contents").toString());
		
		System.out.println(vo.getId() + vo.getName() + vo.getTitle() + vo.getContents());
		
		memberService.insertList(vo);
		
		return "redirect:/list.do";
	}
	
	

}
