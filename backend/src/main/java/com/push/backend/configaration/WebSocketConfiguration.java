package com.push.backend.configaration;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
// @CrossOrigin(origins = "http://localhost:4200")
// Enables WebSocket message handling
@EnableWebSocketMessageBroker
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        /*
         * Register /socket endpoint,
         * setAllowedOriginPatterns is used to prevent CORS issue when using the
         * Angular application as a client
         *
         */
        // registry.addEndpoint("/socket").setAllowedOriginPatterns("*").withSockJS();
        // registry.addEndpoint("/socket").setAllowedOrigins("localhost:4200").withSockJS();
        registry.addEndpoint("/socket").setAllowedOriginPatterns("*").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        /*
         * enable a memory-based message broker to carry the topic messages
         * back to the client on destinations prefixed with /topic
         */
        config.enableSimpleBroker("/topic");
        /*
         * designates the /app prefix for messages that are bound for
         * methods annotated with @MessageMapping
         */
        config.setApplicationDestinationPrefixes("/app");
    }

}