package lt.bt.messager.messanger.dto;

import lt.bt.messager.messanger.entity.MessageEntity;

public class Message {
    private String message;

    private Long receiverId;

    public Message() {
    }

    public Message(MessageEntity entity) {
        setMessage(entity.getMessage());
        setReceiverId(entity.getReceiverId());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }
}
