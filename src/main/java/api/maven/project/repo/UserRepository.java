/** CREDITS : HiuHiu  -- Please don't remove this comment
 * 
 */
package api.maven.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
//	@Query("SELECT a FROM User a WHERE a.status = ?1")
//    List<User> getUserByStatus(String status);
//	@Transactional
//	@Modifying
//	@Query("Delete from Enroll a where User_id = ?1")
//	void deleteUserEnroll(long id);
}