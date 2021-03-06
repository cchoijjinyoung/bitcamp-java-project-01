package com.eomcs.pms.handler;


import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskListCommand implements Command {
	
	private List<Task> taskList;

	public TaskListCommand(List<Task> list) {
	    this.taskList = list;
	  
	  }
	@Override
	public void execute() {
		System.out.println("[작업 목록]");

	    // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
	    // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
	    Iterator<Task> iterator = taskList.iterator();

	    while (iterator.hasNext()) {
	      Task task = iterator.next();
	      String stateLabel = null;
	      switch (task.getStatus()) {
	        case 1:
	          stateLabel = "진행중";
	          break;
	        case 2:
	          stateLabel = "완료";
	          break;
	        default:
	          stateLabel = "신규";
	      }
	      System.out.printf("%d, %s, %s, %s, %s\n",
	          task.getNo(),
	          task.getContent(),
	          task.getDeadline(),
	          stateLabel,
	          task.getOwner());
	    }
	  }
		//TODO Auto-generated method stub
		
	}


