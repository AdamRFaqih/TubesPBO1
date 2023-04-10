package Pokemon;

public abstract class Pokemon {
    private String name;
    private int HP;
    private String type;
    private int attack;
    private int defend;
    private boolean defendBuff;

    public Pokemon(String name, int HP, String type, int attack, int defend) {
        this.name = name;
        this.HP = HP;
        this.type = type;
        this.attack = attack;
        this.defend = defend;
        defendBuff = false;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public String getType() {
        return type;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefend() {
        return defend;
    }

    public void defend(){
        if (!defendBuff){
            defend =+ 10;
            defendBuff = true;
        }
    }
    public void getAttacked(int damage){
        HP -= (damage - (defend * 0.2));
        System.out.println("Normal Attack");
    }
    public void getAttackedByElement(String type, int damage){
        switch (this.type){
            case "Normal":
                if (type.equals("Fighting")){
                    HP -= (damage * 2);
                    System.out.println("Super Effective");
                    break;
                } else if (type.equals("Ghost")) {
                    System.out.println("No Effect");
                    break;
                }
            case "Fire":
                if (type.equals("Fire")){
                    HP -= (damage *0.5);
                    System.out.println("Not Very Effective");
                    break;
                } else if (type.equals("Water")) {
                    HP -= (damage * 2);
                    System.out.println("Super Effective");
                    break;
                } else if (type.equals("Grass")) {
                    HP -= (damage * 0.5);
                    System.out.println("Not Very Effective");
                    break;
                } else if (type.equals("Ground")) {
                    HP -= (damage * 2);
                    System.out.println("Super Effective");
                    break;
                } else if (type.equals("BUG")) {
                    HP -= (damage * 0.5);
                    System.out.println("Not Very Effective");
                    break;
                } else if (type.equals("Rock")) {
                    HP -= (damage * 2);
                    System.out.println("Super Effective");
                    break;
                }
            case "Water":
                if (type.equals("Fire")){
                    HP -= (damage * 0.5);
                    System.out.println("Not Very Effective");
                    break;
                } else if (type.equals("Water")) {
                    HP -= (damage * 0.5);
                    System.out.println("Not Very Effective");
                    break;
                } else if (type.equals("Electric")) {
                    HP -= (damage * 2);
                    System.out.println("Super Effective");
                    break;
                } else if (type.equals("Grass")) {
                    HP -= (damage * 2);
                    System.out.println("Super Effective");
                    break;
                } else if (type.equals("Ice")) {
                    HP -= (damage * 0.5);
                    System.out.println("Not Very Effective");
                    break;
                }
            default:
                HP -= damage;
                System.out.println("Effective");
        }
    }
}
