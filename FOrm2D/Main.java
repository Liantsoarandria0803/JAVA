public  class Main
{
	public static void main(String[] args)
	{
		Cercle cer1=new Cercle(12);
		Carre carr1=new Carre(4);
		System.out.println("Cercle :");
		System.out.println("Surface :");
		cer1.area();
		System.out.println("Perimetre :");
		cer1.perimeters();
		cer1.dessiner();

		System.out.println("Carre :");
		System.out.println("Surface :");
		carr1.area();
		System.out.println("Perimetre :");
		carr1.perimeters();
		carr1.dessiner();
	}
}
