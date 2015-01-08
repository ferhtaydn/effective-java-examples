public List<Cheese> getCheeseList() {
     if (cheesesInStock.isEmpty())
	     return Collections.emptyList(); // Always returns same list
     else
	     return new ArrayList<Cheese>(cheesesInStock);
}
