class Profit 
{
  public static void main(String[] args)
  {
    float cp, sp, r, pft, pftp;
    cp = 35000f;
    r = 4500f;
    sp = 42000f;
    pft = sp - (cp+r);
    pftp = (pft/sp)*100;
    System.out.println("CP: "+cp+"/- | Repair: "+r+"/- | SP: " + sp+"/-");
    System.out.println("Profit: " + pftp + "%");
  }
}