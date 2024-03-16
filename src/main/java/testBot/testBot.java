package testBot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class testBot extends TelegramLongPollingBot {
    public testBot(@Value("${bot.token}") String botToken){
        super(botToken);
    }

    @Override
    public void onUpdateRecieved(Update update){

    }

    @Override
    public String getBotUsername(){
        return "testBot";
    }
}
