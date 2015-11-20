import java.util.Scanner;
class gesCoche
{
	public static void main( String[] args )
	{
		String gbg;
		coche vehiculo = new coche();
		Scanner sc = new Scanner( System.in );
		
		int option;
		
		do {
			System.out.println( "ESCOJA OPCION:" );
			System.out.println( "[1] Alta nuevo vehiculo." );
			System.out.println( "[2] Ver datos de vehiculo." );
			System.out.println( "[3] Ver kilometraje de vehiculo." );
			System.out.println( "[4] Llenar deposito de vehiculo." );
			System.out.println( "[5] Circular con vehiculo." );
			System.out.println( "[6] SALIR." );
			
			option = sc.nextInt();
			
			switch( option )
			{
				case 1:
					gbg = sc.nextLine();
					System.out.println( "Matricula." );
					String _mat = sc.nextLine();
					System.out.println( "Marca." );
					//gbg = sc.nextLine();
					String _mar = sc.nextLine();
					System.out.println( "Modelo." );
					//gbg = sc.nextLine();
					String _mod = sc.nextLine();
					vehiculo.ALTA( _mat, _mar, _mod );
					break;
				case 2:
					System.out.println( "DATOS DEL VEHICULO" );
					vehiculo.VER_DATOS();
					break;
				case 3:
					System.out.println( "KILOMETROS DEL VEHICULO." );
					System.out.println( vehiculo.VER_KM() );
					break;
				case 4:
					System.out.println( "REPOSTAR... CANTIDAD?" );
					float cantidad = sc.nextInt();
					vehiculo.REPOSTAR( cantidad );
					break;
				case 5:
					System.out.println( "DISTANCIA DE TRAYECTO." );
					float distancia = sc.nextInt();
					vehiculo.CIRCULAR( distancia );
					break;
				case 6:
					break;
				default:
					System.out.println( "OPCION INCORRECTA " );
					break;
			}
		} while( option != 6 );
	}
}
