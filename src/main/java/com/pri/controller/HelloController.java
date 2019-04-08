package com.pri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * class name:HelloController <BR>
 * class description: springboot整合jsp；测试项目启动情况 ，<BR>
 *                  Controller层只需要添加@Controller注解即可<BR>
 * Remark: <BR>
 * @version 1.00 2019年3月28日
 * @author **)ChenQi
 */
@Controller
public class HelloController {

	@RequestMapping("/index")
	public String index(){
		//int i =  7/0;
		return "index";
	}
	
	/**
	 * Method name: toGraph_echarts <BR>
	 * Description: 跳转百度ECharts页面 <BR>
	 * Remark: <BR>
	 * @return  String<BR>
	 * @author )Mine+
	 */
	@RequestMapping("/graph_echarts")
	public String toGraph_echarts(){
		return "graph_echarts";
	}
	
	@RequestMapping("/mailbox")
	public String toMailbox(){
		return "mailbox";
	}
	
	@RequestMapping("/form_basic")
	public String toForm_basic(){
		return "form_basic";
	}
	@RequestMapping("/form_webuploader")
	public String toForm_webuploader(){
		return "form_webuploader";
	}
	@RequestMapping("/index_v1")
	public String toIndex_v1(){
		return "index_v1";
	}
	@RequestMapping("/search_results")
	public String toSearch_results(){
		return "search_results";
	}

}
