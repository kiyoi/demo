package com.service;

import com.opensymphony.xwork2.ActionSupport;

public class homeService extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		System.out.println("進入HOME");
		return SUCCESS;
	}

}
