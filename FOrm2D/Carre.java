class Carre extends Form2D
{
	private float cote;
	public Carre (float co)
	{
		this.cote=co;
	}
	public void area()
	{
	System.out.println(cote*cote);
	}
	public void perimeters()
	{
	System.out.println(4*cote);
	}
	public void dessiner(){
		// System.out.println(cote);
		for(int i=0;i<cote;i++){
			for (int j=0;j<cote;j++){
				System.out.print("-");
			}
			System.out.println("");
		}
	}
}
