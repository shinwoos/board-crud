package com.board.member;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	MemberDAO memberDAO;

	// 1.���̺� ��ü��ȸ
	@Override
	public List<MemberVO> selectList() {
		return memberDAO.selectList();
	}

	// 2.�� ����
	@Override
	public void insertList(MemberVO vo) {		
		memberDAO.insertList(vo);
	}

	// 3.�� ����
	@Override
	public void deleteList(int no) {
		memberDAO.deleteList(no);
	}

	// 4.�� ����
	@Override
	public void updateList(MemberVO vo) {
		memberDAO.updateList(vo);
	}
	

	
	

}
