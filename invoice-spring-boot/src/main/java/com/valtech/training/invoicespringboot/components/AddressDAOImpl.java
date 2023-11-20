package com.valtech.training.invoicespringboot.components;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class AddressDAOImpl implements AddressDAO {
	public class AddressRowMapper implements RowMapper<Address> {

		@Override
		public Address mapRow(ResultSet rs,int rowNum) throws SQLException {
			Address a = new Address();
			a.setId(rs.getInt(1));
			a.setBuildNo(rs.getInt(2));
			a.setStreet(rs.getString(3));
			a.setCity(rs.getString(4));
			a.setState(rs.getString(5));
			a.setCountry(rs.getString(6));
			a.setZipcode(rs.getInt(7));
			return a;
		}

	}

	@Autowired
	private DataSource dataSource;

	@Override
	public void createAddress(Address address) {
		String createQry = "INSERT INTO ADDRESS (ID,BUILDNO,STREET,CITY,STATE,COUNTRY,ZIPCODE) VALUES (?,?,?,?,?,?,?)";
		new JdbcTemplate(dataSource).update(createQry, address.getId(), address.getBuildNo(), address.getStreet(),
				address.getCity(), address.getState(), address.getCountry(), address.getZipcode());

	}

	public long count() {
		String countQry = "SELECT COUNT(ID) FROM ADDRESS";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);
	}

	@Override
	public void deleteAddress(int id) {
		String deleteQry = "DELETE FROM ADDRESS WHERE ID=?";
		new JdbcTemplate(dataSource).update(deleteQry, id);
	}

	@Override
	public void updateAddress(Address addr) {
		String updateQry = "UPDATE ADDRESS SET ID=? BUILDNO=? STREET=? CITY=?,STATE=?,COUNTRY=?,ZIPCODE=? WHERE ID=?";
		new JdbcTemplate(dataSource).update(updateQry, addr.getId(), addr.getBuildNo(), addr.getStreet(),
				addr.getCity(), addr.getState(), addr.getCountry(), addr.getZipcode());
	}

	@Override
	public Address getAddress(int id) {
		String selectAllQry = "SELECT ID,BUILDNO,STREET,CITY,STATE,COUNTRY,ZIPCODE FROM ADDRESS WHERE ID=?" + id;
		return (Address) new JdbcTemplate(dataSource).query(selectAllQry, new AddressRowMapper());
	}


}
