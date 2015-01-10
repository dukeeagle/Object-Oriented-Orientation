
public class Alpha {

		public static void main(String[] args) {
			Beta betaObject = new Beta();
			betaObject.f();
			Gamma.g();
			
			Gamma gammaObject = new Gamma();
			gammaObject.f();
			Gamma.g();
			gammaObject.h();
			
			Delta deltaObject = new Delta();
			deltaObject.publicMethod();
//			deltaObject.privateMethod();
			
			Epsilon epsilonObject = new Epsilon(2);
			System.out.println(epsilonObject.finalVariable);
		}
		
}
