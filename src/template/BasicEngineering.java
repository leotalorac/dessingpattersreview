package template;

/**
 * InnerBasicEngineering
 */
public abstract class BasicEngineering {
    public void completecourse(){
        completeMath();
        completeSoftSkills();
        completeSpecialPaper();
    }   
    public abstract void completeSpecialPaper();

    public void completeMath(){
        System.out.println("1. Mathematics");
    }
    public void completeSoftSkills(){
        System.out.println("2. SoftSkills");
    }
}
