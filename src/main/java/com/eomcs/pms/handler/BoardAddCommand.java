package com.eomcs.pms.handler;


import java.sql.Date;
import java.util.List;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardAddCommand implements Command {
	
	private List<Board> boardList;

	  public BoardAddCommand(List<Board> list) {
	    this.boardList = list;
	  }
	@Override
	public void execute() {
		System.out.println("[게시물 등록]");

	    Board board = new Board();
	    board.setNo(Prompt.inputInt("번호? "));
	    board.setTitle(Prompt.inputString("제목? "));
	    board.setContent(Prompt.inputString("내용? "));
	    board.setWriter(Prompt.inputString("작성자? "));
	    board.setRegisteredDate(new Date(System.currentTimeMillis()));
	    board.setViewCount(0);
		//TODO Auto-generated method stub
		
	}

}
