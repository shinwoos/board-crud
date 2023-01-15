package com.board.member;



import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	@Inject
	SqlSession sqlSession;
	
	// 1.게시판 전체 조회
	public List<MemberVO> selectList(){
		return sqlSession.selectList("queryDBMapper.selectList");	
	}
	
	// 2.게시판 글 추가
	public void insertList(MemberVO vo) {
		sqlSession.insert("queryDBMapper.insertList", vo);
	}
	
	// 3.게시판 글 삭제
	public void deleteList(int no) {
		sqlSession.delete("queryDBMapper.deleteList", no);
	}
	
	// 4.게시판 글 수정
	public void updateList(MemberVO vo) {
		sqlSession.update("queryDBMapper.updateList", vo);
	}
	

	
}
