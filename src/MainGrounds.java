public class MainGrounds {
    static void main(){
    int day = 1;
    Season trending = Season.Le_Noir;
    System.out.println("===========Grand Magasin Sisyphe===========");
    System.out.println("Day: " + day);
    System.out.println("Current season: " + trending);
    System.out.println("===========================================");

        if(trending == Season.Le_Rouge) {
        System.out.println("Le Rouge is currently the trending season!");
            } else {
                System.out.println("Le Noir is currently the trending season!");
            }
    }

    enum Season{
        Le_Rouge,
        Le_Noir
    }

}
