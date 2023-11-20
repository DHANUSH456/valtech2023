package com.valtech.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomersDAOImpl implements CustomerDAO {
	public class CustomerRowMapper implements RowMapper<Customers> {

		@Override
		public Customers mapRow(ResultSet rs ,int rowNum) throws SQLException {
            Customers c=new Customers();
			c.setId(rs.getInt(1));
			c.setFname(rs.getString(2));
			c.setLname(rs.getString(3));
			c.setPhone(rs.getString(4));
			c.setEmail(rs.getString(5));
			c.setAddr_id(rs.getInt(6));
			c.setOrder_id(rs.getInt(7));
            return c;
		}

	}
	
	@Autowired
	private DataSource dataSource;

	@Override
	public void createCustomer(Customers customer) {
		String createQry = "INSERT INTO CUSTOMERS (ID,FNAME,LNAME,PHONE,EMAIL,ADDR_ID,ORDER_ID) VALUES (?,?,?,?,?,?,?)";
		new JdbcTemplate(dataSource).update(createQry, customer.getId(), customer.getFname(), customer.getLname(),
				customer.getPhone(), customer.getEmail(), customer.getAddr_id(), customer.getOrder_id());

	}

	@Override
	public long count() {
		String countQry = "SELECT COUNT(ID) FROM CUSTOMERS";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);
	}
	@Override
	public void deleteCustomers(int id) {
		String deleteQry = "DELETE FROM CUSTOMERS WHERE ID=?";
		new JdbcTemplate(dataSource).update(deleteQry, id);

}
	@Override
	public void updateCustomer(Customers customer) {
		String updateQry = "UPDATE CUSTOMERS SET ID=?,FNAME=?,LNAME=?,PHONE=?,EMAIL=?,ADDR_ID=?,ORDER_ID=? WHERE ID=?";
		new JdbcTemplate(dataSource).update(updateQry,customer.getId(), customer.getFname(), customer.getLname(),
				customer.getPhone(), customer.getEmail(), customer.getAddr_id(), customer.getOrder_id()  );
	}
	@Override
	public Customers getCustomer(int id) {
		String selectAllQry = "SELECT ID,FNAME,LNAME,PHONE,EMAIL,ADDR_ID,ORDER_ID FROM CUSTOMERS WHERE ID=?" + id;
		return (Customers) new JdbcTemplate(dataSource).query(selectAllQry, new  CustomerRowMapper());
	}

}




