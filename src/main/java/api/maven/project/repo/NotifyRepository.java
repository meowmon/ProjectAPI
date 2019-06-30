/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface NotifyRepository extends CrudRepository<Notify, Long> {

	@Query("SELECT a FROM Notify a WHERE a.idUser = ?1")
	Optional<Notify> findByUserId(long id);
//	@Query("SELECT a FROM Course a WHERE a.status = ?1")
//    List<Course> getCourseByStatus(String status);
//	@Transactional
//	@Modifying
//	@Query("Delete from Enroll a where course_id = ?1")
//	void deleteCourseEnroll(long id);

	@Query("SELECT a FROM Notify a WHERE a.idUser = ?1 and a.status = unread")
	Optional<Notify> findUnreadByUserId(long id);
}