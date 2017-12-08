package com.wf.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wf.entity.Provider;
import com.wf.entity.Role;
import com.wf.entity.User;
import com.wf.service.ProviderService;
import com.wf.service.RoleService;
import com.wf.service.UserService;

@Controller
@RequestMapping("jsp")
public class UserController {
	
	@Autowired
	private UserService us;
	@Autowired
	private RoleService rs;
	@Autowired
	private ProviderService ps;
	
	@RequestMapping("login.do")
	public String login(User user,HttpSession session){
	 	User logined = us.findUser(user);
		if(logined != null){
			session.setAttribute("userSession", logined);
			return "jsp/frame";
		}
		session.setAttribute("error", "账号或者密码错误!!!");
		return "login";
	}
	
	@RequestMapping("logout.do")
	public String logout(HttpSession session){
		session.removeAttribute("userSession");
		return "login";
	}
	
	private int pageSize = 5;
	
	@RequestMapping("user.do")
	public String userLists(String queryname,Integer queryUserRole,
				@RequestParam(defaultValue = "1") Integer pageIndex,Map<String, Object> map){
		List<User> userList = us.getUserList(queryname, queryUserRole, pageIndex, pageSize);
		int totalCount = us.getUserCount(queryname, queryUserRole);
		int totalPageCount = totalCount % pageSize == 0 ? totalCount / pageSize :totalCount / pageSize + 1;
		List<Role> roleList = rs.findRoles();
		map.put("userList", userList);
		map.put("roleList", roleList);
		//当前页码
		map.put("currentPageNo", pageIndex);
		//总页数
		map.put("totalPageCount", totalPageCount);
		//总行数
		map.put("totalCount", totalCount);
		map.put("queryUserName", queryname);
		map.put("queryUserRole", queryUserRole);
		return "jsp/userlist";
	}
	
	@RequestMapping("provider.do")
	public String proList(String queryProCode,String queryProName,
			@RequestParam(defaultValue = "1") Integer pageIndex,Map<String, Object> map){
		List<Provider> proList = ps.findProviders(queryProCode, queryProName, pageIndex, pageSize);
		int totalCount = ps.getProvidCount(queryProCode, queryProName);
		int totalPageCount = totalCount % pageSize == 0 ? totalCount / pageSize :totalCount / pageSize + 1;
		map.put("providerList", proList);
		//当前页码
		map.put("currentPageNo", pageIndex);
		//总页数
		map.put("totalPageCount", totalPageCount);
		//总行数
		map.put("totalCount", totalCount);
		//记录
		map.put("queryProCode", queryProCode);
		map.put("queryProName", queryProName);
		
		return "jsp/providerlist";
	}
	
}
