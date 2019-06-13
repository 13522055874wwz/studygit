package com.wz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wz.service.MyService;
import com.wz.util.PageUtils;
/**
 * 
* 项目名称：shops   
* 类名称：MyController   
* 类描述：   数据交互
* 创建人：Administrator   
* 创建时间：2019年6月10日 下午6:50:40   
* @version
 */
@Controller

public class MyController {
	
	@Autowired
	private MyService ms;
	
	@RequestMapping("list")
	public String list(Model model) {
		List list = ms.selectList();
		/*Integer pageSize =3;
	   //分页助手
		 PageHelper.startPage(pageNum, pageSize);
		 PageInfo info = new PageInfo<>(list);
		 //调用分页工具类
		 PageUtils.page(model, info, "");*/
		  
		 model.addAttribute("list", list);
		 
		return "list";
		
	}
	@RequestMapping("tolike")
	@ResponseBody
	public boolean updatelike(Integer id){
		
		return ms.updatelikeByid(id)>0;
	}
	
	@RequestMapping("toshou")
	@ResponseBody
	public boolean updateshou(Integer id){
		
		return ms.updateshouByid(id)>0;
	}

}
