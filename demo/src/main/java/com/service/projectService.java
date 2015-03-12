package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.projectBean;
import com.opensymphony.xwork2.ActionSupport;

public class projectService extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private int projectId;

	private projectBean project;

	public String execute() throws Exception {
		System.out.println("進入projectService");
		int id = 0;
		String name = null;
		List<String> skillList = new ArrayList<String>();
		String description = null;
		int logoNum = 0;
		switch (projectId) {
		case 1:
			// Sales Shipment
			id = 1;
			name = "Sales Shipment";
			skillList.add("JSF");
			skillList.add("JBoss");
			skillList.add("MySQL");
			description = "參與一個PM帶三個RD的團隊，撰寫公司的出貨系統，以EJB撰寫後台，以JSF撰寫前台的網頁系統，連接MySQL資料庫，並佈署於JBoss。提供公司業務助理新增訂單、記錄客戶，再由出貨部門出貨。";
			logoNum = 1;
			project = new projectBean(id, name, skillList, description, logoNum);
			break;
		case 2:
			// Document Management v1
			id = 2;
			name = "Document Management";
			skillList.add("JSF");
			skillList.add("tomee");
			skillList.add("MongoDB");
			description = "參與一個PM帶三個RD的團隊，撰寫文件管理系統產品，以EJB撰寫後台，以JSF撰寫前台的網頁系統，連接MongoDB資料庫，並佈署於TomEE，撰寫期間大概為3個月。為一目標為10人內小公司的產品，提供客戶對資料夾管理、文件作上傳、刪除、搜尋、加入tag、拖拉式搬移與複製...等等功能。";
			logoNum = 2;
			project = new projectBean(id, name, skillList, description, logoNum);
			break;
		case 3:
			// Document Management v2
			id = 3;
			name = "Document Management";
			skillList.add("struts2");
			skillList.add("MongoDB");
			skillList.add("JQueryMobile");
			skillList.add("tomcat");
			skillList.add("Linux");
			description = "參與一個PM帶兩個RD的團隊，撰寫文件管理系統產品，以Struts2搭配JQuery Mobile撰寫網頁系統，連接MongoDB資料庫，並佈署於Linux OS的NAS，撰寫期間大約6個月。提供權限管理、文件分享、線上預覽、自動收信及優越的搜尋功能，鎖定需在外使用可攜式裝置並需即時取得文件的小型公司。";
			logoNum = 2;
			project = new projectBean(id, name, skillList, description, logoNum);
			break;
		case 4:
			// Production Execution
			id = 4;
			name = "Manufacturing Execution";
			skillList.add("Spring");
			skillList.add("struts2");
			skillList.add("tomcat");
			skillList.add("MySQL");
			skillList.add("c sharp");
			description = "參與四人團隊，一起撰寫製鞋工廠的MES系統，提供鞋廠流程控管、數字化的記錄、即時的產能管理及報表...等等，撰寫期間約7個月。業營端所需的網頁系統由Spring及struts2所撰寫，連接MySQL資料庫，並佈署於Tomcat，負責的部份包含成品條碼管理、材積維護、倉儲管理、訂單查詢...等。現場所需的掃描系統由C#撰寫，負責的部份包含記錄成品的掃描、轉交、入庫及出庫。";
			logoNum = 3;
			project = new projectBean(id, name, skillList, description, logoNum);
			break;
		default:
			break;
		}
		return SUCCESS;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public projectBean getProject() {
		return project;
	}

	public void setProject(projectBean project) {
		this.project = project;
	}

}
