

class DiabloCharacter {
	
	// Properties
	String strName;
	int dex;
	int strength;
	int vitality;
	double experience;
	int intelligence;
	int level;
	
	// Constant variable
	int MAX_LEVEL = 99;
	
	// 1 = normal, 2 = nightmare, 3 = hell
	int difficulty = 1;

	// Constructor - these arguments are required when creating a new DiabloCharacter

	public DiabloCharacter(String name, int d, int s, int v) {
		strName = name;
		dex = d;
		strength = s;
		vitality = v;			
	}
	public DiabloCharacter() { }
	
	// This is a public method
	// This is a function, normally has to return a value
	// unless void is used
	public void stats() {
		System.out.println("Name: " + strName);
		System.out.println("Dex: " + dex);
		System.out.println("Strength: " + strength);
		System.out.println("Vitality: " + vitality);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("EXP: " + experience);
		System.out.println("");
	}

	void killMonster(int dif) {
		if (dif == 1) {
			experience = experience + 10;
		} else if (dif == 2) {
			experience = experience + 20;
		} else if (dif == 3) {
			experience = experience + 30;
		}
	}


	void justGotLaid() {
		experience = experience + 1000;
	}


	
    float calculateSquareFeet(float l, float w)
    {
    	return (l * w);
    }
}

// DiabloCharacter is the superclass or parent class
// Barbarian is the subclass or child class
class Barbarian extends DiabloCharacter {
	// still have access to all the properties in the DiabloCharacter
	// still have access to all the methods/functions in the DiabloCharacter
	
	public Barbarian(String name, int d, int s, int v) {
		super(name, d, s, v);
	}
	
	void hasABabyBarb() {
		experience = experience + 1;
	}
	void blowjob() {
		experience = experience + 100;
	}	
	void receivedSTD() {
		experience = experience - 100;
	}


}
class Amazon extends DiabloCharacter {
	// still have access to all the properties in the DiabloCharacter
	// still have access to all the methods/functions in the DiabloCharacter

	public Amazon(String name, int d, int s, int v) {
		super(name, d, s, v);
	}
	
	void atePussy() {
		experience = experience + 100;
	}
	void dropsPanties() {
		experience = experience + 1000;
	}

}





	


