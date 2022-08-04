package com.kasiyas.spring.ex.database.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kasiyas.spring.ex.database.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {

	// 실제 데이터에 대한 쿼리 수행을 담당하는 역할
	// used Goods의 모든 행을 조회하는 기능
	public List<UsedGoods> selectUsedGoodsList();
		
	
}
