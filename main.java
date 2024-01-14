class player{
    String name;
    double health;
    int level;
    weapon weapon;
    armor armor;

    player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(armor armor){
        this.armor = armor;
    }

    void show(){
        System.out.println("\nPlayer Name : " + name);
        System.out.println("Health : " + health);
        weapon.show();
        armor.show();
    }
}

class weapon{
    String name;
    double attackPower;

    weapon(String name,double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void show(){
        System.out.println("Weapon :  " + name + " \nAttack Power : " + attackPower);
    }
}

class armor{
    String name;
    double defencePower;

    armor(String name,double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void show(){
        System.out.println("Armor : " + name + " \nDefence Power : " + defencePower);

    }
}



public class main{
    public static void main(String[] args) {
        player player1 = new player("Player 1", 100);
        player player2 = new player("Player2", 100);

        weapon sniper = new weapon("Sniper", 30);
        weapon sword = new weapon("Sword", 15);
        
        armor basicShield = new armor("Basic shield",10);  
        armor Caldera = new armor("Caldera", 20);

        player1.equipWeapon(sword);
        player1.equipArmor(basicShield);
        player1.show();

        player2.equipWeapon(sniper);
        player2.equipArmor(Caldera);
        player2.show();
    }
}
