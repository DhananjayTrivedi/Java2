package Java_Helper_Codes;

public class EvaluateExpression {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Error");
		}
		
		try{
			System.out.println(evaluateExpression(args[0]));
		}
		catch (Exception e){
			System.out.println("Wrong Expression" + args[0]);
		}
	}

	private static char[] evaluateExpression(String string) {
		return null;
		
	}

}
