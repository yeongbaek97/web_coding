package com.mz.pj.dataroom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mz.pj.TokenMaker;
import com.mz.pj.member.MemberDAO;



@Controller
public class DataroomControoler {

	@Autowired
	private DataroomDAO dDAO;
	
	@Autowired
	private MemberDAO mDAO;
	
	@RequestMapping(value = "dataroom.go", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		
		dDAO.getFile(req);
		
		mDAO.loginCheck(req);
		req.setAttribute("contentPage", "dataroom/dataroom.jsp");
		
		return "index";
	}
	
	@RequestMapping(value = "dataroom.upload", method = RequestMethod.POST)
	public String dataroomUpload(DataroomFile df, HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			dDAO.upload(df, req);
		}
		TokenMaker.make(req);
		dDAO.getFile(req);
		req.setAttribute("contentPage", "dataroom/dataroom.jsp");
		return "index";
	}
	
	@RequestMapping(value = "dataroom.delete", method = RequestMethod.GET)
	public String dataroomDelete(DataroomFile df, HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			dDAO.deleteFile(df, req);
		}
		TokenMaker.make(req);
		dDAO.getFile(req);
		req.setAttribute("contentPage", "dataroom/dataroom.jsp");
		return "index";
	}


}
