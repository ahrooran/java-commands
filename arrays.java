class cars{
	public int numof;
	public String manuf;
	cars( int numof, String manuf){
		this.numof = numof;
		this.manuf = manuf;
	}
}

class arrays{
	public static void main(String args[]){
		// int ca;
		// for (ca=0; ca < args.length; ca++){
		// 	System.out.println(args[ca]);
		// }

		// int [] arr = new int []{10,20,30,40,50,60};
		// for (int i = 0; i < arr.length; i++){
		// 	System.out.println("element:" + i +" is "+ arr[i]);
		// }


		cars [] arr;
		arr = new cars[3];

		arr[0] = new cars(100,"VW"); 
		arr[1] = new cars(450,"JAG"); 
		arr[2] = new cars(15,"BMW"); 
       	for (int a = 0; a < arr.length; a++) 
            System.out.println("Element at " + a + " : " + " No. of: " +
            	arr[a].numof +"  Manufacturer: "+ arr[a].manuf);
	}
}