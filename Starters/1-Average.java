class Average
{
    public static void main(String[] args)
    {
        int eng, math, phy, chem, computer;
        float avg;

        eng = 93;
        math = 78;
        phy = 92;
        chem = 85;
        computer = 100;
        avg = (eng + math + phy + chem + computer) / 5;
        
        System.out.println("Average: " + avg);
    }
}