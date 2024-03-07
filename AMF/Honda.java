public class Honda extends Janken{
    
    public boolean hoi(Boolean f) {
        if(f==true){
            return true;
        }
        str = new String[] {"上", "下",  "左",  "右"};
        System.out.println("あっち向いてホイ♪");

        return play();

    }
    public boolean judge(int player,int computer){
        System.out.println(artList.get(computer));

        System.out.println("あなた:" + str[player] + " 相手:" + str[computer]);
        if (player == computer) {
            System.out.println("\nやるやん\n");
            return false;
        } else {
            System.out.println("\nなんで負けたか明日までに考えといてください\n");
            return true;
        }
    }
}

