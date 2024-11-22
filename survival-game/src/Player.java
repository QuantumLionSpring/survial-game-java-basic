import java.util.Scanner;

public class Player {
    private String Name;
    private int damage;
    private int Health,rHealth;

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealth() {
        return rHealth;
    }

    public void setrHealth(int rHealth) {
        this.rHealth = rHealth;
    }

    private int money;

     Inventory  inv;

    public Player(String name) {
        this.Name = name;
        this.inv = new Inventory();

    }
    public int getTotalDamage(){
        return this.getDamage()+this.getInv().getDamage();
    }

    Scanner scan = new Scanner(System.in);

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void selectCha() {
        switch (chaMenu()) {
            case 1:
                initplayer("Samuray",5,21,15);
                break;
            case 2:
                initplayer("okcu",7,18,20);
                break;
            case 3:
                initplayer("Sovalye",8,24,5);
                break;
            default:
                initplayer("Samuray",5,21,15);
                break;
        }
        System.out.println("Karakter Oluşturuldu ! Adı= " + getName() + ",Hasar=" + getDamage() + ",Sağlık=" + getHealth() + ",Money=" + getMoney());
    }

    public void initplayer(String cNAme,int dmg,int hlth,int mny){

        setName(cNAme);
        setDamage(dmg);
        setHealth(hlth);
        setMoney(mny);
        setrHealth(hlth);
    }


    public int chaMenu() {
        System.out.println("Lütfen karakter seciniz:");
        System.out.println("1- Samuray \t Hasar : 5 \t sağlık:21 \t para :15");
        System.out.println("2- Okcu \t Hasar : 7 \t sağlık:18 \t para :20");
        System.out.println("3- sovalye \t Hasar : 8 \t sağlık:24 \t para:5");
        System.out.print("Karakter seciminiz :");
        int ChaID = scan.nextInt();
        while (ChaID < 1 || ChaID > 3) {
            System.out.println("geçerli karakter bir karakter seçiniz:");
            ChaID = scan.nextInt();

        }
        return ChaID;
    }



}
