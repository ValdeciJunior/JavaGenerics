package persistencia;

public class PersistenciaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericDAO<Administrador> admin = new GenericDAO<>();
		admin.create(new Administrador());
		
		GenericDAO<Diretor> dir = new GenericDAO<>();
		dir.create(new Diretor());
	}

}
