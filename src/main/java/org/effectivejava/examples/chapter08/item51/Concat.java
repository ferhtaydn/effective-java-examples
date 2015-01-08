
// Inappropriate use of string concatenation - Performs horribly!
public String statement() {
	
	String result = "";
	
	for (int i = 0; i < numItems(); i++)
		result += lineForItem(i);  // String concatenation
		
	return result;
}

// use stringbuilder instead of concat.
public String statement() {
	
	StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH); 
	
	for (int i = 0; i < numItems(); i++)
		b.append(lineForItem(i)); 
	
	return b.toString();
}



