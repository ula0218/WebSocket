package com.example.ws.handler;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWsHandler extends TextWebSocketHandler {

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage text) throws Exception {
		String message = text.getPayload();
		
		System.out.println("recive message:"+message);
		
		session.sendMessage(new TextMessage("recive:"+message));
		

	}

}
