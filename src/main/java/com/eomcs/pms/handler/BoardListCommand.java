package com.eomcs.pms.handler;


import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardListCommand implements Command {
	
	private List<Board> boardList;

	  public BoardListCommand(List<Board> list) {
	    this.boardList = list;
	  }
	@Override
	public void execute() {
		System.out.println("[게시물 목록]");

	    // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
	    // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
	    Iterator<Board> iterator = boardList.iterator();

	    while (iterator.hasNext()) {
	      Board board = iterator.next();
	      System.out.printf("%d, %s, %s, %s, %d\n",
	          board.getNo(),
	          board.getTitle(),
	          board.getWriter(),
	          board.getRegisteredDate(),
	          board.getViewCount());
		//TODO Auto-generated method stub
		
	}
	}
}
