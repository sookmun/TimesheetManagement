package TimesheetManagement.TimesheetManagementApplication.DTO;

import TimesheetManagement.TimesheetManagementApplication.Entity.Status;
import lombok.Data;

@Data
public class StatusDTO {
    private Long id;
    private Status status;
}
