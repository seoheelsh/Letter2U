package com.letter2u.board.service;

import org.springframework.data.domain.Page;

import com.letter2u.board.domain.Board;
//import com.letter2u.board.domain.Search;

public interface BoardService {
	void insertBoard(Board board);
	
	void updateBoard(Board board);
	
	void deleteBoard(Board board);
	
	Board getBoard(Board board);
	
	Page<Board> getBoardList(Board board);
//	Page<Board> getBoardList(Search search);
}
