public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "guvenli Ev");

    }
    public boolean getLocation(){
       player.setHealth(player.getrHealth());
        System.out.println("iyileştiniz");
        System.out.println("Suan Guvenli Evdesiniz..");
        return  true;
    }
}
