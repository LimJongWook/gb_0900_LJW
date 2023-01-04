package classTest;

class Company1 {
   static int sequence;
   static int total;
   int id;
   String name;
   int income;
   
//   초기화 블럭
//   생성자 호출될 때마다 실행
   {
      this.id = ++sequence;
   }
   
}

public class Market1 {
   public static void main(String[] args) {
      Company1 한동석 = new Company1();
      Company1 정유찬 = new Company1();
      Company1 오태양 = new Company1();
      Company1 김욱성 = new Company1();
      
      System.out.println(한동석.id);
      System.out.println(정유찬.id);
      System.out.println(오태양.id);
      System.out.println(김욱성.id);
      
//      Company.total += 한동석.income += 300;
//      Company.total += 정유찬.income += 1000;
//      Company.total += 오태양.income += 2000;
//      Company.total += 김욱성.income += 3000;
      
      한동석.income += 300;
      한동석.income += 700;
      정유찬.income += 1000;
      오태양.income += 2000;
      김욱성.income += 3000;
      
      Company.total += 한동석.income;
      Company.total += 정유찬.income;
      Company.total += 오태양.income;
      Company.total += 김욱성.income;
      
      System.out.println("회사 수익 : " + Company.total + "만원");
   }
}



















