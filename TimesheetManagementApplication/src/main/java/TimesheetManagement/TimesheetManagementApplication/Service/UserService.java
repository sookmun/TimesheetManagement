package TimesheetManagement.TimesheetManagementApplication.Service;

import TimesheetManagement.TimesheetManagementApplication.Entity.UserEntity;
import TimesheetManagement.TimesheetManagementApplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getUserList() {
        return userRepository.findAll();
    }
}
