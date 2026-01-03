package net.saad.aichatbot.web;

import net.saad.aichatbot.agents.AIAgent;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
public class ChatController {
    private AIAgent aiAgent;

    public ChatController(AIAgent aiAgent) {
        this.aiAgent = aiAgent;
    }
    @GetMapping(value = "/chat" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public Flux<String> chat(String query ){
        return aiAgent.AnswerMe(query);
    }

}
