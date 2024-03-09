package TimesheetManagement.TimesheetManagementApplication.Repository;

import TimesheetManagement.TimesheetManagementApplication.Entity.TimesheetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimesheetRepository extends JpaRepository<TimesheetEntity, Long> {
    List<TimesheetEntity> findAll();

    TimesheetEntity save(TimesheetEntity timesheetEntity);

//    int updateById(TimesheetEntity timesheetEntity, @NonNull Long id);
}
