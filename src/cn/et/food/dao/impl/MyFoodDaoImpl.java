package cn.et.food.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.et.food.dao.MyFoodDao;
import cn.et.food.mapper.FoodMapper;

@Repository
public class MyFoodDaoImpl implements MyFoodDao{

	@Autowired
	FoodMapper mapper;
	
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#queryAllFood(java.lang.String)
	 */
	public List<Map<String, Object>> queryAllFood(String foodName){
		return mapper.queryAllFood(foodName);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#deleteFood(java.lang.String)
	 */
	public void deleteFood(String foodId){
		mapper.deleteFood(foodId);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodId,String foodName,String price){
		mapper.updateFood(foodId, foodName, price);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#saveFood(java.lang.String, java.lang.String)
	 */
	public void saveFood(String foodName,String price){
		mapper.saveFood(foodName, price);
	}
}
