package edu.monmouth.labFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Lab3 {
	public static void main(String[] args) {
		
		try {
			PrintStream stream = new PrintStream(Lab3Constants.OUT_FILE);
			System.setOut(stream);
			System.setErr(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Can't find output file.");
			e.printStackTrace();
			System.exit(Lab3Constants.FNFERROR);
		}
		
		Competitor[] competitors = new Competitor[Lab3Constants.SIZE];
		String[] golfString = new String[Lab3Constants.SIZE];
		
		File golf = new File(Lab3Constants.GOLFFILE);
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(golf));
			int count = 0;
			String readLine = reader.readLine();
			while (readLine != null) {
				golfString[count] = readLine;
				readLine = reader.readLine();
				count++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Can't find input file" + Lab3Constants.GOLFFILE);
			e.printStackTrace();
			System.exit(Lab3Constants.READFILENOTFOUND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("IO Exception: Can't read lines.");
			e.printStackTrace();
			System.exit(Lab3Constants.IOERROR);
		}
		
		int count = 0;
		for(String string: golfString) {
			String[] parsed = string.split(",");
			int score = Integer.parseInt(parsed[Lab3Constants.SCOREOFFSET]);
			competitors[count++] = new Competitor(parsed[Lab3Constants.NAMEOFFSET], score);
		}
		
		Arrays.sort(competitors);
		System.out.println("Golfers:");
		for(Competitor comp : competitors) {
			System.out.println(comp);
		}
		
		PriorityQueue<Competitor> golfers = new PriorityQueue<Competitor>();
		for(Competitor comp : competitors) {
			golfers.add(comp);
		}
		
		System.out.println("Golf Winner: " + golfers.poll());
		
		PriorityQueue<Competitor> bowlers = new PriorityQueue<Competitor>(Lab3Constants.SIZE, new BowlerComparator());
		String[] bowlString = new String[Lab3Constants.SIZE];
		
		File bowling = new File(Lab3Constants.BOWLFILE);
		
		try {
			BufferedReader reader2 = new BufferedReader(new FileReader(bowling));
			count = 0;
			String readLine = reader2.readLine();
			while (readLine != null) {
				bowlString[count] = readLine;
				readLine = reader2.readLine();
				count++;
			}
			reader2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Can't find input file " + Lab3Constants.BOWLFILE);
			e.printStackTrace();
			System.exit(Lab3Constants.READFILENOTFOUND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("IO Exception: Can't read lines.");
			e.printStackTrace();
			System.exit(Lab3Constants.IOERROR);
		}
		
		count = 0;
		for(String string: bowlString) {
			String[] parsed = string.split(",");
			int score = Integer.parseInt(parsed[Lab3Constants.SCOREOFFSET]);
			bowlers.add(new Competitor(parsed[Lab3Constants.NAMEOFFSET], score));
		}
		System.out.println("Bowling Winner: " + bowlers.poll());
	}
}
