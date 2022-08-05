package com.kasiyas.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kasiyas.spring.ex.mybatis.bo.ReviewBO;
import com.kasiyas.spring.ex.mybatis.model.Review;

@Controller
@RequestMapping("/mybatis/ex01")
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;

	// 특정 id의 Review 데이터 가져오기
	@RequestMapping("/1")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {
		Review review = reviewBO.getReview(id);
		return review;
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public String addReview() {
		// 가게 id, 메뉴, 사용자이름, 별점, 리뷰내용
		int count = reviewBO.addReview(4, "콤비네이션 피자", "김바다", 4.5, "잘 먹었습니다.");
		
		return "삽입결과 : " + count;
	}
	
	
}
