package 연산게임;
	
//
//		 *   ARITHMETIC PROBLEM
//		 *
//		 * 1. ADD
//		 * 2. SUBTRACT
//		 * 3. MULTIPLY
//		 * 4. DIVIDE
//		 * 5. END OF JOB
//		 *    WHICH WOULD YOU LIKE
//		 *    PRESS NUMBER :
//		 */

		import java.io.IOException;
		import java.io.BufferedReader;
		import java.io.InputStreamReader;

		public class Exam26 {
		 static int[][] Program_Data = new int[2][25]; //문제가 들어있는 곳
		 
		 public static void main(String[] args)throws IOException{
		  
		  Problem_Dictionary();    // 난수를 이용하여 문제에 사용될 요소를 생성
		  while(true){      //임의 중단하지 않는한 무한반복
		   Select_Page(Program_Menu()); //메뉴 호출
		   
		  }
		 }
		 
		 
		 public static void Problem_Dictionary(){
		  /*
		   * 본 메소드는 0부터 100까지의 임의적인 숫자를 문제와 답안에 사용될 배열에 삽입하여 줍니다.
		   */
		  for(int i=0; i<Program_Data.length; i++){
		   for(int j=0; j<Program_Data[i].length; j++){
		    Program_Data[i][j]=(int)(Math.random()*100);
		   // System.out.print(Program_Data[i][j]+"\t"); // Test Code
		   }
		  // System.out.println(); // Test Code
		  }
		  return;
		 }
		 
		 
		 public static int Program_Menu()throws IOException{
		  /*
		   * 본 메소드는 프로그램의 메뉴 선택을 입출력 하는 메소드 입니다.
		   */
		  
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  
		  System.out.println("  ARITHMETIC PROBLEM\n");
		  System.out.println("1. ADD");
		  System.out.println("2. SUBTRACT");
		  System.out.println("3. MULTIPLY");
		  System.out.println("4. DIVIDE");
		  System.out.print("5. END OF JOB\n   WHICH WOULD YOU LIKE\n   PRESS NUMBER : ");
		  int Menu_Num = Integer.parseInt(in.readLine());
		  
		  return Menu_Num;
		 }
		 
		 
		 public static void Select_Page(int X)throws IOException{
		  /*
		   * 본 메소드는 사용자가 입력한 메뉴값을 판단하여 해당 프로세스로 이동시켜 주는 메소드입니다.
		   */
		  switch(X){
		   case 1: //ADD : 덧셈
		    ADD();
		    break;
		   case 2: //SUBTRACT : 뺄셈
		    SUBTRACT();
		    break;
		   case 3: //MULTIPLY : 곱셈
		    MULTIPLY();
		    break;
		   case 4: //MULTIPLY : 곱셈
		    DIVIDE();
		    break;
		   case 5: //END OF JOB : 프로그램 종료
		    System.out.println("프로그램을 종료합니다.\n");
		    System.exit(0);
		   default:
		     System.out.println("입력하신 숫자는 올바른 메뉴번호가 아닙니다. 다시 입력해주세요.");
		     Select_Page(Program_Menu());
		  }
		 }
		 
		 
		 public static void ADD()throws IOException{
		  
		  //덧셈문제 25문항을 출제하고 사용자의 답변에 즉각적으로 정답과 오답을 확인하여 최종점수를 출력하여 줍니다.
		  
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  int count=1; //문제 번호
		  int Request; //사용자가 프로그램에 요청한 답안
		  int Score=0; //1문제당 4점 씩임.
		  for(int i=0; i<Program_Data.length-1; i++){
		   for(int j=0; j<Program_Data[i].length; j++){
		    System.out.print(count+"번째 문제 : "+Program_Data[i][j]+"+"+Program_Data[i+1][j]+"는 얼마입니까 :>");
		    Request = Integer.parseInt(in.readLine());
		    if(Request==Program_Data[i][j]+Program_Data[i+1][j]){
		     System.out.println("OK");
		     Score+=4;
		    }
		    else System.out.println("FAULT");
		    count++;
		   }  
		  }
		  //총점을 출력
		  System.out.println("총점은 :"+Score+" 점 입니다.\n");
		 }
		 
		 
		 public static void SUBTRACT()throws IOException{
		  
		  //뺄셈문제 25문항을 출제하고 사용자의 답변에 즉각적으로 정답과 오답을 확인하여 최종점수를 출력하여 줍니다.
		  
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  int count=1; //문제 번호
		  int Request; //사용자가 프로그램에 요청한 답안
		  int Score=0; //1문제당 4점 씩임.
		  for(int i=0; i<Program_Data.length-1; i++){
		   for(int j=0; j<Program_Data[i].length; j++){
		    System.out.print(count+"번째 문제 : "+Program_Data[i][j]+"-"+Program_Data[i+1][j]+"는 얼마입니까 :>");
		    Request = Integer.parseInt(in.readLine());
		    if(Request==Program_Data[i][j]-Program_Data[i+1][j]){
		     System.out.println("OK");
		     Score+=4;
		    }
		    else System.out.println("FAULT");
		    count++;
		   }  
		  }
		  //총점을 출력
		  System.out.println("총점은 :"+Score+" 점 입니다.\n");
		 }
		 
		 public static void MULTIPLY()throws IOException{

		  //곱셈문제 25문항을 출제하고 사용자의 답변에 즉각적으로 정답과 오답을 확인하여 최종점수를 출력하여 줍니다.
		  
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  int count=1; //문제 번호
		  int Request; //사용자가 프로그램에 요청한 답안
		  int Score=0; //1문제당 4점 씩임.
		  for(int i=0; i<Program_Data.length-1; i++){
		   for(int j=0; j<Program_Data[i].length; j++){
		    System.out.print(count+"번째 문제 : "+Program_Data[i][j]+"*"+Program_Data[i+1][j]+"는 얼마입니까 :>");
		    Request = Integer.parseInt(in.readLine());
		    if(Request==Program_Data[i][j]*Program_Data[i+1][j]){
		     System.out.println("OK");
		     Score+=4;
		    }
		    else System.out.println("FAULT");
		    count++;
		   }  
		  }
		  //총점을 출력
		  System.out.println("총점은 :"+Score+" 점 입니다.\n");
		  return;
		 }

		 public static void DIVIDE()throws IOException{
		  //나눗셈문제 25문항을 출제하고 사용자의 답변에 즉각적으로 정답과 오답을 확인하여 최종점수를 출력하여 줍니다.
		  
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  int count=1; //문제 번호
		  int Request; //사용자가 프로그램에 요청한 답안
		  int Score=0; //1문제당 4점 씩임.
		  for(int i=0; i<Program_Data.length-1; i++){
		   for(int j=0; j<Program_Data[i].length; j++){
		    System.out.print(count+"번째 문제 : "+Program_Data[i][j]+"/"+Program_Data[i+1][j]+"는 얼마입니까 (소수 반올림 적용하여 답안작성):>");
		    Request = Integer.parseInt(in.readLine());
		    if(Request==Program_Data[i][j]/Program_Data[i+1][j]){
		     System.out.println("OK");
		     Score+=4;
		    }
		    else System.out.println("FAULT");
		    count++;
		   }  
		  }
		  //총점을 출력
		  System.out.println("총점은 :"+Score+" 점 입니다.\n");
		 }
		}
		
		
		
		
		
		

