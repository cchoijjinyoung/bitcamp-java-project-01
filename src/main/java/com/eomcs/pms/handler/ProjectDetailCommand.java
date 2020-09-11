package com.eomcs.pms.handler;

import java.sql.Date;
import java.util.List;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.Prompt;

public class ProjectDetailCommand implements Command{

	private List<Project> projectList;

	  public ProjectDetailCommand(List<Project> list) {
	    this.projectList = list;
	  }
	@Override
	public void execute() {
		System.out.println("[프로젝트 상세보기]");
	    int no = Prompt.inputInt("번호? ");
	    Project project = findByNo(no);

	    if (project == null) {
	      System.out.println("해당 번호의 프로젝트가 없습니다.");
	      return;
	    }

	    System.out.printf("프로젝트명: %s\n", project.getTitle());
	    System.out.printf("내용: %s\n", project.getContent());
	    System.out.printf("기간: %s ~ %s\n", project.getStartDate(), project.getEndDate());
	    System.out.printf("만든이: %s\n", project.getOwner());
	    System.out.printf("팀원: %s\n", project.getMembers());
		 
	    //TODO Auto-generated method stub
		  }

private Project findByNo(int no) {
    for (int i = 0; i < projectList.size(); i++) {
      Project project = projectList.get(i);
      if (project.getNo() == no) {
        return project;
      }
    }
    return null;
  }
}	
