package com.valtech.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.valtech.training.invoicespringboot.components.CustomersDAOImpl.CustomerRowMapper;
import com.valtech.training.invoicespringboot.components.ItemsDAOImpl.ItemRowMapper;

@Component
public class ItemsDAOImpl implements ItemsDAO {
	public class ItemRowMapper implements RowMapper<Items> {

		@Override
		public Items mapRow(ResultSet rs,int rowMap) throws SQLException {
			Items i= new Items();
			i.setId(rs.getInt(1));
			i.setItemName(rs.getString(2));
			i.setDescription(rs.getString(3));
			i.setUnitPrice(rs.getDouble(4));
			i.setVender_id(rs.getInt(5));
			i.setOrderDesc_id(rs.getInt(6));
			return i;
			

		}

	}
	@Autowired
	private DataSource dataSource;

	@Override
	public void createItems(Items item) {
		String createQry = "INSERT INTO ITEMS_TABLE (ID,ITEMNAME,DESCRIPTION,UNITPRICE,VENDER_ID,ORDERDESC_ID) VALUES (?,?,?,?,?,?)";
		new JdbcTemplate(dataSource).update(createQry, item.getId(), item.getItemName(), item.getDescription(),
				item.getUnitPrice(), item.getVender_id(), item.getOrderDesc_id());
	}

	@Override
	public long count() {
		String countQry="SELECT COUNT(ID) FROM ITEMS_TABLE";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);
	}
	@Override
	public void deleteItems(int id) {
		String deleteQry = "DELETE FROM ITEMS_TABLE WHERE ID=?";
		new JdbcTemplate(dataSource).update(deleteQry, id);

}
	@Override
	public void updateItem(Items item) {
		String updateQry = "UPDATE ITEMS_TABLE SET ID=?,ITEMNAME=?,DESCRIPTION=?,UNITPRICE=?,VENDER_ID=?,ORDERDESC_ID=? WHERE ID=?";
		new JdbcTemplate(dataSource).update(updateQry,item.getId(), item.getItemName(), item.getDescription(),
				item.getUnitPrice(), item.getVender_id(), item.getOrderDesc_id()  );
	}
	@Override
	public Items getItems(int id) {
		String selectAllQry = "SELECT ID,ITEMNAME,DESCRIPTION,UNITPRICE,VENDER_ID,ORDERDESC_ID FROM ITEMS_TABLE WHERE ID=?" + id;
		return (Items) new JdbcTemplate(dataSource).query(selectAllQry, new  ItemRowMapper());
	}
}
