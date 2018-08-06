package lt.bt.messager.messanger.dto;


import lt.bt.messager.messanger.entity.User;

public class UserDTO {

    private Long id;

    private String name;

    public UserDTO() {
    }

    public UserDTO(User entity) {
        setId(entity.getUserId());
        setName(entity.getFirstname());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
