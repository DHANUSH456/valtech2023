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
import com.valtech.training.invoicespringboot.components.OrderDescDAOImpl.OrderDescriptionRowMapper;

@Component
public class OrderDescDAOImpl implements OrderDescDAO {
	public class OrderDescriptionRowMapper implements RowMapper<OrderDescription> {

		@Override
		public OrderDescription mapRow(ResultSet rs, int rowNum) throws SQLException {
			OrderDescription d = new OrderDescription();
			d.setId(rs.getInt(1));
			d.setQuantity(rs.getInt(2));
			d.setItem_id(rs.getInt(3));
			d.setOrder_id(rs.getInt(4));

			return d;
		}

	}

	@Autowired
	private DataSource dataSource;

	@Override
	public void createOrderDesc(OrderDescription orderDesc) {
		String createQry = "INSERT INTO ORDERDESCRIPTION (ID,QUANTITY,ITEM_ID,ORDER_ID) VALUES (?,?,?,?)";
		new JdbcTemplate(dataSource).update(createQry, orderDesc.getId(), orderDesc.getQuantity(),
				orderDesc.getItem_id(), orderDesc.getOrder_id());

	}

	@Override
	public long count() {
		String countQry = "SELECT COUNT(ID) FROM ORDERDESCRIPTION";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);
	}

	@Override
	public void deleteOrderDesp(int id) {
		String deleteQry = "DELETE FROM ORDERDESCRIPTION WHERE ID=?";
		new JdbcTemplate(dataSource).update(deleteQry, id);
	}

	@Override
	public void updateOrderDesc(OrderDescription orderDesc) {
		String updateQry = "UPDATE ORDERDESCRIPTION SET ID=?,QUANTITY=?,ITEM_ID=?,ORDER_ID=? WHERE ID=?";
		new JdbcTemplate(dataSource).update(updateQry, orderDesc.getId(), orderDesc.getQuantity(),
				orderDesc.getItem_id(), orderDesc.getOrder_id());

	}

	@Override
	public OrderDescription getOrderDescription(int id) {
		String selectAllQry = "SELECT ID,QUANTITY,ITEM_ID,ORDER_ID FROM ORDERDESCRIPTION WHERE ID=?" + id;
		return (OrderDescription) new JdbcTemplate(dataSource).query(selectAllQry, new OrderDescriptionRowMapper());
	}

}
