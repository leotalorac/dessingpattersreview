package singleton;

/**
 * Capitan
 */
final class Captain {
    private static Captain captain;
    // prevent create new instances
    private Captain(){

    }
    public static synchronized Captain getCaptain(){
        if(captain == null){
            captain = new Captain();
            System.out.println("New captain in the team");
        }
        else{
            System.out.println("Already exist a captain");
            System.out.println("sending that one");
        }
        return captain;
    }
}