package com.project.mail;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.mail.dao.MailDao;
import com.project.mail.model.Mailer;

@Controller
@RequestMapping(value = "/email")
public class EmailController {
	
	@Autowired
	private MailDao mDao;
	@Autowired
    private JavaMailSender mailSender;
	
	@ModelAttribute("mailer")
	public Mailer getMailerObject() {
		return new Mailer();
	}
	
	@GetMapping
	public String getEmail() {
		return "email";
	}
	
	@PostMapping
	public String postEmail(@ModelAttribute Mailer m, Model model, RedirectAttributes redir) {
		m.setFrom_email("kaiti.bvb09@gmail.com");
		m.setCreatedAt(new Date());
//		System.out.println("To Email: "+m.getFrom_email());
//		System.out.println("To Email: "+m.getTo_email());
//		System.out.println("To Email: "+m.getSubject_email());
//		System.out.println("To Email: "+m.getMessage_email());
//		System.out.println("To Email: "+m.getCreatedAt());
		if(mDao.sentEmail(m)) {
			// creates a simple e-mail object
	        SimpleMailMessage email = new SimpleMailMessage();
	        email.setTo(m.getTo_email());
	        email.setSubject(m.getSubject_email());
	        email.setText(m.getMessage_email());
	         
	        // sends the e-mail
	        mailSender.send(email);
			redir.addFlashAttribute("messge", "Message Sent Successfully.");
			return "redirect:/";
		}
		model.addAttribute("error", "Message Could Not Be Sent.");
		return "email";
	}

}
