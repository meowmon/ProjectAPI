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
public interface UserRepository extends CrudRepository<User, Long> {
	@Query("SELECT a FROM User a WHERE a.code = ?1")
    User findByCode(String code);
//	@Transactional
//	@Modifying
//	@Query("Delete from Enroll a where User_id = ?1")
//	void deleteUserEnroll(long id);
	@Transactional
	@Modifying
	@Query("UPDATE User a SET a.password = ?1 WHERE a.id = ?2 ")
	void updatePassword(String password, long id);
	
	@Query("SELECT a FROM User a WHERE a.password = ?1 AND a.code = ?2")
    User login(String password, String username);
}