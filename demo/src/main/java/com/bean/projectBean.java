package com.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class projectBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private List<String> skillList = new ArrayList<String>();

	private String description;

	private int logoNum;

	public projectBean() {

	}

	public projectBean(int id, String name, List<String> skillList,
			String description, int logoNum) {
		this.id = id;
		this.name = name;
		this.skillList = skillList;
		this.description = description;
		this.logoNum = logoNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<String> skillList) {
		this.skillList = skillList;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLogoNum() {
		return logoNum;
	}

	public void setLogoNum(int logoNum) {
		this.logoNum = logoNum;
	}
}
