package TimesheetManagement.TimesheetManagementApplication.Repository;

import TimesheetManagement.TimesheetManagementApplication.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, Long> {
    List<StatusEntity> findAll();
}
