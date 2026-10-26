public class MainGrounds {
    static void main(){
    int dayno = 1;
    String season1 = "Le Rouge";
    String season2 = "Le Noir";
    System.out.println("===========Grand Magasin Sisyphe===========");
    System.out.println("Day: " + dayno);
    System.out.println("Current season: " + season1);
    System.out.println("===========================================");

    if(season1.equals("Le Rouge")) {
        System.out.println(season1 + " is currently the trending season!");
    } else {
        System.out.println(season2 + " is currently the trending season!");
    }
    }
}
