package java_II_spring_M04_Lauren_Hall.homework.tacotruckmap;


import java.util.UUID;

public class TacoImpl {

    public enum Protein {
        CHICKEN,
        BEEF,
        PORK,
        BEAN
    }

    private Protein protein;

    private boolean hasCheeze;

    public final UUID orderNumber = UUID.randomUUID();

    public TacoImpl(Protein protein, boolean hasCheeze) {
        this.setProtein(protein);
        this.setHasCheeze(hasCheeze);
    }


	public boolean equals(TacoImpl tacoOrder) {
        return this.orderNumber.equals(tacoOrder.orderNumber);
    }

	public Protein getProtein() {
		return protein;
	}

	public void setProtein(Protein protein) {
		this.protein = protein;
	}

	public boolean isHasCheeze() {
		return hasCheeze;
	}

	public void setHasCheeze(boolean hasCheeze) {
		this.hasCheeze = hasCheeze;
	}



	
}
