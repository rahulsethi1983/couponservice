package com.tesco.coupon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.coupon.domain.Coupon;

@RestController
public class CouponController {

	@GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", "Coupon");
        return "home";
    }
	
	@GetMapping("/coupons")
	public List<Coupon> getCoupons() {
		List<Coupon> coupons = new ArrayList<Coupon>();
		coupons.add(new Coupon("1",100.0,60.0,"1"));
		coupons.add(new Coupon("2",100.0,100.0,"1"));
		coupons.add(new Coupon("3",100.0,90.0,"2"));
		
		return coupons;
	}
}
