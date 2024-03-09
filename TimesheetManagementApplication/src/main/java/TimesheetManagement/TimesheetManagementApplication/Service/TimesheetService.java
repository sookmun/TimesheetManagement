package TimesheetManagement.TimesheetManagementApplication.Service;

import TimesheetManagement.TimesheetManagementApplication.Entity.TimesheetEntity;
import TimesheetManagement.TimesheetManagementApplication.Repository.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimesheetService {
    @Autowired
    private TimesheetRepository timesheetRepository;

    public List<TimesheetEntity> getTimesheetList(){
        return timesheetRepository.findAll();
    }

    public Boolean createTimesheet(TimesheetEntity timesheetEntity){
        return timesheetRepository.save(timesheetEntity) != null;
    }

    public Boolean updateTimesheet(TimesheetEntity timesheetEntity){
        return timesheetRepository.save(timesheetEntity) !=null;
    }
}
