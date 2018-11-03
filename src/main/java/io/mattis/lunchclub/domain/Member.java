package io.mattis.lunchclub.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


/**
 * @author Mathias Bjerke
 */
@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Member {
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE )
	private Long id;

	@CreationTimestamp
	private Date created;

	@NonNull
	private String name;

	@NonNull
	private String email;

	@NonNull
	private String phone;
}
