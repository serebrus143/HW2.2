package hogwarts;

public abstract class HogwartsStudent {

    private String name;
    public int powerOfMagic;
    public int transgressionDistance;

    public HogwartsStudent(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    private int sumOfBaseCharacteristics(){
        return powerOfMagic + transgressionDistance;
    }

    protected abstract int sumOfCharacteristics();

    protected void compareToStudent(HogwartsStudent hogwartsStudent){
        int sumOfCharacteristics1 = this.sumOfCharacteristics();
        int sumOfCharacteristics2 = hogwartsStudent.sumOfCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2){
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getName(),
                    hogwartsStudent.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if(sumOfCharacteristics1 < sumOfCharacteristics2){
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    hogwartsStudent.getName(),
                    this.getName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        } else {
            System.out.printf(
                    "Студент %s и %s одинаковые (%d vs %d)%n",
                    hogwartsStudent.getName(),
                    this.getName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }
    }

    public void compareToHogwartsStudent(HogwartsStudent hogwartsStudent) {
        int sumOfCharacteristics1 = this.sumOfBaseCharacteristics();
        int sumOfCharacteristics2 = hogwartsStudent.sumOfBaseCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2){
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getName(),
                    hogwartsStudent.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if(sumOfCharacteristics1 < sumOfCharacteristics2){
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    hogwartsStudent.getName(),
                    this.getName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        } else {
            System.out.printf(
                    "Студент %s и %s одинаковые (%d vs %d)%n",
                    hogwartsStudent.getName(),
                    this.getName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }
    }

    @Override
    public String toString() {
        return "%s, сила магии: %d, сила трансгрессии: %d".formatted(name, powerOfMagic, transgressionDistance);
    }

    public void print(){
        System.out.println(this);
    }
}
