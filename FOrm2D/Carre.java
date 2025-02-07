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
		System.out.println("Mahitsy ZORO");
	}
}
