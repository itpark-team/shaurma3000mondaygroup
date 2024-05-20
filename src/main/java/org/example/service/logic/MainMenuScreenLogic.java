package org.example.service.logic;

import org.example.statemachine.TransmittedData;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class MainMenuScreenLogic {
    public SendMessage processWaitingCommandStart(String textFromUser, TransmittedData transmittedData) throws Exception {
        SendMessage messageToUser = new SendMessage();

        //todo create start logic

        return messageToUser;
    }
}
