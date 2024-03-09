package TimesheetManagement.TimesheetManagementApplication.DTO;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class TimesheetDTO {
    private Long id;
    private String projectName;
    private String task;
    private ZonedDateTime startDate;
    private ZonedDateTime endDate;
    private Long userId;
    private Long statusId;
}
