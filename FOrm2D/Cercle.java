public class Cercle extends Form2D{
    private float rayon;
    public Cercle(float r){
        this.rayon=r;
    }
    public void area()
	{
	System.out.println(rayon*rayon*3.14);
	}
	public void perimeters()
	{
	System.out.println(2*rayon*(3.14));
	}
    public void dessiner(){
        System.out.println("Boribory");
    }
}
