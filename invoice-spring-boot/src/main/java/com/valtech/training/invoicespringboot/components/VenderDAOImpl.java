package com.valtech.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class VenderDAOImpl implements VenderDAO {
	public class VenderRowMapper implements RowMapper<Venders> {

		@Override
		public Venders mapRow(ResultSet rs,int rowNum) throws SQLException {
			Venders v=new Venders();
			v.setId(rs.getInt(1));
			v.setName(rs.getString(2));
			v.setEmail(rs.getString(3));
			v.setPhone(rs.getString(4));
			v.setAddr_id(rs.getInt(5));
			v.setItem_id(rs.getInt(6));
              return v;
		}

	}
	@Autowired
	private DataSource dataSource;

	@Override
	public void createVender(Venders vender) {
		String createQry = "INSERT INTO VENDERS (ID,NAME,EMAIL,PHONE,ADDR_ID,ITEM_ID) VALUES (?,?,?,?,?,?)";
		new JdbcTemplate(dataSource).update(createQry, vender.getId(), vender.getName(), vender.getEmail(),
				vender.getPhone(), vender.getAddr_id(), vender.getItem_id());

	}

	@Override
	public long count() {
		String countQry = "SELECT COUNT(ID) FROM VENDERS";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);
	}
	@Override
	public void deleteVender(int id) {
		String deleteQry = "DELETE FROM VENDERS WHERE ID=?";
		new JdbcTemplate(dataSource).update(deleteQry, id);
	}

	@Override
	public void updateVender(Venders vender) {
		String updateQry = "UPDATE VENDERS SET ID=?,NAME=?,EMAIL=?,PHONE=?,ADDR_ID=?,ITEM_ID=? WHERE ID=?";
		new JdbcTemplate(dataSource).update
		(updateQry,vender.getId(),vender.getName(),vender.getEmail(),vender.getPhone(),vender.getAddr_id(),vender.getItem_id());
	}
	@Override
	public Venders getVender(int id) {
		String selectAllQry = "SELECT ID,NAME,EMAIL,PHONE,ADDR_ID,ITEM_ID FROM VENDERS WHERE ID=?" + id;
		return (Venders) new JdbcTemplate(dataSource).query(selectAllQry, new  VenderRowMapper());
	}
}
