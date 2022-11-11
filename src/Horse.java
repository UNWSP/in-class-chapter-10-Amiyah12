
public class Horse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		private String name;
		private String color;
		private int birthYear;
		public String GetName;
		{
			return name;
			
		}
		
		public String getColor()
		{
			return color;
			
		}
		
		public int getBirthyear
		{
			retrun birthYear;
			
		}
		
		public void setName(String n)
		{
			name = n;
			
		}
		
		public void setColor(String c)
		{
			color = c;
		}
		
		public voit setBirthyear(int y)
		{
			birthYear = y;
		}

	}

}

public class DemoHorse
{
	public static void main(String args[])
	{
		Horse horse1 = new Horse();
		RaceHorse horse2 = new RaceHorse();
		horse1.setName("Bullseye");
		horse1.setColor("brown");
		horse1.birthYear("2011");
		horse2.setName("Cassey");
		horse2.setColor("black");
		horse2.setbirthYear("2010");
		horse2.setRaces(8);
		
		System.out.println(horse1.getName()+horse1.getColor()+horse1.getbirthYear());
		
		
	}
}

public class RaceHorse extends Horse
{
	private int race;
	public int getRace()
	{
		return race;
		
	}
	public void setRace(int numRace)
	{
		race = numRace;
	}
}
