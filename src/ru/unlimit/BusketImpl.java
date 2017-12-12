package ru.unlimit;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BusketImpl implements BasketInterface<Radiator> {
	
	private DB db;
	
	public BusketImpl(DB db){
		this.db=db;
	}
	@Override
	public void insert(Radiator rad) throws SQLException {
	PreparedStatement ps=(PreparedStatement)db.getCn().prepareStatement("INSERT INTO"+rad.getClass().getSimpleName()
			+"(name,price,count) VALUES (?,?,?)");
	ps.setString(1, rad.type+"-"+rad.size);
	ps.setDouble(2, rad.price);
	ps.setInt(3, rad.count);
	ps.execute();
		
	}

}
