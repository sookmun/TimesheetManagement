package TimesheetManagement.TimesheetManagementApplication.Controller;

import TimesheetManagement.TimesheetManagementApplication.DTO.UserDTO;
import TimesheetManagement.TimesheetManagementApplication.Service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController {
    @Autowired
    private ModelMapper modelMapper;
    private UserService userService;

    @GetMapping(path = "/allUsers")
    public List<UserDTO> getUserList() {
        return userService.getUserList().stream().map(post -> modelMapper.map(post, UserDTO.class))
                .collect(Collectors.toList());
    }
}
