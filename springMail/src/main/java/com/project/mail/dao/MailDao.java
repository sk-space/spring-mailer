package com.project.mail.dao;

import com.project.mail.model.Mailer;

public interface MailDao {

	public boolean sentEmail(Mailer m);
	
}
