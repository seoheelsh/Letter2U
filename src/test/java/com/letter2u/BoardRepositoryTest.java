package com.letter2u;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.letter2u.board.domain.Board;
import com.letter2u.board.domain.Member;
import com.letter2u.board.persistence.BoardRepository;
import com.letter2u.board.persistence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {
	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired
	private BoardRepository boardRepo;
	
//	@Autowired
//	private PasswordEncoder encoder;
	
	/*
	@Test
	public void testInsert() {
		Member member1 = new Member();
		member1.setEmail("5522rita@naver.com");
		member1.setPassword("5522rita");
//		member1.setPassword(encoder.encode("member123"));
		member1.setNickname("리타");
		member1.setEnabled(true);
		memberRepo.save(member1);
		
		for (int i = 1; i <= 13; i++) {
			Board board = new Board();
			board.setMember(member1);
			board.setTitle(member1.getNickname() + "의 편지 " + i);
			board.setContent(member1.getNickname() + "의 편지 " + i);
			boardRepo.save(board);
		}
	}
	*/
	
	/*
	@Test
	public void testGetBoard() {
		Board board = boardRepo.findById(1L).get();
		
		System.out.println("[ " + board.getSeq() + "번 게시글 상세 정보 ]");
		System.out.println("제목\t : " + board.getTitle());
		System.out.println("작성자\t : " + board.getMember().getNickname());
		System.out.println("내용\t : " + board.getContent());
		System.out.println("등록일\t : " + board.getCreateDate());
	}
	*/
	
	
	@Test
	public void testGetBoardList() {
		Member member = memberRepo.findById("member").get();
		
		System.out.println("[ " + member.getNickname() + "의 편지 ]");
		for (Board board : member.getBoardList()) {
			System.out.println("----> " + board.toString());
		}
	}
	
}
