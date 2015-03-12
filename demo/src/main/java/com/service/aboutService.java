package com.service;

import com.opensymphony.xwork2.ActionSupport;

public class aboutService extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String description;
	
	public String execute() throws Exception {
		System.out.println("進入about");
		description = "此網站是以Maven為基礎並以Struts2 技術架設，因無適當主機因此沒有連接資料庫。除了Project圖片切換文字的JQuery 效果取自網路，其他皆為自己撰寫。圖示為原創或免費個人使用授權，因不擅長美工，美工參考於<a style='color:#FFCC00;' href='http://www.wix.com/website/templates/html/personal/portfolio/3'>Wix</a>，本網站程式碼放置於Git，其他個人的詳細資料請您參考履歷表，謝謝。";
		return SUCCESS;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
