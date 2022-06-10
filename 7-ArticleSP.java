class ArticleSP {
  public static void main(String[] args) 
  {
    float cp, profitp, sp;
    cp = 2500f;
    profitp = 15f;
    sp = ((profitp/100) * cp) + cp;

    System.out.println("CP: "+cp+"/- Profit:"+profitp+"%");
    System.out.println("SP: " + sp + "/-");
  }
}