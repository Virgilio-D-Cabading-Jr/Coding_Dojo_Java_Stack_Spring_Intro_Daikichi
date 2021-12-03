package com.vcabading.firstspringproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String daikichi() {
		return "Welcome";
	}

	@RequestMapping("/today")
	public String daikichiToday() {
		return "Today, you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String daikichiTomorrow() {
		return "Tomorrow, an opportunity will arise, be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{city}")
	public String daikichiTravelCity(@PathVariable("city") String city) {
		return "Congratulations!  You will soon travel to " + city + "!";
	}
	
	@RequestMapping("lotto/{inputNumber}")
	public String daikichiLottoNumber(@PathVariable("inputNumber") String inputNumber) {
		if (DaikichiController.isNumeric(inputNumber)) {
			int number = Integer.parseInt(inputNumber);
			if (number % 2 == 0) {
				return "You will take a grand journey in the near future, but be weary of etempting offers.";
			} else {
				return "You have enjoyed the fruits of your labor but now is a great timeto spend time with family and friends.";
			}
		}
		return "Invalid number";
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Integer d = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
