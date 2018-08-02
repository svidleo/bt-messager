package lt.bt.messager.messanger.dto;

import lt.bt.messager.messanger.entity.MessageEntity;

public class Message {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message() {
    }
    public Message(MessageEntity entity) {
        setMessage(entity.getMessage());
    }


}
