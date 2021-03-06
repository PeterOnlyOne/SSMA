package cn.et.food.service;

import java.util.List;
import java.util.Map;

public interface MyFoodService {

	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#queryAllFood(java.lang.String)
	 */
	public abstract List<Map<String, Object>> queryAllFood(String foodName);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#deleteFood(java.lang.String)
	 */
	public abstract void deleteFood(String foodId);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public abstract void updateFood(String foodId, String foodName, String price);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyFoodDao#saveFood(java.lang.String, java.lang.String)
	 */
	public abstract void saveFood(String foodName, String price);

}