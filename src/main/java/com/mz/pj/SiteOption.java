package com.mz.pj;

import javax.servlet.http.HttpServletRequest;

public class SiteOption {
	private int snsCountPerpage; // 한 페이지당 sns 개수
	// 다른 게시판..
	
	public SiteOption() {
		// TODO Auto-generated constructor stub
	}

	public SiteOption(int snsCountPerpage) {
		super();
		this.snsCountPerpage = snsCountPerpage;
	}

	public int getSnsCountPerpage() {
		return snsCountPerpage;
	}

	public void setSnsCountPerpage(int snsCountPerpage) {
		this.snsCountPerpage = snsCountPerpage;
	}

	public static void clearSearch(HttpServletRequest req) {
		req.getSession().setAttribute("search", null);
		
	}

	
	
}
