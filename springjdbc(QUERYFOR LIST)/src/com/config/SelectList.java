package com.config;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SelectList {
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	
	public void select()
	{
		List l=jt.queryForList("select *From employee");
		System.out.println(l);
	}
}
