package simpleNLG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import simplenlg.features.Tense;
import simplenlg.framework.NLGFactory;
import simplenlg.lexicon.Lexicon;
import simplenlg.phrasespec.SPhraseSpec;
import simplenlg.realiser.english.Realiser;


public class pro2 {
	
	     
	    public static void main(String[] args) throws IOException {
	    	   String excelFilePath = "C:/Users/Vineet/Documents/sheet2.xls";
		      
		    FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	    	POIFSFileSystem fs = new POIFSFileSystem(inputStream);
	        HSSFWorkbook wb = new HSSFWorkbook(fs);
	        HSSFSheet sheet = wb.getSheetAt(0);
	 //       HSSFRow row;
	//        HSSFCell cell;
	        String[] names = new String[11];
	        int[][] a = new int[11][3];
	        int[][] b = new int[11][3];
	        int[][] c = new int[11][2];
	        int[][] d = new int[11][2];
	        String[] names1 = new String[11];
	        int[][] a1 = new int[11][3];
	        int[][] b1 = new int[11][3];
	        int[][] c1 = new int[11][2];
	        int[][] d1 = new int[11][2];
	        int i=-1;
	        int i1=-1;
            String Venue=null,MHT1=null, MHT2=null,TW=null,Decision=null,T1Total=null,T2Total=null,MOTM=null,
            		Winner=null,Team1=null,Team2=null;
	        int T1S=0, T2S=0, T1W=0, T2W=0;
            int rows; // No of rows
	        rows = sheet.getPhysicalNumberOfRows();
	        int k=0;
	        int cols = 0; // No of columns
	        int tmp = 0;

	        // This trick ensures that we get the data properly even if it doesn't start from first few rows
//	        for(int i = 0; i < 10 || i < rows; i++) {
//	            row = sheet.getRow(i);
//	            if(row != null) {
//	                tmp = sheet.getRow(i).getPhysicalNumberOfCells();
//	                if(tmp > cols) cols = tmp;
//	            }
//	        }
//
//	        for(int r = 0; r < rows; r++) {
//	            row = sheet.getRow(r);
//	            if(row != null) {
//	                for(int c = 0; c < cols; c++) {
//	                    cell = row.getCell((short)c);
//	                    if(cell != null) {
//	                        // Your code here
//	                    }
//	                }
//	            }
//	        }
	        Iterator<Row> iterator = sheet.iterator();
	        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
             
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                 k++; System.out.println(k);
                
                 if(10<k && k<=120)
                 {
                	if(k%10==1)
                	{
                		i++;	
                		names[i]=cell.getStringCellValue();
                        System.out.print(cell.getStringCellValue());
                	}
                		
                	if(k%10==2)
                    {
                        a[i][0]=i;
                		a[i][1]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }	
                	
                	if(k%10==3)
                    {
                		a[i][2]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }	
                	
                	if(k%10==4)
                    {
                        b[i][0]=i;
                		b[i][1]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }
                	
                	if(k%10==5)
                    {
                		b[i][2]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }
                	
                	if(k%10==6)
                    {
                        c[i][0]=i;
                		c[i][1]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }
                	
                	if(k%10==7)
                    {
                        d[i][0]=i;
                		d[i][1]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }
                	
                 } 
                 
               if(140<k && k<=250)
                 {
                	if(k%10==1)
                	{
                		i1++;	
                		names1[i1]=cell.getStringCellValue();
                        System.out.print(cell.getStringCellValue());
                	}
                		
                	if(k%10==2)
                    {
                        a1[i1][0]=i1;
                		a1[i1][1]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }	
                	
                	if(k%10==3)
                    {
                		a1[i1][2]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }	
                	
                	if(k%10==4)
                    {
                        b1[i1][0]=i1;
                		b1[i1][1]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }
                	
                	if(k%10==5)
                    {
                		b1[i1][2]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }
                	
                	if(k%10==6)
                    {
                        c1[i1][0]=i1;
                		c1[i1][1]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }
                	
                	if(k%10==7)
                    {
                        d1[i1][0]=i1;
                		d1[i1][1]=(int) cell.getNumericCellValue();
                        System.out.print(cell.getNumericCellValue());
                    }
                	
                 } 
			
				if(k==252)
				Venue=cell.getStringCellValue();
				
				
				if(k==254)
					MHT1=cell.getStringCellValue();

			
				if(k==256)
					MHT2=cell.getStringCellValue();				
				
			
				if(k==258)
					TW=cell.getStringCellValue();				

				
				if(k==260)
					Decision=cell.getStringCellValue();
				
			
				if(k==262)
					T1Total=cell.getStringCellValue();
				
				
				if(k==264)
					T2Total=cell.getStringCellValue();
					
				if(k==266)
					MOTM=cell.getStringCellValue();	
				
				if(k==268)
					Winner=cell.getStringCellValue();	
                
				if(k==270)
					Team1=cell.getStringCellValue();	
				
				if(k==272)
					Team2=cell.getStringCellValue();
				
				if(k==274)
					T1S=(int) cell.getNumericCellValue();
				
				if(k==276)
					T2S=(int) cell.getNumericCellValue();
				
				if(k==278)
					T1W=(int) cell.getNumericCellValue();
				
				if(k==280)
					T2W=(int) cell.getNumericCellValue();
				
				/*	switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue()+"1");
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue()+"2");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue()+"3");
                        break;
                 
                
                } */
                System.out.print("\t");
            }
            System.out.println();
        }
	        System.out.println(Venue+" "+MHT1+" "+MHT2+" "+TW+" "+Decision+" "+T1Total+" "+T2Total+" "
	        		+MOTM+" "+Winner+" "+Team1+" "+Team2+" "+T1S+" "+T2S+" "+T1W+" "+T2W);
	        
	        
	        int i3,i4,temp=0,temp1=0,temp2=0,temp3=0,temp4=0,temp5=0;
	        for(i4=0;i4<11;i4++)
        	{
	        	System.out.println(a[i4][0]+" "+a[i4][1]+" "+a[i4][2]);
        	}
	      /* 
	        System.out.println(a[i4][0]+" "+a[i4][1]+" "+a[i4][2]); 
	        System.out.println(a1[i4][0]+" "+a1[i4][1]+" "+a1[i4][2]);
    		System.out.println(c1[i4][0]+" "+c1[i4][1]);
    		System.out.println(c[i4][0]+" "+c[i4][1]);
    		System.out.println(d1[i4][0]+" "+d1[i4][1]);
    		System.out.println(d[i4][0]+" "+d[i4][1]); */
	        
	        System.out.println();
	        for(i3=0;i3<10;i3++)
	        {
	        	for(i4=0;i4<10;i4++)
	        	{
	        		if(a[i4][1]<a[i4+1][1])
	        		{	
	        			temp=a[i4][1];
	        		    a[i4][1]=a[i4+1][1];
	        			a[i4+1][1]=temp;
	        			
	        			temp=a[i4][0];
	        		    a[i4][0]=a[i4+1][0];
	        			a[i4+1][0]=temp;
	        			
	        			temp=a[i4][2];
	        		    a[i4][2]=a[i4+1][2];
	        			a[i4+1][2]=temp;
	        		}
	        		
	        		if(a1[i4][1]<a1[i4+1][1])
	        		{	
	        			temp1=a1[i4][1];
	        		    a1[i4][1]=a1[i4+1][1];
	        			a1[i4+1][1]=temp1;
	        			
	        			temp1=a1[i4][0];
	        		    a1[i4][0]=a1[i4+1][0];
	        			a1[i4+1][0]=temp1;
	        			
	        			temp1=a1[i4][2];
	        		    a1[i4][2]=a1[i4+1][2];
	        			a1[i4+1][2]=temp1;
	        		}
	        		
	        		if(c1[i4][1]<c1[i4+1][1])
	        		{	
	        			temp2=c1[i4][1];
	        		    c1[i4][1]=c1[i4+1][1];
	        			c1[i4+1][1]=temp2;
	        			
	        			temp2=c1[i4][0];
	        		    c1[i4][0]=c1[i4+1][0];
	        			c1[i4+1][0]=temp2;
	        		}
	        		
	        		if(c[i4][1]<c[i4+1][1])
	        		{	
	        			temp3=c[i4][1];
	        		    c[i4][1]=c[i4+1][1];
	        			c[i4+1][1]=temp3;
	        			
	        			temp3=c[i4][0];
	        		    c[i4][0]=c[i4+1][0];
	        			c[i4+1][0]=temp3;
	        		}
	        		
	        		if(d1[i4][1]<d1[i4+1][1])
	        		{	
	        			temp4=d1[i4][1];
	        		    d1[i4][1]=d1[i4+1][1];
	        			d1[i4+1][1]=temp4;
	        			
	        			temp4=d1[i4][0];
	        		    d1[i4][0]=d1[i4+1][0];
	        			d1[i4+1][0]=temp4;
	        		}
	        		
	        		if(d[i4][1]<d[i4+1][1])
	        		{	
	        			temp5=d[i4][1];
	        		    d[i4][1]=d[i4+1][1];
	        			d[i4+1][1]=temp5;
	        			
	        			temp5=d[i4][0];
	        		    d[i4][0]=d[i4+1][0];
	        			d[i4+1][0]=temp5;
	        		}
	        	}
	        }
	        
	        int i5;
	        	for(i4=0;i4<11;i4++)
	        	{
	        		i5=a[i4][0];
	        		System.out.println(names[i5]+" "+a[i4][1]+" "+a[i4][2]);
	        	}
	        	
	        	String[][] out=new String[12][9];
	        	out=null;

	        	String sb1=new String();
	        	
	        	
	        	inputParsing q = new inputParsing;
	        	
	        	//sentence 1
	        	out[0][0]="the match";
	        	out[0][5]=Venue;
	        	out[2][7]="b";
	        	out=q.parse(out);
	        	
	        	//sentence 2
	        	out[1][0]=TW;
	        	out[1][5]="the toss";
	        	out[2][7]="b";
	        	out=q.parse(out);
	        	
	        	//sentence 3
	        	out[2][0]=TW;
	        	out[2][5]="bat";
	        	out[2][7]="b";
	        	out=q.parse(out);
	        	
	        	//sentence 4
	        	if(TW.equals(Winner) && Decision=="Bat")
	        	{
	        		if(Winner.equals(Team1))
	        		{
	        			out[3][0]=Winner;
	        			out[3][2]="the match";
	        			sb1=Integer.toString(T1S-T2S);
	    	        	sb1=sb1 + " runs";
	        			out[3][5]=sb1;
	        			out[3][7]="b";
	    	        	out=q.parse(out);
	        		}		
	        		else if(Winner.equals(Team2))	
	        		{
	        			out[3][0]=Winner;
	        			out[3][2]="the match";
	        			sb1=Integer.toString(T1S-T2S);
	    	        	sb1=sb1 + " runs";
	        			out[3][5]=sb1;
	        			out[3][7]="b";
	    	        	out=q.parse(out);
	        		}
	        	}
	        	
	        	else if(!TW.equals(Winner) && Decision=="Bat")
	        	{
	        		if(Winner.equals(Team1))
	        		{
	        			out[3][0]=Winner;
	        			out[3][2]="the match";
	        			sb1=Integer.toString(10-T1W);
	    	        	sb1=sb1 + " wickets";
	        			out[3][5]=sb1;
	        			out[3][7]="b";
	    	        	out=q.parse(out);
	        		}	
	        		else if(TW.equals(Team2))	
	        		{
	        			out[3][0]=Winner;
	        			out[3][2]="the match";
	        			sb1=Integer.toString(10-T2W);
	    	        	sb1=sb1 + " wickets";
	        			out[3][5]=sb1;
	        			out[3][7]="b";
	    	        	out=q.parse(out);
	        		}
	        	}
	        	
	        	else if(TW.equals(Winner) && Decision=="Field")
	        	{
		        		if(Winner.equals(Team1))
		        		{
		        			out[3][0]=Winner;
		        			out[3][2]="the match";
		        			sb1=Integer.toString(10-T1W);
		    	        	sb1=sb1 + " wickets";
		        			out[3][5]=sb1;
		        			out[3][7]="b";
		    	        	out=q.parse(out);
		        		}	
		        		else if(TW.equals(Team2))	
		        		{
		        			out[3][0]=Winner;
		        			out[3][2]="the match";
		        			sb1=Integer.toString(10-T2W);
		    	        	sb1=sb1 + " wickets";
		        			out[3][5]=sb1;
		        			out[3][7]="b";
		    	        	out=q.parse(out);
		        		}
	        	}
	        	
	        	else if(!TW.equals(Winner) && Decision=="Field")
	        	{
	        		if(Winner.equals(Team1))
	        		{
	        			out[3][0]=Winner;
	        			out[3][2]="the match";
	        			sb1=Integer.toString(T1S-T2S);
	    	        	sb1=sb1 + " runs";
	        			out[3][5]=sb1;
	        			out[3][7]="b";
	    	        	out=q.parse(out);
	        		}
	        		else if(Winner.equals(Team2))	
	        		{
	        			out[3][0]=Winner;
	        			out[3][2]="the match";
	        			sb1=Integer.toString(T2S-T1S);
	    	        	sb1=sb1 + " runs";
	        			out[3][5]=sb1;
	        			out[3][7]="b";
	    	        	out=q.parse(out);
	        		}	
	        	}
	        	
	        	
	        	//sentence 5
	        	out[4][0]=Team1;
    			out[4][5]=T1Total;
    			out[4][7]="b";
	        	out=q.parse(out);
	        	
	        	//sentence 6
	        	out[5][0]=Team2;
    			out[5][5]=T2Total;
    			out[5][7]="b";
	        	out=q.parse(out);
	        	
	        	//sentence 7 
	        	out[6][0]=names[a[0][0]];
	        	sb1=null;
	        	sb1=Integer.toString(a[0][1]);
	        	sb1=sb1 + " runs";
	        	out[6][2]=sb1;
	        	sb1=null;
	        	sb1=Integer.toString(a[0][2]);
	        	sb1=sb1 + " balls";
	        	out[6][5]=sb1;
	        	out[6][7]="b";
	        	out=q.parse(out);
	        	
	        	//sentence 8
	        	out[7][0]=names1[a1[0][0]];
	        	sb1=null;
	        	sb1=Integer.toString(a1[0][1]);
	        	sb1=sb1 + " runs";
	        	out[7][2]=sb1;
	        	sb1=null;
	        	sb1=Integer.toString(a1[0][2]);
	        	sb1=sb1 + " balls";
	        	out[7][5]=sb1;
	        	out[7][7]="b";
	        	out=q.parse(out);
	        	
	        	//sentence 9
	        	out[8][0]=names[c[0][0]];
	        	sb1=null;
	        	sb1=Integer.toString(c[0][1]);
	        	sb1=sb1 + " wickets";
	        	out[8][2]=sb1;
	        	sb1=null;
	        	sb1=Integer.toString(b[c[0][0]][1]);
	        	sb1=sb1 + " overs";
	        	out[8][5]=sb1;
	        	out[8][7]="b";
	        	out=q.parse(out);
	        	
	        	//sentence 10
	        	out[9][0]=names1[c1[0][0]];
	        	sb1=null;
	        	sb1=Integer.toString(c1[0][1]);
	        	sb1=sb1 + " wickets";
	        	out[9][2]=sb1;
	        	sb1=null;
	        	sb1=Integer.toString(b1[c1[0][0]][1]);
	        	sb1=sb1 + " overs";
	        	out[9][5]=sb1;
	        	out[9][7]="b";
	        	out=q.parse(out);
	        	
	        	
	        	//sentence 11
	        	out[10][0]=MOTM;
	        	out[10][2]="the Player of the match";
	        	out[10][7]="b";
	        	out=q.parse(out);
	        	
	        	//sentence 12
	        	for(int n=0;n<11;n++)
	        	{
	        		if(MOTM.equals(names[n]))
	        		{	
	        			if(n!=a[0][0] && n!=c[0][0])
	        			{
	        				if(a[n][1]>50)
	        				{
	        					out[11][0]=names[n];
	        					sb1=null;
	        		        	sb1=Integer.toString(a[n][1]);
	        		        	sb1=sb1 + " runs";
	        		        	out[11][2]=sb1;
	        		        	sb1=null;
	        		        	sb1=Integer.toString(a[n][2]);
	        		        	sb1=sb1 + " balls";
	        		        	out[11][5]=sb1;
	        		        	out[11][7]="b";
	        		        	out=q.parse(out);
	        				}
	        				
	        				else if(c[n][1]!=0)
	        				{
	        					out[11][0]=names[n];
	        					sb1=null;
	        		        	sb1=Integer.toString(c[n][1]);
	        		        	sb1=sb1 + " wickets";
	        		        	out[11][2]=sb1;
	        		        	sb1=null;
	        		        	sb1=Integer.toString(b[n][1]);
	        		        	sb1=sb1 + " overs";
	        		        	out[11][5]=sb1;
	        		        	out[11][7]="b";
	        		        	out=q.parse(out);
	        				}
	        				
	        				
	        			}
	        		}
	        		
	        		if(MOTM.equals(names1[n]))
	        		{	
	        			if(n!=a1[0][0] && n!=c1[0][0])
	        			{
	        				if(a1[n][1]>0)
	        				{
	        					out[11][0]=names1[n];
	        					sb1=null;
	        		        	sb1=Integer.toString(a1[n][1]);
	        		        	sb1=sb1 + " runs";
	        		        	out[11][2]=sb1;
	        		        	sb1=null;
	        		        	sb1=Integer.toString(a1[n][2]);
	        		        	sb1=sb1 + " balls";
	        		        	out[11][5]=sb1;
	        		        	out[11][7]="b";
	        		        	out=q.parse(out);
	        				}
	        				
	        				else if(c[n][1]!=0)
	        				{
	        					out[11][0]=names1[n];
	        					sb1=null;
	        		        	sb1=Integer.toString(c1[n][1]);
	        		        	sb1=sb1 + " wickets";
	        		        	out[11][2]=sb1;
	        		        	sb1=null;
	        		        	sb1=Integer.toString(b1[n][1]);
	        		        	sb1=sb1 + " overs";
	        		        	out[11][5]=sb1;
	        		        	out[11][7]="b";
	        		        	out=q.parse(out);
	        				}
	        				
	        				
	        			}
	        		}	
	        	}
	        	
	        	
	        	
	        		
	        	Lexicon lexicon = Lexicon.getDefaultLexicon();                         // default simplenlg lexicon
	        	NLGFactory nlgFactory = new NLGFactory(lexicon);             // factory based on lexicon
	        	Realiser realiser = new Realiser(lexicon);
	        	Scanner sc=new Scanner(System.in);
	        	
	        	SPhraseSpec p = nlgFactory.createClause();
	        	
	        	System.out.println(); System.out.println();
	        	System.out.println("The article:");
	        	System.out.println(); System.out.println();
	        	
	        	int n1=0;
	        	for(n1=0;n1<12;n1++)
	        	{
	        	if(out[n1][0]!=null)
	        	p.setSubject(out[n1][0]);
	        		
	        	if(out[n1][1]!=null)
	        	p.setVerb(out[n1][1]);  // variant of be

	        	if(out[n1][2]!=null)	
	        	p.setObject(out[n1][2]);

	        	if(out[n1][3]!=null)
	        	p.addComplement(out[n1][3]);

	        	if(out[n1][4]!=null)
	        	p.setIndirectObject(out[n1][4]);

	        	if(out[n1][5]!=null)
	        	p.setPostModifier(out[n1][5]);

	        	if(out[n1][6]!=null)
	        		p.setPreModifier(out[n1][6]);

	        	if(out[n1][7]!=null)
	        		{
	        		if(out[n1][7]=="a")
	        			p.setTense(Tense.PRESENT);
	        		else if(out[n1][7]=="b")
	        			p.setTense(Tense.PAST);
	        		else if(out[n1][7]=="c")
	        			p.setTense(Tense.PRESENT);
	        		}	
	        	if(out[n1][8]=="n")
	        	p.setNegated(true);
	        	else
	        	p.setNegated(false);
	        	
	        	
	        	if(n1>9)
	        		{
	        			if(out[10][0]!=null)
	        				{
	        					String output = realiser.realiseSentence(p);
	        					System.out.println(output);
	        				}
	        		}
	        		
	        	else
	        		{	
	        			String output = realiser.realiseSentence(p);
	        			System.out.println(output);
	        		}
	        	
	        	
	        	}
	        	
	        	
	        	
//	       try
//	       {
//	    	   
//	    	   String excelFilePath = "C:/Users/Vineet/Documents/SC Allotment.xls";
//	       
//	        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
//	         
//	        Workbook workbook = new XSSFWorkbook(inputStream);
//	        Sheet firstSheet = workbook.getSheetAt(0);
//	        Iterator<Row> iterator = firstSheet.iterator();
//	         
//	        while (iterator.hasNext()) {
//	            Row nextRow = iterator.next();
//	            Iterator<Cell> cellIterator = nextRow.cellIterator();
//	             
//	            while (cellIterator.hasNext()) {
//	                Cell cell = cellIterator.next();
//	                 
//	                switch (cell.getCellType()) {
//	                    case Cell.CELL_TYPE_STRING:
//	                        System.out.print(cell.getStringCellValue());
//	                        break;
//	                    case Cell.CELL_TYPE_BOOLEAN:
//	                        System.out.print(cell.getBooleanCellValue());
//	                        break;
//	                    case Cell.CELL_TYPE_NUMERIC:
//	                        System.out.print(cell.getNumericCellValue());
//	                        break;
//	                }
//	                System.out.print(" - ");
//	            }
//	            System.out.println();
//	        }
//	         
//	        workbook.close();
//	        inputStream.close();
//	    
//	    
//	    }
//	    catch(Exception ioe) {
//	        ioe.printStackTrace();
//	    }
}
}






