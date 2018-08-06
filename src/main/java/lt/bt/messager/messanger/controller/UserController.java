package lt.bt.messager.messanger.controller;

import lt.bt.messager.messanger.dto.UserDTO;
import lt.bt.messager.messanger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping()
    public List<UserDTO> fetchUsers() {
        return userService.fetchUsers().stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }
}
