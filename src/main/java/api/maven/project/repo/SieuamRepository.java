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
public interface SieuamRepository extends CrudRepository<Sieuam, Long> {
	@Query("SELECT a FROM Sieuam a WHERE a.id_hoso = ?1")
    Sieuam record(long id);
//	@Modifying
//	@Query("Delete from Enroll a where course_id = ?1")
//	void deleteCourseEnroll(long id);
	@Transactional
	@Modifying
    @Query("UPDATE HoSo t SET t.has_sieuam = 1 WHERE t.id= ?1")
    public void updateTitle(long id);
}