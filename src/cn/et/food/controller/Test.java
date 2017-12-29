package cn.et.food.controller;

import java.io.IOException;
import java.io.OutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Test {

	@RequestMapping("/test")
	public String test(OutputStream os) throws IOException{
		os.write("<font color='red'>hello</font>".getBytes());
		return null;
	}
}
