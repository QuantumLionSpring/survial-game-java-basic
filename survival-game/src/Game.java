
import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);
    public void login(){

        System.out.println("hayatta kalma oyununa hoşgeldiniz.");
        System.out.println("oyuna girmeden önce isminizi giriniz:");
        player = new Player("a");
        player.selectCha();
        start();
    }
   public void start() {
       while (true) {
           System.out.println();
           System.out.println("-----------------------------");
           System.out.println();
           System.out.println("Eylem gerçekleştirmek için bir yer seçiniz :");
           System.out.println("1.Güvenli Ev --> Size ait güvenli bir mekan düşman yok!");
           System.out.println("2.Mağara --> Karşınıza belki zombi çıkabilir. !");
           System.out.println("3.Orman --> Karşınıza belki vampir çıkabilir.");
           System.out.println("4.Nehir --> Karşınıza belki Ayı çıkabilir.");
           System.out.println("5.Mağaza --> silah yada zırh alabilirsiniz.");
           System.out.print("gitmek istediginiz yer:");
           int selLoc = scan.nextInt();
           while (selLoc < 0 || selLoc > 5) {
               System.out.print("lütfen geçerli bir yer seçiniz:");
               selLoc = scan.nextInt();
           }
           switch (selLoc) {
               case 1:
                   location = new SafeHouse(player);
                   break;
               case 2:
                   location = new Cave(player);
                   break;
               case 3:
                   location = new Forest(player);
                   break;
               case 4:
                   location = new River(player);
                   break;
               case 5:
                   location = new ToolStore(player);
                   break;
               default:
                   location = new SafeHouse(player);
                   break;
           }

           if(!location.getLocation()){
               System.out.println("Oyun Bitti.");
               break;
           }
       }
   }

}
