package com.board.member;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	MemberDAO memberDAO;

	// 1.테이블 전체조회
	@Override
	public List<MemberVO> selectList() {
		return memberDAO.selectList();
	}

	// 2.글 쓰기
	@Override
	public void insertList(MemberVO vo) {		
		memberDAO.insertList(vo);
	}

	// 3.글 삭제
	@Override
	public void deleteList(int no) {
		memberDAO.deleteList(no);
	}

	// 4.글 수정
	@Override
	public void updateList(MemberVO vo) {
		memberDAO.updateList(vo);
	}
	

	
	

}
