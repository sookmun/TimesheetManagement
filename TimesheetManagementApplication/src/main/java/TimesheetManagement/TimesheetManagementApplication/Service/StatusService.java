package TimesheetManagement.TimesheetManagementApplication.Service;

import TimesheetManagement.TimesheetManagementApplication.Entity.StatusEntity;
import TimesheetManagement.TimesheetManagementApplication.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;

    public List<StatusEntity> getStatusList() {
        return statusRepository.findAll();
    }
}
