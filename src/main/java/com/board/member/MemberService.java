package com.board.member;

import java.util.List;

public interface MemberService {
	
	// 게시판 전체 조회
	public List<MemberVO> selectList();
	
	// 게시판 글 추가
	public void insertList(MemberVO vo);

	// 게시판 글 삭제
	public void deleteList(int no);
	
	// 게시판 글 수정
	public void updateList(MemberVO vo);

}
