// Horrible abuse of exceptions. Don't ever do this!
try {
	int i = 0;
       	while(true)
		range[i++].climb();
} catch(ArrayIndexOutOfBoundsException e) {
}

//use it instead
for (Mountain m : range)
	m.climb();


for (Iterator<Foo> i = collection.iterator(); i.hasNext(); ) {
        Foo foo = i.next();
        ...
}


// Do not use this hideous code for iteration over a collection!
try {
	Iterator<Foo> i = collection.iterator();
	while(true) {
		Foo foo = i.next();
		... }
} catch (NoSuchElementException e) {
}



