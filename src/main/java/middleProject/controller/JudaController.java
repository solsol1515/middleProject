package middleProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JudaController {

	@RequestMapping("{url}.do")
	public String userJoin(@PathVariable String url) {
		System.out.println("확인");
		return url;
	}
	
	
	/*
	 * @RequestMapping("index.do") public void index() {
	 * System.out.println("index.do 실행"); }
	 * 
	 * 
	 * @RequestMapping("intro.do") public void intro() {
	 * System.out.println("intro.do 실행"); }
	 * 
	 * 
	 * @RequestMapping("intro.do") public void goodsList() {
	 * System.out.println("goodsList.do 실행"); }
	 */
	
}
