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
        int r=(int)rayon;
        for (int y = -r; y <= r; y++) {
            for (int x = -r; x <= r; x++) {
                if (x * x + y * y <= r * r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
