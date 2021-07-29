package com.jhs.exam.exam2.http.controller;

import com.jhs.exam.exam2.http.Rq;
import com.jhs.exam.exam2.util.Ut;

public class UsrHomeController extends Controller {
	@Override
	public void performAction(Rq rq) {
		switch (rq.getActionMethodName()) {
		case "main":
			actionShowMain(rq);
			break;
		case "doSendMail":
			actionDoSendMail(rq);
			break;
		default:
			rq.println("존재하지 않는 페이지 입니다.");
			break;
		}
	}

	private void actionShowMain(Rq rq) {
		rq.jsp("usr/home/main");
	}

	private void actionDoSendMail(Rq rq) {
		Ut.sendMail("jangka512@gmail.com", "reociwilzsujsbtd", "no-reply@lemon-cm.com", "레몬 커뮤니티 알림", "jangka512@gmail.com", "제목ㅋㅋㅋ", "내용 ㅋㅋㅋ");
	}
}