import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * ʵ�ֽӿ�
 * @author LiuL
 *
 */
public class Main {

	public static void main(String[] args) throws ScriptException, IOException {
		
		ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
		File file = new File("result.txt");  //���ɱ��������ļ�
		FileOutputStream fop = new FileOutputStream(file);
		
		//���û���ļ����Լ�����
		if (!file.exists()) {
		   file.createNewFile();
		}

		String s = "";
		int x=-1; //��Ŀ����		
		System.out.println("��������Ŀ��������");
		Scanner scan2 = new Scanner(System.in);
		while(x < 1 || x > 1000)
		{
		          try{
		        	  x = scan2.nextInt();
		          }catch(Exception e){
		              System.out.println("���벻����Ҫ������������");
		              scan2.next();
		              x=-1;
		        }
		        if((x < 1 || x > 1000) && x != -1)
		             System.out.println("���벻����Ҫ������������");
		}        
 		String serialNo = "201571030119";
		fop.write(serialNo.getBytes());    //��ѧ��д���ļ�
        fop.write("\r\n".getBytes());   //����
		
		int a = 0;//����ʽ�ĵ�һ�������
		int b = 0;//����ʽ�ĵڶ��������
		int c = 0;//����ʽ�ĵ����������
		int d = 0;//����ʽ�ĵ��ĸ������
		int e = 0;//����ʽ�ĵ���������
		
		int num = 0;//���
		String q="";      //��������ʽ
		Random random = new Random();	
		int i=0;
		while(i<x){
			a = (int) (Math.random()*100+1);
			b = (int) (Math.random()*100+1);
			c = (int) (Math.random()*100+1);
			d = (int) (Math.random()*100+1);
			e = (int) (Math.random()*100+1);
			
			int z = random.nextInt(5)%(5-3+1) + 3;//����һ��3-5֮���������������趨����ʽ����ֵ����		
			if(z == 3){
				//3��������������������
				int A = random.nextInt(4)%(4-1+1) + 1;
				switch(A){
					case 1: num = a + b;
					q = a + "+" + b;  
					break;
					case 2: num = a - b;
					q = a + "-" + b;
					break;
					case 3: num = a * b;
					q = a + "*" + b;
					break;
					default : 
					num = a / b; q = a + "/" + b;
					break;
				}
				int B = random.nextInt(4)%(4-1+1) + 1;
				switch(B){
					case 1: num = num + c; q = q + "+" + c;
					break;
					case 2: num = num - c; q = q + "-" + c;
					break;
					case 3: num = num * c; q = q + "*" + c;
					break;
					default : 
						num = num / c; q = q + "/" + c;
					break;
				}
			}
			
			if(z == 4){
				//4��������������������
				int A = random.nextInt(4)%(4-1+1) + 1;
				switch(A){
					case 1: num = a + b;  q = a + "+" + b; 
					break;
					case 2: num = a - b;  q = a + "-" + b; 
					break;
					case 3: num = a * b; q = a + "*" + b; 
					break;
					default : 
						num = a / b; q = a + "/" + b; 
					break;
				}
				int B = random.nextInt(4)%(4-1+1) + 1;
				switch(B){
					case 1: num = num + c;  q = q + "+" + c; 
					break;
					case 2: num = num - c;   q = q + "-" + c; 
					break;
					case 3: num = num * c;   q = q + "*" + c; 
					break;
					default :
						num = num / c;  q = q + "/" + c; 
					break;
				}
				
				int C = random.nextInt(4)%(4-1+1) + 1;
				switch(C){
					case 1: num = num + d;    q = q + "+" + d; 
					break;
					case 2: num = num - d;     q = q + "-" + d; 
					break;
					case 3: num = num * d;    q = q + "*" + d; 
					break;
					default :
						num = num / d;  q = q + "/" + d; 
					break;
				}
			}
			
			if(z == 5){
				//5�����������4�������
				int A = random.nextInt(4)%(4-1+1) + 1;
				switch(A){
					case 1: num = a + b;   q = a + "+" + b; 
					break;
					case 2: num = a - b;   q = a + "-" + b;
					break;
					case 3: num = a * b;   q = a + "*" + b;
					break;
					default :
					num = a / b; q = a + "/" + b; 
					break;
				}
				int B = random.nextInt(4)%(4-1+1) + 1;
				switch(B){
					case 1: num = num + c;  q = q + "+" + c;
					break;
					case 2: num = num - c;  q = q + "-" + c;
					break;
					case 3: num = num * c; q = q + "*" + c;
					break;
					default : 
					num = num / c;  q = q + "/" + c; 
					break;
				}
				int C = random.nextInt(4)%(4-1+1) + 1;
				switch(C){
					case 1: num = num + d;    q = q + "+" + d; 
					break;
					case 2: num = num - d;      q = q + "-" + d; 
					break;
					case 3: num = num * d;      q= q + "*" + d; 
					break;
					default : 
					num = num / d;  q = q + "/" + d;  
					break;
				}
				int D = random.nextInt(4)%(4-1+1) + 1;
				switch(D){ 
					case 1:     q = q + "+" + e; 
					break; 
					case 2:     q = q + "-" + e; 
					break;
					case 3:     q = q + "*" + e; 
					break;
					default : 
								num = num / d;  q = q + "/" + e;  
					break;
				}
			}
			String hush=String.valueOf(jse.eval(q));
			Double result=Double.parseDouble(hush);
		
			if(result<0 || result%1!=0)  {   continue;  }   //�������Ϊ�����ͷ�����
			fop.write((q+"=" + jse.eval(q)).getBytes());    //д����ʽ
	        fop.write("\r\n".getBytes());   //����
	        System.out.println(q+"="+jse.eval(q));
			q="";    result=(double) 0;  i++; //������Ϊ�գ����¿�ʼ
		}
		fop.close();  //�ر�ָ��
	}

}
