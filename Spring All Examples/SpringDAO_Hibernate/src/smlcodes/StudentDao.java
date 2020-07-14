package smlcodes;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public void saveEmployee(Student e) {
		template.save(e);
	}

	public void updateEmployee(Student e) {
		template.update(e);
	}

	public void deleteEmployee(Student e) {
		template.delete(e);
	}
}
