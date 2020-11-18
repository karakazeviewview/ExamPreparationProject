 //ランダムに「まどか」を出力するプログラム。
  2 //ただし、変数homuraの値が10を超えないといけない。
  3 //また、変数madokaに1が代入されたとき、
  4 //変数qbにランダムに値を入力し、一致したとき出力する。
  5 public class Homura{
  6   public static void main(String[] args){
  7     //変数homuraとmadokaに0を代入する。
  8     int homura = 0;
  9     int madoka = 0;
 10     //処理が完了するまで無限ループ
 11     while(true){
 12       if(homura < 10){//homuraの最低ループ回数を確認
 13         homura += 1;
 14         System.out.println("私は何度でもやり直す");
 15       }else if(homura >10 || madoka ==1){//homuraの最低ループ回数とmadokaの値を確認
 16         System.out.println("まどか");
 17         break;//処理が終わったので抜ける
 18       }else{//homuraが10以上、かつmadokaが0の時の処理
 19         homura += 1;
 20         System.out.println("私は何度でもやり直す");
 21         int qb = new java.util.Random().nextInt(10);
 22         if(qb == 9){
 23           madoka +=1;
 24           System.out.println("私もう迷わない");
 25         }
 26       
 27     }
 28   }
 29 }
