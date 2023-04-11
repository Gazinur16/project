package ru.tinkoff.edu.java.bot.service;

import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.objects.MessageContext;
import ru.tinkoff.edu.java.bot.dto.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResponseService {

    public String startResponse(User user, Long ctx){

        return "Приветик!";
    }

    public String trackResponse(User user, String secondArg){
        if(user!=null)
            if (user.links!=null) {
                user.links.add(secondArg);
                return "Link succefully added";
        }
        return "Press /start";

    }

    public String untrackResponse(User user, Long ctx){
        if(user!=null&&user.links!=null)
            return "Прекратили";
        return "Link succefully added";
    }

    public String listResponse(User user, Long ctx){
        if(user!=null)
            return "Тут список отслеживаемых ссылок:" + user.links.toString();
        return "Туть пусто!";
    }
}
