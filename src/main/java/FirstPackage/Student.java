package FirstPackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*this is going to be entity Model this tell Hibernate to make a table out of it */
@Entity
@Table(name = "students_table")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="roll_Number")
	private Integer roll_Number;
	
	@Column(name="standerd")
	private String standerd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll_Number() {
		return roll_Number;
	}

	public void setRoll_Number(Integer roll_Number) {
		this.roll_Number = roll_Number;
	}
	public String getStanderd() {
		return standerd;
	}

	public void setStanderd(String standerd) {
		this.standerd = standerd;
	}
}
