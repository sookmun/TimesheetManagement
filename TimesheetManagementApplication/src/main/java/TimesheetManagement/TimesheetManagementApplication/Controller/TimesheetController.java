package TimesheetManagement.TimesheetManagementApplication.Controller;

import TimesheetManagement.TimesheetManagementApplication.DTO.TimesheetDTO;
import TimesheetManagement.TimesheetManagementApplication.Entity.TimesheetEntity;
import TimesheetManagement.TimesheetManagementApplication.Service.TimesheetService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@Slf4j
public class TimesheetController {
    @Autowired
    private ModelMapper modelMapper;
    private TimesheetService timesheetService;

    @GetMapping(path = "/allTimesheet")
    public List<TimesheetDTO> getAllTimesheet() {
        return timesheetService.getTimesheetList().stream().map(post -> modelMapper.map(post, TimesheetDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping(path = "/createTimesheet")
    public ResponseEntity createTimesheet(@RequestBody TimesheetDTO timesheetDTO){
        TimesheetEntity timesheetRequest = modelMapper.map(timesheetDTO, TimesheetEntity.class);
        try {
            timesheetService.createTimesheet(timesheetRequest);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception ex){
            log.error(ex.getMessage());
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
        }
    }

    @PutMapping(path = "/updateTimesheet")
    public ResponseEntity updateTimesheet(@RequestBody TimesheetDTO timesheetDTO){
        TimesheetEntity timesheetRequest = modelMapper.map(timesheetDTO, TimesheetEntity.class);
        try {
            timesheetService.updateTimesheet(timesheetRequest);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception ex){
            log.error(ex.getMessage());
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
        }
    }
}
