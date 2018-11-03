package io.mattis.lunchclub.repository;


import io.mattis.lunchclub.domain.Member;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


/**
 * @author Mathias Bjerke
 */
public interface MemberRepository extends CrudRepository<Member, Long> {
	List<Member> findAll();
}
