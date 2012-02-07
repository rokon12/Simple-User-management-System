/**
 * 
 */
package com.iit.univdhaka.iis.domain.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.hibernate.type.BooleanType;

import com.mysql.jdbc.PreparedStatement;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
public class OneZeroBoolean extends BooleanType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 683071644678235278L;

	public Object get(ResultSet rs, String name) throws SQLException {
		if (rs.getObject(name) == null) {
			return null;
		}
		int code = rs.getInt(name);
		return code != 0;
	}

	public void set(PreparedStatement st, Object value, int index)
			throws SQLException {
		if (value == null) {
			st.setObject(index, null);
		} else {
			st.setInt(index, Boolean.TRUE.equals(value) ? 1 : 0);
		}
	}
}
