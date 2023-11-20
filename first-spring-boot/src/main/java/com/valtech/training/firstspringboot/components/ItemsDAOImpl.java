package com.valtech.training.firstspringboot.components;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ItemsDAOImpl implements ItemsDAO {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public long count() {
		
		String QueryCount = "SELECT COUNT(ITEMID) FROM ITEMS;";
		return new JdbcTemplate(dataSource).queryForObject(QueryCount, Long.class);
	}
	
	@Override
	public void createItems(Items item) {

		String createQuery = "INSERT INTO ITEMS (ITEMNAME, UNITPRICE) VALUES(?,?)";
		new JdbcTemplate(dataSource).update(createQuery, item.getItemName(),item.getUnitPrice());
	}

}
