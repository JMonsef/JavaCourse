package modulo9.modelo;

import java.sql.SQLException;
import java.util.List;


public interface DAO {
	//responde a un patron de dise�o DAO
	//CRUD. ABMC
	public int agregar(Model pMod) throws ClassNotFoundException, SQLException;
	public int modificar(Model pMod)throws ClassNotFoundException, SQLException;
	public int eliminar(Model pMod)throws ClassNotFoundException, SQLException;
	public List<Model> leer(Model pMod)throws ClassNotFoundException, SQLException;
	

}
