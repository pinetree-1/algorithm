package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B10798 {
	public static void main(String[] args) throws IOException {

		ArrayList<String> row1 = new ArrayList<>();
		ArrayList<String> row2 = new ArrayList<>();
		ArrayList<String> row3 = new ArrayList<>();
		ArrayList<String> row4 = new ArrayList<>();
		ArrayList<String> row5 = new ArrayList<>();
		
		ArrayList<ArrayList<String>> table  = new ArrayList<>(); 

		table.add(row1);
		table.add(row2);
		table.add(row3);
		table.add(row4);
		table.add(row5);
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        for(int i = 0; i<table.size(); i++) {
    		String[] input = br.readLine().split("");
    		int columnCount = 0;
    		for(String s : input) {
    			table.get(i).add(s);
    			columnCount++;
    		}
    		if(columnCount > 15) {
    			System.out.println("한줄에는 15자만 입력 가능해요");
    			System.exit(0);
    		}
        }
        
        int maxSize = 0;
        for(int i =0; i<table.size() ; i++) {
        	if(maxSize < table.get(i).size())
        		maxSize = table.get(i).size();
        }
        
        for(int i = 0 ; i<maxSize ; i++) {
        	for(int j = 0 ; j<table.size() ; j++) {
        		try {
        			System.out.print(table.get(j).get(i));
        		}catch(Exception e) {
        			System.out.print("");
        		}
        		
        	}
        }
	}
}
