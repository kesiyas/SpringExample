package com.kasiyas.spring.ex.database.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kasiyas.spring.ex.database.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {

	// used Goods의 모든 행을 조회하는 기능
	public List<UsedGoods> selectUsedGoodsList();
		
	
}
