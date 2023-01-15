package com.board.member;

public class MemberVO {
	private int no;
	private String id;
	private String name;
	private String title;
	private String contents;
	private String date;
	

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	// toString()
	@Override
    public String toString() {
        return "MemberVO [id=" + id + ", name=" + name + ", title=" + title + ", contents=" + contents + " ]";
    }
	
}
