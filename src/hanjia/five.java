package hanjia;
import java.util.*;

import java.util.*;

class game{
	Scanner sc = new Scanner(System.in);
 
	private String[][] board;
	private String player="#";
	String english[]= {"  ","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
	int sum1=0,mistake1=0;
	int sum2=0,mistake2=0;
 
	public game(){
  
	 board = new String[16][16];
	 
  
	 for(int i = 0;i<16;i++)//第0列英文
	 {
		 board[0][i]=english[i];
	 }
  
	 for(int j = 1;j<16;j++)//第0行數字
	 {
		 if(j<10)
			 board[j][0]=String.valueOf(j)+" ";
		 else
			 board[j][0]=String.valueOf(j);
   
	 }
  
	 for(int i=1;i<16;i++)//設定初始為-
	 {
		 for (int j = 1; j < 16; j++) {
			 board[i][j] = "-";
		 }
	 }
 	}

	void displayBoard() {//列印初始棋盤
  
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
	void play() {
	 boolean gameFinished2 = false;
  
        do {
         
        	System.out.println("===============================");
            
            displayBoard();
            
            System.out.println("===============================");
            
            System.out.println("玩家"+player+"請輸入下棋位置(x,y)，例如(A,1)");
            String eng=sc.next();
            int y=sc.nextInt();
            
            if(y>15||y<0){
            	System.out.println("輸入錯誤，請重新輸入");
    			reinput(sc.next(),sc.nextInt());
            	}
            else if(change(eng)==-1){//將輸入的英文換成數字
            	System.out.println("輸入錯誤，請重新輸入");
    			reinput(sc.next(),sc.nextInt());
            	}
            else {
            	play(change(eng),y);
            }
            
             for (int i = 0; i <= board.length - 5; i++) {//判斷橫的
            	 for (int j = 0; j <= board[i].length - 5; j++) {
         
            		 if(board[i][j]!="-") {//若五個-也會辨識成連線
            			 if(board[i][j].equals(board[i][j + 1]) &&
            					 board[i][j].equals(board[i][j + 2]) &&
            					 board[i][j].equals(board[i][j + 3]) &&
            					 board[i][j].equals(board[i][j + 4]))
            				 gameFinished2=true;
            		 	}
         
            	 	}
             	}
             for (int j = 0; j <= board.length - 5; j++) {//判斷直的
            	 for (int i = 0; i <= board[i].length - 5; i++) {
         
            		 if(board[i][j]!="-") {//若五個-也會辨識成連線
            			 if(board[i][j].equals(board[i + 1][j]) &&
            					 board[i][j].equals(board[i + 2][j]) &&
            					 board[i][j].equals(board[i + 3][j]) &&
            					 board[i][j].equals(board[i + 4][j]))
            				 gameFinished2=true;
            		 	}
         
            	 	}
             	}
             for (int i = 0; i <= board.length - 5; i++) {//判斷斜的左上右下
            	 for (int j = 0; j <= board[i].length - 5; j++) {
         
            		 if(board[i][j]!="-") {//若五個-也會辨識成連線
            			 if(board[i][j].equals(board[i + 1][j + 1]) &&
            					 board[i][j].equals(board[i + 2][j + 2]) &&
            					 board[i][j].equals(board[i + 3][j + 3]) &&
            					 board[i][j].equals(board[i + 4][j + 4]))
            				 gameFinished2=true;
            		 	}
         
            	 	}
             	}
             for (int i = 1; i <= board.length - 5; i++) {//判斷斜的右上左下
            	 for (int j = 1; j <= board[i].length - 5; j++) {
         
            		 if(board[i][j]!="-") {//若五個-也會辨識成連線
            			 if(board[i][j].equals(board[i - 1][j + 1]) &&
            					 board[i][j].equals(board[i - 2][j + 2]) &&
            					 board[i][j].equals(board[i - 3][j + 3]) &&
            					 board[i][j].equals(board[i - 4][j + 4]))
            				 gameFinished2=true;
            		 	}
         
            	 	}
             	}
             if(gameFinished2 !=true) {
            player = (player == "#") ? "%" : "#";}//交換順序
         
        }while(!gameFinished2);
        System.out.println("遊戲結束"+player+"獲勝");
        System.out.println("黑棋總共放棋子"+sum1+"次，錯誤"+mistake1+"次");
		System.out.println("白棋總共放棋子"+sum2+"次，錯誤"+mistake2+"次");
 
 }
 
	void play(int x,int y){
		
	 if(board[y][x]=="%"||board[y][x]=="#") { 
		 System.out.println("已有棋子，請重新輸入");
		 reinput(sc.next(),sc.nextInt());
	 }
  
	 else {
		 board[y][x]=player;//下棋
		 
		 	if(board[y][x]=="#") {//下棋次數
		 			sum1++;
		 	}
			if(board[y][x]=="%") {
					sum2++;
			}
	 }

 }
	int change(String eng) {//將輸入的英文換成數字
		for(int z=0;z<english.length;z++) {
			if(eng.equals(english[z])==true) {
				return z;
			}
		}	
		return -1;
	}
	
	void reinput(String eng,int y) {//重新輸入
		
		if(player=="#")
			mistake1++;
		else
			mistake2++;
		
		if(y>15||y<0){
        	System.out.println("輸入錯誤，請重新輸入");
			reinput(sc.next(),sc.nextInt());
        	}
        else if(change(eng)==-1){//將輸入的英文換成數字
        	System.out.println("輸入錯誤，請重新輸入");
			reinput(sc.next(),sc.nextInt());
        	}
        else {
        	play(change(eng),y);
        }
	}
	
}
public class five {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
  
		// 猜拳 
    String[] mora = { "剪刀", "石頭", "布" };
    
    boolean gameFinished1 = false;
   
    System.out.println("現在進行猜拳，決定比賽順序");
    
    do {
    	System.out.println("玩家1 請選擇（剪刀[0]、石頭[1]、布[2]）：");
    	int user1 = sc.nextInt();
    	System.out.println("玩家2 請選擇（剪刀[0]、石頭[1]、布[2]）：");
    	int user2 = sc.nextInt();

    	if (user1 == user2) {
    		System.out.println("平手，請重新猜拳");
    		gameFinished1 = false;
    	} else if ((user1 == 0 && user2 == 2) || (user1 == 1 && user2 == 0) || (user1 == 2 && user2 == 1)) {
    		System.out.println("玩家1持黑子(#)！");
    		gameFinished1 = true;
    	} else {
    		System.out.println("玩家2持黑子！(#)");
    		gameFinished1 = true;
    	}
    }while(!gameFinished1);
    
    System.out.println("持黑子之玩家先下子");   
    //五子棋遊戲開始
    game gameObj = new game();
    //初始棋盤
    gameObj.play();
          
  }
}