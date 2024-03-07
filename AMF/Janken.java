import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

class Janken {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    String[] str;
    List<String> artList = new ArrayList<>();

    public Janken() {//テキストブロック機能。これにより、マルチライン文字列を簡単に作成。
        String art0 = """
            　　　ノ从从ヽ
            　　／彡彡ミミ＼
            　 / ／￣￣￣＼∧
            　｜(　　三　　)｜
            　 Ｖ/@＼ッ／@ヽＶ
            　 (ﾘ ヽ ∧  ノﾘ)
            　　(　 ｜　　 )
            　　∧　 (_)　 /
            　　 (　(⊂⊃)　)
            　　  人      ﾉ
            　　 _|＼＿／|_
            　 ／ ヽ＿＿ノ ＼
            　｜ １８凵[●] ｜
            　｜|　　　　　|｜
            """;
        artList.add(art0);

        String art1 = """
            　　　ノ从从ヽ
            　　／彡彡ミミ＼
            　 / ／￣￣￣＼∧
            　｜(　　　　　)｜
            　 Ｖ /＼ッ／ヽＶ
            　 (ﾘ ヽ,∧ ,ノ ﾘ)
            　　(　 ｜　　 )
            　　∧　 (_)　 /
            　　 (　　　　)
            　　  人(⊂⊃)ﾉ
            　　 _|＼＿／|_
            　 ／ ヽ＿＿ノ ＼
            　｜ １８凵[●] ｜
            　｜|　　　　　|｜
            """;
        artList.add(art1);

        String art2 = """
            　　　ノ从从ヽ
            　　／彡彡ミミ＼
            　 / ／￣￣￣＼∧
            　｜(　　　　　)｜
            　 Ｖ /＼ッ／ヽＶ
            　 (ﾘヽ･ ∧･ ノﾘ)
            　　(　｜　　 )
            　　∧　(_) 　 /
            　　 (　　　　)
            　　 (⊂⊃)  ﾉ
            　　 _|＼＿／|_
            　 ／ ヽ＿＿ノ ＼
            　｜ １８凵[●] ｜
            　｜|　　　　　|｜
            """;
        artList.add(art2);

        String art3 = """
            　　　ノ从从ヽ
            　　／彡彡ミミ＼
            　 / ／￣￣￣＼∧
            　｜(　　　　　)｜
            　 Ｖ /＼ッ／ヽＶ
            　 (ﾘ ヽ ･∧  ･ノﾘ)
            　　(　  ｜　　)
            　　∧　  (_)　/
            　　 (　　　　)
            　　  人  (⊂⊃)ﾉ
            　　 _|＼＿／|_
            　 ／ ヽ＿＿ノ ＼
            　｜ １８凵[●] ｜
            　｜|　　　　　|｜
            """;
        artList.add(art3);

        String art4 = """
            　　　ノ从从ヽ
            　　／彡彡ミミ＼
            　 / ／￣￣￣＼∧
            　｜(　　　　　)｜
            　 Ｖ /＼ッ／ヽＶ
            　 (ﾘ ヽ･∧ ･ノ ﾘ)
            　　(　 ｜　　 )
            　　∧　 (_)　 /
            　　 (　　　　)
            　　  人(⊂⊃)ﾉ
            　　 _|＼＿／|_
            　 ／ ヽ＿＿ノ ＼
            　｜ １８凵[●] ｜
            　｜|　　　　　|｜
            """;
        artList.add(art4);
    }

    public boolean startGame() {
        str = new String[] {"グー", "チョキ",  "パー"};

        System.out.println("最初はグー、ジャンケン♪");
        
        boolean result = play();

        return result;
        
    }

    public boolean play(){
        for(int i=0; i<str.length; i++){
            System.out.printf("%d:%s,", i, str[i]);
        } 
        System.out.print("　　自分の手を入力してください: ");

        int player = -1;

        try{
            player = input.nextInt();
        }catch(Exception e){
            System.out.println("数字を入力してください");
            input.nextLine(); //改行をここで読み込ませる。
            return play();
        }

        if (player < 0 || player > str.length-1) {
            System.out.println("0から" + Integer.toString(str.length-1) + "の数字を入力してください。");//整数を文字列に変換してから、文字列と文字列を結合
            return play();
        }
        

        int computer = rand.nextInt(str.length);

        return judge(player,computer);
    }

    public boolean judge(int player,int computer){

        System.out.println("あなた:" + str[player] + " 相手:" + str[computer]);

        if ((player == 0 && computer == 1) || (player == 1 && computer == 2) || (player == 2 && computer == 0)) {
            System.out.println("\nあなたの勝ちです\n");
            return false;
        } else if (player == computer) {
            System.out.println("\n引き分け\n");
            return true;
        } else {
            System.out.println("\nあなたの負けです。\n");
            return true;
        }
    }

}
