package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("hello")
public class HelloViewController {
	
	@GetMapping("")
	public String helloView() {
		// 戻り値は「ビュー名」を返す
		return "hello";
	}
	
	@GetMapping("linktest")
	public String linkTest() {
		// 戻り値は「ビュー名」を返す
		return "linktest";
	}
	
	@GetMapping("model")
	public String helloView(Model model) {
		// 「Model」にデータを格納する
		model.addAttribute("msg", "タイムリーフ!!!");
		// 戻り値は「ビュー名」を返す
		return "helloThymeleaf";
	}
	
	@GetMapping("modelandview")
	public ModelAndView helloView2(ModelAndView modelAndView) {
		// データを格納する
		modelAndView.addObject("msg", "タイムリーフ!!!");
		// 画面を設定する
		modelAndView.setViewName("helloThymeleaf");
		return modelAndView;
	}
}