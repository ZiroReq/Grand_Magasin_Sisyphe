public class MainGrounds {
    static void main() {
    dashboard();
    }

    enum Season{
        Le_Rouge,
        Le_Noir
    }

    public static void dashboard(){
        int day = 28;
        Season trending;

        if (day % 2 == 0) {
            trending = Season.Le_Noir;
        } else {
            trending = Season.Le_Rouge;
        }
        System.out.println("===========Grand Magasin Sisyphe===========");
        System.out.println("Day: " + day);
        System.out.println("Current season: " + trending);
        System.out.println("===========================================");

        if (trending == Season.Le_Rouge) {
            System.out.println("Le Rouge is currently the trending season!");
        } else {
            System.out.println("Le Noir is currently the trending season!");
        }
    }
}
