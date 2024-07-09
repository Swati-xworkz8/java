public class ApplicationRunner{
	public static void main(String []args){
	String value=Application.features(50);
	System.out.println(value);
	String values=Application.features(50,"HCL application");
	System.out.println(values);
	String returnValue=Application.features(50,"HCL application",60.5);
	System.out.println(returnValue);
	String returns=Application.features(50,"HCL application",60.5,"20/07/2024");
	System.out.println(returns);
	String valued=Application.features(50,"HCL application",60.5,"20/07/2024","haleritti");
	System.out.println(valued);
	String returned=Application.features(50,"HCL application",60.5,"20/07/2024","haleritti","bengluru");
	System.out.println(returned);
	String returning=Application.features(50,"HCL application",60.5,"20/07/2024","haleritti","bengluru","hosaritti");
	System.out.println(returning);
	String data=Application.features(50,"HCL application",60.5,"20/07/2024","haleritti","bengluru","hosaritti",22);
	System.out.println(data);
	String datas=Application.features(50,"HCL application",60.5,"20/07/2024","haleritti","bengluru","hosaritti",22,5);
	System.out.println(datas);
	String contain=Application.features(50,"HCL application",60.5,"20/07/2024","haleritti","bengluru","hosaritti",22,5,"haveri");
	System.out.println(contain);
	
	}

}