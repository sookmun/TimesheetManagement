package TimesheetManagement.TimesheetManagementApplication.Controller;

import TimesheetManagement.TimesheetManagementApplication.DTO.StatusDTO;
import TimesheetManagement.TimesheetManagementApplication.Service.StatusService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@AllArgsConstructor
public class StatusController {
    @Autowired
    private ModelMapper modelMapper;

    private StatusService statusService;

    @GetMapping(path = "/allStatus")
    public List<StatusDTO> getStatusList() {
        return statusService.getStatusList().stream().map(post -> modelMapper.map(post, StatusDTO.class))
                .collect(Collectors.toList());
    }
}
