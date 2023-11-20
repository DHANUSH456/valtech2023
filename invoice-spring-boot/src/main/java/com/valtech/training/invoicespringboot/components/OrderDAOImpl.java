package com.valtech.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.valtech.training.invoicespringboot.components.OrderDAOImpl.OrderRowMapper;
import com.valtech.training.invoicespringboot.components.VenderDAOImpl.VenderRowMapper;

@Component
public class OrderDAOImpl implements OrderDAO {

	public class OrderRowMapper implements RowMapper<Orders> {

		@Override
		public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
			Orders o = new Orders();
			o.setId(rs.getInt(1));
			o.setOrderDate(rs.getString(2));
			o.setCust_id(rs.getInt(3));
			o.setOrderDesc_id(rs.getInt(4));
			return o;
		}

	}

	@Autowired
	private DataSource dataSource;

	@Override
	public void createOrder(Orders order) {
		String createQry = "INSERT INTO ORDERS_TABLE (ID,ORDERDATE,CUST_ID,ORDERDESC_ID) VALUES (?,?,?,?)";
		new JdbcTemplate(dataSource).update(createQry, order.getId(), order.getOrderDate(), order.getCust_id(),
				order.getOrderDesc_id());

	}

	@Override
	public long count() {
		String countQry = "SELECT COUNT(ID) FROM ORDERS_TABLE";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);
	}

	@Override
	public void deleteOrder(int id) {
		String deleteQry = "DELETE FROM ORDERS_TABLE WHERE ID=?";
		new JdbcTemplate(dataSource).update(deleteQry, id);
	}

	@Override
	public void updateOrder(Orders order) {
		String updateQry = "UPDATE ORDERS_TABLE SET ID=?,ORDERDATE=?,CUST_ID=?,ORDERDESC_ID=? WHERE ID=?";
		new JdbcTemplate(dataSource).update(updateQry, order.getId(), order.getOrderDate(), order.getCust_id(),
				order.getOrderDesc_id());
	}

	@Override
	public Orders getOrder(int id) {
		String selectAllQry = "SELECT ID,ORDERDATE,CUST_ID,ORDERDESC_ID FROM ORDERS_TABLE WHERE ID=?" + id;
		return (Orders) new JdbcTemplate(dataSource).query(selectAllQry, new OrderRowMapper());
	}
}
