package cn.et.food.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.et.food.service.MyFoodService;

@Controller
public class MyFoodController {

	@Autowired
	MyFoodService service;
	/**
	 * 直接返回对象
	 * springmvc自动转换json
	 * @param foodName
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping(value="/queryFoodList",method=RequestMethod.GET)
	public List<Map<String, Object>> queryFoodList(String foodName) throws IOException{
		List<Map<String, Object>> queryAllFood = service.queryAllFood(foodName);
		return queryAllFood;
	}
	@RequestMapping(value="/food/{foodId}",method=RequestMethod.DELETE)
	public String deleteFood(@PathVariable String foodId,OutputStream os) throws IOException{
		try {
			service.deleteFood(foodId);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			os.write("0".getBytes("UTF-8"));
		}
		
		return null;
	}
	@RequestMapping(value="/food/{foodId}",method=RequestMethod.PUT)
	public String updateFood(@PathVariable String foodId,String foodName,String price,OutputStream os) throws IOException{
		try {
			service.updateFood(foodId, foodName, price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			os.write("0".getBytes("UTF-8"));
		}
		
		return null;
	}
	@RequestMapping(value="/food",method=RequestMethod.POST)
	public String saveFood(String foodName,String price,OutputStream os) throws IOException{
		try {
			service.saveFood(foodName, price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			os.write("0".getBytes("UTF-8"));
		}
		
		return null;
	}
}
