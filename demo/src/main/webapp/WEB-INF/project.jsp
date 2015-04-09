<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div style="margin-top: 60px;" align="center">
	<font style="font-family: Segoe WP Light; font-size: 50px;"><s:property
			value="project.name" /></font>
</div>
<div style="margin-top: 60px; border-bottom: solid 1px;" align="center">
	<img alt="" src="images/<s:property value="project.logoNum"/>logo.png">
</div>

<div align="center" style="border-bottom: solid 1px;">
	<div align="left"
		style="width: 400px; padding-top: 60px; padding-bottom: 60px; font-family: Microsoft MHei;">
		<font color="#000000"><s:property value="project.description" /></font>
	</div>
</div>
<div style="font-family: Microsoft MHei;margin: 10 0 10 0;">使用技術：</div>
<div style="filter: Gray;">
	<s:iterator value="project.skillList">
		<img alt="<s:property />" src="images/<s:property />.png" width="200px" height="70px;" style="FILTER: Gray(Color=blue);">
	</s:iterator>
</div>