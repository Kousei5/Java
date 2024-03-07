
public class Sample {
    public static void main(String[] args) {
        Janken janken = new Janken();
        Honda honda = new Honda();

        Boolean flag;

        do{
            flag=honda.hoi(janken.startGame());//引数にstartGame()を入れることによって先に呼び出される
        }while(flag);//trueだったら繰り返し。負けるとtrue,勝つとfalse
        

    }
}
