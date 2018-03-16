/*********************************************************************************
 * Author: Anujj Saxena
 *  The following code gives next earliest time that can display same permutation of the digits(24hr-format)
 * *******************************************************************************
 */
package test;
import java.util.ArrayList;
import java.util.Arrays;
public class DigitalClock {

	
	
	 public static void main(String[] args) {
		 String S = "22:58";
		 int  a = Integer.parseInt(S.substring(0, 1));
		 int  b = Integer.parseInt(S.substring(1, 2));
		 int  c = Integer.parseInt(S.substring(3, 4));
		 int  d = Integer.parseInt(S.substring(4));
		 Boolean[] verfier = new Boolean[4];
		 Arrays.fill(verfier, Boolean.FALSE);
		 
		 int a_ = a;
		 int b_ =b;
		 int c_ = c;
		 int d_ = d; 	 
			 while((verfier[0]==false || verfier[1]==false ||verfier[2]==false || verfier[3]==false)) {
			 ArrayList<Integer> initial = new ArrayList<>();
			 initial.add(a);initial.add(b);initial.add(c);initial.add(d);
			 if(d_==9) {
				 d_ = 0;
				 if(c_ ==5) {
				 c_= 0;
				 if((b_==9)||(a_==2 && b_==4)){b_ = 0;
				 if(a_==2){
					 a_=0;
				 }else{a_++;}}else{b_++;}}else {
					 c_++;
				 }
				 }else { d_= d_+1;}
	
			 if(initial.contains(d_) ) {
				 verfier[0] = true; 
				 initial.remove(initial.indexOf(d_));
	
				 if(initial.contains(c_) ) {
					 verfier[1] = true;
					 initial.remove(initial.indexOf(c_));
	
					 if(initial.contains(b_) ) {
						 verfier[2] = true;
						 initial.remove(initial.indexOf(b_));
	
						 if(initial.contains(a_) ) {

							 verfier[3] = true;
							 initial.remove(initial.indexOf(a_));
							 } }
			 }
			 
		 }
	 }System.out.println(a_+""+b_+":"+c_+""+d_);

	 }

}