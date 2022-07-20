package test.com.jdbc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		return "insert";
	}
	
	@RequestMapping(value = "/insertOK.do", method = RequestMethod.POST)
	public String insertOK(MemberVO vo) {
		logger.info("welome insertOK!");
		logger.info("vo:{}", vo);

		int result=service.insert(vo);
		logger.info("result:{}",result);

		return "redirect:/";
	}
	
	@RequestMapping(value = "/loginOK.do", method = RequestMethod.POST)
	public String loginOK(MemberVO vo) {
		logger.info("welome insertOK!");
		logger.info("vo:{}", vo);

		MemberVO vo2= service.login(vo);
		logger.info("vo:{}",vo2);

		return "redirect:/";
	}
	
}
