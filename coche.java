class coche 
{
	private String matricula, marca, modelo;
	private float km, combustible, consumer;
	
	public void ALTA( String mat, String mar, String mod, float cons )
	{
		matricula = mat;
		marca = mar;
		modelo = mod;
		consumer = cons;
	}

	public void VER_DATOS()
	{
		System.out.println(matricula);
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(km);
		System.out.println(combustible);
	}
	
	public float VER_KM()
	{
		return km;
	}

	public void REPOSTAR( float comb )
	{
		combustible = comb;
	}

	public void CIRCULAR( float dist )
	{
		float consumo =  consumer * dist;
		if( consumo < combustible )
		{
			combustible -= consumo;
			km += dist;
			if( combustible <= 5 )
			{
				this.RESERVA();
			}
		} else { 
			this.RESERVA();
		}
	}

	public void RESERVA()
	{
		System.out.println("REPOSTE CANTO ANTES");
		System.out.println("REPOSTE CANTO ANTES");
		System.out.println("REPOSTE CANTO ANTES");
		System.out.println("REPOSTE CANTO ANTES");
		System.out.println("REPOSTE CANTO ANTES");
	}
}
