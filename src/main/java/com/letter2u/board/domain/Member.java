package com.letter2u.board.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "boardList")
@Entity
public class Member {
	@Id
	@Column(name = "MEMBER_EMAIL")
	private String email;
	
	private String password;
	
	private String nickname;
	
	private boolean enabled;
	
	@OneToMany(mappedBy = "member", fetch=FetchType.EAGER)
	private List<Board> boardList = new ArrayList<Board>();
}
