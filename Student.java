package HCQLDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {
	@Id
    @Column(name = "sid")
    private int id;
    @Column(name = "sname",nullable = false,length = 50)
    private String name;
    @Column(name = "sgender",nullable = false,length = 10)
    private String gender;
    @Column(name = "sage",nullable = false)
    private double age;
    @Column(name = "sdepartment",nullable = false,length = 30)
    private String department;
    @Column(name = "semail",nullable = false,length = 50,unique = true)
    private String email;
    @Column(name = "scontact",nullable = false,length = 20,unique = true)
    private String contact;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", department="
				+ department + ", email=" + email + ", contact=" + contact + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

}
