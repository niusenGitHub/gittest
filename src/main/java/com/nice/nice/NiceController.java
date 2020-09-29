package com.nice.nice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author niuse
 * @date 2020/09/29 14:11
 */
@Controller
public class NiceController {

	@RequestMapping("/1")
	public void test(){
		System.err.println("1");
	}
}
