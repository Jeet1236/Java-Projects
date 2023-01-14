/* Abstract class Recipe Template contains all the data required to generate some bread recipe objects.
   Remember to inherit this with RecipeManager.
   
   You don't need to comment this class.  This is my mess.
   
   -Surbhi B. */

public abstract class RecipeTemplate
{
    protected String[] names = new String[]{"Banh mi tay", "Brioche", "Challah", "Generic White", "Gyeren-ppang", "Naan", "Pita"};
    protected float[] flour = new float[]{ 500f, 250f, 300f, 600f, 400f, 350f, 250f};
    protected float[] yeast = new float[]{ 1.5f, 3f, 2.5f, 1f, 2f, 4f, 0.5f};
    protected float[] sugar = new float[]{ 15f, 16f, 17f, 22f, 12f, 15f, 10f};
    protected float[] eggs = new float[]{ 0f, 4f, 3f, 0f, 6f, 0f, 0f};
    protected float[] butter = new float[]{ 0f, 250f, 100f, 0f, 0f, 0f, 0f};
    protected final int NUMRECIPES;
    public RecipeTemplate(){
    this.NUMRECIPES=this.names.length;
    }
}

/* All numbers listed are floats, hence the f at the end.  We don't really need double precision\
   for bread.*/