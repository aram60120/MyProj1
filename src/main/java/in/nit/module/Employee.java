package in.nit.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(generator = "increment")
private Integer empid;
private String empName;
}
