package lab7;


public class Child {
    private String name;
    private int age;
    private Toy[] toys;
    private int numberOfToys;

    public Child(String name, int age, Toy[] toys) {
        this.name = name;
        this.age = age;

        if (toys != null) {
            this.toys = new Toy[toys.length];
            for (int i = 0; i < toys.length; i++) {
                Toy current = toys[i];
                Toy toyCopy = new Toy(current.getToyID(), current.getToyName(), current.getToyQuantity(), current.getToyPrice());
                this.toys[i] = toyCopy;
            }
            this.numberOfToys = toys.length;
        } else {
            this.toys = new Toy[0];
            this.numberOfToys = 0;
        }
    }

    public int getNumberofToys() {
        return numberOfToys;
    }

    public int getChildAge() {
        return age;
    }

    public String getChildName() {
        return name;
    }


	public Toy[] getChildToy() {
	    	
	    	if (this.toys.length == 0) {
	    		
	    		return null;
	    	}
	
	        return toys;
	        
	    }

    public void setChildName(String name) {
        this.name = name;
    }

    public void setChildAge(int age) {
        this.age = age;
    }

    public void setChildToy(Toy[] toys) {
        if (toys != null) {
            this.toys = new Toy[toys.length];
            for (int i = 0; i < toys.length; i++) {
                Toy current = toys[i];
                Toy toyCopy = new Toy(current.getToyID(), current.getToyName(), current.getToyQuantity(), current.getToyPrice());
                this.toys[i] = toyCopy;
            }
            this.numberOfToys = toys.length;
        } else {
            this.toys = new Toy[0];
            this.numberOfToys = 0;
        }
    }

//    public String addToy(Toy toy) {
//        // Check if a toy with the same name already exists
//        for (int i = 0; i < numberOfToys; i++) {
//            if (toys[i].getToyName().equals(toy.getToyName())) {
//                // Update quantity of the existing toy
//                toys[i].setToyQuantity(toys[i].getToyQuantity() + toy.getToyQuantity());
//                return "Toy with the same name already exists. Toy is updated";
//            }
//        }
//
//        // Add the new toy to the toys array
//        Toy[] updatedToys = new Toy[numberOfToys + 1];
//        for (int i = 0; i < numberOfToys; i++) {
//            updatedToys[i] = toys[i];
//        }
//        updatedToys[numberOfToys] = toy;
//        toys = updatedToys;
//        numberOfToys++;
//        return "Toy is added";
//    }
    public String addToy(Toy toy) {
        // Check if a toy with the same name already exists
        for (int i = 0; i < numberOfToys; i++) {
            if (toys[i].getToyName().equals(toy.getToyName())) {
                // Update quantity of the existing toy
                toys[i].setToyQuantity(toys[i].getToyQuantity() + toy.getToyQuantity());
                return "Toy with the same name already exists. Toy is updated";
            }
        }
        
        Toy[] updatedToys = new Toy[toys.length + 1];

        System.arraycopy(toys, 0, updatedToys, 0, toys.length);

 
        updatedToys[toys.length] = toy;

        toys = updatedToys;

        numberOfToys ++;

        return "Toy is added";
    
        
    }
    public void donate(Child recipient) {
        Toy[] combined = new Toy[toys.length + recipient.numberOfToys];
        for (int i = 0; i < numberOfToys; i++) {
            combined[i] = toys[i];
        }
        for (int i = 0; i < recipient.numberOfToys; i++) {
            combined[numberOfToys + i] = recipient.toys[i];
        }

        recipient.setChildToy(combined);
        this.toys = new Toy[0];
        this.numberOfToys = 0;
    }

    public Child(Child other) {
        this.name = other.name;
        this.age = other.age;

        if (other.toys != null) {
            this.toys = new Toy[other.toys.length];
            for (int i = 0; i < other.toys.length; i++) {
                Toy current = other.toys[i];
                Toy toyCopy = new Toy(current.getToyID(), current.getToyName(), current.getToyQuantity(), current.getToyPrice());
                this.toys[i] = toyCopy;
            }
            this.numberOfToys = other.toys.length;
        } else {
            this.toys = new Toy[0];
            this.numberOfToys = 0;
        }
    }

    public void disposeToys() {
        this.toys = new Toy[0];
        this.numberOfToys = 0;
    }

    public String toString() {
        return "Child [" + name + "] of age <" + age + "> has (" + numberOfToys + ") toys";
    }
}
