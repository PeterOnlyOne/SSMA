package cn.et.food.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FoodMapper {

	@Select("select * from food where foodname like '%${foodName}%'")
	public List<Map<String, Object>> queryAllFood(@Param("foodName")String foodName);
	
	@Delete("delete from food where foodId=#{0}")
	public void deleteFood(String foodId);
	
	@Update("update food set foodname=#{1},price=#{2} where foodId=#{0}")
	public void updateFood(String foodId,String foodName,String price);
	
	@Insert("insert into food(foodname,price) values(#{0},#{1})")
	public void saveFood(String foodName,String price);
}
