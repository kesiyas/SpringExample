package com.kasiyas.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kasiyas.spring.ex.database.bo.UsedGoodsBO;
import com.kasiyas.spring.ex.database.model.UsedGoods;

// request 를 전달 받고, response를 만드는 일
@Controller
public class UsedGoodsContorller {

	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	@ResponseBody
	@RequestMapping("/database/ex01")
	public List<UsedGoods> ex01() {
		
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		
		return usedGoodsList;
	}
	
}
