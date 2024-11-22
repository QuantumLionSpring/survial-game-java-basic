import java.sql.SQLOutput;
import java.util.Scanner;

public class ToolStore extends NormalLoc{

    public ToolStore(Player player) {
        super(player, "mağaza");
    }
    public  boolean getLocation(){
        System.out.println("Para:" + player.getMoney());
        System.out.println("1.Silahlar");
        System.out.println("2.Zırhlar");
        System.out.println("3.Cıkıs");
        System.out.print("seçiminiz:");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool){
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;
            default:
                break;
        }
        return true;
    }
    public int armorMenu(){
        System.out.println("1.hafif \t <Para : 5 - koruma : 1>");
        System.out.println("2.orta \t <Para : 35 - koruma : 3>");
        System.out.println("3.yuksek \t <Para : 45 - koruma : 5>");
        System.out.println("4. Cıkıs");
        System.out.println("Silah seçiniz:");
        int selArmorID = scan.nextInt();
        return  selArmorID;


    }
    public void buyArmor(int ItemID) {
        int avoid = 0,price = 0;
        String aName = null;

            switch (ItemID){
                case 1:
                    avoid = 1;
                    aName = "hafif";
                    price = 5;
                    break;
                case 2:
                    avoid = 3;
                    aName = "orta";
                    price = 35;
                    break;
                case 3:
                    avoid = 5;
                    aName = "yuksek";
                    price = 45;
                    break;
                case 4:
                    System.out.println("çıkış yaptınız.");
                    break;

                default:
                    System.out.println("geçersiz islem!!");
                    break;
            }
        if(price > 0){
            player.getInv().setArmor(avoid);
            player.getInv().setaName(aName);
            player.setMoney(player.getMoney()-price);
            System.out.println(aName+"satın aldınız engellenen hasar:"+player.getInv().getArmor() );
            System.out.println("Kalan Para: " + player.getMoney());
        }else {
            System.out.println("Bakiye Yetersiz!!");
        }

    }



    public int weaponMenu(){
        System.out.println("1.Tabanca \t <Para : 5 - Hasar : 2>");
        System.out.println("2.kilic \t <Para : 35 - Hasar : 3>");
        System.out.println("3.Tufek \t <Para : 45 - Hasar : 7>");
        System.out.println("4. Cıkıs");
        System.out.println("Silah seçiniz:");
        int selWeaponID = scan.nextInt();
        return  selWeaponID;
    }

    public void buyWeapon(int ItemID) {
        int damage = 0,price = 0;
        String wNAme = null;
        if (ItemID > 0 || ItemID < 4 ) {
            switch (ItemID){
                case 1:
                    damage = 2;
                    wNAme = "Tabanca";
                    price = 5;
                    break;
                case 2:
                    damage = 3;
                    wNAme = "Kilic";
                    price = 35;
                    break;
                case 3:
                    damage = 7;
                    wNAme = "Tufek";
                    price = 45;
                    break;
                case 4:
                    System.out.println("çıkış yaptınız.");
                    break;

                default:
                    System.out.println("geçersiz islem!!");
                    break;
            }
        }

        if(price > 0){
          player.getInv().setDamage(damage);
          player.getInv().setwName(wNAme);
          player.setMoney(player.getMoney()-price);
            System.out.println(wNAme+" Silahı satın aldınız önceki hasar:"+player.getDamage() + " \tYeni Hasar: " + player.getTotalDamage() );
            System.out.println("Kalan Para: " + player.getMoney());
        }else {
            System.out.println("Bakiye Yetersiz!!");
        }


    }









}
