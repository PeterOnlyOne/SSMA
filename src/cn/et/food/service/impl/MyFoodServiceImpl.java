package cn.et.food.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.food.dao.MyFoodDao;
import cn.et.food.service.MyFoodService;

@Service
public class MyFoodServiceImpl implements MyFoodService{

	@Autowired
	MyFoodDao dao;
	
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#queryAllFood(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#queryAllFood(java.lang.String)
	 */
	public List<Map<String, Object>> queryAllFood(String foodName){
		String sql = "select * from food where foodname like '%"+foodName+"%'";
		return dao.queryAllFood(foodName);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#deleteFood(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#deleteFood(java.lang.String)
	 */
	public void deleteFood(String foodId){
		String sql = "delete from food where foodId="+foodId;
		dao.deleteFood(foodId);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodId,String foodName,String price){
		String sql = "update food set foodname='"+foodName+"',price='"+price+"' where foodid="+foodId;
		dao.updateFood(foodId, foodName, price);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#saveFood(java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#saveFood(java.lang.String, java.lang.String)
	 */
	public void saveFood(String foodName,String price){
		String sql = "insert into food(foodname,price) values('"+foodName+"','"+price+"')";
		dao.saveFood(foodName, price);
	}
}
