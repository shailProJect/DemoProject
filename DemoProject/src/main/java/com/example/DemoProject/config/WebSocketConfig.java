package com.example.DemoProject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import com.example.DemoProject.helpers.MyWebSocketHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer { // Implement WebSocketConfigurer interface

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // Register the WebSocket handler with a specific URL
        registry.addHandler(new MyWebSocketHandler(), "/chat")
                .addInterceptors(new HttpSessionHandshakeInterceptor()) // Optional: if you need to use session
                .setAllowedOrigins("*"); // Configure allowed origins
    }
}
